package exo1;

import java.util.Optional;

public class Natural {

	
	int value;
	
	
	
	public Natural(int value) {
		this.value = value;
	}



	public int getValue() {
		return value;
	}



	public Natural add(Natural natural) {
		return new Natural(this.getValue()+natural.getValue());
	}
	
	public Natural multiply(Natural natural) {
		return new Natural(this.getValue()*natural.getValue());
	}
	
	public Natural substract(Natural natural) {
		return new Natural(this.getValue()-natural.getValue());
	}
	
	public Optional<Natural> divide(Natural natural) {
		return (natural.getValue()!=0) ? Optional.of(new Natural(this.getValue()/natural.getValue())) : null;
	}

	/*
	 * Le pgcd d'un chiffre a et de 0 est égal à a.
	   Le pgcd de 2 chiffres a et b différents de 0, a >= b est égal au pgcd de b et du reste de la division de a par b.
	 * */
	public static Integer pgcd(Natural natural1, Natural natural2) {
		
		if (natural1.getValue() == 0) {
			
			return natural2.getValue();
			
		} else if (natural2.getValue() == 0) {
			
			return natural1.getValue();
			
		} else if (natural1.getValue() != 0 && natural2.getValue() != 0 && natural1.getValue() >= natural2.getValue()) {
			
			return pgcd(natural2, new Natural(natural1.getValue()%natural2.getValue()));
			
		} else if (natural1.getValue() != 0 && natural2.getValue() != 0 && natural2.getValue() >= natural1.getValue()) {
			
			return pgcd(natural1, new Natural(natural2.getValue()%natural1.getValue()));
		}
		return null;

	}
	
}
