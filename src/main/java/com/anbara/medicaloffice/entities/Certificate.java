package com.anbara.medicaloffice.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@NoArgsConstructor
//@AllArgsConstructor
@Data
public class Certificate implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Temporal(TemporalType.DATE)
    private Date dateCreationCert;

    private String firstName, lastName, national_identity_card;
    @Temporal(TemporalType.DATE)
    private Date dateOfBirth;


    private String commentCertificate;

    private CertificateType certificateType;

    public Certificate(String firstName, String lastName, String commentCertificate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.commentCertificate = commentCertificate;

    }
}

enum CertificateType {
    Aptitude, Medical, Dispense;
}
