package com.anbara.medicaloffice.service;

import com.anbara.medicaloffice.dao.*;
import com.anbara.medicaloffice.entities.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.stream.Stream;

@Service
public class MedOfficeInitServiceImpl implements IMedOfficeInitService {

    private final PatientRepository patientRepository;
    private final AppointmentRepository appointmentRepository;
    private final ConsultationRepository consultationRepository;
    private final MedicalExamRepository medicalExamRepository;
    private final CertificateRepository certificateRepository;
    private final MedicamentRepository  medicamentRepository;
    private final PrescriptionRepository prescriptionRepository;

    private  DateFormat format1,format2;

    public MedOfficeInitServiceImpl(PatientRepository patientRepository, AppointmentRepository appointmentRepository, ConsultationRepository consultationRepository, MedicalExamRepository medicalExamRepository, CertificateRepository certificateRepository, MedicamentRepository medicamentRepository, PrescriptionRepository prescriptionRepository) {
        this.patientRepository = patientRepository;
        this.appointmentRepository = appointmentRepository;
        this.consultationRepository = consultationRepository;
        this.medicalExamRepository = medicalExamRepository;
        this.certificateRepository = certificateRepository;
        this.medicamentRepository = medicamentRepository;
        this.prescriptionRepository = prescriptionRepository;

        format1=new SimpleDateFormat("dd-MM-yyyy");
        format2=new SimpleDateFormat("hh:mm");
    }

    @Autowired

    @Override
    public void initPatients() {


     Patient p1=new Patient() ;
     p1.setFirstName("amine");
     p1.setLastName("manih");

        try {
            AppointmentPatient a1=new AppointmentPatient(format1.parse("23-05-2020"),format2.parse("10:34"));
        } catch (ParseException e) {
            e.printStackTrace();
        }
// Stream.of();
    }

    @Override
    public void initAppointments() {

//        try {
//            AppointmentPatient a1=new AppointmentPatient("amine mahdaoui"
//                    ,"002126334444",format1.parse("23-05-2020"),format2.parse("10:34"));
//            AppointmentPatient a2=new AppointmentPatient("ahmed madani"
//                    ,"002126777334",format1.parse("21-06-2010"),format2.parse("14:34"));
//            appointmentRepository.save(a1);
//            appointmentRepository.save(a2);
//
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
    }

    @Override
    public void initConsultations() {

    }

    @Override
    public void initMedicaments() {

    }

    @Override
    public void initPrescriptions() {

    }

    @Override
    public void initCertificates() {

    }

    @Override
    public void initMedicalExams() {

    }
}
