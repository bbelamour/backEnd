package com.bag.bck.service;

import com.bag.bck.models.Experience;
import com.bag.bck.repository.ExperienceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExperienceService implements IExperienceService {

    @Autowired
    public ExperienceRepository experienceRepo;

    @Override
    public List<Experience> seeExperience(){
        return experienceRepo.findAll();
    }
    @Override
    public void addExperience(Experience exp){

        experienceRepo.save(exp);
    }
    @Override
    public void deleteExperience(Long id){
        experienceRepo.deleteById(id);
    }

    @Override
    public Experience findExperience(Long id){

        return experienceRepo.findById(id).orElse(null);
    }

    @Override
    public void editExperience(Experience exp) {
        experienceRepo.save(exp);

    }
}
