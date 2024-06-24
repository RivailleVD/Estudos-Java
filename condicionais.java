public class condicionais {
    public static void main(String[] args){
        int nota = 30;
        int faltas = 5;
        int maxfaltas = 5;
        int media = 60;

        if ((nota >= media) && (faltas <= maxfaltas)){
            System.out.println("Aprovado"); 

        }else if(nota >= 40){
            System.out.println("Recuperação");

        }else{
            System.out.println("Reprovado!");

      
        }
        System.out.println("Fim do Programa");   	
    } 

}
/*"javac" para compilar o programa */
/*java "nome_do_arquivo_compilado" para a execusão */