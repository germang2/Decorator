package decorator;

public abstract class PizzaDecorator implements Ingredientes{
    
    private Ingredientes ingredientes;

    public PizzaDecorator(Ingredientes ingredientes) {
        this.ingredientes = ingredientes;
    }
    
    public Ingredientes getIngredientes(){
        return this.ingredientes;
    }
}
