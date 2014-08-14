package be.vdab.restclient;

import java.math.BigDecimal;
import java.net.URL;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Qualifier("Yahoo")
@Component
class YahooKoersenClient implements KoersenClient{
	private final URL url;
	@Autowired
	YahooKoersenClient (@Value("${yahooKoersenURL}")URL url) {//URL ge�njecteerd, niet hard gecodeerd
		this.url=url;
	}
	@Override
	public BigDecimal getDollarKoers(){
		try (Scanner scanner = new Scanner(url.openStream())) {
			return new BigDecimal(scanner.nextLine());
		} catch (Exception ex) {
			ex.printStackTrace();
			return null;
		}
	}
}
