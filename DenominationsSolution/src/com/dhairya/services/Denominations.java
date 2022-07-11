package com.dhairya.services;

public class Denominations {

	public void implementNotesCount(int[] noteDenomination, int amount) {
		int noteCounter[] = new int[noteDenomination.length];
		try {
			for(int i=0; i<noteDenomination.length; i++) {
				if(amount > noteDenomination[i]) {
					noteCounter[i] = amount / noteDenomination[i];
					amount -= (noteCounter[i] * noteDenomination[i]);
				}
			}
			if(amount > 0) {
				System.out.println("The exact amount cannot be given with the highest denomination.");
			}
			else {
				System.out.println("Your payment in order to give minimum number of notes will be: ");
				for(int i=0; i<noteDenomination.length; i++) {
					if(noteCounter[i] != 0) {
						System.out.println(noteDenomination[i] + " : " + noteCounter[i]);
					}
				}
			}
		}
		catch(ArithmeticException ae){
			System.out.println(ae + "Note of denomination is invalid.");
		}
	}
	

}
