package visitor2;

public class Visitor2 extends Visitor {

    private int As=0;
    private int Bs=0;
    
    @Override
    public void visitElementA(ElementA e) {
        As++;
    }

    @Override
    public void visitElementB(ElementB e) {
        Bs++;
    }

    public int getAs() {
        return As;
    }
    
    public int getBs() {
        return Bs;
    }
}
