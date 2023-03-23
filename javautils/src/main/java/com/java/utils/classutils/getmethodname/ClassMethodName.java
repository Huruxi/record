package com.java.utils.classutils.getmethodname;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 *  获取class 方法名称
 * @author hrd <br/>
 * @date 2023/3/22
 */
public class ClassMethodName {

    public static void main(String[] args) {
        SerializedLambda resolve = resolve(ClassMethodName::testMethodName);
        System.out.println(resolve.getImplMethodName());
    }

    public static void testMethodName(){
    }

    /**
     * 获取
     * @param lambda
     * @return
     */
    public static SerializedLambda resolve(FunctionFieldName lambda) {
        if (!lambda.getClass().isSynthetic()) {
            throw new RuntimeException("该方法仅能传入 lambda 表达式产生的合成类");
        }

        try {
            ObjectInputStream objIn = new ObjectInputStream(new ByteArrayInputStream(serialize(lambda))) {
                @Override
                protected Class<?> resolveClass(ObjectStreamClass objectStreamClass) throws IOException, ClassNotFoundException {
                    Class<?> clazz = super.resolveClass(objectStreamClass);
//                return clazz == java.lang.invoke.SerializedLambda.class ? SerializedLambda.class : clazz;
                    System.out.println(clazz.getName());
                    return clazz == java.lang.invoke.SerializedLambda.class ? SerializedLambda.class : clazz;
                }
            };

            return (SerializedLambda) objIn.readObject();
        } catch (ClassNotFoundException | IOException e) {
            throw new RuntimeException("This is impossible to happen", e);
        }

    }

    /**
     * 反射获取
     * @param lambda
     * @return
     */
    public java.lang.invoke.SerializedLambda reflectMethodName(FunctionFieldName lambda){

        try {
            Method writeReplace = lambda.getClass().getDeclaredMethod("writeReplace");
            writeReplace.setAccessible(true);
            return (java.lang.invoke.SerializedLambda)writeReplace.invoke(lambda);

        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static byte[] serialize(Object object) {
        if (object == null) {
            return null;
        }
        ByteArrayOutputStream baos = new ByteArrayOutputStream(1024);
        try {
            ObjectOutputStream oos = new ObjectOutputStream(baos);
            oos.writeObject(object);
            oos.flush();
        } catch (IOException ex) {
            throw new IllegalArgumentException("Failed to serialize object of type: " + object.getClass(), ex);
        }
        return baos.toByteArray();
    }
}
