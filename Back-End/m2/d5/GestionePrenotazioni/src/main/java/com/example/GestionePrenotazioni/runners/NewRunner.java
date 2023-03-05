package com.example.GestionePrenotazioni.runners;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.example.GestionePrenotazioni.model.Edificio;
import com.example.GestionePrenotazioni.model.Postazione;
import com.example.GestionePrenotazioni.model.Prenotazione;
import com.example.GestionePrenotazioni.model.Utente;
import com.example.GestionePrenotazioni.service.GestionePrenotazioniService;
import com.example.GestionePrenotazioni.utils.TipoPostazione;




@Component
public class NewRunner implements ApplicationRunner {
	
	@Autowired
	GestionePrenotazioniService svc;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		System.out.println("RUNNING");
		
		Utente user1 = new Utente();
		user1.setName("Riccardo");
		user1.setSurname("Damiani");
		user1.setEmail("riccardonjr@gmail.com");
		user1.setUsername("riccardodame");
		
		//svc.saveUser(user1);
		//System.out.println("UTENTE SALVATO CON SUCCESSO!");
		
		Edificio building1 = new Edificio();
		building1.setName("Casa Damiani");
		building1.setAddress("Via delle vigne nuove 54");
		building1.setCity("Mentana");
		
		//svc.saveBuilding(building1);
		//System.out.println("EDIFICIO SALVATO CON SUCCESSO!");
		
		Edificio building2 = svc.getBuildingById(1);
		
		
		Postazione room1 = new Postazione();
		room1.setEdificio(building2);
		room1.setDescription("Camera da letto");
		room1.setRoomType(TipoPostazione.PRIVATO);
		room1.setMaxNumPeople(2);
		
		//svc.saveRoom(room1);
		//System.out.println("POSTAZIONE SALVATA CON SUCCESSO!");
		
		Utente user2 = svc.getUserById(1);
		Postazione room2 = svc.getRoomById(1);
		
		Prenotazione res1 = new Prenotazione();
		res1.setUtente(user2);
		res1.setPostazione(room2);
		res1.setDay(LocalDate.of(2023, 03, 05));
		
		//svc.saveReservation(res1);
		//System.out.println("PRENOTAZIONE SALVATA CON SUCCESSO!");
		
		
		List <Postazione> rooms = new ArrayList<Postazione>();
		rooms = svc.getRoomsByTypeAndCity("Mentana", TipoPostazione.PRIVATO);
		//System.out.println(rooms);
		
	}
	
}
