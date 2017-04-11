/**
 * 
 */
package clases;

import java.util.Collection;
import java.util.HashSet;

/**
 * @author yato
 *
 */

public class Driver extends User{
	
	private String driver_licence;
	
	/**
	 * ver esta variable, el viaje deberia conocer el conductor o no, o ambos ¿? 
	 * 
	 */
	private Long user_id;
	private Collection<Trip> driver_trips; 
	private Collection<Score> driver_scores;
	
	
	public Driver(){
		this.setDriver_scores(new HashSet<Score>());
		this.setDriver_trips(new HashSet<Trip>());
	}
	
	/**
	 * 
	 */
	public Driver(String licence) {
		super();
		this.setDriver_licence(licence);
	}

	public Long getUser_id() {
		return user_id;
	}

	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}



	/**
	 * @return the driver_licence
	 */
	public String getDriver_licence() {
		return driver_licence;
	}

	
	/**
	 * @param driver_licence the driver_licence to set
	 */
	public void setDriver_licence(String driver_licence) {
		this.driver_licence = driver_licence;
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
	
	
	/**
	 * @return the driver_scores
	 */
	public Collection<Score> getDriver_scores() {
		return driver_scores;
	}


	/**
	 * @param driver_scores the driver_scores to set
	 */
	public void setDriver_scores(Collection<Score> driver_scores) {
		this.driver_scores = driver_scores;
	}

	
}
