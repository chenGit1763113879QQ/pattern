/**
 *ListDemo.java
 * Administrator
 *2017��4��10������1:54:32
 *
 */
package com.chen.list;

import java.util.ArrayList;

/**
 * @author ����ǿ
 * @Time  2017��4��10�� ����1:54:32
 */
public class ListDemo {

	
	/**

	* ListԴ�뷽����public void add(int location, E object);

	* ˼·��

	*    �������������ԭ����locationλ���ϵ�ֵ�������ƶ�һλ��ԭlocation������ݶ�Ӧ������һλ��

	*    ��ô��Ҫ�Ƴ�ԭlocation�ƶ����λ���ϵ����� 

	*/

	public static void main(String[] args) {



	ArrayList<String> strList = new ArrayList<>();

	strList.add("����1");

	strList.add("����2");

	strList.add("����3");

	strList.add("����4");

	strList.add("����5");



	// ���ԣ�����2������5�Ե�

	int replaceNum1 = 1;

	int replaceNum2 = 4;



	strList.add(replaceNum1, strList.get(replaceNum2));

	strList.add(replaceNum2+1, strList.get(replaceNum1+1));



	strList.remove(replaceNum1+1);

	strList.remove(replaceNum2+1);



	System.out.println(strList.toString());

	}
	
}
