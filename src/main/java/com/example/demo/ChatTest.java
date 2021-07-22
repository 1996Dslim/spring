package com.example.demo;

public class ChatTest {
	
	public static void main(String[] args) {
		
		int[] number = {4,30,12,1,45,15,7,8,45,67};
		int max = number[0];
		int min = number[0];
		
		for(int i  = 0; i < number.length ; i++) {
			if(number[i] > max) {
				max = number[i];
			}
			else if(number[i] < min) {
				min = number[i];
			}
		}
		System.out.println(max);
		System.out.println(min);
		
	}
	
}
