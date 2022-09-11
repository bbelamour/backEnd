package com.bag.bck.service;

import com.bag.bck.models.Education;
import com.bag.bck.repository.EducationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EducationService implements IEducationService{
    @Autowired
    public EducationRepository educationRepo;

    @Override
    public List<Education> seeEducation(){
        return educationRepo.findAll();
    }
    @Override
    public void addEducation(Education edu){
        educationRepo.save(edu);
    }
    @Override
    public void deleteEducation(Long id){
        educationRepo.deleteById(id);
    }
    @Override
    public Education findEducation(Long id){
        return educationRepo.findById(id).orElse(null);
    }
    @Override
    public void editEducation(Education edu){
        educationRepo.save(edu);
    }
}
