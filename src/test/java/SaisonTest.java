import static org.junit.Assert.*;
import org.junit.Test;
import fr.diginamic.enumerations.Saison;

public class SaisonTest {
	
	@Test
	public void testValueOfLibelle() {
		Saison printemps = Saison.valueOfLibelle("Printemps");
		Saison ete = Saison.valueOfLibelle("Eté");
		Saison automne = Saison.valueOfLibelle("Automne");
		Saison hiver = Saison.valueOfLibelle("Hiver");
		Saison erreurSaisie = Saison.valueOfLibelle("Printemp");
		assertEquals(Saison.PRINTEMPS, printemps);
		assertEquals(Saison.ETE, ete);
		assertEquals(Saison.AUTOMNE, automne);
		assertEquals(Saison.HIVER, hiver);
		assertNull(erreurSaisie);
	}
}
