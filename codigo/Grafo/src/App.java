public class App {
    public static void main(String[] args) throws Exception {
    	Grafo g = new Grafo("Grafo1");
    	g.carregar("grafos.txt");
    	g.salvar("Resultado_Grafo.txt");
    }
}
