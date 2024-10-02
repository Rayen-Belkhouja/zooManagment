public class Zoo {

    Animal [] animals;
 String name;
 String city;
static final int nbrCages =25;
int cp=0;
public Zoo() {}
    public Zoo(String name, String city) {
        animals = new Animal[nbrCages];
        this.name = name;
        this.city = city;

    }

    public void displayZoo(){
    System.out.println("Name: " + name + "\nCity: " + city + "\nNbr Cages: " + nbrCages);
    }

    @Override
    public String toString() {
    String ch1,ch2="";
    ch1="Name: " + name + "\nCity: " + city + "\nNbr Cages: " + nbrCages;
    for(int i=0;i<cp;i++){
        ch2+=animals[i].toString() + "\n";
    }
    return ch1+"\n"+ch2;
    }

    boolean addAnimal(Animal animal){
    if(searchAnimal(animal)==-1){

animals[cp]=animal;
cp++;
return true;
    }
return false;}


    int searchAnimal(Animal animal){
    int indice =-1;
    for(int i=0;i<cp;i++){
        if(animals[i].name==animal.name){
            indice=i;
        }
    }
    return  indice;
    }

    boolean removeAnimal(Animal animal){
    int indice = searchAnimal(animal);

    if(indice==-1){
        return false;

    }
    for(int i= indice;i< cp;i++){
        animals[i]=animals[i+1];
    }
    cp--;
    animals[cp]=null;
    return true;
    }

    boolean isZooFull(){
    if(nbrCages==cp){

        System.out.println("le zoo est plein!!");
        return true;
    }
    return false;
    }

    public static Zoo comparerZoo(Zoo z1, Zoo z2){
    if(z1.cp>z2.cp){
        return z1;
    }
    return z2;
    }
}
