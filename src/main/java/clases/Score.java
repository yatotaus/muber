/**
 * 
 */
package clases;

/**
 * @author yato
 *
 */
public class Score {
	
	private Long score_id;
	private String score_comment;
	private Integer score_number;
	
	
	/**
	 * 
	 */
	public Score() {
		// TODO Auto-generated constructor stub
	}


	/**
	 * 
	 */
	public Score(String comment, Integer score) {
		super();
		this.setComment(comment);
		this.setScore(score);
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
	 * @return the comment
	 */
	public String getComment() {
		return score_comment;
	}


	/**
	 * @param comment the comment to set
	 */
	public void setComment(String comment) {
		this.score_comment = comment;
	}


	/**
	 * @return the score
	 */
	public Integer getScore() {
		return score_number;
	}


	/**
	 * @param score the score to set
	 */
	public void setScore(Integer score) {
		this.score_number = score;
	}
	
	
}
