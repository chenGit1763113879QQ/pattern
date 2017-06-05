package com.chen.ThreadLearn;
/*
 * �����ڲ���ĸ�ʽ��
 */
public class ThreadDemo {
    public static void main(String[] args) {
        // �̳�thread��ʵ�ֶ��߳�
        new Thread() {
            public void run() {
                for (int x = 0; x < 100; x++) {
                    System.out.println(Thread.currentThread().getName() + "--"
                            + x);
                }
            }
        }.start();
        ;

        // ʵ��runnable��ڣ��������̲߳�����
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int x = 0; x < 100; x++) {
                    System.out.println(Thread.currentThread().getName() + "--"
                            + x);
                }
            }
        }) {
        }.start();

        // �����Ѷȵ�,��Thread�����ڲ����������һ����дrun����
        //��ʵ������ʱ�Ľ���� hello+x����thread��run����Ϊ׼�����Ǵ˴�������
        new Thread(new Runnable() {
            @Override
            public void run() {
                // TODO Auto-generated method stub
                for (int x = 0; x < 100; x++) {
                    System.out.println("java" + "--" + x);
                }

            }
        }) {
            public void run() {
                for (int x = 0; x < 100; x++) {
                    System.out.println("hello" + "--" + x);
                }
            }
        }.start();
    }
}