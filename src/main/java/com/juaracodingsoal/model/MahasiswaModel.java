package com.juaracodingsoal.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.lang.Nullable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="mahasiswa")
public class MahasiswaModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false)
	private long nim;
	private String namaMahasiswa;
	@Column(nullable = false)
	private String jenisKelamin;
	@Column(nullable = false)
	private String password;
}
