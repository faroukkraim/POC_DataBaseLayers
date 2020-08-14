package io.gethub.cepr0.demo.entity;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
@Data
@NoArgsConstructor(access = AccessLevel.PACKAGE)
@AllArgsConstructor
public class User extends Person {
	@Id
	@GeneratedValue
	private Long id;

	private String name;

	public User(String name) {
		this.name = name;
	}
}
