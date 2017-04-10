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
	

}
