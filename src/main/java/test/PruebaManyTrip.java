package test;

import java.io.File;
import java.sql.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import clases.Passenger;
import clases.Trip;

public class PruebaManyTrip {

	public PruebaManyTrip() {
		// TODO Auto-generated constructor stub
	}
	
	
	private static SessionFactory buildSessionFactory(){
		try {
			return new Configuration().configure(new File("src/main/resources/hibernate/hibernate.cfg.xml")).buildSessionFactory();
		}
		catch(Throwable ex){
			
			System.err.println("Error de hibernate. No funciona " + ex);
			throw new ExceptionInInitializerError(ex);
		}
	}


	private static SessionFactory sessionFactory = buildSessionFactory();

	public static void main(String[] args) {
		Passenger german = new Passenger();
		Passenger alicia = new Passenger();
		Passenger margarita = new Passenger();
		
		german.setUser_name("Germán");
		alicia.setUser_name("Alicia");
		margarita.setUser_name("Margarita");
		
		alicia.setPassenger_credits(1500);
		german.setPassenger_credits(1500);
		margarita.setPassenger_credits(1500);

		
		Trip t = new Trip(2000,4,new Date(22, 04, 2017),"La Plata", "Bariloche");
		t.addPassenger(alicia);
		t.addPassenger(margarita);
		t.addPassenger(german);
		
		
		Session s = sessionFactory.getCurrentSession();
		s.beginTransaction();
		s.save(t);
		s.getTransaction().commit();


	}

}
