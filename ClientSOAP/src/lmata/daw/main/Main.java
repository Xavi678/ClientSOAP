package lmata.daw.main;


import java.util.List;

import api.Producte;
import api.ServeiCarro;
import api.ServeiCarroService;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ServeiCarroService servei= new ServeiCarroService();
		
		ServeiCarro carro= servei.getServeiCarro();
		
		String token=carro.autenticar("xavi", "e");
		
		Producte p=carro.obtenirProducte(token, "1");
		
		List<Producte> pr=carro.obtenirProductes(token);
		Boolean b=carro.afegirProducte(token, new Producte("HOLA",5,"DESCRIPCIO",56,"xavi"));
		System.out.println("Token: "+token);
		System.out.println("Producte: "+p.getNom());
		
		for(Producte item: pr) {
			System.out.println("Nom: "+item.getNom()+" Preu: "+item.getPreu());
		}
	}

}
