public class TestePolimorfismo {
    public static void main(String[] args) {

    Animal[] pets = { new Cachorro(), new Gato() };
       for (Animal p: pets){
        p.emitirSom();
        p.respirar();
          
       }
    
    }
    
}
