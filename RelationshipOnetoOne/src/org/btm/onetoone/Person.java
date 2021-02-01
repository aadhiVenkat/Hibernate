package org.btm.onetoone;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table
public class Person {
	
	@Id
	@GeneratedValue
	private int Person_id;
	private String Person_name;
	@OneToOne(cascade = CascadeType.ALL)
	private passport pass;
	public int getPerson_id() {
		return Person_id;
	}
	public void setPerson_id(int person_id) {
		Person_id = person_id;
	}
	public String getPerson_name() {
		return Person_name;
	}
	public void setPerson_name(String person_name) {
		Person_name = person_name;
	}
	public passport getPass() {
		return pass;
	}
	public void setPass(passport pass) {
		this.pass = pass;
	}

}
