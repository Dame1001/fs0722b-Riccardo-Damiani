package com.AssegnaDispositivi.entity;

import com.AssegnaDispositivi.utils.TipologieDispositivo;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Inheritance (strategy = InheritanceType.TABLE_PER_CLASS)

public abstract class Dispositivo {
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private long deviceId;
	
	@Enumerated(EnumType.STRING)
	private TipologieDispositivo deviceState;
	protected String deviceName;

}
