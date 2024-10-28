import java.text.DecimalFormat;
import java.util.Random;

public class CalcularMediaDeNotas {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.##");
        Random randomico = new Random();

        double nota1 = randomico.nextDouble(20);
        double nota2 = randomico.nextDouble(20);
        double nota3 = randomico.nextDouble(30);
        double nota4 = randomico.nextDouble(30);

        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("                      EBAC");
        System.out.println(" ");
        System.out.println("         Desenvolvedor Full Stack Java v2");
        System.out.println("                  Backend Java");
        System.out.println(" ");
        System.out.println("                   Módulo 8");
        System.out.println("           Tarefa Cálculo de Média");
        System.out.println(" ");
        System.out.println("A média das notas " + df.format(nota1) + " "  + df.format(nota2) + " "  + df.format(nota3) + " e "  + df.format(nota4) + " é " + df.format(media));
    }

}