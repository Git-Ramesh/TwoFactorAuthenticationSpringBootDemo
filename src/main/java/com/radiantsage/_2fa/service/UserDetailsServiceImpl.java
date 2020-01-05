package com.radiantsage._2fa.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.radiantsage._2fa.model.CustomUser;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
	private static List<CustomUser> users = new ArrayList<>();

	static {
		users.add(new CustomUser("ramesh", "{noop}password", "rameshpanthangi08@gmail.com"));
		users.add(new CustomUser("jhon", "{noop}password", "ramesh@rsageventures.com"));
	}

	private static CustomUser getCustomUser(String username) {
		// @formatter:off
		Optional<CustomUser> userOptional = users.stream()
			.filter(user -> Objects.equals(username, user.getUsername()))
			.findFirst();
		// @formatter:on
		return userOptional.orElseThrow(() -> new UsernameNotFoundException("Invalid username or password"));
	}

	@Override
	public UserDetails loadUserByUsername(String username) {
		return getCustomUser(username);
	}

}
