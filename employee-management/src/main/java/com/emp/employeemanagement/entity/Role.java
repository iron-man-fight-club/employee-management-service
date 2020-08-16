package com.emp.employeemanagement.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "role")
public class Role {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Integer id;

	@Column(name = "role_name")
	private String roleName;

	@Column(name = "description")
	private String description;
	
	@ManyToMany(fetch=FetchType.LAZY)
    @JoinTable(
        name = "role_permission", 
        joinColumns = { @JoinColumn(name = "role_fk") }, 
        inverseJoinColumns = { @JoinColumn(name = "permission_fk") }
    )
	
	private Set<Permission> permissions = new HashSet<>();

//	@ManyToMany(fetch=FetchType.LAZY,mappedBy="roles")
//	private Set<User> users = new HashSet<>();

	public Role() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

//	public Set<User> getUser() {
//		return users;
//	}
//
//	public void setUser(Set<User> users) {
//		this.users = users;
//	}

	@Override
	public String toString() {
		return "Role [id=" + id + ", roleName=" + roleName + "]";
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Set<Permission> getPermissions() {
		return permissions;
	}

	public void setPermissions(Set<Permission> permissions) {
		this.permissions = permissions;
	}

}