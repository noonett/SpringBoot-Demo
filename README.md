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
