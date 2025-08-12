package com.rishabh.skill.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserSkill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userSkilliId;
    private Integer userId;  // from User Microservice
    private Integer skillId; // from Skill
    @Enumerated(EnumType.STRING)
    private SkillType type; // TEACH or LEARN


}
