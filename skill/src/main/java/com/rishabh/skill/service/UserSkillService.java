package com.rishabh.skill.service;

import com.rishabh.skill.DTO.CreateUserSkillRequest;
import com.rishabh.skill.model.UserSkill;

public interface UserSkillService {
    UserSkill addUserSkill(CreateUserSkillRequest userSkillRequest);
}
