package com.m2i.bibliocommon.bo;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@DiscriminatorValue(value = "LivreDetail")
@Entity
public class LivreDetail extends SupportMultimediaDetail {

	@OneToOne(cascade = { CascadeType.PERSIST, CascadeType.REMOVE, }, fetch = FetchType.EAGER, optional = true)
	private Livre livre;
	private String typeDeSupportMultimedia;
	private String resumeAuteur;
	private String editeur;
	private String typeDeDocument;
	private String langue;
	@ManyToMany(cascade = { CascadeType.PERSIST, CascadeType.MERGE }, fetch = FetchType.EAGER)
	private Set<Section> sections = new HashSet<Section>();
	private String isbn;
	@ManyToMany(cascade = { CascadeType.PERSIST, CascadeType.MERGE }, fetch = FetchType.EAGER)
	private Set<Classification> classifications = new HashSet<Classification>();
	@OneToMany(cascade = { CascadeType.PERSIST, CascadeType.REMOVE, CascadeType.MERGE }, fetch = FetchType.EAGER)
	private Set<LivreAvis> avis = new HashSet<LivreAvis>();
	@OneToMany(cascade = { CascadeType.PERSIST, CascadeType.REMOVE, CascadeType.MERGE }, fetch = FetchType.EAGER)
	private Set<LivreExemplaire> exemplaires = new HashSet<LivreExemplaire>();

	public LivreDetail() {
		super();
	}

	public LivreDetail(Integer id, Livre livre, String typeDeSupportMultimedia, String resumeAuteur, String editeur,
			String typeDeDocument, String langue, Set<Section> sections, String isbn,
			Set<Classification> classifications, Set<LivreAvis> avis, Set<LivreExemplaire> exemplaires) {
		super(id);
		this.livre = livre;
		this.typeDeSupportMultimedia = typeDeSupportMultimedia;
		this.resumeAuteur = resumeAuteur;
		this.editeur = editeur;
		this.typeDeDocument = typeDeDocument;
		this.langue = langue;
		this.sections = sections;
		this.isbn = isbn;
		this.classifications = classifications;
		this.avis = avis;
		this.exemplaires = exemplaires;
	}

	public Livre getLivre() {
		return livre;
	}

	public void setLivre(Livre livre) {
		this.livre = livre;
	}

	public String getTypeDeSupportMultimedia() {
		return typeDeSupportMultimedia;
	}

	public void setTypeDeSupportMultimedia(String typeDeSupportMultimedia) {
		this.typeDeSupportMultimedia = typeDeSupportMultimedia;
	}

	public String getResumeAuteur() {
		return resumeAuteur;
	}

	public void setResumeAuteur(String resumeAuteur) {
		this.resumeAuteur = resumeAuteur;
	}

	public String getEditeur() {
		return editeur;
	}

	public void setEditeur(String editeur) {
		this.editeur = editeur;
	}

	public String getTypeDeDocument() {
		return typeDeDocument;
	}

	public void setTypeDeDocument(String typeDeDocument) {
		this.typeDeDocument = typeDeDocument;
	}

	public String getLangue() {
		return langue;
	}

	public void setLangue(String langue) {
		this.langue = langue;
	}

	public Set<Section> getSections() {
		return sections;
	}

	public void setSections(Set<Section> sections) {
		this.sections = sections;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public Set<Classification> getClassifications() {
		return classifications;
	}

	public void setClassifications(Set<Classification> classifications) {
		this.classifications = classifications;
	}

	public Set<LivreAvis> getAvis() {
		return avis;
	}

	public void setAvis(Set<LivreAvis> avis) {
		this.avis = avis;
	}

	public Set<LivreExemplaire> getExemplaires() {
		return exemplaires;
	}

	public void setExemplaires(Set<LivreExemplaire> exemplaires) {
		this.exemplaires = exemplaires;
	}

}