package com.java.utils.classutils.getmethodparamname;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.Arrays;

/**
 *  获取类方法参数名称
 * @author hrd <br/>
 * @date 2023/3/23
 */
public class TestMethodArg {

    public static void main(String[] args) {
        TestMethodArg testMethodArg = new TestMethodArg();
        testMethodArg.test();
    }


        public void  method1(String name,String email){
            System.out.println(name+":"+email);

        }

        public void test(){
            Class<TestMethodArg> clazz = TestMethodArg.class;
            try {
                //得到方法实体
                Method method = clazz.getMethod("method1", String.class, String.class);
                //得到该方法参数信息数组
                Parameter[] parameters = method.getParameters();
                //遍历参数数组，依次输出参数名和参数类型
                Arrays.stream(parameters).forEach(p->{
                    System.out.println(p.getName()+" : "+p.getType());
                });
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            }
        }


}
