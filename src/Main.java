import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//Aletaração só pra commitar
        System.out.println("********************************");
        System.out.println("Welcome to the Password Generator");

        System.out.println("Password length:: ");
        Scanner sc = new Scanner(System.in);

        int passwordLenght = sc.nextInt();
        Random random = new Random();

        Password password = new Password(passwordLenght);

        System.out.println(password.generatePwd());


sc.close();
        }
    }
