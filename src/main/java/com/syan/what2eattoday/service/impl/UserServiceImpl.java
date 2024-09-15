package com.syan.what2eattoday.service.impl;

import com.syan.what2eattoday.mapper.UserMapper;
import com.syan.what2eattoday.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author : syan
 * @date : 2024/9/15
 * @comment :
 */

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserMapper userMapper;

}
