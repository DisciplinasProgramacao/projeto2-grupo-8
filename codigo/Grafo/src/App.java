import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
    	//Verificar a existencia de uma aresta - OK
    	//Gerar um grafo não ponderado - OK
    	//Gerar um grafo ponderado - OK
    	//Realizar  busca em profundidade - OK
    	//Gerar um grafo completo - OK
    	//Gerar um subgrafo de um grafo - OK
    	//Encontrar caminho entre dois vertices
    	//Determinar caminho Euleriano
    	System.out.println("-------------------------CRIANDO GRAFO NÃO PONDERADO-------------------------");
    	Grafo grafoNaoPonderado = new GrafoNaoPonderado("grafoNaoPonderado");
    	grafoNaoPonderado.carregar("grafoNaoPonderado.txt");
    	grafoNaoPonderado.salvar("Resultado_Grafo_Comum.txt");
    	System.out.println("-------------------------GRAFO NÃO PONDERADO CRIADO-------------------------");
    	
    	
    	
    	System.out.println("-------------------------CRIANDO GRAFO PONDERADO-------------------------");
    	Grafo grafoPonderado = new GrafoPonderado("grafoNaoPonderado");
    	grafoPonderado.carregar("grafoPonderado.txt");
    	grafoPonderado.salvar("Resultado_Grafo_Ponderado.txt");
    	System.out.println("-------------------------GRAFO PONDERADO CRIADO-------------------------");
    	
    	
    	
    	System.out.println("-------------------------CRIANDO SUBGRAFO-------------------------");
    	Grafo subgrafo = new Grafo("Subgrafo");
    	subgrafo.carregar("subgrafo.txt");
    	Grafo grafoSubgrafo = new Grafo("GrafoSubgrafo");
    	grafoSubgrafo.carregar("grafoNaoPonderado.txt");
    	grafoSubgrafo.salvar("Resultado_Grafo_Subgrafo.txt");
    	System.out.println("-------------------------SUBGRAFO CRIADO-------------------------");
    	
    	
    	
    	System.out.println("-------------------------CRIANDO GRAFO COMPLETO-------------------------");
    	Grafo grafoCompleto = new GrafoCompleto("GrafoCompleto", 8);
    	grafoCompleto.salvar("Resultado_Grafo_Completo.txt");
    	System.out.println("-------------------------GRAFO CRIADO-------------------------");
    	
    	
    	
    	System.out.println("-------------------------VERIFICANDO ARESTA EXISTENTE-------------------------");
    	System.out.println("Aresta entre vertices 1 e 2");
    	if(grafoCompleto.existeAresta(1, 2) != null) {
    		System.out.println("Existe");
    	}else {
    		System.out.println("Não existe");
    	}
    	System.out.println("-------------------------ARESTA VERIFICADA-------------------------");
    	
    	
    	
    	System.out.println("-------------------------REALIZANDO BUSCA EM PROFUNDIDADE-------------------------");
    	Vertice[] vertices = grafoNaoPonderado.obterVertices();
    	vertices = grafoNaoPonderado.buscaProfundidade(1, vertices);
    	grafoNaoPonderado.buscaProfundidade(1, vertices);
    	for (int i = 0; i < vertices.length; i++) {
            if (vertices[i] != null) {
                System.out.println(vertices[i].getVertice());
            }
        }
    	System.out.println("-------------------------BUSCA REALIZADA-------------------------");


    	System.out.println("-------------------------REALIZANDO CAMINHO ENTRE VERTICES-------------------------");
    	Vertice[] verticesCaminho = grafoPonderado.obterVertices();
    	boolean caminhoExiste = grafoPonderado.caminhoEntreVertices(1, 4, verticesCaminho);
    	if(caminhoExiste) {
    		System.out.println("Caminho existente");
    	}else {
    		System.out.println("Caminho inexistente");
    	}
    	System.out.println("-------------------------CAMINHO ENTRE VERTICES REALIZADO-------------------------");
    	
    	
    	System.out.println("-------------------------REALIZANDO CAMINHO EULERIANO-------------------------");
    	//grafoNaoPonderado.buscaEmProfundidade();
    	System.out.println("-------------------------REALIZANDO CAMINHO EULERIANO-------------------------");
    	
    	
    }
}
