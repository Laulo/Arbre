import org.junit.*;

import arbre.FabriqueArbre;
import arbre.Arbre;

public class TestArbreAUnSommet {
    private Arbre a;
 
    @BeforeClass
    public static void oneTimeSetUp() {
        // code d'initialisation appelé une seule fois au tout début (pour les tests compliqués où l'on doit initialiser des variables STATIC communes à tous les tests, ouvrir des fichiers, etc.)   
    	System.out.println("@ArbreAUnSommet - oneTimeSetUp");
    }
 
    @AfterClass
    public static void oneTimeTearDown() {
        //  code de nettoyage appelé une seule fois à la toute fin (fermeture des fichiers, etc.)
    	System.out.println("@ArbreAUnSommet - oneTimeTearDown");
    }
 
    @Before
    public void setUp() {
		a = FabriqueArbre.creerNoeud("a");
		// initialisation : on fait ça avant chaque test
    }
 
    @After
    public void tearDown() {
		// nettoyage : on fait ça après chaque test
    }
 
	// ma longue liste de tests suit
    @Test
    public void testNbFeuilles() {
        Assert.assertEquals(1, a.nbFeuilles());
    }
 
	@Test
    public void testNbNoeuds() {
        Assert.assertEquals(1, a.nbNoeuds());
    }

	@Test
    public void testNbNoeudsInternes() {
        Assert.assertEquals(0, a.nbNoeudsInternes());
    }

	@Test
    public void testHauteur() {
        Assert.assertEquals(0, a.hauteur());
    }

	@Test
    public void testmaxDegre() {
        Assert.assertEquals(0, a.maxDegree());
    }

	@Test
    public void testPrefixe() {
        Assert.assertEquals("a", a.prefixe());
    }
}
