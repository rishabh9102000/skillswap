package com.rishabh.skill.DTO;


import com.rishabh.skill.model.SkillType;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateUserSkillRequest {

    private Integer userId;  // from User Microservice
    private Integer skillId; // from Skill
    @Enumerated(EnumType.STRING)
    private SkillType type;
}
