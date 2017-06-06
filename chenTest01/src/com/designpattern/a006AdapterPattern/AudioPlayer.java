/**
 *AudioPlayer.java
 * Administrator
 *2017年6月6日上午9:35:28
 *
 */
package com.designpattern.a006AdapterPattern;

/**
 * @author 陈中强
 * @Time  2017年6月6日 上午9:35:28
 */
public class AudioPlayer implements MediaPlayer {

	MediaAdapter mediaAdapter;
	/**
	 *  @param audioType
	 *  @param fileName
	 * (non-Javadoc)
	 * @see com.designpattern.a006AdapterPattern.MediaPlayer#play(java.lang.String, java.lang.String)
	 *  @author 陈中强-chen
	 *  @Time  2017年6月6日 上午9:35:28
	 */
	@Override
	public void play(String audioType, String fileName) {

		//播放mp3 音乐文件的内置支持
		if(audioType.equalsIgnoreCase("mp3")){
			System.out.println("Playing mp3 file.Name :"+ fileName);
		}
//		 mediaAdapter 提供了播放其他文件格式的支持
		else if(audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")){
			mediaAdapter = new MediaAdapter(audioType);
			mediaAdapter.play(audioType, fileName);
			
		}else{
			System.out.println("Invalid media."+audioType+" format not supported");
		}
	}

}
