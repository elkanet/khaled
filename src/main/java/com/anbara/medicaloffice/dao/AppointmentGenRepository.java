package com.anbara.medicaloffice.dao;

import com.anbara.medicaloffice.entities.AppointmentGeneral;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface AppointmentGenRepository extends JpaRepository<AppointmentGeneral,Long> {
}
