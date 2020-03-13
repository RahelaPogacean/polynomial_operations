package model;

import java.util.Comparator;

public class SortByExponent implements Comparator<Monom>  {
	
	public int compare(Monom m1, Monom m2) { 
		return m2.getPutere()-m1.getPutere();
		


	}

}


