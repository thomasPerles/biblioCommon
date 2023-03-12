package com.m2i.bibliocommon.service;

import java.util.List;

import com.m2i.bibliocommon.bo.LivreEmprunt;
import com.m2i.bibliocommon.exception.BiblioException;

public interface ILivreEmpruntService {

	List<LivreEmprunt> findAll() throws BiblioException;

	LivreEmprunt get(Integer id) throws BiblioException;

	LivreEmprunt update(LivreEmprunt livreEmprunt) throws BiblioException;

	void delete(LivreEmprunt livreEmprunt) throws BiblioException;

	LivreEmprunt save(LivreEmprunt livreEmprunt) throws BiblioException;

	List<LivreEmprunt> validerRetourDEmprunt(List<Integer> ids) throws BiblioException;

}
