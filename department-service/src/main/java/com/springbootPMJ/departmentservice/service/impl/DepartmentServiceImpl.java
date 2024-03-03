package com.springbootPMJ.departmentservice.service.impl;

import com.springbootPMJ.departmentservice.dto.DepartmentDto;
import com.springbootPMJ.departmentservice.entity.Department;
import com.springbootPMJ.departmentservice.repository.DepartmentRepository;
import com.springbootPMJ.departmentservice.service.DepartmentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class DepartmentServiceImpl implements DepartmentService {

    private DepartmentRepository departmentRepository;

//    public DepartmentServiceImpl(DepartmentRepository departmentRepository) {
//        this.departmentRepository = departmentRepository;
//    }

    @Override
    public DepartmentDto saveDepartment(DepartmentDto departmentDto) {
        Department department = new Department(
                departmentDto.getId(),
                departmentDto.getDepartmentName(),
                departmentDto.getDepartmentDescription(),
                departmentDto.getDepartmentCode()
        );
        Department savedDepartment1 = departmentRepository.save(department);
        DepartmentDto savedDepartmentDto1 = new DepartmentDto(
                savedDepartment1.getId(),
                savedDepartment1.getDepartmentName(),
                savedDepartment1.getDepartmentDescription(),
                savedDepartment1.getDepartmentCode()
        );
        return savedDepartmentDto1;
    }

    @Override
    public DepartmentDto getDepartmentByCode(String code) {
        Department department = departmentRepository.findByDepartmentCode(code);
        DepartmentDto departmentDto = new DepartmentDto(
                department.getId(),
                department.getDepartmentName(),
                department.getDepartmentDescription(),
                department.getDepartmentCode()
        );
        return departmentDto;
    }

}
