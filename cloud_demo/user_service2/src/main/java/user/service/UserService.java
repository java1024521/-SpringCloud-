package user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import user.dao.UserDao;
import user.entity.User;

@Service
public class UserService {
    @Autowired
    UserDao userDao;
    public User queryUserById(Long id){
     // User user=  userDao.queryById(id);
    User user=new User();
    user.setUserName("大宇");
    user.setId(1L);
    user.setName("程序员知识码头");
    user.setPassWord("1111");
        return user;
    }
}
