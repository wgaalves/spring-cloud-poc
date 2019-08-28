package com.musketters.springpoc.accountservice.service;

import com.musketters.springpoc.accountservice.dto.UserDto;
import com.musketters.springpoc.accountservice.dto.UserRegistrationDto;

public interface AccountService {

    /**
     * Invokes Auth Service user creation
     *
     * @param user
     * @return created account
     */
    UserDto create(UserRegistrationDto user);
}
