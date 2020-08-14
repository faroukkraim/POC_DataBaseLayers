package io.gethub.cepr0.demo.entity;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

@Data
@NoArgsConstructor(access = AccessLevel.PACKAGE)
@AllArgsConstructor
@MappedSuperclass
public class Person implements Serializable {
	@Id
	@GeneratedValue
	private Long id;

	private String name;
	private String lastName;
	private String address;
	private String cin;
	private String phoneNumber;
	private String birthDate;
	private String login;
	private String password;



}
