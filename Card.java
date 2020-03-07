package WarGame;

public class Card {
	
	private int value;
	private String name;
	
	public static void describe(int value, String name) {
		System.out.println("Card: " + value + " of " + name);
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}	
	
		

}
