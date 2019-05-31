# RocketMQ集群
   
## 引入maven依赖
```
<dependency>
    <groupId>org.apache.rocketmq</groupId>
    <artifactId>rocketmq-spring-boot-starter</artifactId>
    <version>LATEST</version>
</dependency>
```
## Spring Boot配置
```
rocketmq:
  name-server: 192.168.3.10:9876;192.168.3.11:9876;192.168.3.12:9876;192.168.3.13:9876
  producer:
    group: my-group
```
