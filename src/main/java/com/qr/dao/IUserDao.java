package com.qr.dao;

import com.qr.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository("userdao")
public interface IUserDao {
    User confirmLogin(@Param("account") String account);

    void insertAccount(@Param("account") String account, @Param("password") String password);

    void updateAccountInfo(@Param("userImage") String userImage, @Param("account") String account, @Param("userName") String userName, @Param("realName") String realName, @Param("idCardNum") String idCardNum, @Param("sex") int sex, @Param("userTel") String userTel, @Param("address") String address);
}
