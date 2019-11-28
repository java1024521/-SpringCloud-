package user.service;


import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


/**
 *@ClassName Uservice
 *@Description TODO
 *@Author DL
 *@Date 2019/11/18 16:34    
 *@Version 1.0
 */
@Service
public class Uservice {
    @Autowired
    private RestTemplate restTemplate;
    /**
     *  Eureka客户端，可以获取到服务实例信息
     */
    @Autowired
    private DiscoveryClient discoveryClient;
    //申明一个失败回滚的方法
    @HystrixCommand(fallbackMethod="getUserByIdError")
    public String getUserById(Long id){
        //只需要填写服务名称就可以了
        String url="http://user-service/user/";
        String user=restTemplate.getForObject(url+id,String.class);
        return user;
    }
    public String getUserByIdError(Long id){
        return "对不起，服务繁忙，请您稍后再试";
    }
}
