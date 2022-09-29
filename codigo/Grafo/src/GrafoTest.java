import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GrafoTest {

	@Test
	void testCarregarGrafo() {
		Grafo.carregar(nomeArquivo);
		assertEquals(0 , Grafo.qtdVertices);
	}

}
