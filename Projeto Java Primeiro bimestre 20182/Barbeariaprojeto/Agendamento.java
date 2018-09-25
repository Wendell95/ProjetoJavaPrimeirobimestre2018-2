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
public class Agendamento implements MetodosCliente{
   protected String noome;
   protected String soobrenome;
    protected String tipooCorte;
    protected String dataa;

    public Agendamento(String noome, String soobrenome, String tipooCorte, String dataa) {
        this.noome = noome;
        this.soobrenome = soobrenome;
        this.tipooCorte = tipooCorte;
        this.dataa = dataa;
    }

   
        
    
            
   
   

    public String getTipoCorte() {
        return tipooCorte;
    }

    public void setTipoCorte(String tipoCorte) {
        this.tipooCorte = tipoCorte;
    }

    public String getData() {
        return dataa;
    }

    public void setData(String data) {
        this.dataa = dataa;
    }
public String ImprimirDados(){
 
    return  
            "\n Nome:"+this.getNome()+
            "\n Sobrenome:"+this.getSobrenome()+
            
            "\n Tipo de corte:"+this.tipooCorte+
            "\n data :"+this.dataa;
            
   
}

    public String getNome() {
        return noome;
    }

    public void setNome(String noome) {
        this.noome = noome;
    }

    public String getSobrenome() {
        return soobrenome;
    }

    public void setSobrenome(String soobrenome) {
        this.soobrenome = soobrenome;
    }
}