/**
 *TaskWithResult.java
 * Administrator
 *2017��1��19������3:32:58
 *
 */
package com.chen.test01;

import java.util.concurrent.Callable;

/**
 * Runnable ��ִ�й����Ķ������� �������������κ�ְֵ 
 * �����ϣ���������ʱ�ܹ�����һ��ֵ ��ô����ʵ��callable
 * �ӿ� ������ Runnable�ӿ�
 * �������Ͳ�����ʾ���Ǵӷ���call() �з��ص�ֵ
 * ���ұ���ʹ��ExecutorSerivice.submit()����������
 * @author ����ǿ
 * @Time  2017��1��19�� ����3:32:58
 */
public class TaskWithResult implements Callable<String> {

	private int id;
	
	
	/**
	 *  @param id
	 * (non-Javadoc)
	 *  @author ����ǿ-chen
	 *  @Time  2017��1��19�� ����3:36:57
	*/
	public TaskWithResult(int id) {
//		super();
		this.id = id;
	}


	/**
	 *  @return
	 *  @throws Exception
	 * (non-Javadoc)
	 * @see java.util.concurrent.Callable#call()
	 *  @author ����ǿ-chen
	 *  @Time  2017��1��19�� ����3:32:58
	 */
	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub
		return "result of TaskWithResult " + id ;
	}

}
