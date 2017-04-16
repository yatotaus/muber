/**
 * 
 */
package test;

import java.io.File;
import java.sql.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import clases.Driver;
import clases.Score;
import clases.Trip;
import junit.framework.TestCase;

/**
 * @author yato
 *
 */
public class TestUsuario extends TestCase {
	
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

	@SuppressWarnings("deprecation")
	public void testUser(){
		
		//Persiste User
		Driver user = new Driver();
		user.setDriver_license("Licencia#");
		user.setUser_date(new Date(10, 3, 2017));
		user.setUser_name("German");
		user.setUser_password("contraseña");
		
		Trip t = new Trip(900,4,new Date(22, 04, 2017),"La Plata", "Tres Arroyos");
		
		Score score = new Score();
		score.setScore_comment("Muy buen conductor");
		score.setScore_number(4);

		Session s = sessionFactory.getCurrentSession();
		s.beginTransaction();
		s.save(user);
		s.getTransaction().commit();
		
	}
}
