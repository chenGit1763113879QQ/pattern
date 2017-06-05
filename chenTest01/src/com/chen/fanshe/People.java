///**
// *People.java
// * Administrator
// *2017年2月21日下午2:50:01
// *
// */
//package com.chen.fanshe;
//
///**
// * @author 陈中强
// * @Time  2017年2月21日 下午2:50:01
// */
//public class People {
//	
//	
//	    private String name;
//	    private int age;
//	    
//	    /**
//	     * 当我们自动生成get set方法时，会将字段的首字母大写，
//	     * 我们在上面拼接set 方法时，也是基于这样的规则来拼装的。
//	     * 但是 当我们的字段名为 aAbbb 时，则生成的get set 方法则不会大写。解决方案也很简单，
//	     * 注意字段命名或者在拼接时对第二个自动进行大小写判断。这样我们自己写的Json解析工具就搞定， 
//	     * 以后每次解析只需一行代码即可OK。 
//	     * 
//	     */
//	    private String mSex;//
//		/**
//		 * @return the name
//		 */
//		public String getName() {
//			return name;
//		}
//		/**
//		 * @param name the name to set
//		 */
//		public void setName(String name) {
//			this.name = name;
//		}
//		/**
//		 * @return the age
//		 */
//		public int getAge() {
//			return age;
//		}
//		/**
//		 * @param age the age to set
//		 */
//		public void setAge(int age) {
//			this.age = age;
//		}
//		/**
//		 * @return the mSex
//		 */
//		public String getmSex() {
//			return mSex;
//		}
//		/**
//		 * @param mSex the mSex to set
//		 */
//		public void setmSex(String mSex) {
//			this.mSex = mSex;
//		}
//	    
//	    
//	    
//
//}
