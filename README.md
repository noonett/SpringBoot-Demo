# SpringBoot-Demo
This repository memorize the path which I learn springboot building web application. 

### 1. Start demo
Build an simple interaction demo of Controller, Service and Dao to understand IOC and AOC.
#### New annotations:
- Startup
@SpringBootApplication, @SpringBootTest, @ContextConfiguration(classes = xxx.class)
- Spring Bean: @Configuration, @Bean, 
@Component, @Controller, @Repository, @Service
@PostConstruct, @PreDestroy, @Primary
- IOC: @Autowired, @Qualifier

### 2. SpringMVC demo
Build an simple demo of MVC in controller to deal with requests.
1. Reponse to requests with parameters from path or form. 
2. Reponse with a static HTML and a dynamic template HTML with JSON.
#### New annotations:
- Requests: 
@RequestMapping(path = "", method = "")
- Response:
@ResponseBody

### 3. Dao demo
Demo of MyBatis include configuration of Mapper interface, creating entity class and test CURD.
Using MyBatis, we don't need to implement the interface. The only three things we have to do are creating a class as entity in mysql. And a mapper interface telling MyBatis what we want to do. And use a .xml file tell MyBatis the relationship of sql query and the methods, classes.
#### New annotations
- interface: @Mapper, @Repository

### 4. WebSite homepage demo
Demo of using the previous structure include mybatis,nSpringBoot, thymleaf to build an homepage of a community website, showing the posts by page. This demo summary the knowledge of previous demo.
Create a homecontroller using two service to deal with request from homepage. Create DiscussPostService and UserService to provide the service of query the information of posts and users using mapper interfaces and mapper.xml to achieve the query of mysql. Use thymleaf dynamic templates to show posts.

### 5. Logger demo
Demo of using Logger-back structure to log the running time message. We can use LoggerFactory to create a Logger to create logs and use <logback-spring.xml> to config the where we store the logs and how to collect the logs and more details of logs. We can set the level of logs and according to the level collect them in different path. We can check if there are some exception by reading the logs or set stoppoint on IDE or Browser.
