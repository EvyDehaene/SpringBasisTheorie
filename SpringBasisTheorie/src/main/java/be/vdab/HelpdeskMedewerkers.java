package be.vdab;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class HelpdeskMedewerkers {
	private final Properties medewerkers;
	//key=naam medewerker, value=intern telefoonnummer
	public HelpdeskMedewerkers(Properties medewerkers) {
		this.medewerkers=medewerkers;
	}
	@Override
	public String toString() {
		return medewerkers.toString();
	}
}
