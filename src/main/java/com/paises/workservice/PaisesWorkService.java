package com.paises.workservice;

import java.util.ArrayList;
import java.util.List;

import com.paises.dto.ListaPaises;
import com.paises.dto.Pais;

public class PaisesWorkService {
	public ListaPaises getPaises() {
		Pais pais1 = new Pais();
		ListaPaises paises = new ListaPaises();
		List<Pais> listaPaises = new ArrayList<>();
		pais1.setNombre("España");
		pais1.setCapital("Madrid");
		pais1.setContinente("Europa");
		pais1.setTerritorio("505, 900 km");
		listaPaises.add(pais1);
		
		Pais pais2 = new Pais();
		pais2.setNombre("Argentina");
		pais2.setCapital("Buenos Aires");
		pais2.setContinente("America");
		pais2.setTerritorio("2 791 810 km");
		listaPaises.add(pais2);
		
		
		Pais pais3 = new Pais();
		pais3.setNombre("Belgica");
		pais3.setCapital("Bruselas");
		pais3.setTerritorio("30 528 km");
		pais3.setContinente("Europa");
		listaPaises.add(pais3);
		
		paises.setPaises(listaPaises);
		return paises;
	}

}
