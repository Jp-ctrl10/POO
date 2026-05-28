package exercicio5;
import java.util.List;

public class TesteMainAnimal {
    public static void main(String[]args) {
List<Animal> animais= 

List.of(new Gato(), new Cachorro(), new Cabrito());

for(Animal animal : animais){
animal.emitirSom();
}

    }
}
