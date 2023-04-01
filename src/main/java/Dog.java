public class Dog extends Pets{
    public Dog(String type, String race, int age, String vacuna){
        super(type,race,age,vacuna);
    }

    public String toString() {
        System.out.println("tipo:"+getType());
        System.out.println("raza:"+getRace());
        System.out.println("edad:"+getAge());
        System.out.println("vacuna:"+getVacuna());
        return "Dog{}";
    }

    public String sonido (){
        return "juau,juau";
    }

}
