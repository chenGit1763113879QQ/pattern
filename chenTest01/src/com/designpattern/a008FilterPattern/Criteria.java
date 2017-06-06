/**
 *Criteria.java
 * Administrator
 *2017年6月6日上午11:20:50
 *
 */
package com.designpattern.a008FilterPattern;

import java.util.List;

/**
 * 为标准（Criteria）创建一个接口。
 * @author 陈中强
 * @Time  2017年6月6日 上午11:20:50
 */
public interface Criteria {

	 public List<Person> meetCriteria(List<Person> persons);
	 
}
