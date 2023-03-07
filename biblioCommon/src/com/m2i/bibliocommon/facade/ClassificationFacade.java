package com.m2i.bibliocommon.facade;

import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.OptimisticLockingFailureException;
import org.springframework.stereotype.Component;

import com.m2i.bibliocommon.bo.Classification;
import com.m2i.bibliocommon.dao.IClassificationDAO;
import com.m2i.bibliocommon.exception.BiblioException;

@Component
public class ClassificationFacade implements IClassificationFacade {

	@Autowired
	private IClassificationDAO classificationDAO;

	public IClassificationDAO getClassificationDAO() {
		return classificationDAO;
	}

	public void setClassificationDAO(IClassificationDAO classificationDAO) {
		this.classificationDAO = classificationDAO;
	}

	@Override
	public List<Classification> findAll() throws BiblioException {
		return this.classificationDAO.findAll();
	}

	@Override
	public Classification get(Integer id) throws BiblioException {
		Classification classification = null;
		try {
			classification = this.classificationDAO.getReferenceById(id);
		} catch (IllegalArgumentException | EntityNotFoundException e) {
			throw new BiblioException(e.getMessage());
		} catch (Exception e) {
			throw new BiblioException(e.getMessage());
		}
		return classification;
	}

	@Override
	public Classification update(Classification classification) throws BiblioException {
		Classification retour = null;
		try {
			retour = this.classificationDAO.save(classification);
		} catch (IllegalArgumentException | OptimisticLockingFailureException e) {
			throw new BiblioException(e.getMessage());
		} catch (Exception e) {
			throw new BiblioException(e.getMessage());
		}
		return retour;
	}

	@Override
	public void delete(Classification classification) throws BiblioException {
		try {
			this.classificationDAO.delete(classification);
		} catch (IllegalArgumentException | OptimisticLockingFailureException e) {
			throw new BiblioException(e.getMessage());
		} catch (Exception e) {
			throw new BiblioException(e.getMessage());
		}
	}

	@Override
	public Classification save(Classification classification) throws BiblioException {
		Classification retour = null;
		try {
			retour = this.classificationDAO.save(classification);
		} catch (IllegalArgumentException | OptimisticLockingFailureException e) {
			throw new BiblioException(e.getMessage());
		} catch (Exception e) {
			throw new BiblioException(e.getMessage());
		}
		return retour;
	}

}
