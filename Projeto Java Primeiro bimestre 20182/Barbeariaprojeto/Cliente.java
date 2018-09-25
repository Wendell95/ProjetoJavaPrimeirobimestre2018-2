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
public class Cliente extends AbstractCliente implements MetodosCliente{

    public Cliente(String nomee, String sobrenomee, String datanascimentoo, String enderecoo, String telefonee, int cpff, String emaill) {
        super(nomee, sobrenomee, datanascimentoo, enderecoo, telefonee, cpff, emaill);
    }
   

    
    
public String ImprimirDados(){
 
    return  
           
            "Nome:"+this.nomee+
            "\n Sobrenome:"+this.sobrenomee+
            "\n data de nascimento:"+this.datanascimentoo+
            "\n Endereco:"+this.enderecoo+
            "\n Telefone:"+this.telefonee+
            "\n Cpf:"+this.cpff+
            
            "\n Email:"+this.emaill;
            
}}

   
    
