package com.example.demo.controller;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/")
/*
    Controller gérant les requêtes HTTP
    => Méthodes servent à retourner des vues HTML (nom du fichier HTML)
 */
public class AppController {

    @Autowired
    private StudentService studentService;

    /**
     * Affiche la page d'accueil avec la liste des étudiants
     */
    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("students", studentService.getAllStudents());
        model.addAttribute("newStudent", new Student()); // pour le formulaire

        /* Charge la page home.html quand on accède à la racine "/" du serveur web */
        return "home";
    }

    /**
     * Ajouter un étudiant à la BDD via le formulaire
     */
    @PostMapping("/add")
    public String addStudent(@ModelAttribute Student student) {
        studentService.saveStudent(student);
        if (student.getFirstName() == null || student.getFirstName().isEmpty() ||
                student.getLastName() == null || student.getLastName().isEmpty() ||
                student.getYear() == null || student.getYear().isEmpty() ||
                student.getGroup() == null || student.getGroup().isEmpty()) {
            throw new IllegalArgumentException("Tous les champs doivent être remplis");
        }

        return "redirect:/";  // Recharge la page avec la nouvelle liste
    }

    /**
     * Supprimer un étudiant de la BDD
     */
    @GetMapping("/delete/{id}")
    public String deleteStudent(@PathVariable("id") Integer id) {
        studentService.deleteStudent(id);
        return "redirect:/"; // Recharge la page avec la nouvelle liste
    }


}



