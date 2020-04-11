package com.anbara.medicaloffice.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@NoArgsConstructor
@Data
public class AppointmentGeneral implements Serializable {
   @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numberAppointment;
    @Temporal(TemporalType.DATE)
    private Date dateAppointment;
    @Temporal(TemporalType.TIME)
    private Date  hourAppointment;
    private  String fullName,telephone;



    public AppointmentGeneral(String telephone, String fullName, Date dateAppointment, Date hourAppointment) {
        this.dateAppointment = dateAppointment;
        this.hourAppointment = hourAppointment;
        this.telephone = telephone;
        this.fullName = fullName;
    }
}
