package visitor.figure;

public class TotalNumberOfSidesVisitor extends Visitor {

    private double totalNumberOfSides = 0;
    
    @Override
    public void visitCircle(Circle c) {
        totalNumberOfSides += c.numberOfSides();
    }

    @Override
    public void visitSquare(Square s) {
        totalNumberOfSides += s.numberOfSides();
    }

    @Override
    public void visitTriangle(Triangle t) {
        totalNumberOfSides += t.numberOfSides();
    }
    
    public double getTotalNumberOfSides() {
        return totalNumberOfSides;
    }

}
