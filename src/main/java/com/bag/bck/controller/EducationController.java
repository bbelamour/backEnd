package com.bag.bck.controller;

import com.bag.bck.models.Education;
import com.bag.bck.service.IEducationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;


import java.util.List;


@CrossOrigin("https://belenag-portfolio.web.app")
@RequestMapping("/education")
@RestController
public class EducationController {

    @Autowired
    private IEducationService educationServ;

    @GetMapping("/find/{id}")
    @ResponseBody
    public Education findEducation(@PathVariable Long id) {
        return educationServ.findEducation(id);
    }

    @GetMapping("/list")
    @ResponseBody
    public List<Education> seeEducation(){
        return educationServ.seeEducation();
    }

    //@PreAuthorize ("hasRole('ADMIN')")
    @PostMapping("/add")
    public void addEducation(@RequestBody Education edu){
        educationServ.addEducation(edu);
    }


    //@PreAuthorize ("hasRole('ADMIN')")
    @PutMapping("/edit")
        public void editEducation(@RequestBody Education edu){
        educationServ.editEducation(edu);
    }

    //@PreAuthorize ("hasRole('ADMIN')")
    @DeleteMapping("/delete/{id}")
        public void deleteEducation(@PathVariable Long id){
        educationServ.deleteEducation(id);
    }







}
