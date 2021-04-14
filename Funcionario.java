/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Funcionarios;

/**
 *
 * @author carla
 */
public class Funcionario {
 private String nome;
 private String setor;
 private float salariobruto =1900;
 private String data_adimissao;
 private String data_demissao="";
 public float desconto;

 
public String getSituacao(){
    if (data_demissao.length()==0){
        
        return "Ativo";
       
    } else{ return "Demitido";
    }
}
public float calcularSalarioLiquido(){
if (salariobruto <= 1900 ) { 
    
}
    return salariobruto; 
    
    }
   
}