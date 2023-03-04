package com.m2i.bibliocommon.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.m2i.bibliocommon.bo.Livre;

@Repository("livreDAO")
public interface ILivreDAO extends JpaRepository<Livre, Integer> {

}
