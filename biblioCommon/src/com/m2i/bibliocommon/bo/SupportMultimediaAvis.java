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
public abstract class SupportMultimediaAvis {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@XmlJavaTypeAdapter(type = LocalDateTime.class, value = LocalDateTimeAdapter.class)
	private LocalDateTime dateDePublication;
	private String titre;
	private String contenu;
	private Integer note;
	@ManyToOne(cascade = { CascadeType.PERSIST, CascadeType.REMOVE, CascadeType.MERGE }, fetch = FetchType.EAGER)
	private Utilisateur utilisateur;

	public SupportMultimediaAvis() {
		super();
	}

	public SupportMultimediaAvis(Integer id, LocalDateTime dateDePublication, String titre, String contenu,
			Integer note, Utilisateur utilisateur) {
		super();
		this.id = id;
		this.dateDePublication = dateDePublication;
		this.titre = titre;
		this.contenu = contenu;
		this.note = note;
		this.utilisateur = utilisateur;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDateTime getDateDePublication() {
		return dateDePublication;
	}

	public void setDateDePublication(LocalDateTime dateDePublication) {
		this.dateDePublication = dateDePublication;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getContenu() {
		return contenu;
	}

	public void setContenu(String contenu) {
		this.contenu = contenu;
	}

	public Integer getNote() {
		return note;
	}

	public void setNote(Integer note) {
		this.note = note;
	}

	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

}
