package arbre;
/** 
* A Feuille represents a leaf of a tree.
* @see	NoeudInterne
*/
public class Feuille implements Arbre {
	/**
     * The information stored in the Feuille.
     */
	private String info;

	/** 
    * Creates a tree that is a simple leaf.
	* Beware that this constructor is not to be called directly. Use FabriqueArbre.creerNoeud() instead.
	* @param  info	the information stored in the Feuille.
    */
	Feuille(String info) { this.info = info; }
	
	@Override
	public String prefixe() { return info; }
	
	@Override
	public int nbFeuilles() { return 1; }
	
	@Override
	public int nbNoeudsInternes() { return 0; }
	
	@Override
	public int nbNoeuds() { return 1; }
	
	@Override
	public int hauteur() { return 0; }

	@Override
	public int maxDegree() { return 0; }

	@Override
	public boolean ajouterEnfant(Arbre n) { return false; }
}

