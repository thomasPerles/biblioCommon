package com.m2i.bibliocommon.facade;

import java.util.List;

import com.m2i.bibliocommon.bo.LivreAvis;
import com.m2i.bibliocommon.exception.BiblioException;

public interface ILivreAvisFacade {

	List<LivreAvis> findAll() throws BiblioException;

	LivreAvis get(Integer id) throws BiblioException;

	LivreAvis update(LivreAvis livreAvis) throws BiblioException;

	void delete(LivreAvis livreAvis) throws BiblioException;

	LivreAvis save(LivreAvis livreAvis) throws BiblioException;

}
