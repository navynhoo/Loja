
import java.util.Scanner;

public class ClassePrincipal {
   
  public static void main(String [] args) {
       
    Carro fusca = new Carro();
       
       fusca.nome = "Fusca";
       fusca.marca = "Volkswagem";
       fusca.cor = "Azul";
       fusca.fabricacao = "1556";
       fusca.largura = "1,70 mm";
       fusca.peso = "1300Kg";
       
       System.out.println ("Nome: " + fusca.nome);
       System.out.println ("Marca: " + fusca.marca);
       System.out.println ("Cor: " + fusca.cor);
       System.out.println ("Fabricacao: " + fusca.fabricacao);
       System.out.println ("Largura: " + fusca.largura);
       System.out.println ("Peso: " + fusca.peso);
       
    Carro brasilia = new Carro ();
    
      brasilia.nome="Brasilia";
        brasilia.marca = "Volkswagen";
        brasilia.cor="Amarelo";
        brasilia.fabricacao="1973";
        brasilia.largura="1,40 mm";
        brasilia.peso="906kg";
        
        System.out.println("Nome:" + brasilia.nome) ;
        System.out.println("Marca:" + brasilia.marca) ;
        System.out.println("Cor:" + brasilia.cor) ;
        System.out.println("Fabricacao:" + brasilia.fabricacao) ;
        System.out.println("Largura:" + brasilia.largura) ;
        System.out.println("Peso:" + brasilia.peso) ;
                
    Carro carro01 = new Carro ();
    
    Scanner scan1 = new Scanner (System.in);
    
        System.out.print ("Nome: ");
        carro01.nome = scan1.next ();
                
        System.out.print ("Marca: ");
                carro01.marca = scan1.next ();
                
        System.out.print ("Cor: ");
        carro01.cor = scan1.next ();
                
        System.out.print ("Fabricacao: ");
        carro01.fabricacao = scan1.next ();
                
        System.out.print ("Largura: ");
        carro01.largura = scan1.next ();
                
        System.out.print ("Peso: ");
        carro01.peso = scan1.next ();
                
                
                
    
        

    }
  }  
