package test;

import java.io.File;
import java.sql.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import clases.Driver;
import clases.Passenger;
import clases.Trip;

public class PruebaManyTrip {

	public PruebaManyTrip() {
		// TODO Auto-generated constructor stub
	}
	
	
	@SuppressWarnings("deprecation")
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
		
		alicia.setPassenger_credits(1500.0);
		german.setPassenger_credits(1500.0);
		margarita.setPassenger_credits(1500.0);

		Driver roberto = new Driver();
		roberto.setUser_name("Roberto");
		roberto.setDriver_license("verde");
		
		
		Trip t = new Trip(2000,4,new Date(22, 04, 2017),"La Plata", "Bariloche");
		t.setTrip_numberOfpassengers(5);
		//t.setTrip_driver(roberto);
		t.addPassenger(alicia);
		t.addPassenger(margarita);
		t.addPassenger(german);
		
		roberto.addTrip(t);
		
		Session s = sessionFactory.getCurrentSession();
		s.beginTransaction();
		s.save(t);
		s.getTransaction().commit();


	}

}
