# spring-cloud-demo
spring cloud不常用组件
spring-cloud-hystrix的使用
spring-cloud-sleuth+zipkin ui
spring-cloud-sleuth+zipkin 持久化mysql数据库
spring-cloud-ribbon负载均衡策略


turbine是一个聚合Hystrix监控数据的工具,单独使用没有任何意义
hystrix-dashboard开启的最小配置
需要一个server监听其他client
    hystrix-dashboard需要被监控的服务开启@EnableHystrix @HystrixCommand注解的方法,可以不开启eureka,一定要开启actuator