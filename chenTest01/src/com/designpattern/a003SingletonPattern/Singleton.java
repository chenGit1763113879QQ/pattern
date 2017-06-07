/**
 *Singleton.java
 * Administrator
 *2017年6月5日下午1:37:13
 *
 */
package com.designpattern.a003SingletonPattern;

/**
 * @author 陈中强
 * @Time  2017年6月5日 下午1:37:13
 */
public class Singleton {
	
//	private static Singleton instance;
	private Singleton(){};
	
	/**
	 * 懒汉式，线程安全
	 * 是否 Lazy 初始化：是
	 * 是否多线程安全：是
	 * 实现难度：易
	 * 描述：这种方式具备很好的 lazy loading，能够在多线程中很好的工作，但是，效率很低，99% 情况下不需要同步。
	 * 优点：第一次调用才初始化，避免内存浪费。
	 * 缺点：必须加锁 synchronized 才能保证单例，但加锁会影响效率。
	 * getInstance() 的性能对应用程序不是很关键（该方法使用不太频繁）
	 *  @return
	 *  @author 陈中强-chen
	 *  @Time  2017年6月5日 下午1:40:33
	 */
//	public static synchronized  Singleton getInstance(){
//		if(instance == null){
//			instance = new Singleton();
//		}
//		return instance;
//	}
	
	
/*	4、双检锁/双重校验锁（DCL，即 double-checked locking）

	JDK 版本：JDK1.5 起

	是否 Lazy 初始化：是

	是否多线程安全：是

	实现难度：较复杂

	描述：这种方式采用双锁机制，安全且在多线程情况下能保持高性能。
	getInstance() 的性能对应用程序很关键。*/
	private volatile static Singleton singleton;
	public static Singleton getSingleton(){
		if(singleton == null ){
			synchronized (Singleton.class){
				if(singleton == null){
					singleton = new Singleton();
				}
			}
		}
		return singleton;
	}
	

}
