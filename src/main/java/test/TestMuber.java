/**
 * 
 */
package test;

import java.io.File;
import java.sql.Date;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.junit.Test;
import clases.*;

/**
 * @author yato
 *
 */
public class TestMuber {

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
	
	
	@Test
	public final void test() {
		
		@SuppressWarnings("deprecation")
		Date date = new Date(16, 04, 2017);
		
		@SuppressWarnings("deprecation")
		Date date_user = new Date(10,10,2016);
		
		Muber muber = new Muber();
		
		Trip trip = new Trip(900, 4, date, "La Plata", "Tres Arroyos");
		
		Driver roberto = new Driver("Roberto", "robertito", date, "license#");
		
		Passenger german, alicia, margarita;
		german = new Passenger("German", "pasajeroGerman", date_user, 1500.0);
		alicia = new Passenger("Alicia", "pasajeroAlicia", date_user, 1500.0);
		margarita = new Passenger("Margarita", "pasajeroMarga", date_user, 1500.0);
		
		muber.addDriver(roberto);
		muber.addPassenger(german);
		muber.addPassenger(alicia);
		muber.addPassenger(margarita);
	
		/*	Asigna chofer a un viaje determinado	*/
		muber.addTripBy(trip, roberto);
		
		/*	Agrega los pasajeros a un viaje	*/
		muber.addPassengerToTrip(trip, german);
		muber.addPassengerToTrip(trip, alicia);
		muber.addPassengerToTrip(trip, margarita);
		
		trip.discountCredit();		
		/*	Agrega las calificaciones al viaje trip	*/
		muber.qualifyTrip(trip, german, new Score("Buen viaje", 5));
		muber.qualifyTrip(trip, alicia, new Score("Volvería a viajar", 4));
		muber.qualifyTrip(trip, margarita, new Score("Rapidísimo", 4));
		
		
		Session s = sessionFactory.getCurrentSession();
		s.beginTransaction();
		s.save(muber);
		s.getTransaction().commit();
	}

}
