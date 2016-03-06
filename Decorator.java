package decorator;

public class Decorator {

    public static void main(String[] args) {
        Ingredientes pizza = new Pizza();
        System.out.println(pizza.getDescripcion()+"\n"+pizza.getPrecio());
        pizza = new Piña(pizza);
        System.out.println(pizza.getDescripcion()+"\n"+pizza.getPrecio());
        pizza = new Champiñones(pizza);
        System.out.println(pizza.getDescripcion()+"\n"+pizza.getPrecio());
        pizza = new Salsa(pizza);
        System.out.println(pizza.getDescripcion()+"\n"+pizza.getPrecio());
    }    
}
