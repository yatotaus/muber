package clases;
import java.util.Date;

/**
 * @author yato
 *
 */
public class Passenger extends User {
	
	private Double credits;

	
	public Passenger(){
		// TODO Auto-generated constructor stub
	}
	
	
	/**
	 * @param passenger_name
	 * @param passenger_password
	 * @param passenger_date
	 * @param passenger_credits
	 */
	public Passenger(String namePassenger, String passwd, Date datePasseger, double creditsValue){
		super(namePassenger, passwd, datePasseger);
		this.setCredits(creditsValue);
	}

	public Double getCredits() {
		return credits;
	}


	public void setCredits(Double credits) {
		this.credits = credits;
	}
	
	public void addCredits(Float aMount){
		this.credits = this.credits + aMount;
	}
	
	
	
	
}
