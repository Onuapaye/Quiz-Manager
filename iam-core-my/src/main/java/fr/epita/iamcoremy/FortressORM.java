package fr.epita.iamcoremy;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class FortressORM {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column
	private int fId;
	
	@Column
	private String fName;
	
	@Column
	private String fEmail;
	
	/**
	 * @return the fId
	 */
	public int getfId() {
		return fId;
	}
	/**
	 * @param fId the fId to set
	 */
	public void setfId(int fId) {
		this.fId = fId;
	}
	/**
	 * @return the fName
	 */
	public String getfName() {
		return fName;
	}
	/**
	 * @param fName the fName to set
	 */
	public void setfName(String fName) {
		this.fName = fName;
	}
	/**
	 * @return the fEmail
	 */
	public String getfEmail() {
		return fEmail;
	}
	/**
	 * @param fEmail the fEmail to set
	 */
	public void setfEmail(String fEmail) {
		this.fEmail = fEmail;
	}
	
	public FortressORM() {
		
	}
	
}
