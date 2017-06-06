/**
 *AdapterPatternDemo.java
 * Administrator
 *2017��6��6������9:43:10
 *
 */
package com.designpattern.a006AdapterPattern;

/**
 * @author ����ǿ
 * @Time  2017��6��6�� ����9:43:10
 */
public class AdapterPatternDemo {

	/**
	 *  @param args
	 *  @author ����ǿ-chen
	 *  @Time  2017��6��6�� ����9:43:10
	 */
	public static void main(String[] args) {
		
		AudioPlayer audioPlyer = new AudioPlayer();
		
		audioPlyer.play("mp3", "beyond the horizon.mp3");
		audioPlyer.play("mp4", "alone.mp4");
		audioPlyer.play("vlc", "far far away.vlc");
		audioPlyer.play("avi", "mind me.avi");

	}

}
