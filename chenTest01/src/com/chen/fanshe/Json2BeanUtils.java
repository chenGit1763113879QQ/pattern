///**
// *Json2BeanUtils.java
// * Administrator
// *2017年2月21日下午2:46:40
// *
// */
//package com.chen.fanshe;
//
//import java.lang.reflect.Field;
//import java.lang.reflect.Method;
//
//import com.alibaba.fastjson.JSONObject;
//
///**
// *  
// *  
// *  下面 是我写的一个JsonObject对象转JavaBean的一个工具类，需要注意的是，JSON的key需要和字段名保持一致，先说下思路 
//	①首先通过反射获取JavaBean中的所有字段值的名称 
//	②拼接出set方法 
//	③由于字段名和Json的key值相同，利用自动名获取Json中的值并填充的实例对象中
//
// * @author 陈中强
// * @Time  2017年2月21日 下午2:46:40
// */
//public class Json2BeanUtils {
//
//    public static <T> T jsonToBean(JSONObject response, Class<T> clazz) {
//        try {
//            // 创建类的实例
//            Object object = Class.forName(clazz.getName()).newInstance();
//            // 获取类中的所有成员变量
//            Field[] fields = object.getClass().getDeclaredFields();
//            for (int i = 0; i < fields.length; i++) {
//                //设置权限
//                fields[i].setAccessible(true);
//                // 获取字段的名称
//                String fieldName = fields[i].getName();
//                // 过滤掉UID
//                if (fieldName.endsWith("serialVersionUID")) {
//                    continue;
//                }
//                // 获取字段的类型
//                String fieldType = fields[i].getGenericType().toString();
//                // 拼接出JavaBean中的set方法 这里有一个坑 后面讲解
//                String methodName = "set"
//                        + fieldName.substring(0, 1).toUpperCase()
//                        + fieldName.substring(1);
//                try {
//                    // 判断变量类型
//                    if (fieldType.endsWith("class java.lang.String")) {
//                        // 获取到set方法
//                        Method m = object.getClass().getMethod(methodName,
//                                String.class);
//                        String value = null;
//                        try {
//                            // 从JsonObj中取出相应的值
//                            value = response.getString(fieldName);
//                        } catch (Exception e) {
//                            e.printStackTrace();
//                            value = "";
//                        }
//                        if (TextUtils.isEmpty(value)) {
//                            value = "";
//                        } else if (value.endsWith("null")) {
//                            value = "";
//                        }
//                        // 赋值
//                        m.invoke(object, value);
//                    } else if (fieldType.endsWith("int")
//                            || fieldType.endsWith("class java.lang.Integer")) {
//                        // int 类型
//                        System.out.println();
//                        Method m = object.getClass().getMethod(methodName,
//                                int.class);
//                        int value = -1;
//                        try {
//                            value = response.getInt(fieldName);
//                        } catch (Exception e) {
//                            e.printStackTrace();
//                            value = -1;
//                        }
//                        m.invoke(object, value);
//
//                    } else if (fieldType.endsWith("boolean")
//                            || fieldType
//                                    .endsWith("fieldType:class java.lang.Boolean")) {
//                        // boolean 类型
//                        Method m = object.getClass().getMethod(methodName,
//                                boolean.class);
//                        boolean value = false;
//                        try {
//                            value = response.getBoolean(fieldName);
//                        } catch (Exception e) {
//                            e.printStackTrace();
//                            value = false;
//                        }
//                        m.invoke(object, value);
//                    } else if (fieldType.endsWith("double")
//                            || fieldType
//                                    .endsWith("fieldType:class java.lang.Double")) {
//                        // double 类型
//                        Method m = object.getClass().getMethod(methodName,
//                                double.class);
//                        double value = -1D;
//                        try {
//                            value = response.getDouble(fieldName);
//                        } catch (Exception e) {
//                            e.printStackTrace();
//                            value = -1D;
//                        }
//                        m.invoke(object, value);
//                    } else if (fieldType.endsWith("char")) {
//                        // char类型 JSONObject 没有char
//                        Method m = object.getClass().getMethod(methodName,
//                                String.class);
//                        String value = "";
//                        try {
//                            value = response.getString(fieldName);
//                        } catch (Exception e) {
//                            e.printStackTrace();
//                            value = "";
//                        }
//                        m.invoke(object, value);
//                    } else if (fieldType.endsWith("float")
//                            || fieldType
//                                    .endsWith("fieldType:class java.lang.Float")) {
//                        // float类型
//                        Method m = object.getClass().getMethod(methodName,
//                                double.class);
//                        double value = -1D;
//                        try {
//                            value = response.getDouble(fieldName);
//                        } catch (Exception e) {
//                            e.printStackTrace();
//                            value = -1D;
//                        }
//                        m.invoke(object, value);
//
//                    } else if (fieldType.endsWith("short")
//                            || fieldType
//                                    .endsWith("fieldType:class java.lang.Short")) {
//                        // short
//                        Method m = object.getClass().getMethod(methodName,
//                                short.class);
//                        int value = -1;
//                        try {
//                            value = response.getInt(fieldName);
//                        } catch (Exception e) {
//                            e.printStackTrace();
//                            value = -1;
//                        }
//                        m.invoke(object, value);
//                    } else if (fieldType.endsWith("byte")
//                            || fieldType
//                                    .endsWith("fieldType:class java.lang.Byte")) {
//                        Method m = object.getClass().getMethod(methodName,
//                                byte.class);
//                        int value = -1;
//                        try {
//                            value = response.getInt(fieldName);
//                        } catch (Exception e) {
//                            e.printStackTrace();
//                            value = -1;
//                        }
//                        m.invoke(object, value);
//                    } else if (fieldType.endsWith("long")
//                            || fieldType
//                                    .endsWith("fieldType:class java.lang.Long")) {
//                        Method m = object.getClass().getMethod(methodName,
//                                long.class);
//                        Long value = -1L;
//                        try {
//                            value = response.getLong(fieldName);
//                        } catch (Exception e) {
//                            e.printStackTrace();
//                            value = -1L;
//                        }
//                        m.invoke(object, value);
//                    }  
//                } catch (Exception e) {
//                    // TODO: handle exception
//                }
//            }
//            return (T) object;
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//        return null;
//    }
//
//}