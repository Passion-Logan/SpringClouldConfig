package com.cody;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * spring.application.name：对应配置文件规则中的{application}部分
 * spring.cloud.config.profile：对应配置文件规则中的{profile}部分
 * spring.cloud.config.label：对应配置文件规则中的{label}部分
 * spring.cloud.config.uri：配置中心config-server的地址
 * <p>
 * 这里需要格外注意：上面这些属性必须配置在bootstrap.properties中，这样config-server中的配置信息才能被正确加载。
 * 访问http://localhost:2001/info ，我们可以看到该端点将会返回从git仓库中获取的配置信息
 */
@SpringBootApplication
public class ConfigClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigClientApplication.class, args);
    }

}
