package com.anbara.medicaloffice.dao;

import com.anbara.medicaloffice.entities.MedicalExam;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface MedicalExamRepository extends JpaRepository<MedicalExam,Long> {
}
