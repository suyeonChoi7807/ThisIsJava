package com.kosta.day02;

import java.util.Scanner;

public class LeapYear2 {

	public static void main(String[] args) {
		// switch�� ��� - ����
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�� ���� �Է��ϼ���(ex.2000 2)");
		int year;
		int month;
		int lastDay=31;
		year = sc.nextInt();
		month= sc.nextInt();
        
		switch (month) {
		case 2:
			if(((year%4==0)&&(year%100!=0))||(year%400==0))
				lastDay=29;
			else
				lastDay=28;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
				lastDay=30;
		}
		
		System.out.println(year+"��"+month+"��"+"�� ������ ��¥�� "+lastDay+"�Դϴ�.");
		

	}

}