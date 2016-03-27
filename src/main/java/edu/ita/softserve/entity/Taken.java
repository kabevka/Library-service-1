package edu.ita.softserve.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name = "taken")
public class Taken implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3097530211839597224L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id")
	private User user;
	
	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "instance_id")
	private Instance instance;
	
	@Column(name = "date_of_given")
	private Date dateOfGiven;
	
	@Column(name = "date_of_given_back")
	private Date dateOfGivenBack;
	
	public Taken() {
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Instance getInstance() {
		return instance;
	}

	public void setInstance(Instance instance) {
		this.instance = instance;
	}

	public Date getDateOfGiven() {
		return dateOfGiven;
	}

	public void setDateOfGiven(Date dateOfGiven) {
		this.dateOfGiven = dateOfGiven;
	}

	public Date getDateOfGivenBack() {
		return dateOfGivenBack;
	}

	public void setDateOfGivenBack(Date dateOfGivenBack) {
		this.dateOfGivenBack = dateOfGivenBack;
	}
}

