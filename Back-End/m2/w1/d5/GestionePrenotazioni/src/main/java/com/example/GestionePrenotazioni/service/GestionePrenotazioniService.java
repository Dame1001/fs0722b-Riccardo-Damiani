package com.example.GestionePrenotazioni.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.GestionePrenotazioni.model.Edificio;
import com.example.GestionePrenotazioni.model.Postazione;
import com.example.GestionePrenotazioni.model.Prenotazione;
import com.example.GestionePrenotazioni.model.Utente;
import com.example.GestionePrenotazioni.repositories.EdificioRepository;
import com.example.GestionePrenotazioni.repositories.PostazioneRepository;
import com.example.GestionePrenotazioni.repositories.PrenotazioneRepository;
import com.example.GestionePrenotazioni.repositories.UtenteRepository;
import com.example.GestionePrenotazioni.utils.TipoPostazione;

@Service
public class GestionePrenotazioniService {
	
	@Autowired
    UtenteRepository utenteRepository;
    @Autowired
    EdificioRepository edificioRepository;
    @Autowired
    PostazioneRepository postazioneRepository;
    @Autowired
    PrenotazioneRepository prenotazioneRepository;
    
    //UTENTE
    
    public void saveUser(Utente user) {
    	utenteRepository.save(user);	
    }
    
    public void deleteUser(Utente user) {
    	utenteRepository.delete(user);	
    }
    
    public Utente getUserById(int id) {
    	return utenteRepository.findById(id).get();    	
    }
    
    public List <Utente> getAllUsers() {
    	return (List<Utente>) utenteRepository.findAll();
    }
    
    //EDIFICIO
    
    public void saveBuilding(Edificio build) {
    	edificioRepository.save(build);	
    }
    
    public void deleteBuilding(Edificio build) {
    	edificioRepository.delete(build);	
    }
    
    public Edificio getBuildingById(int id) {
    	return edificioRepository.findById(id).get();    	
    }
    
    public List <Edificio> getAllBuildings() {
    	return (List<Edificio>) edificioRepository.findAll();
    }
    
    //POSTAZIONE
    
    public void saveRoom(Postazione room) {
    	postazioneRepository.save(room);	
    }
    
    public void deleteRoom(Postazione room) {
    	postazioneRepository.delete(room);	
    }
    
    public Postazione getRoomById(int id) {
    	return postazioneRepository.findById(id).get();    	
    }
    
    public List <Postazione> getAllRooms() {
    	return (List<Postazione>) postazioneRepository.findAll();
    }
    
    public List <Postazione> getRoomsByTypeAndCity(String city, TipoPostazione type) {
    	List<Postazione> roomsList = getAllRooms();
        List<Postazione> roomsListFinded = new ArrayList<Postazione>();
        for (int i = 0; i < roomsList.size(); i++) {
            if (roomsList.get(i).getRoomType().compareTo(type) == 0 && roomsList.get(i).getEdificio().getCity().equals(city)) {
            	roomsListFinded.add(roomsList.get(i));
            }
        }
        return roomsListFinded;
    }
    
    //PRENOTAZIONE
    
    public void saveReservation(Prenotazione res) {
        List<Prenotazione> ListaPrenotazione = getAllReservations();
            if(ListaPrenotazione != null) {
            for(int i = 0; i < ListaPrenotazione.size();) {
                if(ListaPrenotazione.get(i).getPostazione().getIdPostazione().equals(res.getPostazione().getIdPostazione())) {
                    if(ListaPrenotazione.get(i).getDay().equals(res.getDay())) {
                        System.out.println("GIORNO DELLA PRENOTAZIONE GIA OCCUPATO!!");
                    } else {
                        prenotazioneRepository.save(res);
                        System.out.println("PRENOTAZIONE SALVATA CON SUCCESSO!!");
                    }
                    break;
                } else if(ListaPrenotazione.get(i).getUtente().getIdUtente().equals(res.getUtente().getIdUtente())) {
                    if(ListaPrenotazione.get(i).getDay().equals(res.getDay())) {
                        System.out.println("GIORNO DELLA PRENOTAZIONE GIA OCCUPATO!!");
                    } else {
                    	prenotazioneRepository.save(res);
                        System.out.println("PRENOTAZIONE SALVATA CON SUCCESSO!!");
                    }
                    break;
                } else {
                	prenotazioneRepository.save(res);
                    System.out.println("PRENOTAZIONE SALVATA CON SUCCESSO!!");
                }
                break;
            }
        } else {
            prenotazioneRepository.save(res);
            System.out.println("PRENOTAZIONE SALVATA CON SUCCESSO!!");
        }

    }
    
  
    public void deleteReservation(Prenotazione res) {
    	prenotazioneRepository.delete(res);	
    }
    
    public Prenotazione getReservationById(int id) {
    	return prenotazioneRepository.findById(id).get();    	
    }
    
    public List <Prenotazione> getAllReservations() {
    	return (List<Prenotazione>) prenotazioneRepository.findAll();
    }
    

    
    

}
