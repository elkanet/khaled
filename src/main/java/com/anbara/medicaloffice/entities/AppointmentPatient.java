package com.anbara.medicaloffice.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@NoArgsConstructor
@Data
public class AppointmentPatient implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numberAppointment;
    @Temporal(TemporalType.DATE)
    private Date dateAppointment;
    @Temporal(TemporalType.TIME)
    private Date  hourAppointment;




    public AppointmentPatient( Date dateAppointment, Date hourAppointment) {
        this.dateAppointment = dateAppointment;
        this.hourAppointment = hourAppointment;

    }
}
