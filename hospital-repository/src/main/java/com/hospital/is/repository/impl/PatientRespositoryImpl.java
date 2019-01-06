package com.hospital.is.repository.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Repository;

import com.hospital.is.entity.Patient;
import com.hospital.is.repository.PatientRepository;

@Repository
public class PatientRespositoryImpl implements PatientRepository {

	public List<Patient> getAll() {
		Configuration configuration = new Configuration();
		configuration.addAnnotatedClass(Patient.class);
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();

		Criteria criteria = session.createCriteria(Patient.class);
//		criteria.add(Restrictions.ilike("firstName", "MAro"));

		Patient patient = (Patient) session.get(Patient.class, 3);

		return criteria.list();
	}

}
