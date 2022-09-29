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
    	
    	
    	
    	System.out.println("-------------------------CRIANDO SUBGRAFO DO GRAFO COMUM-------------------------");
    	//
        //
    	//
    	System.out.println("-------------------------SUBGRAFO CRIADO-------------------------");
    	
    	
    	
    	System.out.println("-------------------------CRIANDO GRAFO COMPLETO-------------------------");
//    	Grafo grafoCompleto = new Grafo("GrafoCompleto");
//    	grafoCompleto.carregar("grafoCompleto.txt");
//    	grafoCompleto.salvar("Resultado_Grafo_Completo.txt");
    	System.out.println("-------------------------GRAFO CRIADO-------------------------");
    	
    	
    	
    	System.out.println("-------------------------VERIFICANDO ARESTA EXISTENTE-------------------------");
    	//grafoComum.arestaExistente(a);
    	System.out.println("-------------------------ARESTA VERIFICADA-------------------------");
    	
    	
    	
    	System.out.println("-------------------------REALIZANDO BUSCA EM PROFUNDIDADE-------------------------");
    	//grafoComum.buscaEmProfundidade();
    	System.out.println("-------------------------BUSCA REALIZADA-------------------------");
    	
    	
    	
    	System.out.println("-------------------------REALIZANDO CAMINHO EULERIANO-------------------------");
    	//grafoComum.buscaEmProfundidade();
    	System.out.println("-------------------------REALIZANDO CAMINHO EULERIANO-------------------------");
    	
    	
    }
}
