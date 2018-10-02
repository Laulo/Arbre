package arbre;

import java.lang.Math;

/** 
* A NoeudInterne represents an internal node of a tree.
* @see	Feuille
*/
public class NoeudInterne implements Arbre {
	/**
     * The information stored in the NoeudInterne.
     */
	private String info;
	/**
     * The children of the NoeudInterne.
     */
	private Arbre enfants [];
	/**
     * The current number of children. This number must eventually be equal to enfants.length.
     */	
	private int nbEnfants;

	/** 
    * Creates a tree. The caller must ensure that taille is at least 1.
	* Beware that this constructor is not to be called directly. Use FabriqueArbre.creerNoeud() instead.
	* @param  info	the information stored in the Noeud.
 	* @param  taille	the number of children of this Noeud. Its value must be strictly positive.
    */
	NoeudInterne(String info, int taille) {
		this.info = info;
		this.enfants = new Arbre[taille];
		this.nbEnfants = 0;
	}
	
	@Override
	public boolean ajouterEnfant(Arbre n) {
		if (nbEnfants >= enfants.length)
			return false;
		enfants[nbEnfants++] = n;
		return true;
	}

	@Override
	public String prefixe() {
		String s = info + '(' + enfants[0].prefixe();
		for(int i = 1; i < nbEnfants; i++) {
			s += ", " + enfants[i].prefixe();
		}
		return s + ')';
	}

	@Override
	public int nbFeuilles() {
		int n = 0;
		for(int i = 0; i < nbEnfants; i++) {
			n += enfants[i].nbFeuilles();
		}
		return n;
	}

	@Override
	public int nbNoeudsInternes() {
		int n = 1;
		for(int i = 0; i < nbEnfants; i++) {
			n += enfants[i].nbNoeudsInternes();
		}
		return n;
	}

	@Override
	public int nbNoeuds() {
		int n = 1;
		for(int i = 0; i < nbEnfants; i++) {
			n += enfants[i].nbNoeuds();
		}
		return n;
	}
	
	@Override
	public int hauteur() {
		int n = 0;
		for(int i = 0; i < nbEnfants; i++) {
			n = 1 + Math.max(n, enfants[i].hauteur());
		}
		return n;
	}

	@Override
	public int maxDegree() {
		int n = nbEnfants;
		for (int i = 0; i < nbEnfants; i++) {
			n = Math.max(n, enfants[i].maxDegree() );
		}
		return n;
	}

}
