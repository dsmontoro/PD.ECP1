package visitor.figure;

public class TotalAreaVisitor extends Visitor {

    private double totalArea = 0;
    
    @Override
    public void visitCircle(Circle c) {
        totalArea += c.area();        
    }

    @Override
    public void visitSquare(Square s) {
        totalArea += s.area();
    }

    @Override
    public void visitTriangle(Triangle t) {
        totalArea += t.area();
    }
    
    public double getTotalArea() {
        return totalArea;
    }

}
