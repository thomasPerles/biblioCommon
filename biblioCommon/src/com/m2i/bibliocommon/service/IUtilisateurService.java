package com.m2i.bibliocommon.service;

import com.m2i.bibliocommon.bo.Utilisateur;
import com.m2i.bibliocommon.exception.AuthentificationException;

public interface IUtilisateurService {

	Utilisateur creer(Utilisateur utilisateur) throws AuthentificationException;

	Utilisateur chercher(Utilisateur utilisateur) throws AuthentificationException;

}
