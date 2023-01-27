package Logica;

public class Pikachu extends Pokemon implements IElectrico {

    public Pikachu() {
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Hola, soy Pikachu y éste es mi ataque placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Hola, soy Pikachu y éste es mi ataque arañazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Hola, soy Pikachu y éste es mi ataque mordisco");
    }

    @Override
    public void atacarImpactrueno() {
        System.out.println("Hola, soy Pikachu y éste es mi ataque Impactrueno");
    }

    @Override
    public void atacarPuniotrueno() {
        System.out.println("Hola, soy Bulbasaur y éste es mi ataque Puño Trueno");
    }
    
}
