package com.anbara.medicaloffice.dao;

import com.anbara.medicaloffice.entities.Medicament;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface MedicamentRepository extends JpaRepository<Medicament,Long> {
}
