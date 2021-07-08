import java.util.ArrayList;
import java.util.Scanner;
public class playerSelection{
    public static void main(String[] args) {
        //String scanner;
        int age;
        String letter;
        Scanner scanner= new Scanner(System.in);
        ArrayList<String>Players = new ArrayList<>();
        Players.add("Kusal Janith Perera");
        Players.add("Kusal Mendis");
        Players.add("Avishka Fernando");
        Players.add("Danushka Gunathilake");
        Players.add("Wanidu De Silva");
        Players.add("Dasun Shanaka");
        Players.add("Oshada Fernando");
        Players.add("Akila Dhananjaya");
        Players.add("Lakshan Sandakan");
        Players.add("Binura Fernando");
        Players.add("Dushmantha Chameera");
        Players.add("Dhananjaya DeSilva");
        Players.add("Asitha Fernando");
        Players.add("Shiran Fernando");
        Players.add("Niroshan Dickwella");
        Players.add("Chamika Karunarathne");



        System.out.println("Enter A to add a player");
        letter= scanner.nextLine();

        switch (letter){

            case "A":
                System.out.println("Enter player's name :  ");
                String Name=scanner.nextLine();
                System.out.println("Enter player age :  ");
                age =scanner.nextInt();
                System.out.println("Enter player type :  ");
                String type= scanner.nextLine();
                Players.add(Name);
            case "v":
                for(int i=0; i<15; i++) {
                    Players.get(i);
                }
            case "B":

        }


}}
