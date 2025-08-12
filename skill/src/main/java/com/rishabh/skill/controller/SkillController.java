package com.rishabh.skill.controller;


import com.rishabh.skill.DTO.CreateSkillRequest;
import com.rishabh.skill.model.Skill;
import com.rishabh.skill.service.SkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class SkillController {

    @Autowired
    private SkillService skillService;


    @PostMapping
    public Skill addSkill(CreateSkillRequest request){
        return skillService.addSkill(request);
    }
    @GetMapping
    public Skill getSkill(String skillName){
        return skillService.getSkill(skillName);
    }

}
