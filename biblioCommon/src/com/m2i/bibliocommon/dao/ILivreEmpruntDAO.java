package com.m2i.bibliocommon.dao;

import java.time.LocalDateTime;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.m2i.bibliocommon.bo.LivreEmprunt;

@Repository("livreEmpruntDAO")
public interface ILivreEmpruntDAO extends JpaRepository<LivreEmprunt, Integer> {

	@Transactional
	@Modifying
	@Query("update LivreEmprunt emprunt set emprunt.dateRetour = ?2 where emprunt.id = ?1")
	int validerRetourDEmprunt(Integer id, LocalDateTime dateRetour);

}
