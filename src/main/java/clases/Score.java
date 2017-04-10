/**
 * 
 */
package clases;

/**
 * @author marcos
 *
 */
public class Score {

	/**
	 * 
	 */
	
	private Long score_id;
	private String score_comment;
	private Integer score_number;
	private Trip score_trip;
	private Passenger score_passenger;

	public Score() {
		// TODO Auto-generated constructor stub
	}
	
	public Score(String score_comment, Integer score_number) {
		super();
		this.score_comment = score_comment;
		this.score_number = score_number;
	}


	public Long getScore_id() {
		return score_id;
	}

	public void setScore_id(Long score_id) {
		this.score_id = score_id;
	}

	public String getScore_comment() {
		return score_comment;
	}

	public void setScore_comment(String score_comment) {
		this.score_comment = score_comment;
	}

	public Integer getScore_number() {
		return score_number;
	}

	public void setScore_number(Integer score_number) {
		this.score_number = score_number;
	}

	
	/**
	 * @return the trip
	 */
	public Trip getTrip() {
		return this.score_trip;
	}

	/**
	 * @param trip the trip to set
	 */
	public void setTrip(Trip trip) {
		this.score_trip = trip;
	}

	/**
	 * @return the score_passenger
	 */
	public Passenger getScore_passenger() {
		return score_passenger;
	}

	/**
	 * @param score_passenger the score_passenger to set
	 */
	public void setScore_passenger(Passenger score_passenger) {
		this.score_passenger = score_passenger;
	}
	
	
}
