public class Gato  extends Animal {
    // sobrescrevendo (@override) o método emitirSom da classe pai Animal
    @Override
    protected void emitirSom() {
        System.out.println("Miau! Miau! Miau!");

    }

}
