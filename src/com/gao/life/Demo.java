package com.gao.life;

import java.lang.invoke.SwitchPoint;
import java.security.PublicKey;

public class Demo {
	
	//��ϰ if for switch while�÷� ��ʽ
	
	//if �÷� 1.if{}else{}  2.if{}
	
	public void test1(int x){
		if (x>1)
	{
			System.out.println("x>1");
		}else{
			System.out.println("x>=1");			
		}
		
	}
	
	//for��ѭ���� �÷�
	
	public void test2(){
		for (int i = 1; i <= 9; i++) {
			System.out.print("*");
		}		
	}
	
	//switch  ����ѡ�����
	public void test3(int x){
		switch (x) {
		case 1:
			System.out.println("*");
//			break;    //break(����)  ����
		case 2:
			System.out.println("**");
//			break;
		case 3:
			System.out.println("***");
//			break;
		case 4:
			System.out.println("****");
			break;
		case 5:
			System.out.println("*****");
			break;
						
		default:
			System.out.println("///");
			break;
		}
		}
		
		//while
		public void test4(){
			int x=1;
			while (x<100000000) {
				
				x++;
				System.out.println(x);
			}
			
		}
		
	}
	
	

