package com.m2i.bibliocommon.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.m2i.bibliocommon.bo.Livre;
import com.m2i.bibliocommon.exception.BiblioException;
import com.m2i.bibliocommon.facade.ILivreFacade;

@Service
public class LivreService implements ILivreService {

	@Autowired
	private ILivreFacade livreFacade;

	public ILivreFacade getLivreFacade() {
		return livreFacade;
	}

	public void setLivreFacade(ILivreFacade livreFacade) {
		this.livreFacade = livreFacade;
	}

	@Override
	public List<Livre> findAll() throws BiblioException {
		return this.livreFacade.findAll();
	}

	@Override
	public Livre get(Integer id) throws BiblioException {
		try {
			return this.livreFacade.get(id);
		} catch (BiblioException e) {
			throw new BiblioException(e.getMessage());
		}
	}

	@Override
	public Livre update(Livre livre) throws BiblioException {
		try {
			return this.livreFacade.update(livre);
		} catch (BiblioException e) {
			throw new BiblioException(e.getMessage());
		}
	}

	@Override
	public void delete(Livre livre) throws BiblioException {
		try {
			this.livreFacade.delete(livre);
		} catch (BiblioException e) {
			throw new BiblioException(e.getMessage());
		}
	}

	@Override
	public Livre save(Livre livre) throws BiblioException {
		try {
			return this.livreFacade.save(livre);
		} catch (BiblioException e) {
			throw new BiblioException(e.getMessage());
		}
	}

}
