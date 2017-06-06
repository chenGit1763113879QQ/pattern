/**
 *AdapterPatternDemo.java
 * Administrator
 *2017年6月6日上午9:43:10
 *
 */
package com.designpattern.a006AdapterPattern;

/**
 * @author 陈中强
 * @Time  2017年6月6日 上午9:43:10
 */
public class AdapterPatternDemo {

	/**
	 *  @param args
	 *  @author 陈中强-chen
	 *  @Time  2017年6月6日 上午9:43:10
	 */
	public static void main(String[] args) {
		
		AudioPlayer audioPlyer = new AudioPlayer();
		
		audioPlyer.play("mp3", "beyond the horizon.mp3");
		audioPlyer.play("mp4", "alone.mp4");
		audioPlyer.play("vlc", "far far away.vlc");
		audioPlyer.play("avi", "mind me.avi");

	}

}
