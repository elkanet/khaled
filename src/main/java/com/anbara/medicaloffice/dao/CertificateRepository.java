package com.anbara.medicaloffice.dao;

import com.anbara.medicaloffice.entities.Certificate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CertificateRepository extends JpaRepository<Certificate,Long> {
}
