/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package grafy;

/**
 *
 * @author ajka
 */

import java.awt.Color;
import java.awt.Graphics;

public class Bod {
	private int x;
	private int y;
	private int r;

	public Bod(int x, int y, int r) {
		this.x = x;
		this.y = y;
		this.r = r;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getX() {
		return x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getY() {
		return y;
	}

	public int getR() {
		return r;
	}

	public void setR(int w) {
		this.r = w;
	}

	public void paintBod(Graphics g) {
		Color c = Color.BLACK;
		g.setColor(c);
		g.fillOval(x, y, r, r);
	}

	public boolean inBod(int x, int y) {
		if ((x >= this.x) && (x <= this.x + this.r) && (y >= this.y)
				&& (y <= this.y + this.r))
			return true;
		else
			return false;
	}

}