package clases;

import java.util.Date;

/**
 * @author yato
 *
 */
public abstract class User {
	
	private Long user_id;
	private String user_name;
	private String user_password; 
	private Date user_date;
	
	/**
	 * 
	 */
	
	public User() {
		// TODO Auto-generated constructor stub
	}
	
	
	/**
	 * @param user_name
	 * @param user_password
	 * @param user_date
	 */
	public User (String name, String password, Date date){
		this();
		this.user_name = name; 
		this.user_password = password;
		this.user_date = new Date();			
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

	
	/**
	 * @return the user_name
	 */
	public String getUser_name() {
		return user_name;
	}

	
	/**
	 * @param user_name the user_name to set
	 */
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}


	/**
	 * @return the user_password
	 */
	public String getUser_password() {
		return user_password;
	}


	/**
	 * @param user_password the user_password to set
	 */
	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}


	/**
	 * @return the user_date
	 */
	public Date getUser_date() {
		return user_date;
	}

	
	/**
	 * @param user_date the user_date to set
	 */
	public void setUser_date(Date user_date) {
		this.user_date = user_date;
	}
	
	
}
