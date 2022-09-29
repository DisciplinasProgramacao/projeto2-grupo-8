import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TesteGrafo {
	
	@Test
    void addVertice() {
		Grafo grafo = new Grafo("Grafo");
		assertTrue(grafo.addVertice(1));
    }

	@Test
    void addAresta() {
		Grafo grafo = new Grafo("Grafo");
		grafo.addVertice(1);
		grafo.addVertice(2);
		assertTrue(grafo.addAresta(1, 2));
    }

	@Test
    void testExisteAresta() {
		Grafo grafo = new Grafo("Grafo");
		grafo.addVertice(1);
		grafo.addVertice(1);
		grafo.addVertice(2);
//		assertTrue(grafo.existeAresta(1, 2));
    }
    

    @Test
    void testBuscaEmProfundidade() {

    }

    @Test
    void testCaminhoEuleriano() {

    }

    @Test
    void testECompleto() {

    }

    @Test
    void testEEuleriano() {

    }

    

    @Test
    void testExisteVertice() {

    }

    @Test
    void testGetAllVertices() {

    }

    @Test
    void testOrdem() {

    }

    @Test
    void testSubGrafo() {

    }

    @Test
    void testTamanho() {

    }

}