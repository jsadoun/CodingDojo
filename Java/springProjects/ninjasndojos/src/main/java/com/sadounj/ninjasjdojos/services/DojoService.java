package com.sadounj.ninjasjdojos.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sadounj.ninjasjdojos.models.Dojo;
import com.sadounj.ninjasjdojos.repositories.DojoRepository;

@Service
public class DojoService{
	@Autowired
	private DojoRepository dojoRepository;
	
	public DojoService(DojoRepository dojoRepository){
		this.dojoRepository = dojoRepository;
	}
	
	public void create(Dojo dojo){dojoRepository.save(dojo);}
	public void update(Dojo dojo){dojoRepository.save(dojo);}
	public void destroy(long id){dojoRepository.deleteById(id);}
	
	public ArrayList<Dojo> all(){
		return (ArrayList<Dojo>) dojoRepository.findAll();
	}
	
	public Optional<Dojo> getById(long id){
		return dojoRepository.findById(id);
	}
}