package model;

import model.enumeration.Color;
import model.interfaces.Slot;

public class SlotImpl implements Slot {

	private int position;
	private int number;
	private Color color;

	public SlotImpl(int position, Color color, int number) {
		this.position = position;
		this.color = color;
		this.number = number;
	}

	@Override
	public int getPosition() {
		return this.position;
	}

	@Override
	public int getNumber() {
		return this.number;
	}

	@Override
	public Color getColor() {
		return this.color;
	}

	@Override
	public boolean equals(Slot slot) {
		if(slot.getPosition() == position && slot.getNumber() == number && slot.getColor() == color) {
			return true;
		}
		return false;

	}

	@Override
	public String toString() {
		return String.format("Position: %d Number: %d Colour: %s", position, number, color);
	}

}
