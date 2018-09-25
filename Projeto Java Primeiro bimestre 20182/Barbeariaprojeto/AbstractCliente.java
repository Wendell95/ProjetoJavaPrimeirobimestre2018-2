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
public abstract class AbstractCliente {
    
    protected  String nomee;
    protected String sobrenomee;
    protected  String datanascimentoo;
     protected String enderecoo;
    protected String telefonee;
     protected int cpff;
   
    protected String emaill;
     

    public AbstractCliente(String nomee, String sobrenomee, String datanascimentoo, String enderecoo, String telefonee, int cpff, String emaill) {
       
        this.nomee = nomee;
        this.sobrenomee = sobrenomee;
        this.datanascimentoo = datanascimentoo;
        this.enderecoo = enderecoo;
        this.telefonee = telefonee;
        this.cpff = cpff;
        
        this.emaill=emaill;
       
    }

    

    public String getNome() {
        return nomee;
    }

    public void setNome(String nome) {
        this.nomee = nomee;
    }

    public String getSobrenome() {
        return sobrenomee;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenomee = sobrenomee;
    }

    public String getDatanascimento() {
        return datanascimentoo;
    }

    public void setDatanascimento(String Datanascimento){
        this.datanascimentoo=datanascimentoo;
    
    }

    public String getEndereco() {
        return enderecoo;
    }

    public void setEndereco(String endereco) {
        this.enderecoo = enderecoo;
    }

    public String getTelefone() {
        return telefonee;
    }

    public void setTelefone(String telefone) {
        this.telefonee = telefonee;
    }

    public int getCpf() {
        return cpff;
    }

    public void setCpf(int cpff) {
        this.cpff = cpff;
    }

   

    public String getEmail() {
        return emaill;
    }

    public void setEmail(String emaill) {
        this.emaill = emaill;
    }

    
}

