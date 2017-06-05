/**
 *Reflection.java
 * Administrator
 *2017年2月21日下午2:36:57
 *
 */
package com.chen.fanshe;

/**
 * 
 * http://blog.csdn.net/soul_code/article/details/50466935
 * 
 * url 
    一、 什么是反射？
    二、反射能做什么？
    一、 什么是反射？
    用在Java身上指的是我们可以于运行时加载、探知、使用编译期间完全未知的classes。换句话说，Java程序可以加载一个运行时才得知名称的class，获悉其完整构造（但不包括methods定义），并生成其对象实体、或对其fields设值、或唤起其methods。
    如果你是一个Android Developer，前辈们都会教导你尽量少用反射，效率太低，太慢。“射”嘛，射的太快就不好了，所以反射虽然慢点，但是偶尔射一下还是很”爽”的。
    二、反射能做什么？
    1、新建类的实例
    我们知道所有的类都继承子顶级父类Object，而Object中有hashCode()、equals()、clone()、toString()、getClass()等。其中getClass()返回一个Class 对象。我们这里就需要使用的Class对象，注意C是大写，我们可以通过一下方式来获取Class对象
    1.Class.forName(“类名字符串”) （注意：类名字符串必须是全称，包名+类名）
    2.类名.class
    3.实例对象.getClass()
    在Class类中有一个非常重要的方法


 * @author 陈中强
 * @Time  2017年2月21日 下午2:36:57
 */
public class Reflection {

    public static void main(String[] args) {

        // 普通创建类的实例

        People p1 = new People();
        System.out.println(p1.getName());
        // 利用反射获取类的实例
        Class clazz = People.class;
        // 常用方式,注意括号中需要放类的全路径名
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

    private String name = "张三";
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