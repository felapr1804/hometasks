package com.vasylyev.hometasks.service;

import com.vasylyev.hometasks.dto.AccountDto;

import java.util.List;


public interface AccountService {

    void addAccount(AccountDto accountDto);

    AccountDto findByName(String name);

    AccountDto getDefaultAccount();

    List<AccountDto> findAll();

}
