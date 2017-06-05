/**
 *Reflection.java
 * Administrator
 *2017��2��21������2:36:57
 *
 */
package com.chen.fanshe;

/**
 * 
 * http://blog.csdn.net/soul_code/article/details/50466935
 * 
 * url 
    һ�� ʲô�Ƿ��䣿
    ������������ʲô��
    һ�� ʲô�Ƿ��䣿
    ����Java����ָ�������ǿ���������ʱ���ء�֪̽��ʹ�ñ����ڼ���ȫδ֪��classes�����仰˵��Java������Լ���һ������ʱ�ŵ�֪���Ƶ�class����Ϥ���������죨��������methods���壩�������������ʵ�塢�����fields��ֵ��������methods��
    �������һ��Android Developer��ǰ���Ƕ���̵��㾡�����÷��䣬Ч��̫�ͣ�̫�������䡱����̫��Ͳ����ˣ����Է�����Ȼ���㣬����ż����һ�»��Ǻܡ�ˬ���ġ�
    ������������ʲô��
    1���½����ʵ��
    ����֪�����е��඼�̳��Ӷ�������Object����Object����hashCode()��equals()��clone()��toString()��getClass()�ȡ�����getClass()����һ��Class ���������������Ҫʹ�õ�Class����ע��C�Ǵ�д�����ǿ���ͨ��һ�·�ʽ����ȡClass����
    1.Class.forName(�������ַ�����) ��ע�⣺�����ַ���������ȫ�ƣ�����+������
    2.����.class
    3.ʵ������.getClass()
    ��Class������һ���ǳ���Ҫ�ķ���


 * @author ����ǿ
 * @Time  2017��2��21�� ����2:36:57
 */
public class Reflection {

    public static void main(String[] args) {

        // ��ͨ�������ʵ��

        People p1 = new People();
        System.out.println(p1.getName());
        // ���÷����ȡ���ʵ��
        Class clazz = People.class;
        // ���÷�ʽ,ע����������Ҫ�����ȫ·����
        // Class clazz = Class.forName("reflection.People");
        // Class clazz = p1.getClass();
        try {
            People p2 = (People) clazz.newInstance();
            System.out.println(p2.getName());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}

class People {

    private String name = "����";
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}