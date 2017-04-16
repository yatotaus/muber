package test;

import java.io.File;
import java.sql.Date;
import java.sql.SQLException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import clases.Driver;

import clases.Passenger;
import clases.Score;
import clases.Trip;

public class PruebaRelationshipScore {

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


	public static void main(String[] args) throws SQLException {
	
		Date date = new Date(22, 04, 2017);
		Trip trip = new Trip(900, 4, date,"La pampa", "Neuquen");
		Score score = new Score("Excelente viaje", 5);
		Driver d = new Driver("Pedro-Chofer", "Pedro", date, "license#");
		
		Date date_user = new Date(10,10,2016);
		
		Passenger p = new Passenger("Clau", "pasajeroCLau", date_user, 1500.0);
		
		score.setScore_autor(p);
		score.setScore_trip(trip);
		
		trip.addScore(score);
		trip.setTrip_driver(d);
		trip.addPassenger(p);
		
		
		Session s = sessionFactory.getCurrentSession();
		s.beginTransaction();
		s.save(score);
		s.getTransaction().commit();
			
	}
	
	
	public PruebaRelationshipScore() {
		// TODO Auto-generated constructor stub
	}

	
}
