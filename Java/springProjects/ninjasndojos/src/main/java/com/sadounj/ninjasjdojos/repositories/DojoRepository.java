package com.sadounj.ninjasjdojos.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sadounj.ninjasjdojos.models.Dojo;

@Repository
public interface DojoRepository extends CrudRepository<Dojo, Long> {

}
