package com.quiz.controller;

import com.quiz.entities.Question;
import com.quiz.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/Quiz")
public class QuizController {

  @Autowired
  QuizService quizService;

    @GetMapping("/questions")
    public List<Question> getAllQuestion(){return quizService.getAllQuestion();}
}
