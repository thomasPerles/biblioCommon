package com.m2i.bibliocommon.facade;

import java.util.List;

import com.m2i.bibliocommon.bo.LivreExemplaire;
import com.m2i.bibliocommon.exception.BiblioException;

public interface ILivreExemplaireFacade {

	List<LivreExemplaire> findAll() throws BiblioException;

	LivreExemplaire get(Integer id) throws BiblioException;

	LivreExemplaire update(LivreExemplaire livreExemplaire) throws BiblioException;

	void delete(LivreExemplaire livreExemplaire) throws BiblioException;

	LivreExemplaire save(LivreExemplaire livreExemplaire) throws BiblioException;

}
