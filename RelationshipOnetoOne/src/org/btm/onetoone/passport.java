package org.btm.onetoone;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table
public class passport {
	
	@Id
	@GeneratedValue
	private int Passport_id;
	private String Passport_name;
	public int getPassport_id() {
		return Passport_id;
	}
	public void setPassport_id(int passport_id) {
		Passport_id = passport_id;
	}
	public String getPassport_name() {
		return Passport_name;
	}
	public void setPassport_name(String passport_name) {
		Passport_name = passport_name;
	}

}
