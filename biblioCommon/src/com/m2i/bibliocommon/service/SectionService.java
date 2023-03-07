package com.m2i.bibliocommon.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.m2i.bibliocommon.bo.Section;
import com.m2i.bibliocommon.exception.BiblioException;
import com.m2i.bibliocommon.facade.ISectionFacade;

@Service
public class SectionService implements ISectionService {

	@Autowired
	private ISectionFacade sectionFacade;

	public ISectionFacade getSectionFacade() {
		return sectionFacade;
	}

	public void setSectionFacade(ISectionFacade sectionFacade) {
		this.sectionFacade = sectionFacade;
	}

	@Override
	public List<Section> findAll() throws BiblioException {
		return this.sectionFacade.findAll();
	}

	@Override
	public Section get(Integer id) throws BiblioException {
		try {
			return this.sectionFacade.get(id);
		} catch (BiblioException e) {
			throw new BiblioException(e.getMessage());
		}
	}

	@Override
	public Section update(Section section) throws BiblioException {
		try {
			return this.sectionFacade.update(section);
		} catch (BiblioException e) {
			throw new BiblioException(e.getMessage());
		}
	}

	@Override
	public void delete(Section section) throws BiblioException {
		try {
			this.sectionFacade.delete(section);
		} catch (BiblioException e) {
			throw new BiblioException(e.getMessage());
		}
	}

	@Override
	public Section save(Section section) throws BiblioException {
		try {
			return this.sectionFacade.save(section);
		} catch (BiblioException e) {
			throw new BiblioException(e.getMessage());
		}
	}

}
