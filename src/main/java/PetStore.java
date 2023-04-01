public class PetStore {
    public static void main(String[] args) {
        Cat gato = new Cat("gato","gato",3,"antirabia: si");
        gato.toString();
        System.out.println(gato.sonido());

        System.out.println("-----------------------------------------------------------");
        Dog perro = new Dog("perro","pit bull",4,"antirabia: si");

        perro.toString();
        System.out.println(perro.sonido());

    }
}
