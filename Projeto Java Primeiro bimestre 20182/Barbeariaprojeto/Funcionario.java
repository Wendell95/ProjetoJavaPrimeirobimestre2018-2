/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Barbeariaprojeto;

import javax.swing.JOptionPane;

/**
 *
 * @author PC
 */
public class Funcionario extends AbstractFuncionario implements MetodosFuncionario {
        
    public Funcionario(String nome, String sobrenome, double salario, String tipoCorte, String datanascimento, String endereco, String telefone, int cpf, String email) {
        super(nome, sobrenome, salario, tipoCorte, datanascimento, endereco, telefone, cpf, email);
    }
        
  

      
    

   

  

    
  
     
          
  
   
 

   
    
public String ImprimirDados(){
 
    return  
            "Nome:"+this.nome+
            "\n Sobrenome:"+this.sobrenome+
            "\n Salario:"+this.salario+
            "\n Tipo de corte:"+this.tipoCorte+
            "\n data de nascimento:"+this.datanascimento+
            "\n Endereco:"+this.endereco+
            "\n Telefone:"+this.telefone+
            "\n Cpf:"+this.cpf+
           
            "\n Email:"+this.email;
            



}

  public double CalcularSalario(){
      return salario *0.10;
  }
}