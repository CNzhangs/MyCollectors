package com.zhangs.collector.service;

import com.zhangs.collector.entities.User;

public interface UserService {
   void  register(User user);
   void delete(User user);
}
