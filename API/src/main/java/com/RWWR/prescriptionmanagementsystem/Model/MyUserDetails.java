package com.RWWR.prescriptionmanagementsystem.Model;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class MyUserDetails implements UserDetails {
    private String username;
	private String password;
	private boolean active;
	private List<GrantedAuthority> authorities;

    public MyUserDetails(){}
    public MyUserDetails(Account user) {
        this.username = user.getUsername(); 
		this.password = user.getPass();
		this.active = user.getLock();
		this.authorities = Arrays.stream(user.getRoles().split(","))
				.map(SimpleGrantedAuthority::new)
				.collect(Collectors.toList());

    }
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }
    //---------------getter and setters-----------------------
    @Override
	public String getPassword() {
		return password;
	}

	@Override
	public String getUsername() {
		return username;
	}

	@Override
	public boolean isEnabled() {
		return active;
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }
}
