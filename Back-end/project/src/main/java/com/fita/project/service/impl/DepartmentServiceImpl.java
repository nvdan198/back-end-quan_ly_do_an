package com.fita.project.service.impl;

import com.fita.project.dto.DepartmentDTO;
import com.fita.project.repository.DepartmentRepository;
import com.fita.project.repository.entity.Department;
import com.fita.project.service.DepartmentService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;

    @Autowired
    private ModelMapper modelMapper;

    /**
     * Lấy tất cả các bộ môn trong cơ sở dữ liệu
     *
     * @return List<DepartmentDTO>
     */
    @Override
    public List<DepartmentDTO> getDepartments() {
        List<Department> departments = departmentRepository.findAll();
        List<DepartmentDTO> departmentsDTO = new ArrayList<>();

        //Convert department (Entity) -> departmentDTO (DTO)
        for (Department department : departments) {
            departmentsDTO.add(modelMapper.map(department, DepartmentDTO.class));
        }

        return departmentsDTO;
    }

    /**
     * Lấy bộ môn trong cơ sở dữ liệu dựa theo id
     *
     * @param id
     * @return departmentDTO
     */
    @Override
    public DepartmentDTO getDepartmentById(int id) {
        Department department = departmentRepository.findById(id).get();

        //Convert department (Entity) -> departmentDTO (DTO)
        DepartmentDTO departmentDTO = modelMapper.map(department, DepartmentDTO.class);

        return departmentDTO;
    }

    /**
     * Lấy bộ môn trong cơ sở dữ liệu dựa theo mã bộ môn
     *
     * @param departmentCode
     * @return departmentDTO
     */
    @Override
    public DepartmentDTO getDepartmentByDepartmentCode(String departmentCode) {
        Department department = departmentRepository.findByDepartmentCode(departmentCode);

        //Convert department (Entity) -> departmentDTO (DTO)
        DepartmentDTO departmentDTO = modelMapper.map(department, DepartmentDTO.class);

        return departmentDTO;
    }

    /**
     * Thêm 1 bộ môn vào cơ sở dữ liệu
     *
     * @param departmentDTO
     */
    @Override
    public void addDepartment(DepartmentDTO departmentDTO) {
        departmentRepository.save(modelMapper.map(departmentDTO, Department.class));
    }

    /**
     * Sửa bộ môn trong cơ sở dữ liệu dựa theo id
     *
     * @param id
     * @param departmentDTO
     */
    @Override
    public void editDepartment(int id, DepartmentDTO departmentDTO) {
        // Lấy bộ môn cần sửa
        Department departmentToUpdate = departmentRepository.getOne(id);

        // Cập nhật dữ liệu mới
        departmentToUpdate.setDepartmentCode(departmentDTO.getDepartmentCode());
        departmentToUpdate.setDepartmentName(departmentDTO.getDepartmentName());

        // Lưu lại vào cơ sở dữ liệu
        departmentRepository.save(departmentToUpdate);
    }

    /**
     * Xoá bộ môn trong cơ sở dữ liệu dựa theo id
     *
     * @param id
     */
    @Override
    public void deleteDepartment(int id) {
        departmentRepository.deleteById(id);
    }
}
