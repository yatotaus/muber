package clases;

import java.util.Collection;
import java.util.HashSet;

/**
 * @author yato
 *
 */
public class Trip {

	private Long trip_id;
	private Integer trip_cost;
	private Integer trip_numberOfpassengers;
	private String trip_date;
	private String trip_from;
	private String trip_to;
	private Collection<Passenger> trip_passengers;
	
	/**
	 * 
	 */
	public Trip(){
		this.setTrip_passengers(new HashSet<Passenger>());
	}
	
	
	/**
	 * @param trip_cost
	 * @param trip_numberOfpassengers
	 * @param trip_date
	 * @param trip_from
	 * @param trip_to
	 */
	public Trip(Integer trip_cost, Integer trip_numberOfpassengers, String trip_date, String trip_from,
			String trip_to) {
		super();
		this.trip_cost = trip_cost;
		this.trip_numberOfpassengers = trip_numberOfpassengers;
		this.trip_date = trip_date;
		this.trip_from = trip_from;
		this.trip_to = trip_to;
	}

	
	

	/**
	 * @return the trip_id
	 */
	public Long getTrip_id() {
		return trip_id;
	}


	/**
	 * @param trip_id the trip_id to set
	 */
	public void setTrip_id(Long trip_id) {
		this.trip_id = trip_id;
	}


	/**
	 * @return the trip_cost
	 */
	public Integer getTrip_cost() {
		return trip_cost;
	}


	/**
	 * @param trip_cost the trip_cost to set
	 */
	public void setTrip_cost(Integer trip_cost) {
		this.trip_cost = trip_cost;
	}


	/**
	 * @return the trip_numberOfpassengers
	 */
	public Integer getTrip_numberOfpassengers() {
		return trip_numberOfpassengers;
	}


	/**
	 * @param trip_numberOfpassengers the trip_numberOfpassengers to set
	 */
	public void setTrip_numberOfpassengers(Integer trip_numberOfpassengers) {
		this.trip_numberOfpassengers = trip_numberOfpassengers;
	}


	/**
	 * @return the trip_date
	 */
	public String getTrip_date() {
		return trip_date;
	}


	/**
	 * @param trip_date the trip_date to set
	 */
	public void setTrip_date(String trip_date) {
		this.trip_date = trip_date;
	}


	/**
	 * @return the trip_from
	 */
	public String getTrip_from() {
		return trip_from;
	}


	/**
	 * @param trip_from the trip_from to set
	 */
	public void setTrip_from(String trip_from) {
		this.trip_from = trip_from;
	}


	/**
	 * @return the trip_to
	 */
	public String getTrip_to() {
		return trip_to;
	}


	/**
	 * @param trip_to the trip_to to set
	 */
	public void setTrip_to(String trip_to) {
		this.trip_to = trip_to;
	}


	/**
	 * @return the trip_passengers
	 */
	public Collection<Passenger> getTrip_passengers() {
		return trip_passengers;
	}


	/**
	 * @param trip_passengers the trip_passengers to set
	 */
	public void setTrip_passengers(Collection<Passenger> trip_passengers) {
		this.trip_passengers = trip_passengers;
	}
	
	
}
