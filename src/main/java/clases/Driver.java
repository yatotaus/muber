/**
 * 
 */
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
	 * 
	 */
	public Driver(String name,  String password, Date date, String license){
		super(name, password, date);
		this.setDriver_license(license);
	}

	
	/**
	 * @return the user_id
	 */
	public Long getUser_id() {
		return user_id;
	}

	
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
	 * @param trip the trip to add 
	 */
	public void addTrip(Trip trip){
		trip.setTrip_driver(this);
		this.getDriver_trips().add(trip);
	}

	
}
