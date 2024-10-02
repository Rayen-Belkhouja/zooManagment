public class ZooManagement {

    public static void main(String[] args) {


        Animal lion = new Animal();

        Zoo myzoo = new Zoo();

        lion.name="Symba";
        lion.age=2;
        lion.family="lionFamily";
        lion.isMammal=true;


        myzoo.name="Friguia";
        //myzoo.nbrCages=20;
        myzoo.city="Tunis";

        Animal chien = new Animal("DogFamily","bobi",2,true);
        Animal chat = new Animal("CatFamily","mimi",1,true);
        Animal mouse = new Animal("MouseFamily","sousou",1,true);
        Animal chien2 = new Animal("DogFamily","bobi",2,true);
        Zoo z1 = new Zoo("cityzoo","tunis");
        Zoo z2 = new Zoo("Friguia","ariana");

        z1.displayZoo();

        System.out.println("*********************");

       // System.out.println(z1);
        //System.out.println(z1.toString());

        System.out.println(chat);
        System.out.println(chien);

        System.out.println("**********-----***********");

        z1.addAnimal(chat);
        z1.addAnimal(chien);
        System.out.println(z1);

        System.out.println(z1.searchAnimal(chien2));
        System.out.println(z1.searchAnimal(mouse));

        System.out.println(Zoo.comparerZoo(z1,z2));

    }
}
