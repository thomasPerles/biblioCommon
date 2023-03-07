package com.m2i.bibliocommon.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.m2i.bibliocommon.bo.LivreAvis;

@Repository("livreAvisDAO")
public interface ILivreAvisDAO extends JpaRepository<LivreAvis, Integer> {

}
