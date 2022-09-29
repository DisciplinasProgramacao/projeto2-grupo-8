public class GrafoCompleto extends Grafo {
    private int ordem;

    public GrafoCompleto(String nome, int ordem) {
        super(nome);
        this.ordem = ordem;

        for (int i = 1; i <= this.ordem; i++) {
            addVertice(i);

            for (int j = (i + 1); j <= this.ordem; j++) {
                addAresta(i, j);
            }
        }
    }

    public boolean addVertice(int id) {
        Vertice novo = new Vertice(id);
        return this.vertices.add(id, novo);
    }

    public boolean addAresta(int origem, int destino) {
    
        boolean adicionou = false;
        Vertice saida = this.existeVertice(origem);
        Vertice chegada = this.existeVertice(destino);
    
        if (saida != null && chegada != null) {
            saida.addAresta(1, destino);
            chegada.addAresta(1, origem);
            adicionou = true;
        }

        return adicionou;
    }

    @Override
    public boolean completo() {
        return true;
    }

    public Vertice existeVertice(int idVertice) {
        return this.vertices.find(idVertice);
    }


    public Aresta existeAresta(int vertice1, int vertice2) {
        Vertice saida = this.existeVertice(vertice1);
        return saida.existeAresta(vertice2);
    }
    
    public GrafoCompleto subGrafo(Lista<Vertice> vertices) {

        Vertice[] vert = null; 
        int ordemSubGrafo = vertices.allElements(vert).length;

        if(this.ordem > ordemSubGrafo) {
            GrafoCompleto subgrafo = new GrafoCompleto("Subgrafo de " + this.nome,ordemSubGrafo);
            return subgrafo;

        } else{
            GrafoCompleto subgrafo = new GrafoCompleto("Subgrafo de " + this.nome,this.ordem);
            return subgrafo;
        }
    }
}