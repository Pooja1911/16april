package com.sec.security.pooja.spring.security.web.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "privilage")
public class Authority {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "priviliage_id")
	private int id;
	private String privilage;

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the privilage
	 */
	public String getPrivilage() {
		return privilage;
	}

	/**
	 * @param privilage
	 *            the privilage to set
	 */
	public void setPrivilage(String privilage) {
		this.privilage = privilage;
	}

	public Authority() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param privilage
	 */
	public Authority(String privilage) {
		super();
		this.privilage = privilage;
	}

	@ManyToMany(mappedBy = "authority")
	private List<Role> roles;

	/**
	 * @return the roles
	 */
	public List<Role> getRoles() {
		return roles;
	}

	/**
	 * @param roles
	 *            the roles to set
	 */
	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}
}
