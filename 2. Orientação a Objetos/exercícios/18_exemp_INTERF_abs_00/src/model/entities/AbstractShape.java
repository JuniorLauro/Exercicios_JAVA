package model.entities;

import model.enums.Color;

import model.services.Shapes;

public abstract class AbstractShape implements Shapes {

	private Color color;
	
	public AbstractShape() {
	}
	
	public AbstractShape(Color color) {
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
	
}