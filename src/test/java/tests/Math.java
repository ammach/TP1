package tests;

import static org.junit.Assert.*;

import java.awt.geom.Ellipse2D;
import java.util.Optional;

import org.junit.Ignore;
import org.junit.Test;

import exo1.Natural;
import exo2.Rational;

public class Math {

	/* test des naturels*/
	@Ignore
	@Test
	public void testAddForNaturals() {
		
		Natural three=new Natural(3);
		Natural four=new Natural(4);
		assertEquals(7, three.add(four).getValue());
	}
	@Ignore
	@Test
	public void testMultiplyForNaturals() {
		
		Natural three=new Natural(3);
		Natural four=new Natural(4);
		assertEquals(12, three.multiply(four).getValue());
	}
	@Ignore
	@Test
	public void testSubstractForNaturals() {
		
		Natural three=new Natural(3);
		Natural four=new Natural(4);
		assertEquals(-1, three.substract(four).getValue());
	}
	@Ignore
	@Test
	public void testDivideForNaturals() {
		
		Natural three=new Natural(3);
		Natural four=new Natural(4);
		Optional<Natural> divisionResultatOptional=three.divide(four);
		assertEquals(0, divisionResultatOptional.get().getValue());
	}
	
	/* test des rationnels*/
	
	@Ignore
	@Test
	public void testAddForRationals() {
		
		Rational twoByThree=new Rational(2, 3);
		Rational oneByFour=new Rational(1, 4);
		Rational elevenByTwelve=twoByThree.add(oneByFour);
		assertEquals(11/12, elevenByTwelve.getNumerator()/elevenByTwelve.getDenominator());
	}
	@Ignore
	@Test
	public void testMultiplyForRationals() {
		
		Rational twoByThree=new Rational(2, 3);
		Rational oneByFour=new Rational(1, 4);
		Rational oneBySix=twoByThree.multiply(oneByFour);
		assertEquals(1/6, oneBySix.getNumerator()/oneBySix.getDenominator());
	}
	
	@Test
	public void testPgcd() {
		Natural twentyFour=new Natural(24);
		Natural thirtySix=new Natural(36);
		assertEquals(new Integer(12), Natural.pgcd(twentyFour, thirtySix));
	}

}
