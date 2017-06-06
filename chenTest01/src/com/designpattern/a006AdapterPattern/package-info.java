/**
 *package-info.java
 * Administrator
 *2017��6��6������9:20:13
 *
 */
/**
 * 
 * ������ģʽ

������ģʽ��Adapter Pattern������Ϊ���������ݵĽӿ�֮����������������͵����ģʽ���ڽṹ��ģʽ������������������ӿڵĹ��ܡ�

����ģʽ�漰��һ����һ���࣬���ฺ���������Ļ򲻼��ݵĽӿڹ��ܡ��ٸ���ʵ�����ӣ�����������Ϊ�ڴ濨�ͱʼǱ�֮����������������ڴ濨������������ٽ�����������ʼǱ��������Ϳ���ͨ���ʼǱ�����ȡ�ڴ濨��

����ͨ�������ʵ������ʾ������ģʽ��ʹ�á����У���Ƶ�������豸ֻ�ܲ��� mp3 �ļ���ͨ��ʹ��һ�����߼�����Ƶ������������ vlc �� mp4 �ļ���

 * @author ����ǿ
 * @Time  2017��6��6�� ����9:20:13
 */
package com.designpattern.a006AdapterPattern;

/**
 * 
 * ����

��ͼ����һ����Ľӿ�ת���ɿͻ�ϣ��������һ���ӿڡ�������ģʽʹ��ԭ�����ڽӿڲ����ݶ�����һ��������Щ�����һ������

��Ҫ�������Ҫ���������ϵͳ�У�����Ҫ��һЩ"�ִ�Ķ���"�ŵ��µĻ����У����»���Ҫ��Ľӿ����ֶ���������ġ�

��ʱʹ�ã� 1��ϵͳ��Ҫʹ�����е��࣬������Ľӿڲ�����ϵͳ����Ҫ�� 2����Ҫ����һ�������ظ�ʹ�õ��࣬������һЩ�˴�֮��û��̫�������һЩ�࣬����һЩ�����ڽ�����������һ��������ЩԴ�಻һ����һ�µĽӿڡ� 3��ͨ���ӿ�ת������һ���������һ����ϵ�С��������ϻ��ͷ��ݣ����ڶ���һ���ɻ����ڲ�����ʵ��������£�����һ�������������������һ��������ʵ�ַɵĽӿڡ���

��ν�����̳л��������Ƽ�����

�ؼ����룺�������̳л��������еĶ���ʵ����Ҫ��Ŀ��ӿڡ�

Ӧ��ʵ���� 1���������� 110V���й� 220V����Ҫ��һ���������� 110V ת��Ϊ 220V�� 2��JAVA JDK 1.1 �ṩ�� Enumeration �ӿڣ����� 1.2 ���ṩ�� Iterator �ӿڣ���Ҫʹ�� 1.2 �� JDK����Ҫ����ǰϵͳ�� Enumeration �ӿ�ת��Ϊ Iterator �ӿڣ���ʱ����Ҫ������ģʽ�� 3���� LINUX ������ WINDOWS ���� 4��JAVA �е� jdbc��

�ŵ㣺 1���������κ�����û�й�������һ�����С� 2���������ĸ��á� 3�����������͸���ȡ� 4������Ժá�

ȱ�㣺 1�������ʹ��������������ϵͳ�ǳ����ң�����������а��ա����磬�����������õ��� A �ӿڣ���ʵ�ڲ���������� B �ӿڵ�ʵ�֣�һ��ϵͳ���̫��������������������һ�����ѡ����������Ǻ��б�Ҫ�����Բ�ʹ��������������ֱ�Ӷ�ϵͳ�����ع��� 2.���� JAVA ����̳�һ���࣬��������ֻ������һ���������࣬����Ŀ��������ǳ����ࡣ

ʹ�ó������ж������޸�һ���������е�ϵͳ�Ľӿڣ���ʱӦ�ÿ���ʹ��������ģʽ��

ע�������������������ϸ���ʱ���ӵģ����ǽ�����ڷ��۵���Ŀ�����⡣
 */

//
//ʵ��
//
//������һ�� MediaPlayer �ӿں�һ��ʵ���� MediaPlayer �ӿڵ�ʵ���� AudioPlayer��Ĭ������£�AudioPlayer ���Բ��� mp3 ��ʽ����Ƶ�ļ���
//
//���ǻ�����һ���ӿ� AdvancedMediaPlayer ��ʵ���� AdvancedMediaPlayer �ӿڵ�ʵ���ࡣ������Բ��� vlc �� mp4 ��ʽ���ļ���
//
//������Ҫ�� AudioPlayer ����������ʽ����Ƶ�ļ���Ϊ��ʵ��������ܣ�������Ҫ����һ��ʵ���� MediaPlayer �ӿڵ��������� MediaAdapter����ʹ�� AdvancedMediaPlayer ��������������ĸ�ʽ��
//
//AudioPlayer ʹ���������� MediaAdapter �����������Ƶ���ͣ�����Ҫ֪���ܲ��������ʽ��Ƶ��ʵ���ࡣAdapterPatternDemo�����ǵ���ʾ��ʹ�� AudioPlayer �������Ÿ��ָ�ʽ��
//
//
