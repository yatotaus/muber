package clases;

import java.sql.Date;
import java.util.Collection;
import java.util.HashSet;

/**
 * @author yato
 *
 */

public class Driver extends User{
	
	private Long user_id;
	private String driver_license;
	private Collection<Trip> driver_trips; 
	
	
	public Driver(){
		this.setDriver_trips(new HashSet<Trip>());
	}
	
	
	/**
	 * @param driver_name
	 * @param driver_password
	 * @param driver_date
	 * @param driver_license
	 */
	public Driver(String driver_name,  String driver_password, Date driver_date, String driver_license){
		super(driver_name, driver_password, driver_date);
		this.setDriver_license(driver_license);
	}

	
	/**
	 * @return the user_id
	 */
	public Long getUser_id() {
		return user_id;
	}

	
	/**
	 * @param user_id the user_id to set
	 */
	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}


	/**
	 * @return the driver_license
	 */
	public String getDriver_license() {
		return driver_license;
	}

	
	/**
	 * @param driver_licence the driver_licence to set
	 */
	public void setDriver_license(String driver_license) {
		this.driver_license = driver_license;
	}


	/**
	 * @return the driver_trips
	 */
	public Collection<Trip> getDriver_trips() {
		return this.driver_trips;
	}


	/**
	 * @param driver_trips the driver_trips to set
	 */
	public void setDriver_trips(Collection<Trip> driver_trips) {
		this.driver_trips = driver_trips;
	}

	
	/**
	 * agrega al viaje trip el conductor
	 * agrega a la colección driver_trips el viaje trip  
	 */
	public void addTrip(Trip trip){
		trip.setTrip_driver(this);
		this.getDriver_trips().add(trip);
	}

	
}