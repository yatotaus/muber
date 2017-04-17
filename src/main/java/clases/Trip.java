package clases;

import java.sql.Date;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author yato
 *
 */
public class Trip {

	private Long trip_id;
	private int trip_cost;
	private int trip_numberOfpassengers;
	private Date trip_date;
	private String trip_from;
	private String trip_to;
	private Collection<Passenger> trip_passengers = new HashSet<Passenger>();
	private Driver trip_driver;
	private Set<Score> trip_scores= new HashSet<Score>();
	
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
	public Trip(int trip_cost, int trip_numberOfpassengers, Date trip_date, String trip_from,
			String trip_to) {
		super();
		this.setTrip_cost(trip_cost);
		this.setTrip_date(trip_date);
		this.setTrip_numberOfpassengers(trip_numberOfpassengers);
		this.setTrip_from(trip_from);
		this.setTrip_to(trip_to);
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
	public int getTrip_cost() {
		return trip_cost;
	}


	/**
	 * @param trip_cost the trip_cost to set
	 */
	public void setTrip_cost(int trip_cost) {
		this.trip_cost = trip_cost;
	}

	
	/**
	 * @return the trip_numberOfpassengers
	 */
	public int getTrip_numberOfpassengers() {
		return trip_numberOfpassengers;
	}


	/**
	 * @param trip_numberOfpassengers the trip_numberOfpassengers to set
	 */
	public void setTrip_numberOfpassengers(int trip_numberOfpassengers) {
		this.trip_numberOfpassengers = trip_numberOfpassengers;
	}


	/**
	 * @return the trip_date
	 */
	public Date getTrip_date() {
		return trip_date;
	}


	/**
	 * @param trip_date the trip_date to set
	 */
	public void setTrip_date(Date trip_date) {
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
	public void setTrip_passengers(Set<Passenger> trip_passengers) {
		this.trip_passengers = trip_passengers;
	}


	/**
	 * @return the trip_driver
	 */
	public Driver getTrip_driver() {
		return trip_driver;
	}


	/**
	 * @param trip_driver the trip_driver to set
	 */
	public void setTrip_driver(Driver trip_driver) {
		this.trip_driver = trip_driver;
	}


	/**
	 * @param trip_passengers the trip_passengers to set
	 */
	public void setTrip_passengers(Collection<Passenger> trip_passengers) {
		this.trip_passengers = trip_passengers;
	}


	/**
	 * @return the trip_scores
	 */
	public Set<Score> getTrip_scores() {
		return trip_scores;
	}


	/**
	 * @param trip_scores the trip_scores to set
	 */
	public void setTrip_scores(Set<Score> trip_scores) {
		this.trip_scores = trip_scores;
	}

	
	/**
	 * @param score the trip_scores to add
	 */
	public void addScore(Score score) {
		trip_scores.add(score);
		
	}

	
	/**
	 * @param passenger agrega pasajero al viaje si hay espacio disponible
	 */
	public void addPassenger(Passenger passenger){
		if(this.getTrip_numberOfpassengers() - this.getTrip_passengers().size() > 0)
			this.trip_passengers.add(passenger);
	}
	
	/*
	 *Mensaje que sirve para descontar el crédito a los pasajeros que participaron de un viaje.
	 *
	 *No contamos con las reglas de negocio completamente definidas para la implementación del mismo. 
	 *Podría ocurrir que un pasajero quede con créditos negativos. Desconocemos como se espera que el
	 *sistema verifique esto. Asumimos que los créditos son enteros  
	 * */
	public void discountCredit(){
		int passengerNumber = trip_passengers.size() + 1;
		Passenger passenger;
		Iterator iterator = trip_passengers.iterator(); 
		while(iterator.hasNext()){
			passenger = (Passenger) iterator.next();
			passenger.setPassenger_credits(passenger.getPassenger_credits() - trip_cost/passengerNumber);
		}
	}
	
	
}
