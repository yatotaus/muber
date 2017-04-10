package clases;

import java.util.Collection;
import java.util.HashSet;

public class Muber {

	private Long muber_id;
	private Collection<User> muber_users;
	private  Collection<Trip> muber_trips;
	
	
	public Muber(){
		this.setMuber_trips(new HashSet<Trip>());
		this.setMuber_users(new HashSet<User>());
	}
	
	
	/**
	 * @param muber_users
	 * @param muber_trips
	 */
	public Muber(Collection<User> muber_users, Collection<Trip> muber_trips) {
		super();
		this.setMuber_users(muber_users);
		this.setMuber_trips(muber_trips);
	}

	public Long getMuber_id() {
		return muber_id;
	}


	public void setMuber_id(Long muber_id) {
		this.muber_id = muber_id;
	}


	/**
	 * @return the muber_users
	 */
	public Collection<User> getMuber_users() {
		return muber_users;
	}


	/**
	 * @param muber_users the muber_users to set
	 */
	public void setMuber_users(Collection<User> muber_users) {
		this.muber_users = muber_users;
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
	
	
}
