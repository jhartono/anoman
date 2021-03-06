package com.anoman.inventory_management.resource.dto;

import java.util.HashSet;
import java.util.Set;

public class UserDto extends Dto {

	private static final long serialVersionUID = -6581556531684970307L;
	
	private String username;
	private String password;
	private boolean enabled;
	private Set<String> authorities = new HashSet<String>();
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public boolean isEnabled() {
		return enabled;
	}
	
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	
	public Set<String> getAuthorities() {
		return authorities;
	}
	
	public void setAuthorities(Set<String> authorities) {
		this.authorities = authorities;
	}
}
