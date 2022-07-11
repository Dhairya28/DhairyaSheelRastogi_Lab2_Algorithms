package com.dhairya.driver;

import java.util.Scanner;

import com.dhairya.transactions.Transaction;

public class PayMoneyDriver {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Transaction tr = new Transaction();
		System.out.println("Enter the size of transaction array");
		int size = sc.nextInt();
		int[] transactionArray = new int[size];
		
		
		for (int i =0;i<size;i++) {
			System.out.println("Enter daily transactions in Crores of Day: " + (i+1));
			transactionArray[i]= sc.nextInt();
		}
		tr.displayTransactions(transactionArray);
		System.out.println();
		
		System.out.println("Enter the total no of targets that needs to be achieved");
		int targetCount = sc.nextInt();
		
		for (int j=0;j<targetCount;j++) {
			System.out.println("Enter the value of "+ (j+1) +" target");
			int target = sc.nextInt();
			int result = tr.isTargetReached(transactionArray,target);
			if(result==-1) {
				System.out.println("Given target is not achieved");
			}else {
				System.out.println("Target achieved after "+result+" transactions");
			}
		}
		

	}

}
