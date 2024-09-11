package com.syan.user.service.impl;

import com.syan.common.entity.ResultInfo;
import com.syan.user.mapper.UserMapper;
import com.syan.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserMapper userMapper;

}
