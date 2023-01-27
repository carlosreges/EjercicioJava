package Logica;

public class Squirtle extends Pokemon implements IAgua {

    public Squirtle() {
    }

    
    
    @Override
    protected void atacarPlacaje() {
        System.out.println("Hola, soy Squirtle y éste es mi ataque placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Hola, soy Squirtle y éste es mi ataque arañazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Hola, soy Squirtle y éste es mi ataque mordisco");
    }

    @Override
    public void atacarHidrobomba() {
        System.out.println("Hola, soy Squirtle y éste es mi ataque Hidrobomba");
    }

    @Override
    public void atacarBurbuja() {
        System.out.println("Hola, soy Bulbasaur y éste es mi ataque Burbuja");
    }

    @Override
    public void atacarPistolaAgua() {
        System.out.println("Hola, soy Bulbasaur y éste es mi ataque Pistola de Agua");
    }
    
}
