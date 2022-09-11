package com.bag.bck.service;

import com.bag.bck.models.Experience;
import com.bag.bck.models.Person;

import java.util.List;

public interface IExperienceService {
    public void addExperience(Experience exp);

    public List<Experience> seeExperience();

    public void deleteExperience(Long id);

    public void editExperience(Experience exp);

    public Experience findExperience(Long id);

}
