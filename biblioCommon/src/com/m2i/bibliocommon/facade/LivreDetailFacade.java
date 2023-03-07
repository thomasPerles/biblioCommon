package com.m2i.bibliocommon.facade;

import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.OptimisticLockingFailureException;
import org.springframework.stereotype.Component;

import com.m2i.bibliocommon.bo.LivreDetail;
import com.m2i.bibliocommon.dao.ILivreDetailDAO;
import com.m2i.bibliocommon.exception.BiblioException;

@Component
public class LivreDetailFacade implements ILivreDetailFacade {

	@Autowired
	private ILivreDetailDAO livreDetailDAO;

	public ILivreDetailDAO getLivreDetailDAO() {
		return livreDetailDAO;
	}

	public void setLivreDetailDAO(ILivreDetailDAO livreDetailDAO) {
		this.livreDetailDAO = livreDetailDAO;
	}

	@Override
	public List<LivreDetail> findAll() throws BiblioException {
		return this.livreDetailDAO.findAll();
	}

	@Override
	public LivreDetail get(Integer id) throws BiblioException {
		LivreDetail livreDetail = null;
		try {
			livreDetail = this.livreDetailDAO.getReferenceById(id);
		} catch (IllegalArgumentException | EntityNotFoundException e) {
			throw new BiblioException(e.getMessage());
		} catch (Exception e) {
			throw new BiblioException(e.getMessage());
		}
		return livreDetail;
	}

	@Override
	public LivreDetail update(LivreDetail livreDetail) throws BiblioException {
		LivreDetail retour = null;
		try {
			retour = this.livreDetailDAO.save(livreDetail);
		} catch (IllegalArgumentException | OptimisticLockingFailureException e) {
			throw new BiblioException(e.getMessage());
		} catch (Exception e) {
			throw new BiblioException(e.getMessage());
		}
		return retour;
	}

	@Override
	public void delete(LivreDetail livreDetail) throws BiblioException {
		try {
			this.livreDetailDAO.delete(livreDetail);
		} catch (IllegalArgumentException | OptimisticLockingFailureException e) {
			throw new BiblioException(e.getMessage());
		} catch (Exception e) {
			throw new BiblioException(e.getMessage());
		}
	}

	@Override
	public LivreDetail save(LivreDetail livreDetail) throws BiblioException {
		LivreDetail retour = null;
		try {
			retour = this.livreDetailDAO.save(livreDetail);
		} catch (IllegalArgumentException | OptimisticLockingFailureException e) {
			throw new BiblioException(e.getMessage());
		} catch (Exception e) {
			throw new BiblioException(e.getMessage());
		}
		return retour;
	}

}
