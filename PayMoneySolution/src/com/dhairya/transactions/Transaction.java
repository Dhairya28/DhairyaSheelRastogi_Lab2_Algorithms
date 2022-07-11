package com.dhairya.transactions;

public class Transaction {
	
	int sumOfTransactions =0;

	public  int  isTargetReached(int[] transactionArray, int target) {
		for(int i=0;i<transactionArray.length;i++) {
			if (target<=transactionArray[i]) {
				return i+1;
			}
			else {
				target = target-transactionArray[i];
			}
		}
		return -1;
	}
	
	

	public void displayTransactions(int[] transactionArray) {
		for (int i =0;i<transactionArray.length;i++) {
			System.out.print(transactionArray[i] + " ");
		}
		System.out.println(" ");	
	}
		

}
