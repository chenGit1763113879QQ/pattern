/**
 *MVCPatternDemo.java
 * Administrator
 *2017��6��7������2:57:19
 *
 */
package com.designpattern.a026MVCPattern;

/**
 * @author ����ǿ
 * @Time  2017��6��7�� ����2:57:19
 */
public class MVCPatternDemo {

	/**
	 *  @param args
	 *  @author ����ǿ-chen
	 *  @Time  2017��6��7�� ����2:57:19
	 */
	public static void main(String[] args) {
		
		//�����ݿ��ȡѧ����¼
		Student model = retriveStudentFormDatabase();

		//����һ����ͼ ��ѧ������Ϣ���������̨
		StudentView view  = new StudentView();
		
		StudentController controller = new StudentController(model, view);
		
		
		controller.updateView();
		
		
		//��������ģ��
		controller.setStudentName("John");
		controller.updateView();
		
	}

	/**
	 *  @return
	 *  @author ����ǿ-chen
	 *  @Time  2017��6��7�� ����2:58:19
	*/
	private static Student retriveStudentFormDatabase() {
		Student student = new Student();
		student.setName("Robert");
		student.setRollNo("11");
		return student;
	}

}
