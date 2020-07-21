package com.fita.project.service;

import com.fita.project.dto.CategoryDTO;
import com.fita.project.dto.ProjectDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProjectService {
    // Lấy ra tất cả các đồ án
    List<ProjectDTO> getProjects();

    // Lấy ra đồ án theo "id"
    ProjectDTO getProjectById(int id);

    // Lấy ra đồ án theo "mã sinh viên"
    List<ProjectDTO> getProjectsByStudentCode(String studentCode);

    // Lấy ra đồ án theo "mã giảng viên"


    // Lấy ra đồ án theo "năm học - học kỳ id"
    List<ProjectDTO> getProjectByYearSemesterId(String yearSemesterId);

    // Lấy ra đồ án theo "mã thể loại"
    List<ProjectDTO> getProjectsByCategoryCode(String categoryCode);

    //...





    // Thêm đồ án
    void addProject(ProjectDTO projectDTO);

    // Sửa đồ án


    // Xoá đồ án
    void deleteProject(int id);
}
