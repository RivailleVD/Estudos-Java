import java.util.Scanner;

public class entrada {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int idade = 0, altura = 0;
        String nome = "";
        
        System.out.print("Digite seu Nome: ");
        nome = scan.nextLine();

        System.out.print("Digite sua idade: ");
        idade = scan.nextInt();

        System.out.print("Digite a sua Altura: ");
        altura =  scan.nextInt();

        System.out.printf("Seu nome é: %s\n" , nome);
        System.out.printf("Sua idade é: %d\n" , idade);
        System.out.printf("Sua Altura é %d\n" , altura);

        System.out.print("Fim do Programa");

    }
    
}
/*"javac" para compilar o programa */
/*java "nome_do_arquivo_compilado" para a execusão */