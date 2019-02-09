package cn.bdqn.service;

import cn.bdqn.pojo.User;
public interface Userservice {

    public User findUser(int sn,String password);

}
