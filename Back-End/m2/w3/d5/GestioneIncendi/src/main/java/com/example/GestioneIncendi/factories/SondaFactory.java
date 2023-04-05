package com.example.GestioneIncendi.factories;

import com.example.GestioneIncendi.models.Dispositivo;
import com.example.GestioneIncendi.models.Sonda;

public class SondaFactory extends DispositivoFactory {
	
	@Override
	public Dispositivo createDevice() {
		return new Sonda();
	}

}
