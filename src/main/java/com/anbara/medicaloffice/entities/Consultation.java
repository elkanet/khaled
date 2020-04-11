package com.anbara.medicaloffice.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Consultation implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Temporal(TemporalType.DATE)
    private Date dateConsultation;

    private String reason_consultation;

    @ManyToOne
     private Patient patient;

    @OneToOne
    private Prescription prescription;

    @OneToMany(mappedBy = "consultation")
    private Collection<MedicalExam> medicalExams;

    @OneToOne
    @JoinColumn(name="id", nullable=true)
    private Certificate certificate;
}
