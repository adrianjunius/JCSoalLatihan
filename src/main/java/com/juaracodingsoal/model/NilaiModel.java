package com.juaracodingsoal.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="nilai")
public class NilaiModel {
	@Id
	@Column(length=20)
	private String nilai;
	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name="IdSoal", referencedColumnName = "IdSoal")
	private SoalModel IdSoal;
}
