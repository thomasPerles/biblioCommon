package com.m2i.bibliocommon.facade;

import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.OptimisticLockingFailureException;
import org.springframework.stereotype.Component;

import com.m2i.bibliocommon.bo.Livre;
import com.m2i.bibliocommon.dao.ILivreDAO;
import com.m2i.bibliocommon.exception.BiblioException;

@Component
public class LivreFacade implements ILivreFacade {

	@Autowired
	private ILivreDAO livreDAO;

	public ILivreDAO getLivreDAO() {
		return livreDAO;
	}

	public void setLivreDAO(ILivreDAO livreDAO) {
		this.livreDAO = livreDAO;
	}

	@Override
	public List<Livre> findAll() throws BiblioException {
		return this.livreDAO.findAll();
	}

	@Override
	public Livre get(Integer id) throws BiblioException {
		Livre livre = null;
		try {
			livre = this.livreDAO.getReferenceById(id);
		} catch (IllegalArgumentException | EntityNotFoundException e) {
			throw new BiblioException(e.getMessage());
		} catch (Exception e) {
			throw new BiblioException(e.getMessage());
		}
		return livre;
	}

	@Override
	public Livre update(Livre livre) throws BiblioException {
		Livre retour = null;
		try {
			retour = this.livreDAO.save(livre);
		} catch (IllegalArgumentException | OptimisticLockingFailureException e) {
			throw new BiblioException(e.getMessage());
		} catch (Exception e) {
			throw new BiblioException(e.getMessage());
		}
		return retour;
	}

	@Override
	public void delete(Livre livre) throws BiblioException {
		try {
			this.livreDAO.delete(livre);
		} catch (IllegalArgumentException | OptimisticLockingFailureException e) {
			throw new BiblioException(e.getMessage());
		} catch (Exception e) {
			throw new BiblioException(e.getMessage());
		}
	}

	@Override
	public Livre save(Livre livre) throws BiblioException {
		Livre retour = null;
		try {
			retour = this.livreDAO.save(livre);
		} catch (IllegalArgumentException | OptimisticLockingFailureException e) {
			throw new BiblioException(e.getMessage());
		} catch (Exception e) {
			throw new BiblioException(e.getMessage());
		}
		return retour;
	}

}
