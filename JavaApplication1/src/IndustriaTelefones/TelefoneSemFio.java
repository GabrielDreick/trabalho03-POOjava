
package IndustriaTelefones;

/**
 *
 * @author Gabriel Dreick
 */
public class TelefoneSemFio extends Telefone {
    private String frequencia; //provavelmente quer dizer alcance: 1000 ate 6000, e n a frequencia atual
    private int qtde_canais;
    private int distancia_operacao;
    
    
    // METODO CONSTRUTOR
    public TelefoneSemFio(
            int codigo, int num_serie, String modelo, float peso,
            String dimensao, String frequencia, int qtde_canais, int distancia_operacao) {
        super(codigo, num_serie, modelo, peso, dimensao);
        
        this.frequencia = frequencia;
        this.qtde_canais = qtde_canais;
        this.distancia_operacao = distancia_operacao;
    }
    
    @Override
    public void printall(){
        super.printall();
        System.out.println(
                "Frequencia: ------------ Hz" + this.frequencia +"\n"+
                "Quantidade de Canais: -- " + this.qtde_canais +"\n"+
                "Distancia de Operacao: - " + this.distancia_operacao +"M"
        );
    }
}
