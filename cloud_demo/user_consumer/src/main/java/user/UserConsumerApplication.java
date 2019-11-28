package user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * @ClassName consumer
 * @Description TODO
 * @Author DL
 * @Date 2019/11/18 16:27
 * @Version 1.0
 */


@SpringBootApplication
@EnableDiscoveryClient
@EnableHystrix
public class UserConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserConsumerApplication.class, args);
    }
}
