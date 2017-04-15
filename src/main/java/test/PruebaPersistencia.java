package test;

import junit.framework.TestCase;

import java.io.File;
import java.sql.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import clases.Driver;
import clases.Passenger;
import clases.Trip;


/**
 * @author marcos
 *
 */
public class PruebaPersistencia extends TestCase {

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
		public void testPrimerTest(){
			
			Driver d = new Driver();
			Passenger u = new Passenger();
			u.setCredits(1500);
			u.setUser_date(new Date(10, 3, 2017));
			u.setUser_name("German");
			u.setUser_password("contraseña");
			Trip t = new Trip(900,4,new Date(22, 04, 2017),"La Plata", "Caviahue");
			
			d.setUser_name("Nuevo conductor");

			t.setTrip_driver(d);
			
			Session s = sessionFactory.getCurrentSession();
			s.beginTransaction();
			s.save(t);
			s.getTransaction().commit();
			
		}
}