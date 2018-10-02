package arbre;

/**
 * Defines an Arbre. Every node in a tree is also a (sub)tree.
 * Therefore, there is an equivalence between a node and an Arbre.
 *
 * @see Feuille NoeudInterne
 */
public interface Arbre {
	/**
	 * Returns a String representation of this subtree in prefix order.
	 * 
	 * @return the String representation.
	 */
	public String prefixe();

	/**
	 * Returns the number of leaves of this subtree.
	 * 
	 * @return the number of leaves.
	 */
	public int nbFeuilles();

	/**
	 * Returns the number of internal nodes of this subtree.
	 * 
	 * @return the number of internal nodes.
	 */
	public int nbNoeudsInternes();

	/**
	 * Returns the number of nodes of this subtree.
	 * 
	 * @return the number of nodes.
	 */
	public int nbNoeuds();

	/**
	 * Returns the height of this subtree.
	 * 
	 * @return the height.
	 */
	public int hauteur();

	/**
	 * Returns the degree of this subtree.
	 * 
	 * @return the degree.
	 */
	public int maxDegree();

	/** 
    * Add a child to the Arbre.
	* @param  a	the Arbre to add as a child of this NoeudInterne.
 	* @return  true if the operation succeeded, false otherwise.
    */
	public boolean ajouterEnfant(Arbre a);
}
