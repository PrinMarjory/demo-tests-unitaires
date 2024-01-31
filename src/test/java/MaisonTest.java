import static org.junit.Assert.*;
import org.junit.Test;
import fr.diginamic.immobilier.entites.Maison;
import fr.diginamic.immobilier.entites.Chambre;
import fr.diginamic.immobilier.entites.Piece;

public class MaisonTest {
	
	@Test
	public void testAjouterPiece() {
		Piece chambre = new Chambre(1, 12);
		Maison maison = new Maison();
		maison.ajouterPiece(chambre);
		maison.ajouterPiece(null);
		Piece[] pieces = maison.getPieces();
		assertEquals(pieces.length, 2);
		assertEquals(pieces[0], chambre);
		assertEquals(pieces[1], null);
	}
	
	@Test
	public void testNbPiece() {
		Piece chambre = new Chambre(1, 12);
		Maison maison = new Maison();
		int nbPieces = maison.nbPieces();
		assertEquals(0, nbPieces);
		maison.ajouterPiece(chambre);
		maison.ajouterPiece(null);
		nbPieces = maison.nbPieces();
		assertEquals(2, nbPieces);
	}
	
	@Test
	public void testSuperficieEtage() {
		Piece chambre1 = new Chambre(1, 12);
		Piece chambre2 = new Chambre(1, 10);
		Maison maison = new Maison();
		maison.ajouterPiece(chambre1);
		maison.ajouterPiece(chambre2);
		double superficieRdc = maison.superficieEtage(0);
		double superficie1 = maison.superficieEtage(1);
		assertEquals(0, superficieRdc,  0.0);
		assertEquals(22, superficie1, 0.0);
	}
	
	@Test
	public void testSuperficieTypePiece() {
		Piece chambre1 = new Chambre(1, 12);
		Piece chambre2 = new Chambre(1, 10);
		Maison maison = new Maison();
		maison.ajouterPiece(chambre1);
		maison.ajouterPiece(chambre2);
		double superficieSalon = maison.superficieTypePiece("Salon");
		double superficieChambre = maison.superficieTypePiece("Chambre");
		assertEquals(0, superficieSalon,  0.0);
		assertEquals(22, superficieChambre, 0.0);
	}
	
	@Test
	public void testCalculerSurface() {
		Piece chambre1 = new Chambre(1, 12);
		Piece chambre2 = new Chambre(0, 10);
		Maison maison = new Maison();
		double superficie = maison.calculerSurface();
		assertEquals(0, superficie,  0.0);
		maison.ajouterPiece(chambre1);
		maison.ajouterPiece(chambre2);
		maison.ajouterPiece(null);
		superficie = maison.calculerSurface();
		assertEquals(22, superficie,  0.0);

	}
}
