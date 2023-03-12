package com.AssegnaDispositivi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AssegnaDispositivi.entity.Dispositivo;
import com.AssegnaDispositivi.repository.DispositivoRepository;

@Service
public class DispositivoService {
	@Autowired
	DispositivoRepository dispositivoRepo;
	
	public Dispositivo saveDevice(Dispositivo dev) {
        dispositivoRepo.save(dev);
        System.out.println("DISPOSITIVO SALVATO CORRETTAMENTE!!");
        return dev;
    }

    public void deleteDevice(Dispositivo dev) {
        dispositivoRepo.delete(dev);
        System.out.println("DISPOSITIVO ELIMINATO CORRETTAMENTE!!");
    }

    public Dispositivo getDeviceById(Long id) {
        return dispositivoRepo.findById(id).get();
    }

    public List<Dispositivo> getAllDevices() {
        return (List<Dispositivo>) dispositivoRepo.findAll();
    }

}
