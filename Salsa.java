package decorator;

public class Salsa extends PizzaDecorator{
    private Ingredientes ingrediente;
            
    public Salsa(Ingredientes ingrediente) {
        super(ingrediente);
        this.ingrediente = ingrediente;
    }
    
    public String getDescripcion(){
        return ingrediente.getDescripcion()+" + Salsa";
    }
    
    public int getPrecio(){
        return ingrediente.getPrecio()+1000;
    }
}
