package com.m2i.bibliocommon.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.m2i.bibliocommon.bo.Utilisateur;

@Repository("utilisateurDAO")
public interface IUtilisateurDAO extends JpaRepository<Utilisateur, Integer> {

	List<Utilisateur> findByPseudo(String pseudo);
}
