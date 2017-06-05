/**
 *ThreadStopExample.java
 * Administrator
 *2017年2月21日下午3:15:26
 *
 */
package com.chen.test01;

/**
 * 
 * http://blog.csdn.net/u010002184/article/details/52334266
 * 
 * @author 陈中强
 * @Time  2017年2月21日 下午3:15:26
 */
public class ThreadStopExample {

    public static User u = new User();

    public static void main(String[] a){
        /**
         * 开启读取线程
         */
        new Thread(new readObj(),"读--线程").start();

        while (true){
            Thread t = new Thread(new changeObj(),"写--线程");
            t.start();
            try {
                /**
                 * 主线程sleep 150毫秒,处理业务
                 */
                Thread.sleep(150);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            /**
             * 将写线程停止
             */
            t.stop();
        }
        /**
         * 执行结果:
         * 观察这些值,name属性永远比id小,是因为它永远是上一次的值,就是因为stop(),无法完整的完成id和name赋值.
         * 
         * 为什么会不一致呢?
         * 因为 User 通过 changeObj()方法不断改变,当changeObj方法设置id后,需要处理其他花费100毫秒的业务.完成后设置name的值.
         * 在这100毫秒中,调用changeObj()的主线程恰好执行了stop()方法,
         * 虽然已经设置了User的id属性值,但User的name属性依然是上次循环的值.没来得及赋值就stop()了.
         * 所以这就是为什么stop()会产生不一致问题.
         * 
         * User{id=1455613327, name='1455613326'}
         * User{id=1455613329, name='1455613328'}
         * User{id=1455613331, name='1455613330'}
         * User{id=1455613331, name='1455613330'}
         * User{id=1455613331, name='1455613330'}
         * .......
         */
    }

    /**
     * 修改操作
     */
    public static class changeObj implements Runnable{
        @Override
        public void run() {
            while (true){

                synchronized(u){
                    int v = (int) (System.currentTimeMillis()/1000);
                    u.setId(v);
                    try {
                        /**
                         * sleep 100毫秒,处理业务
                         */
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    u.setName(String.valueOf(v));
                }
                Thread.yield();
            }
        }
    }

    /**
     * 读取操作
     */
    public static class readObj implements Runnable{
        @Override
        public void run() {
            while (true) {
                synchronized (u) {
                    /**
                     * 当ID 不等于 name时,打印.
                     *
                     */
                    if (u.getId() != Integer.parseInt(u.getName())){
                        System.out.println(u);
                    }
                }
                Thread.yield();
            }
        }
    }

    public static class User{

        private int id ;

        private String name ;

        //getter setter
        
        

        public User() {
            this.id = 0;
            this.name = "0";
        }

        /**
		 * @return the id
		 */
		public int getId() {
			return id;
		}

		/**
		 * @param id the id to set
		 */
		public void setId(int id) {
			this.id = id;
		}

		/**
		 * @return the name
		 */
		public String getName() {
			return name;
		}

		/**
		 * @param name the name to set
		 */
		public void setName(String name) {
			this.name = name;
		}

		@Override
        public String toString() {
            return "User{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }
    }


}
