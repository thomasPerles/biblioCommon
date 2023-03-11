package com.m2i.bibliocommon.bo;

import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.m2i.bibliocommon.adapter.LocalDateTimeAdapter;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@MappedSuperclass
public abstract class SupportMultimediaEmprunt {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@ManyToOne(cascade = { CascadeType.PERSIST, CascadeType.REMOVE, CascadeType.MERGE }, fetch = FetchType.EAGER)
	private Utilisateur utilisateur;
	@XmlJavaTypeAdapter(type = LocalDateTime.class, value = LocalDateTimeAdapter.class)
	private LocalDateTime dateDebut;
	@XmlJavaTypeAdapter(type = LocalDateTime.class, value = LocalDateTimeAdapter.class)
	private LocalDateTime dateFin;
	@XmlJavaTypeAdapter(type = LocalDateTime.class, value = LocalDateTimeAdapter.class)
	private LocalDateTime dateRetour;

	public SupportMultimediaEmprunt() {
		super();
	}

	public SupportMultimediaEmprunt(Integer id) {
		super();
		this.id = id;
	}

	public SupportMultimediaEmprunt(Integer id, Utilisateur utilisateur, LocalDateTime dateDebut, LocalDateTime dateFin,
			LocalDateTime dateRetour) {
		super();
		this.id = id;
		this.utilisateur = utilisateur;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.dateRetour = dateRetour;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	public LocalDateTime getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(LocalDateTime dateDebut) {
		this.dateDebut = dateDebut;
	}

	public LocalDateTime getDateFin() {
		return dateFin;
	}

	public void setDateFin(LocalDateTime dateFin) {
		this.dateFin = dateFin;
	}

	public LocalDateTime getDateRetour() {
		return dateRetour;
	}

	public void setDateRetour(LocalDateTime dateRetour) {
		this.dateRetour = dateRetour;
	}

}
