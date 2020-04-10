package com.anbara.medicaloffice;

import com.anbara.medicaloffice.service.IMedOfficeInitService;
import com.anbara.medicaloffice.service.MedOfficeInitServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MedicalofficeApplication implements CommandLineRunner {
    @Autowired
    private IMedOfficeInitService iMedOfficeInitService;

    public static void main(String[] args) {
        SpringApplication.run(MedicalofficeApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        iMedOfficeInitService.initAppointments();
    }
}
