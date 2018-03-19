package com.sadounj.ninjasjdojos.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sadounj.ninjasjdojos.models.Ninja;
import com.sadounj.ninjasjdojos.repositories.NinjaRepository;

@Service
public class NinjaService {
	@Autowired
	private NinjaRepository ninjaRepository;
	
	public NinjaService(NinjaRepository ninjaRepository){
		this.ninjaRepository = ninjaRepository;
	}
	
	public void create(Ninja ninja){ninjaRepository.save(ninja);}
	public void update(Ninja ninja){ninjaRepository.save(ninja);}
	public void destroy(long id){ninjaRepository.deleteById(id);}
	
	public ArrayList<Ninja> all(){
		return (ArrayList<Ninja>) ninjaRepository.findAll();
	}
	
	public Optional<Ninja> getById(long id){
		return ninjaRepository.findById(id);
	}
}