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
public class Patient implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_fichePatient;

    @Temporal(TemporalType.DATE)
    private Date dateCreationFiche;
    private String firstName, lastName;
   // private String national_identity_card,profession, address, telephone, typeDeMutuel, numMatriculeMutuel;

    @Temporal(TemporalType.DATE)
    private Date dateOfBirth;

    @Enumerated(EnumType.STRING)
    private Gender gender;

//    private float weight; // en kg
//    private int size;    // en cm

    //@OneToMany(mappedBy = "patient")
//    @OneToMany()
//    private Collection<AppointmentPatient> appointmentPatients;
    @ElementCollection(fetch = FetchType.EAGER) // recomended value LAZY
    Collection<Date> rdvPatients;

    @OneToMany(mappedBy = "patient")
    private Collection<Consultation> consultations;



    public Patient(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

    }
}

enum Gender {
    Female, Male;
}
