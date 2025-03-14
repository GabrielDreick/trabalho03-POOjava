
package IndustriaTelefones;

/**
 *
 * @author Gabriel Dreick
 */
public class IndustriaTelefones {

    public static void main(String[] args) {
        Telefone tel = new Telefone(001, 001001, "tel0001", (float) 1.2, "20x26x7");
        TelefoneSemFio rad = new TelefoneSemFio(002, 002001, "rad0001", (float) 0.6, "18x7x6", "2000-3600", 5, 120);
           /*                                           ^^^
            *                                   n sei como inventar numero de serie   ...e depois de testar tem algo acontecendo
            *                                                                                   001001 tranforma em 513, e 002001 -> 1025... ta lendo como bits?
            *
            */                                         
    
    
        tel.printall();
        rad.printall();
    }
}
