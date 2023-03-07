package com.m2i.bibliocommon.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.m2i.bibliocommon.bo.LivreAvis;
import com.m2i.bibliocommon.exception.BiblioException;
import com.m2i.bibliocommon.facade.ILivreAvisFacade;

@Service
public class LivreAvisService implements ILivreAvisService {

	@Autowired
	private ILivreAvisFacade livreAvisFacade;

	public ILivreAvisFacade getLivreAvisFacade() {
		return livreAvisFacade;
	}

	public void setLivreAvisFacade(ILivreAvisFacade livreAvisFacade) {
		this.livreAvisFacade = livreAvisFacade;
	}

	@Override
	public List<LivreAvis> findAll() throws BiblioException {
		return this.livreAvisFacade.findAll();
	}

	@Override
	public LivreAvis get(Integer id) throws BiblioException {
		try {
			return this.livreAvisFacade.get(id);
		} catch (BiblioException e) {
			throw new BiblioException(e.getMessage());
		}
	}

	@Override
	public LivreAvis update(LivreAvis livreAvis) throws BiblioException {
		try {
			return this.livreAvisFacade.update(livreAvis);
		} catch (BiblioException e) {
			throw new BiblioException(e.getMessage());
		}
	}

	@Override
	public void delete(LivreAvis livreAvis) throws BiblioException {
		try {
			this.livreAvisFacade.delete(livreAvis);
		} catch (BiblioException e) {
			throw new BiblioException(e.getMessage());
		}
	}

	@Override
	public LivreAvis save(LivreAvis livreAvis) throws BiblioException {
		try {
			return this.livreAvisFacade.save(livreAvis);
		} catch (BiblioException e) {
			throw new BiblioException(e.getMessage());
		}
	}

}
