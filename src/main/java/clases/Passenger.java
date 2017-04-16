/**
 * 
 */
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
	 * 
	 */
	public Passenger(String name, String password, Date date, double credits){
		super(name, password, date);
		this.setPassenger_credits(credits);
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
	
	
	public Long getUser_id() {
		return user_id;
	}


	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}

	
}
