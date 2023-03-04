package com.m2i.bibliocommon.bo;

import java.time.LocalDate;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@DiscriminatorValue(value = "Livre")
@Entity
public class Livre extends SupportMultimedia {

	private Integer nombreDePages;

	public Livre() {
		super();
	}

	public Livre(Integer id) {
		super(id);
	}

	public Livre(Integer id, String titre, String auteur, LocalDate dateDePublication, Integer nombreDePages) {
		super(id, titre, auteur, dateDePublication);
		this.nombreDePages = nombreDePages;
	}

	public Integer getNombreDePages() {
		return nombreDePages;
	}

	public void setNombreDePages(Integer nombreDePages) {
		this.nombreDePages = nombreDePages;
	}

}
