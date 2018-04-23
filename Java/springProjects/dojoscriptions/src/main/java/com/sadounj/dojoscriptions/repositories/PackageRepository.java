package com.sadounj.dojoscriptions.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sadounj.dojoscriptions.models.DojoPackage;

@Repository
public interface PackageRepository extends CrudRepository<DojoPackage, Long> {

	void save(Optional<DojoPackage> thisPackage);

}