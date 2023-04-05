package com.example.GestioneIncendi.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.example.GestioneIncendi.factories.SondaFactory;
import com.example.GestioneIncendi.models.CentroControllo;
import com.example.GestioneIncendi.models.Sonda;
import com.example.GestioneIncendi.services.SondaService;

@Component
public class MainRunner implements ApplicationRunner {
	
	@Autowired SondaService sondaService;
	SondaFactory sFactory = new SondaFactory();

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("RUNNING!!");
		
		CentroControllo control = new CentroControllo();
		sondaService.saveCenter(control);
		CentroControllo testControl = sondaService.getCenterById(1l);
		
		
		Sonda s1 = (Sonda) sFactory.createDevice();
		s1.setLatitude(137);
		s1.setLongitude(19);
		s1.setSmokeLevel(0);
		s1.setControlCenter(testControl);
		Sonda s2 = (Sonda) sFactory.createDevice();
		s2.setLatitude(345);
		s2.setLongitude(300);
		s2.setSmokeLevel(0);
		s2.setControlCenter(testControl);
		Sonda s3 = (Sonda) sFactory.createDevice();
		s3.setLatitude(147);
		s3.setLongitude(30);
		s3.setSmokeLevel(0);
		s3.setControlCenter(testControl);
		
		sondaService.createSonda(s1);
		sondaService.createSonda(s2);
		sondaService.createSonda(s3);
		
		ChangeSmokeLevel(1L,3);
		ChangeSmokeLevel(3L,9);

	}
	
	public void ChangeSmokeLevel(Long id, int a) {
		Sonda s = sondaService.findSondaById(id);
		s.setSmokeLevel(a);
		sondaService.updateSonda(s);
	}
	

}
