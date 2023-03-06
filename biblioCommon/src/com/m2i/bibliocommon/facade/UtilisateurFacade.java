package com.m2i.bibliocommon.facade;

import java.util.NoSuchElementException;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.OptimisticLockingFailureException;
import org.springframework.stereotype.Component;

import com.m2i.bibliocommon.bo.Utilisateur;
import com.m2i.bibliocommon.dao.IUtilisateurDAO;
import com.m2i.bibliocommon.exception.AuthentificationException;

@Component
public class UtilisateurFacade implements IUtilisateurFacade {

	@Autowired
	private IUtilisateurDAO utilisateurDAO;

	public IUtilisateurDAO getUtilisateurDAO() {
		return utilisateurDAO;
	}

	public void setUtilisateurDAO(IUtilisateurDAO utilisateurDAO) {
		this.utilisateurDAO = utilisateurDAO;
	}

	@Override
	public Utilisateur creer(Utilisateur utilisateur) throws AuthentificationException {
		Utilisateur retour = null;
		try {
			if (!this.utilisateurDAO.findByPseudo(utilisateur.getPseudo()).isEmpty()) {
				throw new AuthentificationException("Le pseudo existe deja");
			}
			retour = this.utilisateurDAO.save(utilisateur);
		} catch (IllegalArgumentException | OptimisticLockingFailureException e) {
			throw new AuthentificationException(e.getMessage());
		} catch (Exception e) {
			throw new AuthentificationException(e.getMessage());
		}
		return retour;
	}

	@Override
	public Utilisateur chercher(Utilisateur utilisateur) throws AuthentificationException {
		Utilisateur retour = null;
		try {
			retour = this.utilisateurDAO.findByPseudo(utilisateur.getPseudo()).stream().findFirst()
					.orElseThrow(() -> new AuthentificationException("Le pseudo n'existe pas"));
		} catch (IllegalArgumentException | EntityNotFoundException e) {
			throw new AuthentificationException(e.getMessage());
		} catch (NoSuchElementException e) {
			throw new AuthentificationException(e.getMessage());
		} catch (Exception e) {
			throw new AuthentificationException(e.getMessage());
		}
		return retour;
	}

}
