package com.rishabh.skill.service;

import com.rishabh.skill.DTO.CreateUserSkillRequest;
import com.rishabh.skill.model.UserSkill;
import com.rishabh.skill.repo.UserSkillRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserSkillServiceImpl implements UserSkillService{
    @Autowired
    UserSkillRepo repo;

    @Override
    public UserSkill addUserSkill(CreateUserSkillRequest userSkillRequest) {
        UserSkill userSkill = UserSkill.builder()
                .skillId(userSkillRequest.getSkillId())
                .userId(userSkillRequest.getUserId())
                .type(userSkillRequest.getType())
                .build();
        return repo.save(userSkill);
    }
}
