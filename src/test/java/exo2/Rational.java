package exo2;

import exo1.Natural;

public class Rational {

	int numerator;
	int denominator;

	public Rational(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
	}

	public int getNumerator() {
		return numerator;
	}

	public int getDenominator() {
		return denominator;
	}

	public Rational add(Rational rational) {
		int numeratorResultat = this.getNumerator() * rational.getDenominator()
				+ rational.getNumerator() * this.getDenominator();
		int denominatorResultat = this.getDenominator() * rational.getDenominator();
		return new Rational(numeratorResultat, denominatorResultat);
	}

	public Rational multiply(Rational rational) {
		int numeratorResultat = this.getNumerator() * rational.getNumerator();
		int denominatorResultat = this.getDenominator() * rational.getDenominator();
		return new Rational(numeratorResultat, denominatorResultat);
	}

	
	

}
