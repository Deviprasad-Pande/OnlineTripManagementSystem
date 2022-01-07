package com.cg.otms.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id; 
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Travels {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int travelsId;
	@Column(name="travels_name",nullable=false,length=50)
	private String travelsName;
	@Column(name="agent_name",nullable=false,length=50)
	private String  agentName;
	@Column(name="addr",nullable=false,length=50)
	private String  address;
	@Column(name="contact",nullable=false,unique=true,length=10)
	private String  contact;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="user_id",table="User")
	private User user;
	
	public Travels() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Travels(int travelsId, String travelsName, String agentName, String address, String contact) {
		super();
		this.travelsId = travelsId;
		this.travelsName = travelsName;
		this.agentName = agentName;
		this.address = address;
		this.contact = contact;
	}
	public int getTravelsId() {
		return travelsId;
	}
	public void setTravelsId(int travelsId) {
		this.travelsId = travelsId;
	}
	public String getTravelsName() {
		return travelsName;
	}
	public void setTravelsName(String travelsName) {
		this.travelsName = travelsName;
	}
	public String getAgentName() {
		return agentName;
	}
	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	@Override
	public String toString() {
		return "Travels [travelsId=" + travelsId + ", travelsName=" + travelsName + ", agentName=" + agentName
				+ ", address=" + address + ", contact=" + contact + "]";
	}
	
	
}
