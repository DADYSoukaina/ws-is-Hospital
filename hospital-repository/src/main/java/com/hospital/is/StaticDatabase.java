package com.hospital.is;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.hospital.is.entity.Patient;

public class StaticDatabase {

	private static Long patientIndex;

	//static Map<Long, Patient> patientMap = new HashMap<>();
	static List<Patient> patientList = new ArrayList<Patient>();


	
	public static List<Patient> getPatientList() {

//		this patients will be added on each call f this method
		Patient patient = new Patient();

		patient.setFirstName("Code");
		patient.setLastName("Burners");
		patient.setAddress("30 rue soulaimane achaairi, 20500, Tetouan Maroc");
		patient.setPhone("+212 6 66 77 88 99");
		
		Patient patient2 = new Patient();

		patient2.setFirstName("chaam");
		patient2.setLastName("guet");
		patient2.setAddress("15 rue soulaimane achaairi, 20500, Tetouan Maroc");
		patient2.setPhone("+212 6 66 77 88 99");

		addPatient(patient);
		addPatient(patient2);
		

		return patientList;
	}
	
	public static void addPatient(Patient p) {
		patientList.add(p);
	}

	

}
