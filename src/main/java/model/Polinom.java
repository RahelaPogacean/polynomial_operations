package model;

import java.util.*;

public class Polinom {
	 ArrayList<Monom> mono;

	public Polinom() {
		mono = new ArrayList<Monom>();
	}
	
	public void addMonom(Double coef, int putere) {
		this.mono.add(new Monom(coef, putere));
	}

	public void removeMonom(Monom m) {
		mono.remove(m);
		
	}
	
	public void sortExponent() {
		mono.sort(new SortByExponent());
	}
	
	public static Polinom actualizeazaCoef(Polinom p3) {
		p3.sortExponent();
		int i=0;
		while(i<p3.mono.size()-1) {
			if(p3.mono.get(i).getPutere()==p3.mono.get(i+1).getPutere()) {
		
			p3.mono.get(i+1).setCoeficient(p3.mono.get(i).getCoeficient()+p3.mono.get(i+1).getCoeficient());
			p3.removeMonom(p3.mono.get(i));
		}
			else if(p3.mono.get(i).getCoeficient()==0) {
				p3.removeMonom(p3.mono.get(i));
			}
			i++;	
	}
		return p3;
	}
	
	public static Polinom sumaPoli(Polinom p1, Polinom p2) {
		Polinom p3=new Polinom();
	
		for(Monom m: p1.mono) {
			p3.addMonom(m.getCoeficient(), m.getPutere());
		}
		
		for(Monom m: p2.mono) {
			p3.addMonom(m.getCoeficient(), m.getPutere());
		}
		Polinom.actualizeazaCoef(p3);
	
		return p3;
	}
	
	public static Polinom diferentaPoli(Polinom p1, Polinom p2) {
		Polinom p3=new Polinom();
	
		for(Monom m: p1.mono) {
			p3.addMonom(m.getCoeficient(), m.getPutere());
		}
		for(Monom m: p2.mono) {
			p3.addMonom(m.getCoeficient()*(-1), m.getPutere());
		}
		Polinom.actualizeazaCoef(p3);
		return p3;
	}
		
	public static Polinom produsPoli(Polinom p1, Polinom p2) {
		
		int i=0, j=0;
		Polinom p3=new Polinom();
		ArrayList<Monom> rez=new ArrayList<Monom>();
		Double coef;
		Monom aux;
		int putere;
		
		while(i<p1.mono.size()) {
			if(j<p2.mono.size()) {
				coef=p1.mono.get(i).getCoeficient()*p2.mono.get(j).getCoeficient();
				putere=p1.mono.get(i).getPutere()+ p2.mono.get(j).getPutere();
				aux=new Monom(coef, putere);
				rez.add(aux);
				j++;
			}
			if(j==p2.mono.size()) {
				j=0;
				i++;	
			}	
		}
		p3.mono=rez;
		Polinom.actualizeazaCoef(p3);
		return p3;
	}
	
	public static Polinom derivarePoli(Polinom p1) {
		int i=0;
		while(i<p1.mono.size()) {
			if(p1.mono.get(i).getPutere()>0) {
				p1.mono.get(i).setCoeficient(p1.mono.get(i).getCoeficient()*p1.mono.get(i).getPutere());
				p1.mono.get(i).setPutere(p1.mono.get(i).getPutere()-1);
		}
			i++;
	}
		Polinom.actualizeazaCoef(p1);
		return p1;
	}
	
	public static Polinom integrarePoli(Polinom p1) {

		int i=0;
		while(i<p1.mono.size()) {
			int exp=p1.mono.get(i).getPutere();
			Double coef=p1.mono.get(i).getCoeficient();
			p1.mono.get(i).setPutere(exp+1);
			exp=p1.mono.get(i).getPutere();
			p1.mono.get(i).setCoeficient(coef/((exp)));
			i++;
		}
		Polinom.actualizeazaCoef(p1);
		return p1;
	}
	public static Polinom readPolinom(String polinom) {
		
		String semn =  polinom.replace("-", "+-");
		String[] element=semn.split("\\+");//element=monom
		
		ArrayList<Monom> rez=new ArrayList<Monom>();

		for(String s: element) {//extrag monoamele
			
			String[] a=s.split("x");//extrag din monoame elementele
			Double coef;
			int putere;
			coef=Double.parseDouble(a[0]);//extrag coeficientul
			putere=Integer.parseInt(a[1].substring(1));//extrag puterea
			rez.add(new Monom(coef, putere));//adaug monomul in lista
				}
		
		Polinom nou=new Polinom();
		nou.mono=rez;//setez polinomul obtinut
		return nou;
	}
	
	public String toString() {
		String s = " ";
		for (Monom a : mono) {
			s += a.toString();
		}
		return s;

	}
}

