/**
 *Criteria.java
 * Administrator
 *2017��6��6������11:20:50
 *
 */
package com.designpattern.a008FilterPattern;

import java.util.List;

/**
 * Ϊ��׼��Criteria������һ���ӿڡ�
 * @author ����ǿ
 * @Time  2017��6��6�� ����11:20:50
 */
public interface Criteria {

	 public List<Person> meetCriteria(List<Person> persons);
	 
}
