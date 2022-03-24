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

import org.hibernate.annotations.ManyToAny;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="plotmatakuliah")
public class PlotMataKuliahModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false)
	private long IdPlotMataKuliah;
	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name="IdMataKuliah", referencedColumnName = "IdMataKuliah")
	private MataKuliahModel IdMataKuliah;
	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name="IdDosen", referencedColumnName = "IdDosen")
	private DosenModel IdDosen;
	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name="NIM", referencedColumnName = "nim")
	private MahasiswaModel NIM;
}
