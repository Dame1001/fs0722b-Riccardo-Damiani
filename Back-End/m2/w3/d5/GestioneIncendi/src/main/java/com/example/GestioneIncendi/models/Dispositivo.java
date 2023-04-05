package com.example.GestioneIncendi.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public abstract class Dispositivo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

}
