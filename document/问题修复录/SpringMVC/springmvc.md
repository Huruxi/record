### Spring MVCʹ��@ResponseBody����JSON����406�Լ���������������

��һ�����������
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

�ڶ������޸�Spring MVC�������ļ�������Ԥ�����м���Ҫʹ��3.2������xsd�����������´��룺
�޸���2015-8-26 16:24:58  �����ֱ�ӷ���Stringʱ���������

```
<!-- ����ע��������Spring MVC���ܣ�ע������url��ע��POJO�෽����ӳ�� -->
<!-- ͨ��ע�⣬��URLӳ�䵽Controller�ϣ��ñ�ǩĬ��ע��RequestMappingHandlerMapping��RequestMappingHandlerAdapter -->
<!-- ���@ResponseBodyע��ֱ�ӷ��ض���ת����JSONʱ����406���⣬ͬʱ����˷���String������������� -->
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