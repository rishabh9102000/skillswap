package com.rishabh.skill.repo;

import com.rishabh.skill.model.Skill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillRepo extends JpaRepository<Skill,Integer> {
}
