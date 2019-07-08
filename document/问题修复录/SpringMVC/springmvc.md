### Spring MVC使用@ResponseBody返回JSON数据406以及乱码问题解决方案

第一步，引入包：
```
    <dependency>
        <groupId>com.fasterxml.jackson.core</groupId>
        <artifactId>jackson-core</artifactId>
        <version>2.2.3</version>
    </dependency>
    <dependency>
        <groupId>com.fasterxml.jackson.core</groupId>
        <artifactId>jackson-databind</artifactId>
        <version>2.2.3</version>
    </dependency>
    <dependency>
        <groupId>com.fasterxml.jackson.core</groupId>
        <artifactId>jackson-annotations</artifactId>
        <version>2.2.3</version>
    </dependency>
		
```

第二步，修改Spring MVC的配置文件（高能预警：切记需要使用3.2及以上xsd），增加如下代码：
修改于2015-8-26 16:24:58  解决了直接返回String时乱码的问题

```
<!-- 启动注解驱动的Spring MVC功能，注册请求url和注解POJO类方法的映射 -->
<!-- 通过注解，把URL映射到Controller上，该标签默认注册RequestMappingHandlerMapping和RequestMappingHandlerAdapter -->
<!-- 解决@ResponseBody注解直接返回对象并转换成JSON时出现406问题，同时解决了返回String类型乱码的问题 -->
	<mvc:annotation-driven>
		<mvc:message-converters>
			<bean class="org.springframework.http.converter.StringHttpMessageConverter">
				<property name="supportedMediaTypes">
					<list>
						<value>text/plain;charset=UTF-8</value>
						<value>text/html;charset=UTF-8</value>
					</list>
				</property>
			</bean>
			<bean
				class="org.springframework.http.converter.json.MappingJackson2HttpMessageConverter">
				<property name="supportedMediaTypes">
					<list>
						<value>application/json; charset=UTF-8</value>
						<value>application/x-www-form-urlencoded; charset=UTF-8</value>
					</list>
				</property>
			</bean>
		</mvc:message-converters>
	</mvc:annotation-driven>
```