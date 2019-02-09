package cn.bdqn.dao;
import cn.bdqn.pojo.User;
import org.apache.ibatis.annotations.Param;
/**
 * 用户功能接口
 */
public interface UserMapper {

    public User findUser(@Param("sn")int sn,@Param("password")String password);

}
