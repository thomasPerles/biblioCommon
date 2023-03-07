package com.m2i.bibliocommon.bo;

import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@DiscriminatorValue(value = "Avis")
@Entity
public class LivreAvis extends SupportMultimediaAvis {

	@ManyToOne(cascade = { CascadeType.PERSIST, CascadeType.REMOVE, CascadeType.MERGE }, fetch = FetchType.EAGER)
	private Livre livre;

	public LivreAvis() {
		super();
	}

	public LivreAvis(Integer id, LocalDateTime dateDePublication, String titre, String contenu, Integer note,
			Utilisateur utilisateur, Livre livre) {
		super(id, dateDePublication, titre, contenu, note, utilisateur);
		this.livre = livre;
	}

	public Livre getLivre() {
		return livre;
	}

	public void setLivre(Livre livre) {
		this.livre = livre;
	}

}
