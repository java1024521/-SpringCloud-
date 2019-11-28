package server; /**
 * @ClassName EurekaServerApplication
 * @Description TODO
 * @Author DL
 * @Date 2019/11/19 17:25
 * @Version 1.0
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 *@ClassName 服务启动类
 *@Description TODO
 *@Author DL
 *@Date 2019/11/19 17:25    
 *@Version 1.0
 */
//开启注册服务
@EnableEurekaServer
@SpringBootApplication
public class EurekaServer2Application {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServer2Application.class,args);
    }
}
