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
public class Passenger extends User {
	
	private Long user_id;
	private Integer passenger_credits = 0;
	private Collection<Score> passenger_scores;

	
	public Integer getPassenger_credits() {
		return passenger_credits;
	}


	public void setPassenger_credits(Integer passenger_credits) {
		this.passenger_credits = passenger_credits;
	}	
	
	public Passenger(){
		this.setPassenger_scores(new HashSet<Score>());
	}
	
	
	public Long getUser_id() {
		return user_id;
	}


	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}


	/**
	 * 
	 */
	public Passenger(Integer credits) {
		super();
		this.setCredits(credits);	
	}
	
	
	/**
	 * @return the credits
	 */
	public Integer getCredits() {
		return passenger_credits;
	}
	
	
	/**
	 * @param credits the credits to set
	 */
	public void setCredits(Integer credits) {
		this.passenger_credits = credits;
	}


	/**
	 * @return the passenger_scores
	 */
	public Collection<Score> getPassenger_scores() {
		return passenger_scores;
	}


	/**
	 * @param passenger_scores the passenger_scores to set
	 */
	public void setPassenger_scores(Collection<Score> passenger_scores) {
		this.passenger_scores = passenger_scores;
	}

	
}
