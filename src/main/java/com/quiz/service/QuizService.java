package com.quiz.service;

import com.quiz.entities.Question;
import com.quiz.repo.Repo;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@AllArgsConstructor
public class QuizService {
    @Autowired
    public final Repo repo;
    public List<Question> getAllQuestion(){
        return repo.findAll();
    }

}
