import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TesteAresta {

	@Test
	void ExisteTesteAresta() {
		Aresta a = new Aresta(1,2);
		assertEquals(a.peso(),1);
		assertEquals(a.destino(),2);
		
	}

}