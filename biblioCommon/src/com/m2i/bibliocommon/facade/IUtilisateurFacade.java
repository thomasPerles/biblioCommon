package com.m2i.bibliocommon.facade;

import com.m2i.bibliocommon.bo.Utilisateur;
import com.m2i.bibliocommon.exception.AuthentificationException;

public interface IUtilisateurFacade {

	Utilisateur creer(Utilisateur utilisateur) throws AuthentificationException;

	Utilisateur chercher(Utilisateur utilisateur) throws AuthentificationException;

}
