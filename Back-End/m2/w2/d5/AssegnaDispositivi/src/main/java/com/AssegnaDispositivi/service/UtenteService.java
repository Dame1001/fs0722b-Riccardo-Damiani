package com.AssegnaDispositivi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AssegnaDispositivi.entity.User;
import com.AssegnaDispositivi.repository.UserRepository;

@Service
public class UtenteService {
	@Autowired
	UserRepository utenteRepo;
	
	public User saveUser(User user) {
        utenteRepo.save(user);
        System.out.println("UTENTE SALVATO CORRETTAMENTE!!");
        return user;
    }

    public String deleteUser(Long id) {
        utenteRepo.deleteById(id);
        return "UTENTE ELIMINATO CORRETTAMENTE";
    }

    public User getUserById(Long id) {
        return utenteRepo.findById(id).get();
    }

    public List<User> getAllUsers() {
        return (List<User>) utenteRepo.findAll();
    }
	

}
