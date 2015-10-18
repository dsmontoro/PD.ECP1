package visitor.figure;

public abstract class Figure implements Element{

    private String description;
    
    public Figure(String description) {
        this.description = description;
    }
    
    public String getDescription() {
        return description;
    }
    
    public abstract double area();
    public abstract double numberOfSides();

}
