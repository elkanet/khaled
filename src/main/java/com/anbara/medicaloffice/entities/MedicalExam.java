package com.anbara.medicaloffice.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@NoArgsConstructor @AllArgsConstructor @Data
public class MedicalExam implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description_exam ,result_exam;

    @ManyToOne
    private Consultation consultation;

}
