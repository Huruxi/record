package cn.hrd.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author hrd <br/>
 * @date 2019/7/15
 */
public class StreamDemo {

    public static void main(String[] args) {

        List< String> createStream = new ArrayList< String>();

        // 顺序流
        Stream< String> stream = createStream.stream();

        // 并行流
        Stream< String> parallelStream = createStream.parallelStream();

        // of()方法创建
        Stream< String> stringStream = Stream.of(
                createStream.toArray(new String[createStream.size()]));

        streamImpl(initData());
        java7Impl(initData());
    }

    public static void streamImpl(List<Student> students) {
        List<Student> filterStudent = students.stream()
                .filter(one -> one.getScore() < 60).collect(Collectors.toList());

        System.out.println(filterStudent);
    }

    public static void java7Impl(List<Student> students) {
        List<Student> filterStudent = new ArrayList<>();
        for (Student student : students) {
            if (student.getScore() < 60) {
                filterStudent.add(student);
            }
        }
        System.out.println(filterStudent);
    }

    public static List<Student> initData() {
        List<Student> students = new ArrayList<>();
        students.add(new Student("张三", 60));
        students.add(new Student("李四", 80));
        students.add(new Student("王五", 50));
        students.add(new Student("赵六", 70));
        students.add(new Student("孙七", 90));
        students.add(new Student("周八", 30));
        return students;
    }
}
