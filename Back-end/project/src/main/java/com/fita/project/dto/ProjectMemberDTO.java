package com.fita.project.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProjectMemberDTO {
    //private Integer id;
    private String studentCode;
    private String fullName;
    private String classCode;
    //private String projectCode;
}
