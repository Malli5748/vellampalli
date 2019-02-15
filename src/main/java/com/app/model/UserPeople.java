package com.app.model;

import java.util.Arrays;
import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.OrderColumn;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "usertab")
public class UserPeople {

	@Id
	@Column(name = "user_id")
	@GeneratedValue(generator = "Item_gen")
	@GenericGenerator(name = "Item_gen", strategy = "increment")
	private Integer id;
	@Column(name = "user_name")
	private String name;
	@Column(name = "user_number")
	private String number;
	@Column(name = "user_mail")
	private String email;
	@Column(name = "Gender")
	private String gender;

	@ElementCollection(fetch = FetchType.EAGER)
	@CollectionTable(name = "cource_tab", joinColumns = @JoinColumn(name = "fid"))
	@OrderColumn(name = "pos")
	@Column(name = "cource")
	private List<String> cource;

	@ElementCollection(fetch = FetchType.EAGER)
	@CollectionTable(name = "lan_tab", joinColumns = @JoinColumn(name = "fid"))
	@OrderColumn(name = "pos")
	@Column(name = "lang")
	private List<String> lang;
	
	@Column(name = "country")
	private String country;

	public UserPeople() {
		super();
	}

	public UserPeople(Integer id) {
		super();
		this.id = id;
	}

	public UserPeople(Integer id, String name, String number, String email, String gender, List<String> cource,
			List<String> lang, String country) {
		super();
		this.id = id;
		this.name = name;
		this.number = number;
		this.email = email;
		this.gender = gender;
		this.cource = cource;
		this.lang = lang;
		this.country = country;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public List<String> getCource() {
		return cource;
	}

	public void setCource(List<String> cource) {
		this.cource = cource;
	}

	public List<String> getLang() {
		return lang;
	}

	public void setLang(List<String> lang) {
		this.lang = lang;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "UserPeople [id=" + id + ", name=" + name + ", number=" + number + ", email=" + email + ", gender="
				+ gender + ", cource=" + cource + ", lang=" + lang + ", country=" + country + "]";
	}

}	