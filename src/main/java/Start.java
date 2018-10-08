import java.io.PrintStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;

import arbre.FabriqueArbre;
import arbre.Arbre;

public class Start {

	public static void main(String args[]) {

	    //Création de l'arbre: a(b(c, d(e, f)), g(h, i, j))
		Arbre a = FabriqueArbre.creerNoeud("a", 2);
		Arbre b = FabriqueArbre.creerNoeud("b", 2);
		a.ajouterEnfant(b);
		b.ajouterEnfant(FabriqueArbre.creerNoeud("c"));
		Arbre d = FabriqueArbre.creerNoeud("d", 2);
		b.ajouterEnfant(d);
		d.ajouterEnfant(FabriqueArbre.creerNoeud("e"));
		d.ajouterEnfant(FabriqueArbre.creerNoeud("f"));
		Arbre g = FabriqueArbre.creerNoeud("g", 3);
		a.ajouterEnfant(g);
		g.ajouterEnfant(FabriqueArbre.creerNoeud("h"));
		g.ajouterEnfant(FabriqueArbre.creerNoeud("i"));
		g.ajouterEnfant(FabriqueArbre.creerNoeud("j"));
				
		System.out.println("Noeuds: " + a.nbNoeuds() + " (attendu: 10)");
		System.out.println("Feuilles: " + a.nbFeuilles() + " (attendu: 6)");
		System.out.println("NoeudsInternes: " + a.nbNoeudsInternes() + " (attendu: 4)");
		System.out.println("Hauteur: " + a.hauteur() + " (attendu: 3)");
		System.out.println("Degré Max: " + a.maxDegree() + " (attendu: 3)");

		try {
			PrintStream out = new PrintStream(new FileOutputStream("prefixe.txt"));
			out.println(a.prefixe());
			out.close();
			out = new PrintStream(new FileOutputStream("postfixe.txt"));
			out.println(a.postfixe());
			out.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		System.out.println("Fichiers prefixe.txt et postfixe.txt crées");
   }
}
