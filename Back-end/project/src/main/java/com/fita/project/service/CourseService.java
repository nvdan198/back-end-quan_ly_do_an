package com.fita.project.service;

import com.fita.project.dto.CourseDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CourseService {
    // Lấy ra tất cả các lớp học phần
    List<CourseDTO> getCourses();

    // Lấy ra lớp học phần theo "id"
    CourseDTO getCourseById(int id);

    // Lấy ra lớp học phần theo "mã giảng viên"
    List<CourseDTO> getCoursesByLecturerCode(String lecturerCode);

    // Lấy ra lớp học phần theo "năm học - học kỳ"
    List<CourseDTO> getCoursesByYearSemesterId(int yearSemesterId);

    // Lấy ra lớp học phần theo "mã giảng viên" và "năm học - học kỳ id"
    List<CourseDTO> getCoursesByLecturerCodeAndYearSemesterId(String lecturerCode, int yearSemesterId);

    // Thêm lớp học phần
    void addCourse(CourseDTO courseDTO);

    // Sửa lớp học phần
    void editCourse(int id, CourseDTO courseDTO);

    // Xoá lớp học phần
    void deleteCourse(int id);
}
