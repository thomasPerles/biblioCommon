package com.m2i.bibliocommon.facade;

import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.OptimisticLockingFailureException;
import org.springframework.stereotype.Component;

import com.m2i.bibliocommon.bo.LivreAvis;
import com.m2i.bibliocommon.dao.ILivreAvisDAO;
import com.m2i.bibliocommon.exception.BiblioException;

@Component
public class LivreAvisFacade implements ILivreAvisFacade {

	@Autowired
	private ILivreAvisDAO livreAvisDAO;

	public ILivreAvisDAO getLivreAvisDAO() {
		return livreAvisDAO;
	}

	public void setLivreAvisDAO(ILivreAvisDAO livreAvisDAO) {
		this.livreAvisDAO = livreAvisDAO;
	}

	@Override
	public List<LivreAvis> findAll() throws BiblioException {
		return this.livreAvisDAO.findAll();
	}

	@Override
	public LivreAvis get(Integer id) throws BiblioException {
		LivreAvis livreAvis = null;
		try {
			livreAvis = this.livreAvisDAO.getReferenceById(id);
		} catch (IllegalArgumentException | EntityNotFoundException e) {
			throw new BiblioException(e.getMessage());
		} catch (Exception e) {
			throw new BiblioException(e.getMessage());
		}
		return livreAvis;
	}

	@Override
	public LivreAvis update(LivreAvis livreAvis) throws BiblioException {
		LivreAvis retour = null;
		try {
			retour = this.livreAvisDAO.save(livreAvis);
		} catch (IllegalArgumentException | OptimisticLockingFailureException e) {
			throw new BiblioException(e.getMessage());
		} catch (Exception e) {
			throw new BiblioException(e.getMessage());
		}
		return retour;
	}

	@Override
	public void delete(LivreAvis livreAvis) throws BiblioException {
		try {
			this.livreAvisDAO.delete(livreAvis);
		} catch (IllegalArgumentException | OptimisticLockingFailureException e) {
			throw new BiblioException(e.getMessage());
		} catch (Exception e) {
			throw new BiblioException(e.getMessage());
		}
	}

	@Override
	public LivreAvis save(LivreAvis livreAvis) throws BiblioException {
		LivreAvis retour = null;
		try {
			retour = this.livreAvisDAO.save(livreAvis);
		} catch (IllegalArgumentException | OptimisticLockingFailureException e) {
			throw new BiblioException(e.getMessage());
		} catch (Exception e) {
			throw new BiblioException(e.getMessage());
		}
		return retour;
	}

}
