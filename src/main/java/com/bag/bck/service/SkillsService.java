package com.bag.bck.service;


import com.bag.bck.models.Skills;
import com.bag.bck.repository.SkillsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SkillsService implements ISkillsService {

    @Autowired
    public SkillsRepository skillsRepo;

    @Override
    public List<Skills> listSkills(){
        return skillsRepo.findAll();
    }
    @Override
    public void addSkill(Skills sk){
        skillsRepo.save(sk);
    }
    @Override
    public void deleteSkill(Long id){
        skillsRepo.deleteById(id);
    }
    @Override
    public Skills findSkill(Long id){
        return skillsRepo.findById(id).orElse(null);
    }
    @Override
    public void editSkill(Skills sk){
        skillsRepo.save(sk);
    }
}
