package com.rishabh.skill.controller;

import com.rishabh.skill.DTO.CreateUserSkillRequest;
import com.rishabh.skill.model.UserSkill;
import com.rishabh.skill.repo.UserSkillRepo;
import com.rishabh.skill.service.UserSkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user/v1")
public class UserSkillController {

    @Autowired
    UserSkillService userSkillService;

    @PostMapping
    public UserSkill addUserSkill(CreateUserSkillRequest createUserSkillRequest){
        return userSkillService.addUserSkill(createUserSkillRequest);
    }
}
