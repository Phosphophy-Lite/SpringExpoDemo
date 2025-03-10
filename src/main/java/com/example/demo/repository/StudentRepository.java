package com.example.demo.repository;

import com.example.demo.model.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/*
    Repository :
    => sert à communiquer avec la BDD
    => à exécuter des opérations CRUD (Create, Read, Update, Delete) une entité de la BDD (Student par ex)
    => interface CrudRepository : implémente automatiquement les opérations CRUD SQL
 */

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer> {

    // On pourrait ajouter des méthodes personnalisées si besoin
}
