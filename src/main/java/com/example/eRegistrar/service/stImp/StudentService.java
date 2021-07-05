package com.example.eRegistrar.service.stImp;

import com.example.eRegistrar.model.Student;
import com.example.eRegistrar.repository.StudentRepository;
import com.example.eRegistrar.service.StudentServiceInt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
    public class StudentService implements StudentServiceInt {

        @Autowired
        StudentRepository studentRepository;

        @Override
        public Iterable<Student> getAllStudents() {
            return studentRepository.findAll();
        }

        @Override
        public Student save(Student s) {
            return studentRepository.save(s);
        }

        @Override
        public Student findStudentById(Long id){
            return studentRepository.findById(id).orElse(null);
        }

        @Override
        public void deleteStudent(Student s){
            studentRepository.delete(s);
        }

    @Override
    public Optional<Student> findStudentByStudentNumber(String num) {
        return Optional.empty();
    }

//        @Override
//        public Optional<Student> findStudentByStudentNumber(String num){
//            return studentRepository.findStudentByStudentNumber(num);
//        }
}
