package com.miage.altea.tp.trainer_api.service;

import com.miage.altea.tp.trainer_api.repository.TrainerRepository;

import com.miage.altea.tp.trainer_api.bo.Trainer;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import org.junit.jupiter.api.Test;


public class TrainerServiceImplTest {

    @Test
    void getAllTrainers_shouldCallTheRepository() {
        var trainerRepo = mock(TrainerRepository.class);
        var trainerService = new TrainerServiceImpl(trainerRepo);

        trainerService.getAllTrainers();

        verify(trainerRepo).findAll();
    }

    @Test
    void getTrainer_shouldCallTheRepository() {
        var trainerRepo = mock(TrainerRepository.class);
        var trainerService = new TrainerServiceImpl(trainerRepo);

        trainerService.getTrainer("Ash");

        verify(trainerRepo).findById("Ash");
    }

    @Test
    void createTrainer_shouldCallTheRepository() {
        var trainerRepo = mock(TrainerRepository.class);
        var trainerService = new TrainerServiceImpl(trainerRepo);

        var ash = new Trainer();
        trainerService.createTrainer(ash);

        verify(trainerRepo).save(ash);
    }

}
