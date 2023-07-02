package com.quiz.service.implementation;

import com.quiz.entities.Question;
import com.quiz.repositories.QuestionRepository;
import com.quiz.service.QuizService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
public class QuizServiceImpl implements QuizService {

    public final QuestionRepository questionRepository;

    public QuizServiceImpl(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }

    public List<Question> getAllQuestion(){
        return questionRepository.findAll();
    }

}
