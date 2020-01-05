package com.radiantsage._2fa.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class LoginUser implements Serializable {
	private static final long serialVersionUID = -2906716156066110285L;
	private String username;
	private String password;
}
