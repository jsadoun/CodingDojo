package com.sadounj.ninjasjdojos.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sadounj.ninjasjdojos.models.Ninja;

@Repository
public interface NinjaRepository extends CrudRepository<Ninja,Long>{

}