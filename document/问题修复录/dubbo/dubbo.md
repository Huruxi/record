#### 运行报错：java.io.IOException: invalid constant type: 15
```
//2019年6月13日15:48:22
jdk,tomcat更新到jdk1.8与 tomcat8
运行报错：java.io.IOException: invalid constant type: 15
pom.xml文件中更新javassist的版本从3.15到3.18

<dependency>
    <groupId>org.javassist</groupId>
    <artifactId>javassist</artifactId>
    <version>3.18.2-GA</version>
</dependency>
```