package com.m2i.bibliocommon.service;

import java.util.List;

import com.m2i.bibliocommon.bo.Classification;
import com.m2i.bibliocommon.exception.BiblioException;

public interface IClassificationService {

	List<Classification> findAll() throws BiblioException;

	Classification get(Integer id) throws BiblioException;

	Classification update(Classification classification) throws BiblioException;

	void delete(Classification classification) throws BiblioException;

	Classification save(Classification classification) throws BiblioException;

}
