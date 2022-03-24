package com.juaracodingsoal.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="admin")
public class AdminModel {
	@Id
	@Column(length=20, nullable = false)
	String username;
	@Column(nullable = false)
	String password;
}
