package com.springbootPMJ.departmentservice.dto;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class DepartmentDto {
    private long id;
    private String departmentName;
    private String departmentDescription;
    private String departmentCode;
}
