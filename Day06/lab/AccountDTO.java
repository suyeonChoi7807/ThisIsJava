package com.kosta.day06.lab;
/*
 * @author KOSTA
 * Account정보 display한다.
 */

//DTO(Data Transfer Object)

public class AccountDTO {
	private String ano;
	private String owner;
	private int balance;
	
	public AccountDTO(String ano, String owner, int balance) {
		this.ano= ano;
		this.owner= owner;
		this.balance= balance;
	}

	//@override: 컴파일러에게 전달
	//재정의가 맞는지?
	
	@Override
	public String toString() {
		return "AccountDTO [ano=" + ano + ", owner=" + owner + ", balance=" + balance + "]";
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	

}
