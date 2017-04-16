package clases;

/**
 * @author marcos
 *
 */
public class Score {

	
	private Long score_id;
	private String score_comment;
	private Integer score_number;
	private Passenger score_autor;
	private Trip score_trip;

	
	public Score() {
		// TODO Auto-generated constructor stub
	}
	
	
	/**
	 * @param score_comment
	 * @param score_number
	 */
	public Score(String score_comment, Integer score_number) {
		super();
		this.setScore_comment(score_comment);
		this.setScore_number(score_number);
	}


	/**
	 * @return the score_id
	 */
	public Long getScore_id() {
		return score_id;
	}

	
	/**
	 * @param score_id the score_id to set
	 */
	public void setScore_id(Long score_id) {
		this.score_id = score_id;
	}
	
	
	/**
	 * @return the score_comment
	 */
	public String getScore_comment() {
		return score_comment;
	}
	
	
	/**
	 * @param score_comment the score_comment to set
	 */
	public void setScore_comment(String score_comment) {
		this.score_comment = score_comment;
	}
	
	
	/**
	 * @return the score_number
	 */
	public Integer getScore_number() {
		return score_number;
	}
	
	
	/**
	 * @param score_number the score_number to set
	 */
	public void setScore_number(Integer score_number) {
		this.score_number = score_number;
	}

	
	/**
	 * @return the score_autor
	 */
	public Passenger getScore_autor() {
		return score_autor;
	}

	
	/**
	 * @param score_autor the score_autor to set
	 */
	public void setScore_autor(Passenger score_autor) {
		this.score_autor = score_autor;
	}

	
	/**
	 * @return the score_trip
	 */
	public Trip getScore_trip() {
		return score_trip;
	}

	
	/**
	 * @param score_trip the score_trip to set
	 */
	public void setScore_trip(Trip score_trip) {
		this.score_trip = score_trip;
	}
	

}
