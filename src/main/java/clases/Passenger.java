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
	
	private Integer passenger_credits;
	private Collection<Score> passenger_scores;
	
	
	public Passenger(){
		this.setPassenger_scores(new HashSet<Score>());
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
