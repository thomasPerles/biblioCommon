package com.m2i.bibliocommon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.m2i.bibliocommon.bo.Utilisateur;
import com.m2i.bibliocommon.exception.AuthentificationException;
import com.m2i.bibliocommon.facade.IUtilisateurFacade;

@Service
public class UtilisateurService implements IUtilisateurService {

	@Autowired
	private IUtilisateurFacade utilisateurFacade;

	public IUtilisateurFacade getUtilisateurFacade() {
		return utilisateurFacade;
	}

	public void setUtilisateurFacade(IUtilisateurFacade utilisateurFacade) {
		this.utilisateurFacade = utilisateurFacade;
	}

	@Override
	public Utilisateur creer(Utilisateur utilisateur) throws AuthentificationException {
		try {
			return this.utilisateurFacade.creer(utilisateur);
		} catch (AuthentificationException e) {
			throw new AuthentificationException(e.getMessage());
		}
	}

	@Override
	public Utilisateur chercher(Utilisateur utilisateur) throws AuthentificationException {
		try {
			return this.utilisateurFacade.chercher(utilisateur);
		} catch (AuthentificationException e) {
			throw new AuthentificationException(e.getMessage());
		}
	}

}
