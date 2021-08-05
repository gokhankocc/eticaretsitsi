package kamp_5_eticaretSitesi.entities.concrates;

import kamp_5_eticaretSitesi.entities.abstracts.EticaretEntity;

public class EticaretInfo implements EticaretEntity{
	private String firstName;
	private String lastName;
	private String ePosta;
	private String password;
	
	public EticaretInfo() {
		
	}

	public EticaretInfo(String firstName, String lastName, String ePosta, String password) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.ePosta = ePosta;
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getePosta() {
		return ePosta;
	}

	public void setePosta(String ePosta) {
		this.ePosta = ePosta;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	

}
