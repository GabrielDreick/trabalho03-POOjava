
package matriculafuncionario;

import java.util.Scanner;
/**
 *
 * @author Gabriel Dreick
 */
public class Matricular {
    
    private int matricula;
    private String nome;
    private String dep1, dep2, dep3, dep4;
    
    
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
        
        print("Informes seus quatro dependentes. \n");
        print("Dependente 1: ");
        this.dep1 = lerStr();
        
        print("Dependente 2: ");
        this.dep2 = lerStr();
        
        print("Dependente 3: ");
        this.dep3 = lerStr();
        
        print("Dependente 4: ");
        this.dep4 = lerStr();
        
        
    };
    
    
    public void info(){
      print(
      "Matricula: " + this.matricula +"\n"+
      "Nome:      " + this.nome +"\n"+
      "Dependentes: \n" + (" "+this.dep1+" \n") + (" "+this.dep2+" \n") + (" "+this.dep3+" \n") + (" "+this.dep4+" \n"));
    };
}
