package be.vdab;

public class EMailAdres {
	private final static String REG_EXPR = "^.+@.+\\.[a-z]+$";
	private final String adres;
	public EMailAdres(String adres){
		if (!adres.matches(REG_EXPR)){
			throw new IllegalArgumentException("Verkeerd emailadres");
		}
		this.adres=adres;
	}
	@Override
	public String toString() {
		return adres;
	}
}
