package com.musketters.springpoc.accountservice.service;

import com.musketters.springpoc.accountservice.dto.UserRegistrationDto;
import com.musketters.springpoc.accountservice.client.AuthServiceFeignClient;
import com.musketters.springpoc.accountservice.dto.UserDto;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {

    private final AuthServiceFeignClient authServiceFeignClient;

    public AccountServiceImpl(AuthServiceFeignClient authServiceFeignClient) {
        this.authServiceFeignClient = authServiceFeignClient;
    }

    @Override
    public UserDto create(UserRegistrationDto user) {
        return authServiceFeignClient.createUser(user);
    }
}
