package decorator;

public class Piña extends PizzaDecorator{
    
    private Ingredientes ingrediente;
            
    public Piña(Ingredientes ingrediente) {
        super(ingrediente);
        this.ingrediente = ingrediente;
    }
    
    
    public String getDescripcion(){
        return ingrediente.getDescripcion()+" + Piña";
    }
    
    public int getPrecio(){
        return ingrediente.getPrecio()+500;
    }
}
