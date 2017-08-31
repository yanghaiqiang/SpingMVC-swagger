1、加入jar包
     maven格式：
     
          <dependency>
              <groupId>com.mangofactory</groupId>
              <artifactId>swagger-springmvc</artifactId>
              <version>0.9.5</version>
          </dependency>
          <dependency>
               <groupId>com.fasterxml.jackson.core</groupId>
               <artifactId>jackson-annotations</artifactId>
              <version>2.4.4 </version>
          </dependency>
          <dependency>
               <groupId>com.fasterxml.jackson.core</groupId>
              <artifactId>jackson-databind</artifactId>
              <version>2.4.4</version>
          </dependency>
          <dependency>
               <groupId>com.fasterxml.jackson.core</groupId>
              <artifactId>jackson-core</artifactId>
              <version>2.4.4 </version>
          </dependency>
2、添加swagger管理类：采用默认的
3、添加SpringSwaggerConfig的依赖：
     在springMVC容器中，添加：
     <bean class="com.mangofactory.swagger.configuration.SpringSwaggerConfig" />
PS：在web.xml里，ContextLoaderListener对应的applicationContext.xml是spring容器
spring-mvc.xml是springMVC的容器。
4、下载swagger-ui的文件，放到webapp下面
5、在springMVC容器里添加
<mvc:resources mapping="/statics/**" location="/statics/"/>
因为我们在web.xml里springMVC的拦截路径是:/，所以需要在springmvc配置文件里添加swagger-ui静态资源的引用！

6、修改上面static文件下面index.html的url = "http://petstore.swagger.io/v2/swagger.json"
--》"http://localhost:8080/2017_02_07/api-docs" ：http://{ip}:{端口号}/{项目名}/api-docs


7、访问：http://localhost:8080/2017_02_07/statics/index.html
