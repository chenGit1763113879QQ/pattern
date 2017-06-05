///**
// *Json2BeanUtils.java
// * Administrator
// *2017��2��21������2:46:40
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
// *  ���� ����д��һ��JsonObject����תJavaBean��һ�������࣬��Ҫע����ǣ�JSON��key��Ҫ���ֶ�������һ�£���˵��˼· 
//	������ͨ�������ȡJavaBean�е������ֶ�ֵ������ 
//	��ƴ�ӳ�set���� 
//	�������ֶ�����Json��keyֵ��ͬ�������Զ�����ȡJson�е�ֵ������ʵ��������
//
// * @author ����ǿ
// * @Time  2017��2��21�� ����2:46:40
// */
//public class Json2BeanUtils {
//
//    public static <T> T jsonToBean(JSONObject response, Class<T> clazz) {
//        try {
//            // �������ʵ��
//            Object object = Class.forName(clazz.getName()).newInstance();
//            // ��ȡ���е����г�Ա����
//            Field[] fields = object.getClass().getDeclaredFields();
//            for (int i = 0; i < fields.length; i++) {
//                //����Ȩ��
//                fields[i].setAccessible(true);
//                // ��ȡ�ֶε�����
//                String fieldName = fields[i].getName();
//                // ���˵�UID
//                if (fieldName.endsWith("serialVersionUID")) {
//                    continue;
//                }
//                // ��ȡ�ֶε�����
//                String fieldType = fields[i].getGenericType().toString();
//                // ƴ�ӳ�JavaBean�е�set���� ������һ���� ���潲��
//                String methodName = "set"
//                        + fieldName.substring(0, 1).toUpperCase()
//                        + fieldName.substring(1);
//                try {
//                    // �жϱ�������
//                    if (fieldType.endsWith("class java.lang.String")) {
//                        // ��ȡ��set����
//                        Method m = object.getClass().getMethod(methodName,
//                                String.class);
//                        String value = null;
//                        try {
//                            // ��JsonObj��ȡ����Ӧ��ֵ
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
//                        // ��ֵ
//                        m.invoke(object, value);
//                    } else if (fieldType.endsWith("int")
//                            || fieldType.endsWith("class java.lang.Integer")) {
//                        // int ����
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
//                        // boolean ����
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
//                        // double ����
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
//                        // char���� JSONObject û��char
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
//                        // float����
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