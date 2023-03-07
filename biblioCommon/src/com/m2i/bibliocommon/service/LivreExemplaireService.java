package com.m2i.bibliocommon.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.m2i.bibliocommon.bo.LivreExemplaire;
import com.m2i.bibliocommon.exception.BiblioException;
import com.m2i.bibliocommon.facade.ILivreExemplaireFacade;

@Service
public class LivreExemplaireService implements ILivreExemplaireService {

	@Autowired
	private ILivreExemplaireFacade livreExemplaireFacade;

	public ILivreExemplaireFacade getLivreExemplaireFacade() {
		return livreExemplaireFacade;
	}

	public void setLivreExemplaireFacade(ILivreExemplaireFacade livreExemplaireFacade) {
		this.livreExemplaireFacade = livreExemplaireFacade;
	}

	@Override
	public List<LivreExemplaire> findAll() throws BiblioException {
		return this.livreExemplaireFacade.findAll();
	}

	@Override
	public LivreExemplaire get(Integer id) throws BiblioException {
		try {
			return this.livreExemplaireFacade.get(id);
		} catch (BiblioException e) {
			throw new BiblioException(e.getMessage());
		}
	}

	@Override
	public LivreExemplaire update(LivreExemplaire livreExemplaire) throws BiblioException {
		try {
			return this.livreExemplaireFacade.update(livreExemplaire);
		} catch (BiblioException e) {
			throw new BiblioException(e.getMessage());
		}
	}

	@Override
	public void delete(LivreExemplaire livreExemplaire) throws BiblioException {
		try {
			this.livreExemplaireFacade.delete(livreExemplaire);
		} catch (BiblioException e) {
			throw new BiblioException(e.getMessage());
		}
	}

	@Override
	public LivreExemplaire save(LivreExemplaire livreExemplaire) throws BiblioException {
		try {
			return this.livreExemplaireFacade.save(livreExemplaire);
		} catch (BiblioException e) {
			throw new BiblioException(e.getMessage());
		}
	}

}
