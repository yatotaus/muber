package clases;

import java.sql.Date;

/**
 * @author yato
 *
 */
public class Passenger extends User {
	
	private Long user_id;
	private Double passenger_credits;

	
	public Passenger(){
		// TODO Auto-generated constructor stub
	}
	
	
	/**
	 * @param passenger_name
	 * @param passenger_password
	 * @param passenger_date
	 * @param passenger_credits
	 */
	public Passenger(String passenger_name, String passenger_password, Date passenger_date, double passenger_credits){
		super(passenger_name, passenger_password, passenger_date);
		this.setPassenger_credits(passenger_credits);
	}
	
	
	/**
	 * @return the credits
	 */
	public Double getPassenger_credits() {
		return passenger_credits;
	}

	
	/**
	 * @param passenger_credits the passenger_credits to set
	 */
	public void setPassenger_credits(Double passenger_credits) {
		this.passenger_credits = passenger_credits;
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

	
}
