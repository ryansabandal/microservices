package com.eazybytes.accounts.service.impl;

import org.springframework.stereotype.Service;

import com.eazybytes.accounts.dto.CustomerDto;
import com.eazybytes.accounts.repository.AccountsRepository;
import com.eazybytes.accounts.repository.CustomerRepository;
import com.eazybytes.accounts.service.IAccountsService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class AccountsServiceImpl implements IAccountsService {

  private AccountsRepository accountsRepository;
  private CustomerRepository customerRepository;

  @Override
  public void createAccount(CustomerDto customerDto) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'createAccount'");
  }

}
