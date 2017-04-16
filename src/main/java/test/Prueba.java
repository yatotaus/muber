package test;

import java.io.File;
import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import clases.*;

public class Prueba {
	
	private static SessionFactory sessionFactory = buildSessionFactory();
	
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


	public static void main(String[] args) {
				
		Driver driver = new Driver();
		driver.setDriver_license("Licencia#");
		driver.setUser_date(new Date(10, 3, 2017));
		driver.setUser_name("Roberto");
		driver.setUser_password("contraseña");
		
		Driver driver2 = new Driver();
		driver2.setDriver_license("Licencia#");
		driver2.setUser_date(new Date(10, 3, 2017));
		driver2.setUser_name("Carlitos");
		driver2.setUser_password("contraseña");

		
		//Germán, alicia, margarita
		Passenger german = new Passenger();
		Passenger alicia = new Passenger();
		Passenger margarita = new Passenger();
		
		german.setUser_name("Germán");
		german.setUser_password("123");
		german.setPassenger_credits(1500.0);
		german.setUser_date(new Date(11, 4, 2017));
		
		alicia.setUser_name("Alicia");
		alicia.setUser_password("soyAlice");
		alicia.setPassenger_credits(1500.0);
		alicia.setUser_date(new Date(11, 4, 2017));
		
		margarita.setUser_name("Margarita");
		margarita.setUser_password("soyunaflor");
		margarita.setPassenger_credits(1500.0);
		margarita.setUser_date(new Date(11, 4, 2017));
		
		Trip trip = new Trip(900,4,new Date(22, 04, 2017),"La Plata", "Mar del Plata");
		Trip trip2 = new Trip(900,4,new Date(22, 04, 2017),"La Plata", "Córdoba");
		
		
		//trip2.setTrip_driver(driver2);
		
		trip2.addPassenger(alicia);
		
		Score score = new Score();
		score.setScore_comment("Muy buen conductor");
		score.setScore_number(2);	
		
		
		Set<Trip> trips = new HashSet<Trip>();
		Set<Passenger> passengers = new HashSet<Passenger>();
		Set<Driver> drivers = new HashSet<Driver>();
		
		
		trips.add(trip);
		trips.add(trip2);
		passengers.add(german);
		passengers.add(margarita);
		passengers.add(alicia);
		drivers.add(driver);
		drivers.add(driver2);
		
		Muber muber = new Muber(passengers, drivers, trips);				

		
		Session s = sessionFactory.getCurrentSession();
		s.beginTransaction();
		s.save(score);
		s.getTransaction().commit();

	}

}
