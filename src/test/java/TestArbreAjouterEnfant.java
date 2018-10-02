import org.junit.*;

import arbre.FabriqueArbre;
import arbre.Arbre;

public class TestArbreAjouterEnfant {
 
    @BeforeClass
    public static void oneTimeSetUp() {
        // code d'initialisation appelé une seule fois au tout début (pour les tests compliqués où l'on doit initialiser des variables STATIC communes à tous les tests, ouvrir des fichiers, etc.)   
    	System.out.println("@ArbreAjouterEnfant - oneTimeSetUp");
    }
 
    @AfterClass
    public static void oneTimeTearDown() {
        //  code de nettoyage appelé une seule fois à la toute fin (fermeture des fichiers, etc.)
    	System.out.println("@ArbreAjouterEnfant - oneTimeTearDown");
    }
 
    @Before
    public void setUp() {
		// initialisation : on fait ça avant chaque test
    }
 
    @After
    public void tearDown() {
		// nettoyage : on fait ça après chaque test
    }
 
	// ma longue liste de tests suit
    @Test
    public void testAjouterNoeudEnTrop1() {
		Arbre a = FabriqueArbre.creerNoeud("a");
		Arbre b = FabriqueArbre.creerNoeud("b");
        Assert.assertFalse(a.ajouterEnfant(b));
    }
 
	@Test
    public void testAjouterNoeudOK() {
        Arbre a = FabriqueArbre.creerNoeud("a", 1);
		Arbre b = FabriqueArbre.creerNoeud("b");
		Assert.assertTrue(a.ajouterEnfant(b));
    }

	@Test
    public void testAjouterNoeudEnTrop2() {
        Arbre a = FabriqueArbre.creerNoeud("a", 1);
		Arbre b = FabriqueArbre.creerNoeud("b");
		a.ajouterEnfant(b);
		Arbre c = FabriqueArbre.creerNoeud("c");
        Assert.assertFalse(a.ajouterEnfant(c));
    }
}
