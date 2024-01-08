import java.util.Scanner;

public class App {

    public static void main(String[] args) {

      //print("pedindo o numero")

      System.out.println("Digite 2 números para dividir!");

      //input ("numero 1")
      System.out.println("Numero 1: ");
      Scanner scanner = new Scanner(System.in);
      float numero1 = scanner.nextFloat();
      
      //input("Numero 2")
      System.out.println("Numero 2: ");
      float numero2 = scanner.nextFloat();

      float divisão = (numero1 / numero2);

      if (numero2 == 0){
        System.out.println("Erro, o numero não pode ser dividido por Zero");4
        System.exit(1);
      }

      else {

        System.out.println("O resultado da divisão é" + divisão); 

      }
      
      

      
    
}

}
