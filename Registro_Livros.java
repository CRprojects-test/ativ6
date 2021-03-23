package registro_livros;
import java.util.Scanner;

public class Registro_Livros {

    public static void main(String[] args) {
        Livro livro = new Livro();
        Autor autor = new Autor();
        String nome;
        int idade;
        String cidade;
        String genero;
        String formacao;
        
        
        
       Scanner scanner = new Scanner(System.in);
       
       System.out.println("nome: ");
       nome = scanner.next();
       
       System.out.println("idade:");
       idade = scanner.nextInt();
       
       System.out.println("cidade:");
       cidade = scanner.next();
       
       System.out.println("genero:");
       genero = scanner.next();
       
       System.out.println("formação: especialista, mestre, doutor ou nada");
       formacao = scanner.next();
       
       autor.setNome(nome);
       autor.setIdade(idade);
       autor.setCidade (cidade);
       autor.setGenero(genero);
       autor.setFormacao(formacao);
        
    
      
      
    }
    
}




// ****** Carla Rodrigues de Oliveira 
// Rgm:123.319
// UnigranEad ********