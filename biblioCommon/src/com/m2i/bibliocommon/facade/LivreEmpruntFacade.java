package com.m2i.bibliocommon.facade;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.OptimisticLockingFailureException;
import org.springframework.stereotype.Component;

import com.m2i.bibliocommon.bo.LivreEmprunt;
import com.m2i.bibliocommon.dao.ILivreEmpruntDAO;
import com.m2i.bibliocommon.exception.BiblioException;

@Component
public class LivreEmpruntFacade implements ILivreEmpruntFacade {

	@Autowired
	private ILivreEmpruntDAO livreEmpruntDAO;

	public ILivreEmpruntDAO getLivreEmpruntDAO() {
		return livreEmpruntDAO;
	}

	public void setLivreEmpruntDAO(ILivreEmpruntDAO livreEmpruntDAO) {
		this.livreEmpruntDAO = livreEmpruntDAO;
	}

	@Override
	public List<LivreEmprunt> findAll() throws BiblioException {
		return this.livreEmpruntDAO.findAll();
	}

	@Override
	public LivreEmprunt get(Integer id) throws BiblioException {
		LivreEmprunt livreEmprunt = null;
		try {
			livreEmprunt = this.livreEmpruntDAO.getReferenceById(id);
		} catch (EntityNotFoundException e) {
			throw new BiblioException(e.getMessage());
		} catch (Exception e) {
			throw new BiblioException(e.getMessage());
		}
		return livreEmprunt;
	}

	@Override
	public LivreEmprunt update(LivreEmprunt livreEmprunt) throws BiblioException {
		LivreEmprunt retour = null;
		try {
			retour = this.livreEmpruntDAO.save(livreEmprunt);
		} catch (IllegalArgumentException | OptimisticLockingFailureException e) {
			throw new BiblioException(e.getMessage());
		}
		return retour;
	}

	@Override
	public void delete(LivreEmprunt livreEmprunt) throws BiblioException {
		try {
			this.livreEmpruntDAO.delete(livreEmprunt);
		} catch (IllegalArgumentException | OptimisticLockingFailureException e) {
			throw new BiblioException(e.getMessage());
		}
	}

	@Override
	public LivreEmprunt save(LivreEmprunt livreEmprunt) throws BiblioException {
		LivreEmprunt retour = null;
		try {
			retour = this.livreEmpruntDAO.save(livreEmprunt);
		} catch (IllegalArgumentException | OptimisticLockingFailureException e) {
			throw new BiblioException(e.getMessage());
		}
		return retour;
	}

	@Override
	public List<LivreEmprunt> validerRetourDEmprunt(List<Integer> ids) throws BiblioException {
		List<LivreEmprunt> emprunts = new ArrayList<LivreEmprunt>();
		List<Integer> idsEnErreur = new ArrayList<Integer>();
		ids.stream().forEach((id) -> {
			LivreEmprunt livreEmprunt = null;
			try {
				livreEmprunt = get(id);
				livreEmprunt.setDateRetour(LocalDateTime.now());
				this.livreEmpruntDAO.validerRetourDEmprunt(id, livreEmprunt.getDateRetour());
				emprunts.add(livreEmprunt);
			} catch (BiblioException e) {
				idsEnErreur.add(id);
			}
		});
		if (ids.size() != emprunts.size())
			throw new BiblioException(Arrays.toString(ids.toArray()));
		return emprunts;
	}

}
