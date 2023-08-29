package com.olumide.quizzapp.dao;

import com.olumide.quizzapp.Model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizDao extends JpaRepository<Quiz, Integer> {
}
