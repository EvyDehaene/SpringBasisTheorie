package be.vdab.service;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import be.vdab.restclient.KoersenClient;
@Service
public class EuroService {
	private static final MathContext AFRONDEN_OP_CENT = new MathContext(2, RoundingMode.HALF_UP);
	// deze var. kan verwijzen naar ieder object dat de interface implementeert:
	private final KoersenClient koersenClient;
	//de constructor krijgt een object geïnjecteerd dat de interface implementeert
	@Autowired
	public EuroService(@Qualifier("ECB") KoersenClient koersenClient){
		this.koersenClient=koersenClient;
	}
	public BigDecimal naarDollar(BigDecimal euro){
		BigDecimal dollarKoers = koersenClient.getDollarKoers();
		return euro.multiply(dollarKoers, AFRONDEN_OP_CENT);
	}
}
