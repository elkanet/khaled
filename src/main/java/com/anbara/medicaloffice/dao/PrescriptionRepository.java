package com.anbara.medicaloffice.dao;

import com.anbara.medicaloffice.entities.Prescription;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface PrescriptionRepository extends JpaRepository<Prescription,Long> {
}
