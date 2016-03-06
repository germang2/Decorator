package decorator;

public class Pizza implements Ingredientes{
    public String getDescripcion(){
        return "Queso + Mortadela";
    }
    
    public int getPrecio(){
        return 3000;
    }
}
