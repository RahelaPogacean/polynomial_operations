package model;

public class Monom {

	private double coeficient;
	private int putere;
	
	public Monom(double coeficient, int putere) {
		this.coeficient=coeficient;
		this.putere=putere;
	}
	public Monom() {
		
	}

	public  double getCoeficient() {
		return coeficient;
	}

	public void setCoeficient(double coeficient) {
		this.coeficient = coeficient;
	}

	public int getPutere() {
		return putere;
	}

	public void setPutere(int putere) {
		this.putere = putere;
	}
	
	public String toString() {
		String s=" ";
		if(getCoeficient()<0) {
			return s+ " "+getCoeficient()+" "+ "x^" +getPutere();
		}
		else
			return s+ "+"+getCoeficient()+ " "+"x^" +getPutere();
	}


}
