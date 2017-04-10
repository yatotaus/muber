package test;

import java.io.File;
import java.sql.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import clases.Driver;
import clases.Passenger;
import clases.Score;
import clases.Trip;

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
		//Persiste viajes, pasajeros
		Driver u = new Driver();
		u.setDriver_licence("Licencia#");
		u.setUser_date(new Date(10, 3, 2017));
		u.setUser_name("German");
		u.setUser_password("contraseña");
		
		Trip t = new Trip(900,4,new Date(22, 04, 2017),"La Plata", "Tres Arroyos");
		Score score = new Score();
		score.setScore_comment("Muy buen conductor");
		score.setScore_number(4);


		
		Session s = sessionFactory.getCurrentSession();
		s.beginTransaction();
		s.save(score);
		s.getTransaction().commit();

	}

}
