
import java.util.Scanner;

public class ClassePrincipal {
   
  public static void main(String [] args) {
       
    Carro carro = new Carro();
       
      Scanner scan1 = new Scanner (System.in);
    
        System.out.print ("Nome: ");
       carro.setNome(scan1.next());
                
        System.out.print ("Marca: ");
        carro.marca = scan1.next ();
                
        System.out.print ("Cor: ");
        carro.cor = scan1.next ();
                
        System.out.print ("Fabricacao: ");
        carro.fabricacao = scan1.next ();
                
        System.out.print ("Largura: ");
        carro.largura = scan1.next ();
                
        System.out.print ("Peso: ");
        carro.peso = scan1.next ();
    
       System.out.println ("Nome: " + carro.nome);
       System.out.println ("Marca: " + carro.marca);
       System.out.println ("Cor: " + carro.cor);
       System.out.println ("Fabricacao: " + carro.fabricacao);
       System.out.println ("Largura: " + carro.largura);
       System.out.println ("Peso: " + carro.peso);
       
    Carro brasilia = new Carro ();
        
    System.out.print ("Nome: ");
        brasilia.nome = scan1.next ();
                
        System.out.print ("Marca: ");
        brasilia.marca = scan1.next ();
                
        System.out.print ("Cor: ");
        brasilia.cor = scan1.next ();
                
        System.out.print ("Fabricacao: ");
        brasilia.fabricacao = scan1.next ();
                
        System.out.print ("Largura: ");
        brasilia.largura = scan1.next ();
                
        System.out.print ("Peso: ");
        brasilia.peso = scan1.next ();
    
        System.out.println("Nome:" + brasilia.nome) ;
        System.out.println("Marca:" + brasilia.marca) ;
        System.out.println("Cor:" + brasilia.cor) ;
        System.out.println("Fabricacao:" + brasilia.fabricacao) ;
        System.out.println("Largura:" + brasilia.largura) ;
        System.out.println("Peso:" + brasilia.peso) ;
                
    
        
                
                
                
    
        

    }
  }  
