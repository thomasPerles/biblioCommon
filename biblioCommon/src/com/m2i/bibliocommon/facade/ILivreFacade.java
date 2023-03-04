package com.m2i.bibliocommon.facade;

import java.util.List;

import com.m2i.bibliocommon.bo.Livre;
import com.m2i.bibliocommon.exception.BiblioException;

public interface ILivreFacade {

	List<Livre> findAll() throws BiblioException;

	Livre get(Integer id) throws BiblioException;

	Livre update(Livre livre) throws BiblioException;

	void delete(Livre livre) throws BiblioException;

	Livre save(Livre livre) throws BiblioException;

}
