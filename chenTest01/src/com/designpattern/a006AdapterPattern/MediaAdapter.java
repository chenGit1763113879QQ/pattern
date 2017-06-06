/**
 *MediaAdapter.java
 * Administrator
 *2017年6月6日上午9:26:20
 *
 */
package com.designpattern.a006AdapterPattern;

/**
 * @author 陈中强
 * @Time  2017年6月6日 上午9:26:20
 */
public class MediaAdapter implements MediaPlayer {

	
	AdvancedMediaPlayer advancedMusicPlayer;
	
	public MediaAdapter(String audioType){
		
		if(audioType.equalsIgnoreCase("vlc")){
			advancedMusicPlayer = new VlcPlayer();
		} else if (audioType.equalsIgnoreCase("mp4")){
			advancedMusicPlayer = new Mp4Player();
		}
		
	}
	/**
	 *  @param audioType
	 *  @param fileName
	 * (non-Javadoc)
	 * @see com.designpattern.a006AdapterPattern.MediaPlayer#play(java.lang.String, java.lang.String)
	 *  @author 陈中强-chen
	 *  @Time  2017年6月6日 上午9:26:20
	 */
	@Override
	public void play(String audioType, String fileName) {

		if(audioType.equalsIgnoreCase("vlc")){
			 advancedMusicPlayer.playVlc(fileName);
		}else if(audioType.equalsIgnoreCase("mp4")){
			advancedMusicPlayer.playMp4(fileName);
		}
		
	}

}
