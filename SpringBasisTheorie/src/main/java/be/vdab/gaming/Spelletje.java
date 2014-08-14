package be.vdab.gaming;

import org.springframework.beans.factory.annotation.Value;

public class Spelletje {
	private int aantalVijanden;//je maakt zelf een getter en setter voor deze variabele

	public int getAantalVijanden() {
		return aantalVijanden;
	}
	@Value("#{${minimumAantalVijanden} + new java.util.Random().nextInt(2)}")
	public void setAantalVijanden(int aantalVijanden) {
		this.aantalVijanden = aantalVijanden;
	}
}
