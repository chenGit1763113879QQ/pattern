/**
 *ListDemo.java
 * Administrator
 *2017年4月10日下午1:54:32
 *
 */
package com.chen.list;

import java.util.ArrayList;

/**
 * @author 陈中强
 * @Time  2017年4月10日 下午1:54:32
 */
public class ListDemo {

	
	/**

	* List源码方法：public void add(int location, E object);

	* 思路：

	*    调用这个方法后，原来的location位置上的值会往后移动一位（原location后的数据对应往后移一位）

	*    那么就要移除原location移动后的位置上的数据 

	*/

	public static void main(String[] args) {



	ArrayList<String> strList = new ArrayList<>();

	strList.add("序列1");

	strList.add("序列2");

	strList.add("序列3");

	strList.add("序列4");

	strList.add("序列5");



	// 测试：序列2与序列5对调

	int replaceNum1 = 1;

	int replaceNum2 = 4;



	strList.add(replaceNum1, strList.get(replaceNum2));

	strList.add(replaceNum2+1, strList.get(replaceNum1+1));



	strList.remove(replaceNum1+1);

	strList.remove(replaceNum2+1);



	System.out.println(strList.toString());

	}
	
}
