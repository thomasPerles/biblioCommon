package com.m2i.bibliocommon.service;

import java.util.List;

import com.m2i.bibliocommon.bo.Section;
import com.m2i.bibliocommon.exception.BiblioException;

public interface ISectionService {

	List<Section> findAll() throws BiblioException;

	Section get(Integer id) throws BiblioException;

	Section update(Section section) throws BiblioException;

	void delete(Section section) throws BiblioException;

	Section save(Section section) throws BiblioException;

}
