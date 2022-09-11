package com.bag.bck.service;

import com.bag.bck.models.Education;

import java.util.List;

public interface IEducationService {
    void addEducation(Education edu);

    public List<Education> seeEducation();

    public Education findEducation(Long id);

    public void editEducation(Education edu);

    public void deleteEducation(Long id);
}
