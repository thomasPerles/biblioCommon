package com.m2i.bibliocommon.bo;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.m2i.bibliocommon.adapter.LocalDateAdapter;

@XmlRootElement
@DiscriminatorValue(value = "Utilisateur")
@Entity
public class Utilisateur {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(nullable = false)
	private String pseudo;
	private String motDePasse;
	private String adresseElectronique;
	private String nom;
	private String prenom;
	private String bibliotheque;
	@XmlJavaTypeAdapter(type = LocalDate.class, value = LocalDateAdapter.class)
	private LocalDate dateDeNaissance;
	private String sexe;
	private String telephone;
	private String adresse;
	private String codePostal;
	private String ville;

	public Utilisateur() {
		super();
	}

	public Utilisateur(Integer id) {
		this.id = id;
	}

	public Utilisateur(String pseudo) {
		this.pseudo = pseudo;
	}

	public Utilisateur(Integer id, String pseudo) {
		this.id = id;
		this.pseudo = pseudo;
	}

	public Utilisateur(Integer id, String pseudo, String motDePasse, String adresseElectronique, String nom,
			String prenom, String bibliotheque, LocalDate dateDeNaissance, String sexe, String telephone,
			String adresse, String codePostal, String ville) {
		this.id = id;
		this.pseudo = pseudo;
		this.motDePasse = motDePasse;
		this.adresseElectronique = adresseElectronique;
		this.nom = nom;
		this.prenom = prenom;
		this.bibliotheque = bibliotheque;
		this.dateDeNaissance = dateDeNaissance;
		this.sexe = sexe;
		this.telephone = telephone;
		this.adresse = adresse;
		this.codePostal = codePostal;
		this.ville = ville;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPseudo() {
		return pseudo;
	}

	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}

	public String getMotDePasse() {
		return motDePasse;
	}

	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}

	public String getAdresseElectronique() {
		return adresseElectronique;
	}

	public void setAdresseElectronique(String adresseElectronique) {
		this.adresseElectronique = adresseElectronique;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getBibliotheque() {
		return bibliotheque;
	}

	public void setBibliotheque(String bibliotheque) {
		this.bibliotheque = bibliotheque;
	}

	public LocalDate getDateDeNaissance() {
		return dateDeNaissance;
	}

	public void setDateDeNaissance(LocalDate dateDeNaissance) {
		this.dateDeNaissance = dateDeNaissance;
	}

	public String getSexe() {
		return sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

}
