package com.sadounj.languages.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sadounj.languages.models.Language;
import com.sadounj.languages.repositories.LanguageRepository;

@Service
public class LanguageService{
@Autowired
	private LanguageRepository languageRepository;
	
	public LanguageService(LanguageRepository languageRepository){
		this.languageRepository = languageRepository;
	}
	
	public ArrayList<Language> all(){
		return (ArrayList<Language>) languageRepository.findAll();
	}
	
	public double count(){
		return languageRepository.count();
	}
	
	public Optional<Language> getByIndex(long id){
			System.out.println(languageRepository.countByNameContaining("Java"));
			return languageRepository.findById(id);
	}
	
	public void create(Language language){
		languageRepository.save(language);
	}
	
	public void update(Language language){
		languageRepository.save(language);
	}
	
	public void destroy(long id){
			languageRepository.deleteById(id);
	}
}