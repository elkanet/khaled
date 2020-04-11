package com.anbara.medicaloffice.service;

import com.anbara.medicaloffice.dao.*;
import com.anbara.medicaloffice.entities.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

@Service
public class MedOfficeInitServiceImpl implements IMedOfficeInitService {

    private final PatientRepository patientRepository;
    private final AppointmentGenRepository appointmentGenRepository;
    private final ConsultationRepository consultationRepository;
    private final MedicalExamRepository medicalExamRepository;
    private final CertificateRepository certificateRepository;
    private final PrescriptionRepository prescriptionRepository;

    private DateFormat format1, format2;

    @Autowired
    public MedOfficeInitServiceImpl(PatientRepository patientRepository, AppointmentGenRepository appointmentGenRepository, ConsultationRepository consultationRepository, MedicalExamRepository medicalExamRepository, CertificateRepository certificateRepository, PrescriptionRepository prescriptionRepository) {
        this.patientRepository = patientRepository;
        this.appointmentGenRepository = appointmentGenRepository;
        this.consultationRepository = consultationRepository;
        this.medicalExamRepository = medicalExamRepository;
        this.certificateRepository = certificateRepository;

        this.prescriptionRepository = prescriptionRepository;

        format1 = new SimpleDateFormat("dd-MM-yyyy");
        format2 = new SimpleDateFormat("hh:mm");
    }


    @Override
    public void initPatients() {


        Patient p1 = new Patient();
        p1.setFirstName("amine");
        p1.setLastName("manih");
        patientRepository.save(p1);

        Optional<Patient> optional = patientRepository.findById(1L);
        if (optional.isPresent()) {
            Patient pp = optional.get();
            Collection<Date> dates = pp.getRdvPatients();
            dates.add(new Date());
            pp.setRdvPatients(dates);
            patientRepository.save(pp);

        }
        optional = patientRepository.findById(1L);
        if (optional.isPresent()) {
            Patient ppp = optional.get();
            Collection<Date> dates = ppp.getRdvPatients();
            dates.add(new Date());
            ppp.setRdvPatients(dates);
            patientRepository.save(ppp);

        }
    }

    @Override
    public void initAppointmentsGeneral() {

        try {
            AppointmentGeneral a1 = new AppointmentGeneral("mostafa akim"
                    , "002126334444", format1.parse("23-05-2020"), format2.parse("10:34"));
            AppointmentGeneral a2 = new AppointmentGeneral("ahmed najar"
                    , "002126777334", format1.parse("21-06-2010"), format2.parse("14:34"));
            appointmentGenRepository.save(a1);
            appointmentGenRepository.save(a2);

        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void initConsultations() {
        // get Patient then add consultaion
        Optional<Patient> optional = patientRepository.findById(1L);
        if (optional.isPresent()) {
            Consultation consultation = new Consultation();
            consultation.setDateConsultation(new Date());
            consultation.setPatient(optional.get());
            consultation.setReason_consultation("fievre");
            consultationRepository.save(consultation);

        }

    }


    @Override
    public void initPrescriptions() {
// get consulation then add
  /*      Optional<Consultation> optional = consultationRepository.findById(1L);
        if (optional.isPresent()) {
            Consultation consultation = optional.get();

            Prescription prescription = new Prescription(new HashMap<String, String>() {
                {
                    put("medicament AA", "form1");
                    put("medicament BB", "form2");
                }
            });

//            prescription.setConsultation(consultation);
            prescriptionRepository.save(prescription);

            consultation.setPrescription(prescription);

            consultationRepository.save(consultation);

        }

   */
    }

    @Override
    public void initCertificates() {
// get consulation then add
        Optional<Consultation> optional = consultationRepository.findById(1L);
        if (optional.isPresent()) {
            Consultation consultation = optional.get();
//firstName,  lastName,  commentCertificate, CertificateType certificateType) {
            Certificate certificate = new Certificate(consultation.getPatient().getFirstName()
                    , consultation.getPatient().getLastName()
                    , "comment Certificate....");
            certificateRepository.save(certificate);

        }
    }

    @Override
    public void initMedicalExams() {
// get consulation then add

    }
}
