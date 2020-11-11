package com.qr.service.impl;

import com.qr.dao.IUserDao;
import com.qr.entity.User;
import com.qr.service.IUserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@Service("userservice")
public class IUserServiceImpl implements IUserService {
    @Resource
    private IUserDao userDao;

    @Override
    public User confirmUser(String account) {
        return userDao.confirmLogin(account);
    }

    @Override
    public User addAcount(String account, String password) {
        return userDao.insertAccount(account,password);
    }
}
