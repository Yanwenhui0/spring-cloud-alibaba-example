# spring-cloud-alibaba

> spring-cloud-alibaba-example : in this project there are some solutions of spring-cloud-alibaba for Microservice.

## Modules

- cloud-alibaba-example-dependencies : 项目统一依赖
- cloud-alibaba-example-provider : 服务提供者
- cloud-alibaba-example-consumer : 服务消费者
- cloud-alibaba-example-consumer-feign : 服务消费者-feign
- cloud-alibaba-example-gateway : 统一网关
- cloud-alibaba-example-kafka-provider : kafka-服务提供者
- cloud-alibaba-example-kafka-consumer : kafka-服务消费者
- cloud-alibaba-example-rocketmq-provider : rocketmq-服务提供者
- cloud-alibaba-example-rocketmq-consumer : rocketmq-服务消费者

## Error pooling

### sentinel and open-feign
报错信息：

```java
Caused by: java.lang.AbstractMethodError: com.alibaba.cloud.sentinel.feign.SentinelContractHolder.parseAndValidatateMetadata(Ljava/lang/Class;)Ljava/util/List;
```

原因：
spring cloud H R1 版本中的 feign 版本：2.2.0


sentinel 2.2.1 版本中的 feign 版本：2.2.2

在 feign 2.2.0 的 Contract 接口中有一处拼写错误：
```java
public interface Contract {
  /**
   * Called to parse the methods in the class that are linked to HTTP requests.
   *
   * @param targetType {@link feign.Target#type() type} of the Feign interface.
   */

  // TODO: break this and correct spelling at some point
  List<MethodMetadata> parseAndValidatateMetadata(Class<?> targetType);
```
拼写错误已经在 2.2.2 版本中修改，版本导致变量名不一致出现的错误 parseAndValidatateMetadata > parseAndValidateMetadata

解决方法：
    
    升级 spring cloud 使用 H R5 版本

### spring cloud and kafka

报错信息：
```java
The following method did not exist:

    org.springframework.kafka.core.DefaultKafkaProducerFactory.setBeanName(Ljava/lang/String;)V

The method's class, org.springframework.kafka.core.DefaultKafkaProducerFactory, is available from the following locations:

    jar:file:/D:/work/tools/apache-maven-3.6.1/repo/org/springframework/kafka/spring-kafka/2.3.7.RELEASE/spring-kafka-2.3.7.RELEASE.jar!/org/springframework/kafka/core/DefaultKafkaProducerFactory.class

It was loaded from the following location:

    file:/D:/work/tools/apache-maven-3.6.1/repo/org/springframework/kafka/spring-kafka/2.3.7.RELEASE/spring-kafka-2.3.7.RELEASE.jar

Action:

Correct the classpath of your application so that it contains a single, compatible version of org.springframework.kafka.core.DefaultKafkaProducerFactory
```

原因： 版本冲突，spring cloud 中的 kafka 版本与 spring boot 版本不匹配

解决方法：

    将 spring cloud 版本降到 H R6 以下


[版本对应关系推荐：https://github.com/alibaba/spring-cloud-alibaba/wiki/版本说明](https://github.com/alibaba/spring-cloud-alibaba/wiki/%E7%89%88%E6%9C%AC%E8%AF%B4%E6%98%8E)
