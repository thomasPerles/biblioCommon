package com.m2i.bibliocommon.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.m2i.bibliocommon.bo.LivreEmprunt;
import com.m2i.bibliocommon.exception.BiblioException;
import com.m2i.bibliocommon.facade.ILivreEmpruntFacade;

@Service
public class LivreEmpruntService implements ILivreEmpruntService {

	@Autowired
	private ILivreEmpruntFacade livreEmpruntFacade;

	public ILivreEmpruntFacade getLivreEmpruntFacade() {
		return livreEmpruntFacade;
	}

	public void setLivreEmpruntFacade(ILivreEmpruntFacade livreEmpruntFacade) {
		this.livreEmpruntFacade = livreEmpruntFacade;
	}

	@Override
	public List<LivreEmprunt> findAll() throws BiblioException {
		return this.livreEmpruntFacade.findAll();
	}

	@Override
	public LivreEmprunt get(Integer id) throws BiblioException {
		LivreEmprunt retour = null;
		try {
			retour = this.livreEmpruntFacade.get(id);
		} catch (BiblioException e) {
			throw new BiblioException(e.getMessage());
		}
		return retour;
	}

	@Override
	public LivreEmprunt update(LivreEmprunt livreEmprunt) throws BiblioException {
		LivreEmprunt retour = null;
		try {
			retour = this.livreEmpruntFacade.update(livreEmprunt);
		} catch (BiblioException e) {
			throw new BiblioException(e.getMessage());
		}
		return retour;
	}

	@Override
	public void delete(LivreEmprunt livreEmprunt) throws BiblioException {
		try {
			this.livreEmpruntFacade.delete(livreEmprunt);
		} catch (BiblioException e) {
			throw new BiblioException(e.getMessage());
		}
	}

	@Override
	public LivreEmprunt save(LivreEmprunt livreEmprunt) throws BiblioException {
		LivreEmprunt retour = null;
		try {
			retour = this.livreEmpruntFacade.save(livreEmprunt);
		} catch (BiblioException e) {
			throw new BiblioException(e.getMessage());
		}
		return retour;
	}

	@Override
	public List<LivreEmprunt> validerRetourDEmprunt(List<Integer> ids) throws BiblioException {
		List<LivreEmprunt> retour = null;
		try {
			retour = this.livreEmpruntFacade.validerRetourDEmprunt(ids);
		} catch (BiblioException e) {
			throw new BiblioException(e.getMessage());
		}
		return retour;
	}

}
