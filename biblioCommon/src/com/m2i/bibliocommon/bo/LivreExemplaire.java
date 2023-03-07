package com.m2i.bibliocommon.bo;

import java.time.LocalDate;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.m2i.bibliocommon.adapter.LocalDateAdapter;

@XmlRootElement
@DiscriminatorValue(value = "LivreExemplaire")
@Entity
public class LivreExemplaire extends SupportMultimediaExemplaire {

	@ManyToOne
	@JoinColumn(name = "LIVRE_ID", foreignKey = @ForeignKey(name = "FK_LIVRE"))
	private Livre livre;
	@XmlJavaTypeAdapter(type = LocalDate.class, value = LocalDateAdapter.class)
	private LocalDate dateDeRetour;

	public LivreExemplaire() {
		super();
	}

	public LivreExemplaire(Integer id, String bibliotheque, Statut statut, Livre livre, LocalDate dateDeRetour) {
		super(id, bibliotheque, statut);
		this.livre = livre;
		this.dateDeRetour = dateDeRetour;
	}

	public LivreExemplaire(Integer id) {
		super(id);
	}

	public Livre getLivre() {
		return livre;
	}

	public void setLivre(Livre livre) {
		this.livre = livre;
	}

	public LocalDate getDateDeRetour() {
		return dateDeRetour;
	}

	public void setDateDeRetour(LocalDate dateDeRetour) {
		this.dateDeRetour = dateDeRetour;
	}

}
