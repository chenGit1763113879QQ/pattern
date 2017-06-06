/**
 *VlcPlayer.java
 * Administrator
 *2017年6月6日上午9:24:03
 *
 */
package com.designpattern.a006AdapterPattern;

/**
 * @author 陈中强
 * @Time  2017年6月6日 上午9:24:03
 */
public class VlcPlayer implements AdvancedMediaPlayer {

	/**
	 *  @param fileName
	 * (non-Javadoc)
	 * @see com.designpattern.a006AdapterPattern.AdvancedMediaPlayer#playVlc(java.lang.String)
	 *  @author 陈中强-chen
	 *  @Time  2017年6月6日 上午9:24:03
	 */
	@Override
	public void playVlc(String fileName) {
		System.out.println("Playing vlc file. Name: "+ fileName);	

	}

	/**
	 *  @param fileName
	 * (non-Javadoc)
	 * @see com.designpattern.a006AdapterPattern.AdvancedMediaPlayer#playMp4(java.lang.String)
	 *  @author 陈中强-chen
	 *  @Time  2017年6月6日 上午9:24:03
	 */
	@Override
	public void playMp4(String fileName) {
		// TODO Auto-generated method stub

	}

}
