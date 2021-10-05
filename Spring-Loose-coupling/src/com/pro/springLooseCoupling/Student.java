package com.pro.springLooseCoupling;

public class Student {

	private Cheat cheat;

	public void setCheat(Cheat cheat) {
		this.cheat = cheat;
	}

	public void displayCheat() {
		cheat.cheat();
	}

}
