import model.*;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import junit.framework.TestCase;

public class Testii extends TestCase{
	    Polinom p1,p2;
	
    public Testii(  )
    {
        try {
			 p1 = Polinom.readPolinom("2x^2-3x^1");
			 p2= Polinom.readPolinom("1x^1-1x^0");
			} catch (Exception e) {
		}
    }

    @Test public void testAdunare() {
		Polinom p = Polinom.sumaPoli(p1, p2);
		System.out.println(p);
		assertTrue(p.toString().equals("  +2.0 x^2  -2.0 x^1  -1.0 x^0"));
	}
	
    @Test public void testDiferenta() {
		Polinom p =Polinom.diferentaPoli(p1, p2);
		System.out.println(p.toString());
		assertTrue(p.toString().equals("+2.0 x^2  -4.0 x^1 +1.0 x^0"));
	}
	
    @Test public void testInmultire() {
		Polinom p = Polinom.produsPoli(p1, p2);
		assertTrue(p.toString().equals("+2.0 x^3  -5.0 x^2 +3.0 x^1"));
	}
	
    @Test public void testDerivare() {
		Polinom p = Polinom.derivarePoli(p1);
		assertTrue(p.toString().equals("+4.0 x^1  -3.0 x^0"));
	}
	
    @Test public void testIntegrare() {
		Polinom p =Polinom.integrarePoli(p1);
		assertTrue(p.toString().equals("+2.0 x^2  -3.0 x^1"));
	}

}
