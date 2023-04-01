public class Cat extends Pets{
    public Cat (String type, String race, int age, String vacuna){
        super(type,race,age,vacuna);
    }


    public String toString() {
        System.out.println("tipo:"+getType());
        System.out.println("raza:"+getRace());
        System.out.println("edad:"+getAge());
        System.out.println("vacuna:"+getVacuna());
        return "Cat{}";
    }
    public String sonido(){
        return "miau,miau";
    }
}
