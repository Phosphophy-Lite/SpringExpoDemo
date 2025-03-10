package com.example.demo.service;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    @Getter
    @Setter
    private StudentRepository studentRepository;

    /**
     * Récupère tous les étudiants de la BDD
     * @return Iterable<Student> : liste de tous les étudiants
     */
    public Iterable<Student> getAllStudents() {
        // Iterable : ensemble de donnée pouvant être parcouru, peut être plus large qu'une List
        return studentRepository.findAll(); // findAll méthode de CrudRepository
    }

    /**
     * Supprime un étudiant donné de la BDD
     * @param id : clé primaire id de l'étudiant
     */
    public void deleteStudent(final Integer id) {
        studentRepository.deleteById(id);
    }

    /**
     * Sauvegarde un étudiant dans la BDD
     * @param student : objet Student à sauvegarder dans la BDD
     * @return Etudiant sauvegardé
     */
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }
}
