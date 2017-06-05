/**
 *ThreadStopExample.java
 * Administrator
 *2017��2��21������3:15:26
 *
 */
package com.chen.test01;

/**
 * 
 * http://blog.csdn.net/u010002184/article/details/52334266
 * 
 * @author ����ǿ
 * @Time  2017��2��21�� ����3:15:26
 */
public class ThreadStopExample {

    public static User u = new User();

    public static void main(String[] a){
        /**
         * ������ȡ�߳�
         */
        new Thread(new readObj(),"��--�߳�").start();

        while (true){
            Thread t = new Thread(new changeObj(),"д--�߳�");
            t.start();
            try {
                /**
                 * ���߳�sleep 150����,����ҵ��
                 */
                Thread.sleep(150);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            /**
             * ��д�߳�ֹͣ
             */
            t.stop();
        }
        /**
         * ִ�н��:
         * �۲���Щֵ,name������Զ��idС,����Ϊ����Զ����һ�ε�ֵ,������Ϊstop(),�޷����������id��name��ֵ.
         * 
         * Ϊʲô�᲻һ����?
         * ��Ϊ User ͨ�� changeObj()�������ϸı�,��changeObj��������id��,��Ҫ������������100�����ҵ��.��ɺ�����name��ֵ.
         * ����100������,����changeObj()�����߳�ǡ��ִ����stop()����,
         * ��Ȼ�Ѿ�������User��id����ֵ,��User��name������Ȼ���ϴ�ѭ����ֵ.û���ü���ֵ��stop()��.
         * ���������Ϊʲôstop()�������һ������.
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
     * �޸Ĳ���
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
                         * sleep 100����,����ҵ��
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
     * ��ȡ����
     */
    public static class readObj implements Runnable{
        @Override
        public void run() {
            while (true) {
                synchronized (u) {
                    /**
                     * ��ID ������ nameʱ,��ӡ.
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
