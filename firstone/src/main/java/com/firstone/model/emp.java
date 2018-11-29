package com.firstone.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.annotate.JsonProperty;
import org.hibernate.validator.constraints.NotEmpty;
@Entity
@Table(name="Empl")
/*@XmlRootElement*/
public class emp implements Serializable
{
	 private static final long serialVersionUID = -3465813074586302848L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
private int id;
	 
	 
	@Column
	@NotEmpty(message="please enter your name")
private String nm;
	
	@JsonProperty
	@Column
	@NotEmpty(message="please enter your emailid")
private String email;
	
	
	@Column
	//@NotEmpty(message="please enter your password")
private String password;
	
	
    @Column
	//@Null
	private int otp;
	
	
	public int getOtp() {
		return otp;
	}
	public void setOtp(int otp) {
		this.otp = otp;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNm() {
		return nm;
	}
	public void setNm(String nm) {
		this.nm = nm;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
//private int otp;
	
}
