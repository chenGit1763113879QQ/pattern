/**
 *AudioPlayer.java
 * Administrator
 *2017��6��6������9:35:28
 *
 */
package com.designpattern.a006AdapterPattern;

/**
 * @author ����ǿ
 * @Time  2017��6��6�� ����9:35:28
 */
public class AudioPlayer implements MediaPlayer {

	MediaAdapter mediaAdapter;
	/**
	 *  @param audioType
	 *  @param fileName
	 * (non-Javadoc)
	 * @see com.designpattern.a006AdapterPattern.MediaPlayer#play(java.lang.String, java.lang.String)
	 *  @author ����ǿ-chen
	 *  @Time  2017��6��6�� ����9:35:28
	 */
	@Override
	public void play(String audioType, String fileName) {

		//����mp3 �����ļ�������֧��
		if(audioType.equalsIgnoreCase("mp3")){
			System.out.println("Playing mp3 file.Name :"+ fileName);
		}
//		 mediaAdapter �ṩ�˲��������ļ���ʽ��֧��
		else if(audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")){
			mediaAdapter = new MediaAdapter(audioType);
			mediaAdapter.play(audioType, fileName);
			
		}else{
			System.out.println("Invalid media."+audioType+" format not supported");
		}
	}

}
