public class App {
    public static void main(String[] args) throws Exception {
    	//Verificar a existencia de uma aresta
    	//Gerar um grafo
    	//Gerar um grafo completo
    	//Gerar um subgrafo de um grafo
    	//Realizar  busca em profundidade
    	//Determinar caminho Euleriano
    	System.out.println("-------------------------CRIANDO GRAFO COMUM-------------------------");
    	Grafo grafoComum = new Grafo("GrafoComum");
    	grafoComum.carregar("grafoComum.txt");
    	grafoComum.salvar("Resultado_Grafo_Comum.txt");
    	System.out.println("-------------------------GRAFO CRIADO-------------------------");
    	
    	
    	
    	System.out.println("-------------------------CRIANDO SUBGRAFO-------------------------");
    	Grafo subgrafo = new Grafo("Subgrafo");
    	subgrafo.carregar("subgrafo.txt");
    	Grafo grafoSubgrafo = new Grafo("GrafoSubgrafo");
    	grafoSubgrafo.carregar("grafoComum.txt");
    	grafoSubgrafo.salvar("Resultado_Grafo_Subgrafo.txt");
    	System.out.println("-------------------------SUBGRAFO CRIADO-------------------------");
    	
    	
    	
    	System.out.println("-------------------------CRIANDO GRAFO COMPLETO-------------------------");
    	Grafo grafoCompleto = new GrafoCompleto("GrafoCompleto", 6);
    	grafoCompleto.carregar("grafoCompleto.txt");
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
    	Vertice[] vertices = grafoComum.obterVertices();
    	vertices = grafoComum.buscaProfundidade(1, vertices);
    	grafoComum.buscaProfundidade(1, vertices);
    	for (int i = 0; i < vertices.length; i++) {
            if (vertices[i] != null) {
                System.out.println(vertices[i].getVertice());
            }
        }
    	System.out.println("-------------------------BUSCA REALIZADA-------------------------");
    	
    	
    	
    	System.out.println("-------------------------REALIZANDO CAMINHO EULERIANO-------------------------");
    	//grafoComum.buscaEmProfundidade();
    	System.out.println("-------------------------REALIZANDO CAMINHO EULERIANO-------------------------");
    	
    	
    }
}
