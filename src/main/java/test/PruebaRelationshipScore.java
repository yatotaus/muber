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
	
		Trip trip = new Trip(900,4,new Date(22, 04, 2017),"La pampa", "Neuquen");
		Score score = new Score();
		Passenger p = new Passenger();
		Driver d = new Driver();
		
		
		d.setDriver_licence("10/10/2017");
		d.setUser_date(new Date(10,10,2016));
		d.setUser_name("Pedro");
		d.setUser_password("Pablo");
		
		p.setUser_name("Conductor actual");
		score.setScore_comment("Excelente viaje");
		score.setScore_number(5);
		
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
