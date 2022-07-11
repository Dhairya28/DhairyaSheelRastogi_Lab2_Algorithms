package com.dhairya.driver;

import java.util.Scanner;
import com.dhairya.services.Denominations;
import com.dhairya.services.MergeSort;

public class DenominationsDriver {

	public static void main(String[] args) {
		MergeSort mergeSort = new MergeSort();
		Denominations denominations = new Denominations();
		int size;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the Currency denominations: ");
		size = sc.nextInt();
		System.out.println("Enter the Currency denomination values: ");
		int noteDenomination[] = new int[size];
		for(int i=0; i<size; i++) {
			noteDenomination[i] = sc.nextInt();
		}
		System.out.println("Enter the amount you want to pay: ");
		int amount = sc.nextInt();
		mergeSort.mergeSort(noteDenomination, 0, noteDenomination.length-1);
		denominations.implementNotesCount(noteDenomination, amount);

	}

}
