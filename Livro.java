package registro_livros;
import java.util.Scanner;

public class Livro {
 
   private String nome;
   private Autor autor;
   private String editora;
   private String cidade;
   private int ano;      
   private int edicao;
    
    public String getNome(){
        return nome;
    } 
    
    public void setNome(String nome){
        this.nome = nome;
        
               
    }
            
  Autor getAutor() {            
      return autor;      
                   
     
    }
    
   private void  setAutor(Autor autor){
       this.autor = autor;
   }
   public String getEditora(){
       return editora;
      
   }
   
   public void setEditora(String editora){
       this.editora = editora;
   } 
   
   
    public String getCidade(){
     return cidade;
   }
   
    public void setCidade(String cidade){ 
        this.cidade = cidade;
   }
  
     public int getAno(){
         return ano;
     }
   
    public void setAno(int ano){
        this.ano = ano;
    }

   
    public int getEdicao(){
        return edicao;
    }
  
    public void setEdicao(int edicao){
        this.edicao = edicao;
    }

  
}