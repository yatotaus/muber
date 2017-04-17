package clases;

import java.util.Collection;
import java.util.HashSet;

public class Muber {

	private Long muber_id;
	private Collection<Passenger> muber_passengers;
	private Collection<Driver> muber_drivers;
	private Collection<Trip> muber_trips;
	
	
	/**
	 * 
	 */
	public Muber(){
		this.setMuber_trips(new HashSet<Trip>());
		this.setMuber_passengers(new HashSet<Passenger>());
		this.setMuber_drivers(new HashSet<Driver>());
	}
	
	
	/**
	 * @param muber_passengers
	 * @param muber_drivers
	 * @param muber_trips
	 */
	public Muber(Collection<Passenger> muber_passengers, Collection<Driver> muber_drivers, Collection<Trip> muber_trips) {
		super();
		this.setMuber_passengers(muber_passengers);
		this.setMuber_drivers(muber_drivers);
		this.setMuber_trips(muber_trips);
	}

		
	/**
	 * @return the muber_id
	 */
	public Long getMuber_id() {
		return muber_id;
	}


	/**
	 * @param muber_id the muber_id to set
	 */
	public void setMuber_id(Long muber_id) {
		this.muber_id = muber_id;
	}


	/**
	 * @return the muber_trips
	 */
	public Collection<Trip> getMuber_trips() {
		return muber_trips;
	}


	/**
	 * @param muber_trips the muber_trips to set
	 */
	public void setMuber_trips(Collection<Trip> muber_trips) {
		this.muber_trips = muber_trips;
	}


	/**
	 * @return the muber_passengers
	 */
	public Collection<Passenger> getMuber_passengers() {
		return muber_passengers;
	}


	/**
	 * @param muber_passengers the muber_passengers to set
	 */
	public void setMuber_passengers(Collection<Passenger> muber_passengers) {
		this.muber_passengers = muber_passengers;
	}


	/**
	 * @return the muber_drivers
	 */
	public Collection<Driver> getMuber_drivers() {
		return muber_drivers;
	}


	/**
	 * @param muber_drivers the muber_drivers to set
	 */
	public void setMuber_drivers(Collection<Driver> muber_drivers) {
		this.muber_drivers = muber_drivers;
	}
	
	
	/**
	 * agrega aDriver a la colección muber_drivers
	 */
	public void addDriver(Driver aDriver) {
		this.getMuber_drivers().add(aDriver);
	}
	
	
	/**
	 * agrega aPassenger a la colección muber_passengers
	 */
	public void addPassenger(Passenger aPassenger){
		this.getMuber_passengers().add(aPassenger);
	}
	
	
	/**
	 * agrega aDriver a un viaje
	 * agrega aTrip a la colección muber_trips
	 */
	public void addTripBy(Trip aTrip, Driver aDriver){
		aTrip.setTrip_driver(aDriver);
		this.getMuber_trips().add(aTrip);
	}
	
	
	/**
	 * agrega aPassenger a la colección de pasajeros del viaje
	 */
	public void addPassengerToTrip(Trip aTrip, Passenger aPassenger){
		aTrip.addPassenger(aPassenger);
	}
	
	
	/**
	 * agrega aPassenger como autor de la calificación 
	 * agrega aTrip al viaje que pertenece dicha calificación
	 * agrega aScore a la colección de calificaciones del viaje aTrip.
	 * 
	 * Tampoco tenemos definidas las reglas de negocio sobre el control
	 * de las fechas. De momento no verificamos que el pasajero que 
	 * califica haya participado del viaje. En un futuro al implementar
	 * la capa de negocio se verificarán estas cosas.
	 */
	public void qualifyTrip(Trip aTrip, Passenger aPassenger, Score aScore ){
		aScore.setScore_autor(aPassenger);
		aScore.setScore_trip(aTrip);
		aTrip.addScore(aScore);
	}
	
	
}

