package com.springbootPMJ.departmentservice.service;

import com.springbootPMJ.departmentservice.dto.DepartmentDto;

public interface DepartmentService {
    DepartmentDto saveDepartment(DepartmentDto departmentDto);

    DepartmentDto getDepartmentByCode(String Code);
}
