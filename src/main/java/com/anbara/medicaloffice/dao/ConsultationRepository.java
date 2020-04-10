package com.anbara.medicaloffice.dao;

import com.anbara.medicaloffice.entities.Consultation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ConsultationRepository extends JpaRepository<Consultation,Long> {
}
