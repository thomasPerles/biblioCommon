package com.m2i.bibliocommon.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.m2i.bibliocommon.bo.LivreDetail;
import com.m2i.bibliocommon.exception.BiblioException;
import com.m2i.bibliocommon.facade.ILivreDetailFacade;

@Service
public class LivreDetailService implements ILivreDetailService {

	@Autowired
	private ILivreDetailFacade livreDetailFacade;

	public ILivreDetailFacade getLivreDetailFacade() {
		return livreDetailFacade;
	}

	public void setLivreDetailFacade(ILivreDetailFacade livreDetailFacade) {
		this.livreDetailFacade = livreDetailFacade;
	}

	@Override
	public List<LivreDetail> findAll() throws BiblioException {
		return this.livreDetailFacade.findAll();
	}

	@Override
	public LivreDetail get(Integer id) throws BiblioException {
		try {
			return this.livreDetailFacade.get(id);
		} catch (BiblioException e) {
			throw new BiblioException(e.getMessage());
		}
	}

	@Override
	public LivreDetail update(LivreDetail livreDetail) throws BiblioException {
		try {
			return this.livreDetailFacade.update(livreDetail);
		} catch (BiblioException e) {
			throw new BiblioException(e.getMessage());
		}
	}

	@Override
	public void delete(LivreDetail livreDetail) throws BiblioException {
		try {
			this.livreDetailFacade.delete(livreDetail);
		} catch (BiblioException e) {
			throw new BiblioException(e.getMessage());
		}
	}

	@Override
	public LivreDetail save(LivreDetail livreDetail) throws BiblioException {
		try {
			return this.livreDetailFacade.save(livreDetail);
		} catch (BiblioException e) {
			throw new BiblioException(e.getMessage());
		}
	}

}
