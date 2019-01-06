package com.hospital.is.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospital.is.entity.Patient;
import com.hospital.is.repository.PatientRepository;
import com.hospital.is.service.PatientService;

@Service
public class PatientServiceImpl implements PatientService {

	@Autowired
	private PatientRepository patientRepository;

	public List<Patient> getAll() {
		return patientRepository.getAll();
	}


}
