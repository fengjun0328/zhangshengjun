package cn.bdqn.dao;

import cn.bdqn.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 用户功能接口
 */
public interface UserMapper {
    public List<User> checkUser(@Param("sn")int sn,@Param("password")String password);
}
