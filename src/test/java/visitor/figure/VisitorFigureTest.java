package visitor.figure;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;

public class VisitorFigureTest {
    private Collection<Figure> coleccion = new ArrayList<Figure>();

    @Before
    public void ini() {
        coleccion.add(new Circle("Circulo1", 5));
        coleccion.add(new Square("Cuadrado1", 2));
        coleccion.add(new Triangle("Triangulo1", 4, 2));
        coleccion.add(new Square("Cuadrado2", 3));
    }

    @Test
    public void testVisitorTotalArea() {
        TotalAreaVisitor v = new TotalAreaVisitor();
        for (Figure figura : coleccion) {
            figura.accept(v);
        }
        assertEquals(95.54, v.getTotalArea(),2);
    }

    @Test
    public void testVisitorTotalNumberOfSides() {
        TotalNumberOfSidesVisitor v = new TotalNumberOfSidesVisitor();
        for (Figure figura : coleccion) {
            figura.accept(v);
        }
        assertEquals(Double.POSITIVE_INFINITY, v.getTotalNumberOfSides(),2);
    }
}
