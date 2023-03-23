package cn.itcast_03;

import java.util.ArrayList;
import java.util.Collection;

/*
 *���͸߼���
 *����ͨ���<?>
 *		�������ͣ����û����ȷ����ô����Object�Լ������Java����
 *? extends E
 *		�����޶���E��������
 *? super E
 *		�����޶���E���丸��
 */
public class GenericeDemo {
    public static void main(String[] args) {
        // ����ͨ���<?>
        Collection<?> c1 = new ArrayList<Animal>();
        Collection<?> c2 = new ArrayList<Dog>();
        Collection<?> c3 = new ArrayList<Cat>();
        Collection<?> c4 = new ArrayList<Object>();
        System.out.println("--------------------");

        // ? extends E
        Collection<? extends Animal> c5 = new ArrayList<Animal>();
        Collection<? extends Animal> c6 = new ArrayList<Dog>();
        Collection<? extends Animal> c7 = new ArrayList<Cat>();
        // Collection<? extends Animal> c8 = new ArrayList<Object>();
        System.out.println("--------------------");

        // ? super E
        Collection<? super Animal> c9 = new ArrayList<Animal>();
        // Collection<? super Animal> c10 = new ArrayList<Dog>();
        // Collection<? super Animal> c11 = new ArrayList<Cat>();
        Collection<? super Animal> c12 = new ArrayList<Object>();
    }
}

class Animal {
}

class Dog extends Animal {
}

class Cat extends Animal {
}