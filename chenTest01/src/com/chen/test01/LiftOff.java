/**
 *LiftOff.java
 * Administrator
 *2017年1月19日下午2:40:44
 *
 */
package com.chen.test01;

/**
 * 	 *  线程可以驱动任务，因此你需要一种描述任务的方式
	 *  这可以有Runnable接口来提供。要想定义任务
	 *  只需要实现Runnable接口并编写run()方法
	 *  使得该任务可以执行你的命令
	 *  下面的 LiftOff任务将显示发射之前的倒计时
	 *  
 * @author 陈中强
 * @Time  2017年1月19日 下午2:40:44
 */
public class LiftOff implements Runnable {

	
	protected int countDown = 10;//Default

	private static int taskCount =0;
	
	/**
	 * 标识符id可以来区分任务的多个实例  它是final的
	 * 因为它一旦被初始化之后就不希望被修改
	 */
	private final int id = taskCount++;
	
	
	
	/**
	 *  
	 * (non-Javadoc)
	 *  @author 陈中强-chen
	 *  @Time  2017年1月19日 下午2:49:36
	*/
	public LiftOff() {
//		super();
		// TODO Auto-generated constructor stub
	}



	/**
	 *  @param countDown
	 * (non-Javadoc)
	 *  @author 陈中强-chen
	 *  @Time  2017年1月19日 下午2:49:15
	*/
	public LiftOff(int countDown) {
//		super();
		this.countDown = countDown;
	}
	
	public  String status(){
		
		return "#"+ id + "(" +(countDown > 0 ? countDown : "Liftoff!") 
				+").";
		
	}



	/**
	 * (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 *  @author 陈中强-chen
	 *  @Time  2017年1月19日 下午2:40:44
	 */
	@Override
	public void run() {
		
		while(countDown-- > 0){
			
			System.out.print(status());
			Thread.yield();
			
		}
		
		// TODO Auto-generated method stub

	}
	
	
	public static void main(String[] args) {
		
//		LiftOff liftOff = new LiftOff();
//		liftOff.run();
		for(int i = 0; i< 5; i++){
			Thread t = new Thread(new LiftOff());
			t.start();
			System.out.println("Waiting for liftoff");
		}

	}

}
