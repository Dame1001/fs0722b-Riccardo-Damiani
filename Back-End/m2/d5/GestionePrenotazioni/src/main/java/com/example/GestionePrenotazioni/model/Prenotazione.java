package com.example.GestionePrenotazioni.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor

public class Prenotazione {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private Integer idPrenotazione;

@ManyToOne
@JoinColumn (name = "idutente")
private Utente utente;

@ManyToOne
@JoinColumn (name = "idpostazione")
private Postazione postazione;

private LocalDate day;

@Override
public String toString() {
	return "Prenotazione [idPrenotazione=" + idPrenotazione + ", utente=" + utente + ", postazione=" + postazione
			+ ", day=" + day + "]";
}




}
