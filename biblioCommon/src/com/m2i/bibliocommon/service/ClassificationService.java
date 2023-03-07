package com.m2i.bibliocommon.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.m2i.bibliocommon.bo.Classification;
import com.m2i.bibliocommon.exception.BiblioException;
import com.m2i.bibliocommon.facade.IClassificationFacade;

@Service
public class ClassificationService implements IClassificationService {

	@Autowired
	private IClassificationFacade classificationFacade;

	public IClassificationFacade getClassificationFacade() {
		return classificationFacade;
	}

	public void setClassificationFacade(IClassificationFacade classificationFacade) {
		this.classificationFacade = classificationFacade;
	}

	@Override
	public List<Classification> findAll() throws BiblioException {
		return this.classificationFacade.findAll();
	}

	@Override
	public Classification get(Integer id) throws BiblioException {
		try {
			return this.classificationFacade.get(id);
		} catch (BiblioException e) {
			throw new BiblioException(e.getMessage());
		}
	}

	@Override
	public Classification update(Classification classification) throws BiblioException {
		try {
			return this.classificationFacade.update(classification);
		} catch (BiblioException e) {
			throw new BiblioException(e.getMessage());
		}
	}

	@Override
	public void delete(Classification classification) throws BiblioException {
		try {
			this.classificationFacade.delete(classification);
		} catch (BiblioException e) {
			throw new BiblioException(e.getMessage());
		}
	}

	@Override
	public Classification save(Classification classification) throws BiblioException {
		try {
			return this.classificationFacade.save(classification);
		} catch (BiblioException e) {
			throw new BiblioException(e.getMessage());
		}
	}

}
