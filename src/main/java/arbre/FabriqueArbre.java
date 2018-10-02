package arbre;
/** 
* A FabriqueArbre is a Factory (http://en.wikipedia.org/wiki/Factory_method_pattern) used to build Arbre
* @see	Arbre Feuille NoeudInterne
*/
public class FabriqueArbre {
	
	/** 
    * Creates a tree that is a simple leaf.
	* @param  info	the information stored in the node.
    */
	public static Arbre creerNoeud(String info) { return new Feuille(info); }

	/** 
    * Creates a tree. The caller must ensure that taille is at least 1.
	* @param  info	the information stored in the node.
 	* @param  taille	the number of children of this node. Its value must be strictly positive.
    */
	public static Arbre creerNoeud(String info, int taille) { return new NoeudInterne(info, taille); }
	
}
