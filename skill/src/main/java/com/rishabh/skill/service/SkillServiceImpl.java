package com.rishabh.skill.service;

import com.rishabh.skill.DTO.CreateSkillRequest;
import com.rishabh.skill.model.Skill;
import com.rishabh.skill.repo.SkillRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class SkillServiceImpl implements SkillService {

    @Autowired
    SkillRepo skillRepo;

    @Override
    public Skill addSkill(CreateSkillRequest skillRequest) {
        Skill skill = Skill.builder()
                .skillName(skillRequest.getSkillName())
                .category(skillRequest.getCategory())
                .build();

        return skillRepo.save(skill);
    }

    @Override
    public Skill getSkill(String skillName) {
        return skillRepo.findBySkillName(skillName);
    }

}
