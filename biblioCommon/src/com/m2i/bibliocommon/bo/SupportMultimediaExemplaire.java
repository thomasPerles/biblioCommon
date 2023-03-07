package com.m2i.bibliocommon.bo;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@MappedSuperclass
public abstract class SupportMultimediaExemplaire {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String bibliotheque;
	@Enumerated(EnumType.STRING)
	private Statut statut;

	public SupportMultimediaExemplaire() {
		super();
	}

	public SupportMultimediaExemplaire(Integer id, String bibliotheque, Statut statut) {
		super();
		this.id = id;
		this.bibliotheque = bibliotheque;
		this.statut = statut;
	}


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getBibliotheque() {
		return bibliotheque;
	}

	public void setBibliotheque(String bibliotheque) {
		this.bibliotheque = bibliotheque;
	}

	public Statut getStatut() {
		return statut;
	}

	public void setStatut(Statut statut) {
		this.statut = statut;
	}

}
