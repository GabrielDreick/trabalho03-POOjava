
package IndustriaTelefones;

/**
 *
 * @author Gabriel Dreick
 */
public class Telefone {
    private int codigo;
    private int num_serie;
    private String modelo;
    private float peso;
    private String dimensao;
    
    
    public Telefone(int codigo, int num_serie, String modelo, float peso, String dimensao){
        this.codigo = codigo;
        this.num_serie = num_serie;
        this.modelo = modelo;
        this.peso = peso;
        this.dimensao = dimensao;    
    }
    
    
    public void printall(){
        System.out.println(
                    "\n"+
                    "codigo: ---------- " + this.codigo +"\n"+
                    "Numero de serie: - " + this.num_serie +"\n"+
                    "Modelo: ---------- " + this.modelo +"\n"+
                    "Peso: ------------ Kg " + this.peso +"\n"+
                    "Dimensao: -------- cm " + this.dimensao + "\n"
                );
    }

 
            
}
