package com.sadounj.dojoscriptions.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.sadounj.dojoscriptions.models.DojoPackage;
import com.sadounj.dojoscriptions.repositories.PackageRepository;

@Service
public class PackageService {
	
	private PackageRepository packageRepo;
	
	public PackageService(PackageRepository packageRepo) {
		this.packageRepo = packageRepo;
	}
	
	public void createPackage(DojoPackage newPackage) {
		packageRepo.save(newPackage);
	}
	
	public Optional<DojoPackage> readOne(Long id) {
		return packageRepo.findById(id);
	}
	
	public List<DojoPackage> readAll(){
		return (List<DojoPackage>) packageRepo.findAll();
	}
	
	public void updatePackage(DojoPackage thisPackage) {
		packageRepo.save(thisPackage);
	}
	
	public void deletePackage(Long id) {
		packageRepo.deleteById(id);
	}
	
}