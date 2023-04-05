package com.example.GestioneIncendi.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class CentroControllo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long controlId;
	
	public void fireAlert(Long id, int latitude, int longitude, int smokeLevel) {
		System.out.println("http//:host/alarm?=idsonda=[" + id + "]&lat=[" + latitude + "]&lon=[" + longitude + "]&smokelevel=[" + smokeLevel + "]");
	}

}
