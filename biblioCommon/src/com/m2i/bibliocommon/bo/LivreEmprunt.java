package com.m2i.bibliocommon.bo;

import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@DiscriminatorValue(value = "LivreEmprunt")
@Entity
public class LivreEmprunt extends SupportMultimediaEmprunt {

	@ManyToOne(cascade = { CascadeType.PERSIST, CascadeType.REMOVE, CascadeType.MERGE }, fetch = FetchType.EAGER)
	private LivreExemplaire exemplaire;

	public LivreEmprunt() {
		super();
	}

	public LivreEmprunt(Integer id) {
		super(id);
	}

	public LivreEmprunt(Integer id, Utilisateur utilisateur, LocalDateTime dateDebut, LocalDateTime dateFin,
			LocalDateTime dateRetour, LivreExemplaire exemplaire) {
		super(id, utilisateur, dateDebut, dateFin, dateRetour);
		this.exemplaire = exemplaire;
	}

	public LivreExemplaire getExemplaire() {
		return exemplaire;
	}

	public void setExemplaire(LivreExemplaire exemplaire) {
		this.exemplaire = exemplaire;
	}

}
