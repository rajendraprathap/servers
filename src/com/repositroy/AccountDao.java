package com.repositroy;

import com.model.Account;

public interface AccountDao {
	
	Account login(String username,String password);
	boolean SaveAccount(Account acc);

}
