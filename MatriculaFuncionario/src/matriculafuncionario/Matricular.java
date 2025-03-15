
package matriculafuncionario;

import java.util.Scanner;
/**
 *
 * @author Gabriel Dreick
 */
public class Matricular {
    
    private int matricula;
    private String nome;
    
    private Scanner ler = new Scanner(System.in);
    
    
    private void print(String txt){
        System.out.print(txt);
    };
    
    private int lerInt(){
        String n = this.ler.nextLine();
        int num = Integer.parseInt(n);     
        return num;
    };
    
    private String lerStr(){
        return this.ler.nextLine();
    };
    
    
    // Construtor
    public Matricular(){
        print("Matricula do funcionario: \n>");
        this.matricula = lerInt();
        
        print("Name do Funcionario: \n>");
        this.nome = lerStr();
    };
    
    
    public void info(){
      print(
      "Matricula: " + this.matricula +"\n"+
      "Nome:      " + this.nome +"\n");  
    };
}
