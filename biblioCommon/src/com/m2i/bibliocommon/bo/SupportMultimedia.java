package com.m2i.bibliocommon.bo;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.m2i.bibliocommon.adapter.LocalDateAdapter;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@MappedSuperclass
public abstract class SupportMultimedia {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(nullable = false)
	private String titre;
	@Column(nullable = false)
	private String auteur;
	@XmlJavaTypeAdapter(type = LocalDate.class, value = LocalDateAdapter.class)
	private LocalDate dateDePublication;

	public SupportMultimedia() {
		super();
	}

	public SupportMultimedia(Integer id) {
		this.id = id;
	}

	public SupportMultimedia(Integer id, String titre, String auteur, LocalDate dateDePublication) {
		this.id = id;
		this.titre = titre;
		this.auteur = auteur;
		this.dateDePublication = dateDePublication;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getAuteur() {
		return auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	public LocalDate getDateDePublication() {
		return dateDePublication;
	}

	public void setDateDePublication(LocalDate dateDePublication) {
		this.dateDePublication = dateDePublication;
	}

}
