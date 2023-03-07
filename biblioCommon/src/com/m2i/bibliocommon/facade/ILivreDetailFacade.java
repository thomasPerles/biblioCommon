package com.m2i.bibliocommon.facade;

import java.util.List;

import com.m2i.bibliocommon.bo.LivreDetail;
import com.m2i.bibliocommon.exception.BiblioException;

public interface ILivreDetailFacade {

	List<LivreDetail> findAll() throws BiblioException;

	LivreDetail get(Integer id) throws BiblioException;

	LivreDetail update(LivreDetail livreDetail) throws BiblioException;

	void delete(LivreDetail livreDetail) throws BiblioException;

	LivreDetail save(LivreDetail livreDetail) throws BiblioException;

}
