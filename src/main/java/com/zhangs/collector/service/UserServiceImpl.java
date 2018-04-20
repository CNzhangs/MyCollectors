package com.zhangs.collector.service;

import com.zhangs.collector.common.LogUtils;
import com.zhangs.collector.entities.User;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public void register(User user) {

    }

    @Override
    public void delete(User user) {
        LogUtils.e("start to delete users:" + user);
    }

    @Override
    public void update(User user) {

    }
}
