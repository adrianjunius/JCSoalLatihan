package com.juaracodingsoal.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="dosen")
public class DosenModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false)
	private long IdDosen;
	@OneToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name="username", referencedColumnName = "username")
	private AdminModel username;
	@OneToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name="password", referencedColumnName = "password")
	private AdminModel password;
	@Column(nullable = false)
	private String namaDosen;
}
