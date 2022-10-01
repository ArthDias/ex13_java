import java.util.Scanner;

public class App {
    public static void main(String[] args){

        Scanner console = new Scanner(System.in);

        /*Brincando com condicionais porém são exercícios de código sequencial, então não sei se posso usar '-'

        String homemOuMulher = "";
        */
        
        float altura = 0.0f;
        float pesoIdealHomens = 0.0f;
        float pesoIdealMulheres = 0.0f;

        /* Brincando com condicionais porém são exercícios de código sequencial, então não sei se posso usar '-'

        System.out.print("Você é homem? (Responda com sim ou nao) ");
        homemOuMulher = console.nextLine();
        */

        System.out.print("Informe sua altura (separe os metros dos centimetros através de vírgula): ");
        altura = console.nextFloat();

        pesoIdealHomens = (72.7f * altura) - 58;
        pesoIdealMulheres = (62.1f * altura) - 44.7f;

        System.out.println("Para um homem com sua altura o peso ideal seria: " + pesoIdealHomens + "kg");
        System.out.println("Para uma mulher com sua altura o peso ideal seria: " + pesoIdealMulheres + "kg");

        /* Brincando com condicionais porém são exercícios de código sequencial, então não sei se posso usar '-'

        if (homemOuMulher.equals("sim")) {

            System.out.print("Seu peso ideal é: " + pesoIdealHomens);

        } else if (homemOuMulher.equals("nao")) {

            System.out.print("Seu peso ideal é: " + pesoIdealMulheres);

        } else {
            System.out.print("Reinicie o programa e digite exatamente \"sim\" ou \"nao\".");
        }
        */
        console.close();
    }
}
