package WarGame;

public class Card {
	
	int[] value = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
	String[] name = {"Diamonds", "Hearts", "Clubs", "Spades"};
	
	public static void describe(int value, String name) {
		System.out.println("Card: " + value + " of " + name);
	}	
	
	public int[] getValue() {
		return value;
	}
	public void setValue(int[] value) {
		this.value = value;
	}
	public String[] getName() {
		return name;
	}
	public void setName(String[] name) {
		this.name = name;
	}	

}
