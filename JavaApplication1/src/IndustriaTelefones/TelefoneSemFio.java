
package IndustriaTelefones;

/**
 *
 * @author Gabriel Dreick
 */
public class TelefoneSemFio extends Telefone {
    private float frequencia;
    private int qtde_canais;
    private int distancia_operacao;
    
    
    // METODO CONSTRUTOR
    public TelefoneSemFio(
            int codigo, int num_serie, String modelo, float peso,
            String dimensao, float frequencia, int qtde_canais, int distancia_operacao) {
        super(codigo, num_serie, modelo, peso, dimensao);
    }
}
