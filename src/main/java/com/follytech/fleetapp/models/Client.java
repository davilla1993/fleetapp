package com.follytech.fleetapp.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;


@Entity
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Client {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	private String name;
	private String address;
	private String city;
	private String phone;
	private String mobile;
	private String website;
	private String email;
	
	@ManyToOne
	@JoinColumn(name="countryid", insertable=false, updatable=false)
	private Country country;
	private Integer countryid;
	
	@ManyToOne
	@JoinColumn(name="stateid", insertable=false, updatable=false)
	private State state;	
	private Integer stateid;
	
	private String details;
	
	
	

	public Client() {
		
		
	}

	
	public Client(String name, String address, String city, String phone, String mobile, String website, String email) {

		this.name = name;
		this.address = address;
		this.city = city;
		this.phone = phone;
		this.mobile = mobile;
		this.website = website;
		this.email = email;
	}


	public Client(int id, String name, String address, String city, String phone, String mobile, String website,
			String email, Country country, Integer countryid, State state, Integer stateid, String details) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.city = city;
		this.phone = phone;
		this.mobile = mobile;
		this.website = website;
		this.email = email;
		this.country = country;
		this.countryid = countryid;
		this.state = state;
		this.stateid = stateid;
		this.details = details;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getMobile() {
		return mobile;
	}


	public void setMobile(String mobile) {
		this.mobile = mobile;
	}


	public String getWebsite() {
		return website;
	}


	public void setWebsite(String website) {
		this.website = website;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public Country getCountry() {
		return country;
	}


	public void setCountry(Country country) {
		this.country = country;
	}


	public Integer getCountryid() {
		return countryid;
	}


	public void setCountryid(Integer countryid) {
		this.countryid = countryid;
	}


	public State getState() {
		return state;
	}


	public void setState(State state) {
		this.state = state;
	}


	public Integer getStateid() {
		return stateid;
	}


	public void setStateid(Integer stateid) {
		this.stateid = stateid;
	}


	public String getDetails() {
		return details;
	}


	public void setDetails(String details) {
		this.details = details;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((countryid == null) ? 0 : countryid.hashCode());
		result = prime * result + id;
		result = prime * result + ((stateid == null) ? 0 : stateid.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Client other = (Client) obj;
		if (countryid == null) {
			if (other.countryid != null)
				return false;
		} else if (!countryid.equals(other.countryid))
			return false;
		if (id != other.id)
			return false;
		if (stateid == null) {
			if (other.stateid != null)
				return false;
		} else if (!stateid.equals(other.stateid))
			return false;
		return true;
	}
	
	
	
	
	
}

