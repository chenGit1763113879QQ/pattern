/**
 *Mp4Player.java
 * Administrator
 *2017年6月6日上午9:24:33
 *
 */
package com.designpattern.a006AdapterPattern;

/**
 * @author 陈中强
 * @Time  2017年6月6日 上午9:24:33
 */
public class Mp4Player implements AdvancedMediaPlayer {

	/**
	 *  @param fileName
	 * (non-Javadoc)
	 * @see com.designpattern.a006AdapterPattern.AdvancedMediaPlayer#playVlc(java.lang.String)
	 *  @author 陈中强-chen
	 *  @Time  2017年6月6日 上午9:24:33
	 */
	@Override
	public void playVlc(String fileName) {
		// TODO Auto-generated method stub

	}

	/**
	 *  @param fileName
	 * (non-Javadoc)
	 * @see com.designpattern.a006AdapterPattern.AdvancedMediaPlayer#playMp4(java.lang.String)
	 *  @author 陈中强-chen
	 *  @Time  2017年6月6日 上午9:24:33
	 */
	@Override
	public void playMp4(String fileName) {
		 System.out.println("Playing mp4 file. Name: "+ fileName);		
	}

}
