package com.hospital.is;

import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.hospital.is.service.PatientService;

public class PatientServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	private PatientService patientService;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

		context.register(HospitalConfig.class);
		context.refresh();

		patientService = (PatientService) context.getBean(PatientService.class);

		context.getAutowireCapableBeanFactory().autowireBean(this);
		try {
			PrintWriter printWriter = response.getWriter();

			printWriter.println("<html><body>");
			printWriter.println("<h1>CodeBurners</h1>");
			//System.out.println(patientService.getAll().get(0));
			//System.out.println(patientService.getAll().size());
			printWriter.println(patientService.getAll().get(1));
			printWriter.println("</html></body>");

		} catch (Exception e) {
			e.printStackTrace();
		}
		context.close();

	}
	
	
	/*private static final long serialVersionUID = 1L;

	private PatientService patientService;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException {

		ApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "spring-configuration.xml" });

		patientService = (PatientService) context.getBean("patientServiceImpl");
		try {
			PrintWriter printWriter = response.getWriter();

			List<Patient> listPatient = patientService.getAll();
			String firstName = listPatient.get(0).getFirstName();
			request.setAttribute("listPatient", listPatient);
			RequestDispatcher rd = getServletContext().getRequestDispatcher("/views/page.jsp");
			rd.forward(request, response);

//			for (int i = 0; i < listPatient.size(); i++) {
//				printWriter.println("Patient" + i );
//				printWriter.println("First name: "+listPatient.get(i).getFirstName());
//				printWriter.println("Last name: "+listPatient.get(i).getLastName());
//				printWriter.println("Phone: "+listPatient.get(i).getPhone());
//				printWriter.println("Address: "+listPatient.get(i).getAddress());
//				printWriter.println("-------");
//
//		    }
//			printWriter.println("<html><body>");
//			printWriter.println("<h1>Patient list</h1>");
//			printWriter.println(patientService.getAll());
//			printWriter.println("</html></body>");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}*/

}
