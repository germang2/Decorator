package decorator;

public class Champiñones extends PizzaDecorator {
    private Ingredientes ingrediente;
            
    public Champiñones(Ingredientes ingrediente) {
        super(ingrediente);
        this.ingrediente = ingrediente;
    }
    
    
    public String getDescripcion(){
        return ingrediente.getDescripcion()+" + Champiñones";
    }
    
    public int getPrecio(){
        return ingrediente.getPrecio()+1000;
    }
}
