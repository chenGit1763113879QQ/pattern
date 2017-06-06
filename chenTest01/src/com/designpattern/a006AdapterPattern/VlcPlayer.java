/**
 *VlcPlayer.java
 * Administrator
 *2017��6��6������9:24:03
 *
 */
package com.designpattern.a006AdapterPattern;

/**
 * @author ����ǿ
 * @Time  2017��6��6�� ����9:24:03
 */
public class VlcPlayer implements AdvancedMediaPlayer {

	/**
	 *  @param fileName
	 * (non-Javadoc)
	 * @see com.designpattern.a006AdapterPattern.AdvancedMediaPlayer#playVlc(java.lang.String)
	 *  @author ����ǿ-chen
	 *  @Time  2017��6��6�� ����9:24:03
	 */
	@Override
	public void playVlc(String fileName) {
		System.out.println("Playing vlc file. Name: "+ fileName);	

	}

	/**
	 *  @param fileName
	 * (non-Javadoc)
	 * @see com.designpattern.a006AdapterPattern.AdvancedMediaPlayer#playMp4(java.lang.String)
	 *  @author ����ǿ-chen
	 *  @Time  2017��6��6�� ����9:24:03
	 */
	@Override
	public void playMp4(String fileName) {
		// TODO Auto-generated method stub

	}

}
