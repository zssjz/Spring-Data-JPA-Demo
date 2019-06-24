package com.jason.data.OneToOne.service;

import com.jason.data.OneToOne.model.UserDO;

import java.util.List;

/**
 * UserDO
 */
public interface UserService {

    /**
     * 新增UserDO
     * @param userDO
     * @return
     */
    UserDO saveUser(UserDO userDO);

    /**
     * 通过id删除UserDO
     * @param userId
     */
    void deleteUser(String userId);

    /**
     * 通过id获取UserDO
     * @param userId
     * @return
     */
    UserDO queryUserInfo(String userId);

    /**
     * 获取一组符合条件的UserDO
     * @param userDO
     * @return
     */
    List<UserDO> queryUserList(UserDO userDO);

}
