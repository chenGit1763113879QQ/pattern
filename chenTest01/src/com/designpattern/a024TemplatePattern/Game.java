/**
 *Game.java
 * Administrator
 *2017��6��7������1:43:35
 *
 */
package com.designpattern.a024TemplatePattern;

/**
 * @author ����ǿ
 * @Time  2017��6��7�� ����1:43:35
 */
public abstract class Game {

	abstract void initialize();
	abstract void startpaly();
	abstract void endPaly();
	
	//ģ��
	public final void paly(){
	
		//��ʼ����Ϸ
		initialize();
		
		//��ʼ��Ϸ
		startpaly();
		
		//������Ϸ
		endPaly();
		
	}
}
