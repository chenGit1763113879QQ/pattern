/**
 *ListTest01.java
 * Administrator
 *2017��4��10������3:06:53
 *
 */
package com.chen.list;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ����ǿ
 * @Time  2017��4��10�� ����3:06:53
 */
public class ListTest01 {
	 
    public static void main(String[] args) {
         
            //list����ӣ���ȡ��ɾ��Ԫ��
            List<String> person=new ArrayList<>();
            person.add("jackie");   //����Ϊ0  //.add(e)
            person.add("peter");    //����Ϊ1
            person.add("annie");    //����Ϊ2
            person.add("martin");   //����Ϊ3
            person.add("marry");    //����Ϊ4
             
            person.remove(3);   //.remove(index)
            person.remove("marry");     //.remove(Object o)
             
            String per="";
            per=person.get(1);
            System.out.println(per);    ////.get(index)
             
            for (int i = 0; i < person.size(); i++) {
                System.out.println(person.get(i));  //.get(index)
            }
             
             
         
            //list���Ƿ����ĳ��Ԫ��
            List<String> fruits=new ArrayList<>();
            fruits.add("ƻ��");
            fruits.add("�㽶");
            fruits.add("����");
            //forѭ������list
            for (int i = 0; i < fruits.size(); i++) {
                System.out.println(fruits.get(i));
            }
            String appleString="ƻ��";
            //true or false
            System.out.println("fruits���Ƿ����ƻ����"+fruits.contains(appleString));
             
            if (fruits.contains(appleString)) {
                System.out.println("��ϲ����ƻ��");
            }else {
                System.out.println("�Ҳ�����");
            }
             
            //list�и���������Ԫ����ֵ�ı�(�滻)
            String a="������", b="ɳ����", c="�˽�", d="��ɮ", e="���";
            List<String> people=new ArrayList<>();
            people.add(a);
            people.add(b);
            people.add(c);
            people.set(0, d);   //.set(index, element)      //��d��ɮ�ŵ�list������Ϊ0��λ�ã��滻a������
            people.add(1, e);   //.add(index, element);     //��e��շŵ�list������Ϊ1��λ��,ԭ��λ�õ�bɳ���к���һλ
             
            //��ǿforѭ������list
            for(String str:people){
                System.out.println(str);
            }
             
            //list�в鿴���жϣ�Ԫ�ص�����
            List<String> names=new ArrayList<>();
            names.add("����");    //����Ϊ0
            names.add("����");    //����Ϊ1
            names.add("�ŷ�");    //����Ϊ2
            names.add("����");    //����Ϊ3
            names.add("�ŷ�");    //����Ϊ4
            System.out.println(names.indexOf("����"));
            System.out.println(names.lastIndexOf("����"));
            System.out.println(names.indexOf("�ŷ�"));
            System.out.println(names.lastIndexOf("�ŷ�"));
             
            //����Ԫ������λ�ý��е��ж�
            if (names.indexOf("����")==0) {
                System.out.println("����������");
            }else if (names.lastIndexOf("����")==3) {
                System.out.println("����������");
            }else {
                System.out.println("�������������");
            }
             
            //����list������λ����������һ���µ�list����ȡ���ϣ�
            List<String> phone=new ArrayList<>();
            phone.add("����");    //����Ϊ0
            phone.add("ƻ��");    //����Ϊ1
            phone.add("����");    //����Ϊ2
            phone.add("��Ϊ");    //����Ϊ3
            phone.add("С��");    //����Ϊ4
            //ԭlist���б���
            for(String pho:phone){
                System.out.println(pho);
            }
            //������list
            phone=phone.subList(1, 4);  //.subList(fromIndex, toIndex)      //��������1-4�Ķ�����������һ��list�����ǲ���������Ϊ4��Ԫ�أ�4-1=3
            for (int i = 0; i < phone.size(); i++) { // phone.size() �÷����õ�list�е�Ԫ�����ĺ�
                System.out.println("�µ�list������Ԫ����"+phone.get(i));
            }
             
            //�Ա�����list�е�����Ԫ��
            //������ȶ����equals����һ��Ϊtrue, ������hashcode��ȵĶ���һ������ȵĶ���
            if (person.equals(fruits)) {
                System.out.println("����list�е�����Ԫ����ͬ");
            }else {
                System.out.println("����list�е�����Ԫ�ز�һ��");
            }
             
            if (person.hashCode()==fruits.hashCode()) {
                System.out.println("������ͬ");
            }else {
                System.out.println("���ǲ�һ��");
            }
             
             
            //�ж�list�Ƿ�Ϊ��
            //���򷵻�true���ǿ��򷵻�false
            if (person.isEmpty()) {
                System.out.println("�յ�");
            }else {
                System.out.println("���ǿյ�");
            }
             
            //����Iterator���϶���
            System.out.println("����Iterator���϶���:"+person.iterator());
             
            //������ת��Ϊ�ַ���
            String liString="";
            liString=person.toString();
            System.out.println("������ת��Ϊ�ַ���:"+liString);
             
            //������ת��Ϊ���飬Ĭ������
            System.out.println("������ת��Ϊ����:"+person.toArray());
             
            ////������ת��Ϊָ�����ͣ��ѺõĴ���
            //1.Ĭ������
            List<Object> listsStrings=new ArrayList<>();
            for (int i = 0; i < person.size(); i++) {
                listsStrings.add(person.get(i));
            }
            //2.ָ������
            List<StringBuffer> lst=new ArrayList<>();
            for(String string:person){
                lst.add(StringBuffer(string));
            }
             
             
             
             
    }
 
    private static StringBuffer StringBuffer(String string) {
        return null;
    }
 
 
    }