package com.musketters.springpoc.accountservice.controller;

import com.musketters.springpoc.accountservice.dto.UserRegistrationDto;
import com.musketters.springpoc.accountservice.dto.UserDto;
import com.musketters.springpoc.accountservice.service.AccountService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

    private final AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @PostMapping
    public UserDto createNewAccount(@RequestBody UserRegistrationDto user) {
        return accountService.create(user);
    }

}
