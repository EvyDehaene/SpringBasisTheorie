package be.vdab.services;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;

import be.vdab.restclient.DummyKoersenClient;
import be.vdab.restclient.KoersenClient;
import be.vdab.service.EuroService;
import junit.framework.Assert;

public class EuroServiceTest {
	private KoersenClient koersenClient;
	private EuroService euroService;
	@Before
	public void before() {
		koersenClient = new DummyKoersenClient(); // dummy injecteren in de service
		euroService = new EuroService(koersenClient);
	}
	@Test
	public void naarDollar() {
		Assert.assertEquals(0,  new BigDecimal(3).compareTo(euroService.naarDollar(new BigDecimal(2))));
	}
}
