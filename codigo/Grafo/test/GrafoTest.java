import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GrafoTest {
	
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
    void existeAresta() {
		Grafo grafo = new Grafo("Grafo");
		grafo.addVertice(1);
		grafo.addVertice(2);
		grafo.addAresta(1, 2);
		assertTrue(grafo.existeAresta(1, 2) != null);
    }
    
	
	@Test
    void existeVertice() {
		Grafo grafo = new Grafo("Grafo");
		grafo.addVertice(1);
		assertTrue(grafo.existeVertice(1) != null);
    }
	
	@Test
    void obterTodosVertices() {
		Grafo grafo = new Grafo("Grafo");
		grafo.addVertice(1);
		grafo.addVertice(2);
		grafo.addVertice(3);
		assertEquals(grafo.obterVertices().length, 3);
    }

    @Test
    void buscaEmProfundidade() {

    }

    @Test
    void caminhoEuleriano() {

    }

    @Test
    void completo() {

    }

    @Test
    void euleriano() {

    }
    

    @Test
    void ordem() {

    }

    @Test
    void subGrafo() {

    }

    @Test
    void tamanho() {

    }

}