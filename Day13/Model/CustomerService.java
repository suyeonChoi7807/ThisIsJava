package com.kosta.day13.model;

import java.util.*;

//사용자요청-> Controller-> Service(업무로직) -> DAO(Data Access Object)-> DB
//  응답               <-                <-                        <-   
public class CustomerService {

	CustomerDAO dao= new CustomerDAO();

	public List<CustomerDTO> selectAll() {
		//모든 고객을 조회한다.
		return dao.selectAll();
	}

	public CustomerDTO selectById(int custId) {
		//아이디로 고객 정보를 조회한다
		return dao.selectById(custId);
	}

	public CustomerDTO selectByPhone(String phone) {
		//핸드폰 번호로 고객 정보를 조회한다.
		return dao.selectByPhone(phone);
	}

	public int insert(CustomerDTO cust) {
		//고객 정보를 입력한다.(회원가입)
		return dao.insert(cust);
	}	

	public int update(CustomerDTO cust) {
		//고객 정보를 변경한다.
		return dao.update(cust);
	}

	public int delete(int custId) {
		//고객정보를 삭제한다.

		return dao.delete(custId);
	}
}

