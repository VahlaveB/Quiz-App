package com.quiz.entities;


import lombok.*;

import javax.persistence.*;

@Data  // This annotates both setter and getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "questions")
@Entity
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long  id;
    private String question;
    private String wrongAnswer1;
    private String wrongAnswer2;
    private String wrongAnswer3;
    private String correctAnswer;



}

