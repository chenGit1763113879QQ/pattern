/**
 *Game.java
 * Administrator
 *2017年6月7日下午1:43:35
 *
 */
package com.designpattern.a024TemplatePattern;

/**
 * @author 陈中强
 * @Time  2017年6月7日 下午1:43:35
 */
public abstract class Game {

	abstract void initialize();
	abstract void startpaly();
	abstract void endPaly();
	
	//模板
	public final void paly(){
	
		//初始化游戏
		initialize();
		
		//开始游戏
		startpaly();
		
		//结束游戏
		endPaly();
		
	}
}
