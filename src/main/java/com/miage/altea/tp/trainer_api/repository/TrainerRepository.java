package com.miage.altea.tp.trainer_api.repository;


import com.miage.altea.tp.trainer_api.bo.Trainer;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface TrainerRepository extends CrudRepository<Trainer,String> {

    List<Trainer> findAll();

    @Override
    Optional<Trainer> findById(String name);



}