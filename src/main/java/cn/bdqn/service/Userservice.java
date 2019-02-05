package cn.bdqn.service;

import cn.bdqn.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface Userservice {

    public List<User> checkUser(int sn,String password);
}
