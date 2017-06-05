/**
 *LiftOff.java
 * Administrator
 *2017��1��19������2:40:44
 *
 */
package com.chen.test01;

/**
 * 	 *  �߳̿������������������Ҫһ����������ķ�ʽ
	 *  �������Runnable�ӿ����ṩ��Ҫ�붨������
	 *  ֻ��Ҫʵ��Runnable�ӿڲ���дrun()����
	 *  ʹ�ø��������ִ���������
	 *  ����� LiftOff������ʾ����֮ǰ�ĵ���ʱ
	 *  
 * @author ����ǿ
 * @Time  2017��1��19�� ����2:40:44
 */
public class LiftOff implements Runnable {

	
	protected int countDown = 10;//Default

	private static int taskCount =0;
	
	/**
	 * ��ʶ��id��������������Ķ��ʵ��  ����final��
	 * ��Ϊ��һ������ʼ��֮��Ͳ�ϣ�����޸�
	 */
	private final int id = taskCount++;
	
	
	
	/**
	 *  
	 * (non-Javadoc)
	 *  @author ����ǿ-chen
	 *  @Time  2017��1��19�� ����2:49:36
	*/
	public LiftOff() {
//		super();
		// TODO Auto-generated constructor stub
	}



	/**
	 *  @param countDown
	 * (non-Javadoc)
	 *  @author ����ǿ-chen
	 *  @Time  2017��1��19�� ����2:49:15
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
	 *  @author ����ǿ-chen
	 *  @Time  2017��1��19�� ����2:40:44
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
