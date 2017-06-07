/**
 *MVCPatternDemo.java
 * Administrator
 *2017年6月7日下午2:57:19
 *
 */
package com.designpattern.a026MVCPattern;

/**
 * @author 陈中强
 * @Time  2017年6月7日 下午2:57:19
 */
public class MVCPatternDemo {

	/**
	 *  @param args
	 *  @author 陈中强-chen
	 *  @Time  2017年6月7日 下午2:57:19
	 */
	public static void main(String[] args) {
		
		//从数据库获取学生记录
		Student model = retriveStudentFormDatabase();

		//创建一个视图 把学生的信息输出到控制台
		StudentView view  = new StudentView();
		
		StudentController controller = new StudentController(model, view);
		
		
		controller.updateView();
		
		
		//更新数据模型
		controller.setStudentName("John");
		controller.updateView();
		
	}

	/**
	 *  @return
	 *  @author 陈中强-chen
	 *  @Time  2017年6月7日 下午2:58:19
	*/
	private static Student retriveStudentFormDatabase() {
		Student student = new Student();
		student.setName("Robert");
		student.setRollNo("11");
		return student;
	}

}
