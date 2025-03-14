package entrada01;

import java.util.Scanner;

/**
 *
 * @author Gabriel Dreick
 */
public class LerNumero {
    private int num_i;
    private float num_r;
        
    Scanner ler = new Scanner(System.in);
   
    public LerNumero(){
        System.out.println("Informe um numero Inteiro:");
        this.num_i = ler.nextInt();
        
        System.out.println("Informe um numero Real:");
        this.num_r = ler.nextFloat();
        
        System.out.println(
                "Valor do Primeiro: " + this.num_i + "\n" +
                "Valor de Ambos: " + this.num_i + ", " + this.num_r + "\n" +
                "Valor do Segundo: " + this.num_r + "\n" +
                "Valor do Primeiro(x3): " + (this.num_i * 3) + "\n" +
                "Valor do Segundo(x2): " + (this.num_r * 2)
        );
    }
}
