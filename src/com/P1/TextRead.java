package com.P1;

public class TextRead {
	static int i = 5;

	public static int read(){
		try {
			int k=i/2;
			return k;
			
		} catch (Exception e) {
			return i;
			// TODO: handle exception
		}
		finally {
			System.out.println("Finally");
			return 9;
		}
		
	}
	
	public static void main(String[] args) {
		System.out.println("User1 TextRead");
		System.out.println(read());
	}

}
