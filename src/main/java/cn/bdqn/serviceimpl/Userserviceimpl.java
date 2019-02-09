package cn.bdqn.serviceimpl;

import cn.bdqn.dao.UserMapper;
import cn.bdqn.pojo.User;
import cn.bdqn.service.Userservice;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;


@Service
public class Userserviceimpl implements Userservice {

    //注入主键
    @Resource
    private UserMapper userMapper;

    @Override
    public User findUser(int sn, String password) {
        return userMapper.findUser(sn,password);
    }
}
