package lmata.daw.main;


import java.util.List;

import almata.daw.models.myProducte;
import api.Producte;
import api.ServeiCarro;
import api.ServeiCarroService;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ServeiCarroService servei= new ServeiCarroService();
		
		ServeiCarro carro= servei.getServeiCarro();
		
		String token=carro.autenticar("tito", "tito");
		
		Producte p=carro.obtenirProducte(token, "65");
		
		List<Producte> pr=carro.obtenirProductes(token);
		Boolean b=carro.afegirProducte(token, new myProducte("HOLA",5,"DESCRIPCIO",56,"tito"," 11 11 2013"));
		
		List<Producte> pr2=carro.otenirProductesperData(token, "11-11-2013", "11-11-2019");
		System.out.println("Token:");
		System.out.println("Token: "+token);
		System.out.println("Producte: ");
		System.out.println("Producte: "+p.getNom());
		System.out.println("Obtenir productes: ");
		for(Producte item: pr) {
			System.out.println("Nom: "+item.getNom()+" Preu: "+item.getPreu());
		}
		System.out.println("Obtenir Productes Filtrats per Data: ");
		for(Producte item: pr2) {
			System.out.println("Nom: "+item.getNom()+" Preu: "+item.getPreu());
		}
		System.out.println("Afegir producte: ");
		System.out.println(b);
		
	}
	

}
