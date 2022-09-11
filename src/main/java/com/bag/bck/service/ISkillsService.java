package com.bag.bck.service;

import com.bag.bck.models.Person;
import com.bag.bck.models.Skills;

import java.util.List;

public interface ISkillsService {

    public List<Skills>  listSkills();
    public void addSkill (Skills sk);
    public void deleteSkill(Long id);

    public Skills findSkill(Long id);

    public void editSkill(Skills sk);
}
