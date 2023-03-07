package com.m2i.bibliocommon.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.m2i.bibliocommon.bo.LivreExemplaire;

@Repository("livreExemplaireDAO")
public interface ILivreExemplaireDAO extends JpaRepository<LivreExemplaire, Integer> {

}
