package com.rishabh.skill.repo;

import com.rishabh.skill.model.UserSkill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserSkillRepo extends JpaRepository<UserSkill,Integer> {
}
