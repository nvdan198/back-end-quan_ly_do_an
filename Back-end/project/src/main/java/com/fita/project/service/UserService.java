package com.fita.project.service;

import com.fita.project.dto.LecturerDTO;
import com.fita.project.dto.StudentDTO;
import com.fita.project.dto.UserDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    //====================NGƯỜI DÙNG====================
    // Lấy ra tất cả người dùng
    List<UserDTO> getUsers();

    // Lấy ra người dùng theo "id"
    UserDTO getUserById(int id);

    // Lấy ra người dùng theo username
    UserDTO getUserByUsername(String username);

    // Thêm người dùng
    void addUser(UserDTO userDTO);

    // Sửa người dùng
    void editUser(int id, UserDTO userDTO);

    // Xoá người dùng
    void deleteUser(int id);


    //====================GIẢNG VIÊN====================
    // Lấy ra tất cả giảng viên
    List<LecturerDTO> getLecturers();

    // Lấy ra giảng viên theo "id"
    LecturerDTO getLecturerById(int id);

    // Lấy ra giảng viên theo "mã giảng viên"
    LecturerDTO getLecturerByLecturerCode(String lecturerCode);

    // Thêm giảng viên
    void addLecturer(LecturerDTO lecturerDTO);

    // Sửa giảng viên
    void editLecturer(int id, LecturerDTO lecturerDTO);

    // Xoá giảng viên
    void deleteLecturer(int id);


    //====================SINH VIÊN====================
    // Lấy ra tất cả sinh viên
    List<StudentDTO> getStudents();

    // Lấy ra sinh viên theo "id"
    StudentDTO getStudentById(int id);

    // Lất ra sinh viên theo "mã sinh viên"
    StudentDTO getStudentByStudentCode(String studentCode);

    // Thêm sinh viên
    void addStudent(StudentDTO studentDTO);

    // Sửa sinh viên
    void editStudent(int id, StudentDTO studentDTO);

    // Xoá sinh viên
    void deleteStudent(int id);
}
