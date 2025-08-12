package com.rishabh.skill.service;

import com.rishabh.skill.DTO.CreateSkillRequest;
import com.rishabh.skill.model.Skill;
import org.springframework.stereotype.Component;

@Component
public interface SkillService {
     Skill addSkill(CreateSkillRequest skillRequest);
}
