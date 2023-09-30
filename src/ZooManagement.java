import java.util.Scanner;
public class ZooManagement {
    static int nbrCages = 20;
    static String zoo = "my Zoo";

    public static void main(String args[]) {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("donner le nom de votre zoo ");
    	zoo=sc.nextLine();
       System.out.println(zoo+" contient "+nbrCages+" cages");
       Animal lion=new Animal("alex","Lion",5,true);
       Animal[] zooan = { lion };
       Zoo myZoo = new Zoo();
       myZoo.name="Zoo1";
       myZoo.city="tunisia";
       myZoo.animals=new Animal[25];
       Animal zebra=new Animal("zee","zebra",7,true);
       myZoo.addanimal(zebra);
       System.out.println("Animal :");
       System.out.println("Famille : " + lion.getFamily());
       System.out.println("Nom : " + lion.getName());
       System.out.println("Âge : " + lion.getAge());
       System.out.println("Est un mammifère : " + lion.isMammal());
       System.out.println("\nZoo :");
       System.out.println("Nom du zoo : " + myZoo.getName());
       System.out.println("Ville : " + myZoo.getCity());
       System.out.println("Nombre de cages : " + myZoo.getNbrCages());
       myZoo.displayanimals();
     }
}