package org.atom.springboot.people.management.app.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;

@Entity
@Table(name = "person_table")
@DynamicUpdate
/*
 * @NamedQueries(value = {
 * 
 * @NamedQuery(name = "Person.getPersonInfoByLastName", query =
 * "select p from Person p where p.lastName=?1"),
 * 
 * @NamedQuery(name = "Person.getPersonInfoByFirstNameAndEmail", query =
 * "select p from Person p where p.firstName=?1 and email=?2")
 * 
 * })
 */
@NamedNativeQueries(value = { 
		@NamedNativeQuery(name = "Person.getPersonInfoByLastName", query = "select * from person_table where last_name=?1 ", resultClass = Person.class),
		@NamedNativeQuery(name = "Person.getPersonInfoByFirstNameAndEmail", query = "select * from person_table where first_name=?1 and email=?2", resultClass = Person.class)
		
})
public class Person {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "person_id")
	private int id;

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

	@Column(name = "email")
	private String email;

	@Column(name = "creation_date")
	private Date crationDate;

	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person( String firstName, String lastName, String email, Date crationDate) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.crationDate = crationDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getCrationDate() {
		return crationDate;
	}

	public void setCrationDate(Date crationDate) {
		this.crationDate = crationDate;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", crationDate=" + crationDate + "]";
	}

	 
}
