package com.juaracodingsoal.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;
import org.hibernate.resource.beans.internal.FallbackBeanInstanceProducer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="pertanyaan")
public class PertanyaanModel {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	@Column(nullable = false)
	private long IdPertanyaan;
	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name="IdSoal", referencedColumnName = "IdSoal")
	private SoalModel IdSoal;
	@Column(nullable = false)
	private String pertanyaan;
	@Column(nullable = false)
	private String jawaban1;
	@Column(nullable = false)
	private String jawaban2;
	@Column(nullable = false)
	private String jawaban3;
	@Column(nullable = false)
	private String jawaban4;
	@Column(nullable = false)
	private String jawabanBenar;
	private int statusGambar;
}
