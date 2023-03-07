package com.m2i.bibliocommon.facade;

import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.OptimisticLockingFailureException;
import org.springframework.stereotype.Component;

import com.m2i.bibliocommon.bo.Section;
import com.m2i.bibliocommon.dao.ISectionDAO;
import com.m2i.bibliocommon.exception.BiblioException;

@Component
public class SectionFacade implements ISectionFacade {

	@Autowired
	private ISectionDAO sectionDAO;

	public ISectionDAO getSectionDAO() {
		return sectionDAO;
	}

	public void setSectionDAO(ISectionDAO sectionDAO) {
		this.sectionDAO = sectionDAO;
	}

	@Override
	public List<Section> findAll() throws BiblioException {
		return this.sectionDAO.findAll();
	}

	@Override
	public Section get(Integer id) throws BiblioException {
		Section section = null;
		try {
			section = this.sectionDAO.getReferenceById(id);
		} catch (IllegalArgumentException | EntityNotFoundException e) {
			throw new BiblioException(e.getMessage());
		} catch (Exception e) {
			throw new BiblioException(e.getMessage());
		}
		return section;
	}

	@Override
	public Section update(Section section) throws BiblioException {
		Section retour = null;
		try {
			retour = this.sectionDAO.save(section);
		} catch (IllegalArgumentException | OptimisticLockingFailureException e) {
			throw new BiblioException(e.getMessage());
		} catch (Exception e) {
			throw new BiblioException(e.getMessage());
		}
		return retour;
	}

	@Override
	public void delete(Section section) throws BiblioException {
		try {
			this.sectionDAO.delete(section);
		} catch (IllegalArgumentException | OptimisticLockingFailureException e) {
			throw new BiblioException(e.getMessage());
		} catch (Exception e) {
			throw new BiblioException(e.getMessage());
		}
	}

	@Override
	public Section save(Section section) throws BiblioException {
		Section retour = null;
		try {
			retour = this.sectionDAO.save(section);
		} catch (IllegalArgumentException | OptimisticLockingFailureException e) {
			throw new BiblioException(e.getMessage());
		} catch (Exception e) {
			throw new BiblioException(e.getMessage());
		}
		return retour;
	}

}
