import java.util.ArrayList;
import Lib.*;


public class zoo {
    public static void main(String[] args) {
        String Special;
        String ToString = "";
        int count = 1;

        ArrayList<animal> zoo = new ArrayList<>();
        zoo.add(new Lion());
        zoo.add(new Eagle());
        zoo.add(new Dolphin());
        zoo.add(new Penguin());
        zoo.add(new Alpaca());

        System.out.println("\n"+zoo+"\n"); //แสดงในArrayเฉยๆ

        for (animal animal : zoo) {
            ToString += "["+animal.getName()+"],";
            Special = "-";

            System.out.println("("+count++ + ") -----------------------------");
            System.out.println("Name    : "+animal.getName());
            System.out.println("Sound   : "+animal.makeSound());
            if(animal instanceof Eagle){
                Eagle eagle1 = new Eagle();
                Special = eagle1.fly();
            }
            else if(animal instanceof Dolphin){
                Dolphin Dolphin1 = new Dolphin();
                Special = Dolphin1.swim();
            }
            else if(animal instanceof Penguin){
                Penguin penguin1 = new Penguin();
                Special = penguin1.swim();
            }
            else if(animal instanceof Alpaca){
                Alpaca Alpaca1 = new Alpaca();
                Special = Alpaca1.Spit();
            }
            System.out.println("Special : "+Special);
            
        }
        System.out.println("\n"+ToString);
    }
}
