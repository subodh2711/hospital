package com.hms.service;


import com.hms.dao.impl.DoctorDAOImpl;
import com.hms.dao.impl.HospitalDAOImpl;
import com.hms.dao.impl.PatientDAOImpl;
import com.hms.model.Doctor;
import com.hms.model.Hospital;
import com.hms.model.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class HMSService {
	
	@Autowired
	DoctorDAOImpl doctorDao;
	
	@Autowired
	PatientDAOImpl patientDao;

	@Autowired
	HospitalDAOImpl hospitalDao;
	
	List<Doctor> listDoctors;
	List<Patient> listPatients;

	public List<Hospital> getHospital() {
		return hospitalDao.getHospital();
	}

	public List<Doctor> showAllDoctors(){
		listDoctors=doctorDao.allDoctors();
		return listDoctors;
	}

	public List<Map<String, Object>> searchDoctorByName(String doctorName){
		return doctorDao.searchDoctorByName(doctorName);
	}
	
	public Doctor searchDoctorById(long id) {	
		return doctorDao.searchDoctorById(id);
	}
	
	public Doctor createDoctor(Doctor doctor) {
		return doctorDao.createDoctor(doctor);
	}
	
	public Doctor updateDoctor(Doctor doctor) {
		return doctorDao.updateDoctor(doctor);
	}
	
	public void deleteDoctor(long id){
		doctorDao.deleteDoctor(id);
	}

	public List<Patient> showAllPatients(){
		listPatients=patientDao.allPatients();
		return listPatients;
	}
	
	public List<Map<String, Object>> searchPatientByName(String patientName){
		return patientDao.searchPatientByName(patientName);
	}
	
	public Patient searchPatientById(long id) {
		return patientDao.searchPatientById(id);
	}
	
	public Patient createPatient(Patient patient) {
		return patientDao.createPatient(patient);
	}
	
	public void updatePatient(Patient patient){
		patientDao.updatePatient(patient);
	}
	
	public void deletePatient(long id){
		patientDao.deletePatient(id);
	}

}
