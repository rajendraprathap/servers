package com.repositroy;

public class AccountDaoFactory {
	
	public static AccountDao getInstance(){
			return new AccountDaoImpl();
		}

	

}
