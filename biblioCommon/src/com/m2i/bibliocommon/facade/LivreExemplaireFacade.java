package com.m2i.bibliocommon.facade;

import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.OptimisticLockingFailureException;
import org.springframework.stereotype.Component;

import com.m2i.bibliocommon.bo.LivreExemplaire;
import com.m2i.bibliocommon.dao.ILivreExemplaireDAO;
import com.m2i.bibliocommon.exception.BiblioException;

@Component
public class LivreExemplaireFacade implements ILivreExemplaireFacade {

	@Autowired
	private ILivreExemplaireDAO livreExemplaireDAO;

	public ILivreExemplaireDAO getLivreExemplaireDAO() {
		return livreExemplaireDAO;
	}

	public void setLivreExemplaireDAO(ILivreExemplaireDAO livreExemplaireDAO) {
		this.livreExemplaireDAO = livreExemplaireDAO;
	}

	@Override
	public List<LivreExemplaire> findAll() throws BiblioException {
		return this.livreExemplaireDAO.findAll();
	}

	@Override
	public LivreExemplaire get(Integer id) throws BiblioException {
		LivreExemplaire livreExemplaire = null;
		try {
			livreExemplaire = this.livreExemplaireDAO.getReferenceById(id);
		} catch (IllegalArgumentException | EntityNotFoundException e) {
			throw new BiblioException(e.getMessage());
		} catch (Exception e) {
			throw new BiblioException(e.getMessage());
		}
		return livreExemplaire;
	}

	@Override
	public LivreExemplaire update(LivreExemplaire livreExemplaire) throws BiblioException {
		LivreExemplaire retour = null;
		try {
			retour = this.livreExemplaireDAO.save(livreExemplaire);
		} catch (IllegalArgumentException | OptimisticLockingFailureException e) {
			throw new BiblioException(e.getMessage());
		} catch (Exception e) {
			throw new BiblioException(e.getMessage());
		}
		return retour;
	}

	@Override
	public void delete(LivreExemplaire livreExemplaire) throws BiblioException {
		try {
			this.livreExemplaireDAO.delete(livreExemplaire);
		} catch (IllegalArgumentException | OptimisticLockingFailureException e) {
			throw new BiblioException(e.getMessage());
		} catch (Exception e) {
			throw new BiblioException(e.getMessage());
		}
	}

	@Override
	public LivreExemplaire save(LivreExemplaire livreExemplaire) throws BiblioException {
		LivreExemplaire retour = null;
		try {
			retour = this.livreExemplaireDAO.save(livreExemplaire);
		} catch (IllegalArgumentException | OptimisticLockingFailureException e) {
			throw new BiblioException(e.getMessage());
		} catch (Exception e) {
			throw new BiblioException(e.getMessage());
		}
		return retour;
	}

}
