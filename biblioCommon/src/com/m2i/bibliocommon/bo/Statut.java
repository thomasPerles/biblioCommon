package com.m2i.bibliocommon.bo;

public enum Statut {

	DISPONIBLE("Disponible"), EN_PRET("En prêt"), EXCLU("Exclu temporairement, En attente de retour");

	private String valeur;

	private Statut(String valeur) {
		this.valeur = valeur;
	}

	public String getValeur() {
		return valeur;
	}

	public void setValeur(String valeur) {
		this.valeur = valeur;
	}

}
