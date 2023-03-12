package com.AssegnaDispositivi.entity;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString

public class Laptop extends Dispositivo {
	public Laptop() {
		super.deviceName = "Portatile aziendale";
	}


}
