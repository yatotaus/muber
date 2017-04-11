package test;

import java.io.File;
import java.sql.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import clases.*;

public class Prueba {
	
	private static SessionFactory sessionFactory = buildSessionFactory();
	
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
		//Puede persistir score, viajes y pasajeros
		
		Driver driver = new Driver();
		driver.setDriver_licence("Licencia#");
		driver.setUser_date(new Date(10, 3, 2017));
		driver.setUser_name("Roberto");
		driver.setUser_password("contraseña");
		
		//Germán, alicia, margarita
		Passenger german = new Passenger();
		Passenger alicia = new Passenger();
		Passenger margarita = new Passenger();
		
		german.setUser_name("Germán");
		alicia.setUser_name("Alicia");
		margarita.setUser_name("Margarita");
		
		alicia.setPassenger_credits(1500);
		german.setPassenger_credits(1500);
		margarita.setPassenger_credits(1500);
		
		
		Trip trip = new Trip(900,4,new Date(22, 04, 2017),"La Plata", "Mar del Plata");
		Trip trip2 = new Trip(900,4,new Date(22, 04, 2017),"La Plata", "Córdoba");
		
		Score score = new Score();
		score.setScore_comment("Muy buen conductor");
		score.setScore_number(4);	
		
		
		
		//SortedSet<User> users = new TreeSet<User>();
		Set<Trip> trips = new HashSet<Trip>();
		Set<User> users = new HashSet<User>();
		
		trips.add(trip);
		trips.add(trip2);
		users.add(german);
		users.add(margarita);
		users.add(alicia);
		
		Muber muber = new Muber(users, trips);				

		Session s = sessionFactory.getCurrentSession();
		s.beginTransaction();
		s.save(muber);
		s.getTransaction().commit();

	}

}
