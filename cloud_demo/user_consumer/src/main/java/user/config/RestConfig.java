package user.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 *@ClassName RestConfig
 *@Description TODO
 *@Author DL
 *@Date 2019/11/18 16:28    
 *@Version 1.0
 */
@Configuration
public class RestConfig {
    @Bean
    @LoadBalanced//开启负载均衡
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
