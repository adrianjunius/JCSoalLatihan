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
import javax.persistence.Table;

import org.hibernate.resource.beans.internal.FallbackBeanInstanceProducer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="soal")
public class SoalModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long IdSoal;
	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name="IdMataKuliah", referencedColumnName = "IdMataKuliah")
	private MataKuliahModel IdMataKuliah;
	@Column(nullable = false)
	private String NamaSoal;
	@Column(nullable = false)
	private int status;
}
