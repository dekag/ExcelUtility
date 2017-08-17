package com.P1;

public class ExcelRead {
	
	public static String fileName = "test";
	
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Hello World! GitHub Project");
		ExcelRead obj = new ExcelRead();
		obj.readExcel(fileName);
		
	}
	
	public void readExcel(String fileName) throws InterruptedException{
		
		//Added new sysout
		System.out.println("User1 Commit");
		Thread.sleep(5000);
		System.out.println("User1 Change without pulling");
		System.out.println("User2 Commit");
		//Sysout from User 2
		System.out.println("Test");
		
	}
	
public void readExcel() throws InterruptedException{
		
		//Added new sysout
		System.out.println("User1 Commit");
		Thread.sleep(5000);
		System.out.println("User1 Change without pulling");
		System.out.println("User2 Commit");
		//Sysout from User 2
		System.out.println("Test");
		
	}

}
