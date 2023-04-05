package com.example.GestioneIncendi.models;



import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@Getter

public class Sonda extends Dispositivo{
	private int latitude;
	private int longitude;
	private int smokeLevel;
	@ManyToOne
	private CentroControllo controlCenter;
	
	public void setLatitude(int latitude) {
		this.latitude = latitude;
	}
	public void setLongitude(int longitude) {
		this.longitude = longitude;
	}
	public void setSmokeLevel(int smokeLevel) {
		this.smokeLevel = smokeLevel;
		if(smokeLevel >= 5) {
			controlCenter.fireAlert(getId(), latitude, longitude, smokeLevel);
			
		}
	}
	public void setControlCenter(CentroControllo controlCenter) {
		this.controlCenter = controlCenter;
	}

	
	

}
