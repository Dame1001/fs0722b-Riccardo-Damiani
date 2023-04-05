package com.example.GestioneIncendi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.GestioneIncendi.models.CentroControllo;
import com.example.GestioneIncendi.models.Sonda;
import com.example.GestioneIncendi.repositories.CentroControlloRepository;
import com.example.GestioneIncendi.repositories.SondaRepository;




@Service
public class SondaService {
	@Autowired CentroControlloRepository centroControlloRepo;
	@Autowired SondaRepository sondaRepo;
	
	public CentroControllo saveCenter(CentroControllo controlCenter){
		centroControlloRepo.save(controlCenter);
        return controlCenter;
    }

    public void deleteCenter(CentroControllo controlCenter) {
        centroControlloRepo.delete(controlCenter);
    }

    public CentroControllo getCenterById(Long id) {
        return centroControlloRepo.findById(id).get();
    }

    public List<CentroControllo> getAllCenters() {
        return (List<CentroControllo>) centroControlloRepo.findAll();
    }
    
    
    public Sonda createSonda(Sonda sonda) {
        sondaRepo.save(sonda);
        return sonda;
    }

    public Sonda updateSonda(Sonda sonda) {

        sondaRepo.save(sonda);
        return sonda;
    }

    public void deleteSonda(Sonda sonda) {
        sondaRepo.delete(sonda);
    }

    public Sonda findSondaById(Long id) {
        return sondaRepo.findById(id).get();
    }

    public List<Sonda> FindAllSonde() {
        return (List<Sonda>) sondaRepo.findAll();
    }

}
