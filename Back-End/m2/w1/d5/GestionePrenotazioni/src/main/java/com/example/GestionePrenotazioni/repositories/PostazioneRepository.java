package com.example.GestionePrenotazioni.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.GestionePrenotazioni.model.Postazione;
import com.example.GestionePrenotazioni.utils.TipoPostazione;

public interface PostazioneRepository extends CrudRepository<Postazione, Integer> {
	
}
