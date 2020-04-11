package com.anbara.medicaloffice.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Entity
@NoArgsConstructor
//@AllArgsConstructor
@Data
public class Prescription implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Temporal(TemporalType.DATE)
    private Date datePrescription;


    //    @OneToOne
//    private Consultation consultation;

    //    @ElementCollection


//    @ElementCollection
 //   private Map<String, String> medicamentMap; // <name,details> ;

//    public Prescription(Map<String, String> medicamentMap) {
//        this.medicamentMap = medicamentMap;
//    }
}
