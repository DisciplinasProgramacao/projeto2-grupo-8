import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class VerticeTest{
    @Test
    public void visitaVertice() {
        Vertice vertice = new Vertice(1);
        vertice.visitar();
        assertTrue(vertice.visitado());
    }

    @Test
    public void tiraVisita() {
        Vertice vertice = new Vertice(1);
        vertice.visitar();
        vertice.limparVisita();
        assertFalse(vertice.visitado());
    }
}