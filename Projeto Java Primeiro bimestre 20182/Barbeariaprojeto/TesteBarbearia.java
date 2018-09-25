/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Barbeariaprojeto;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author PC
 */
public class TesteBarbearia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Arrays para guardar os dados
        ArrayList<Funcionario> f = new ArrayList<Funcionario>();
        ArrayList<Cliente> c = new ArrayList<Cliente>();
        ArrayList<Agendamento> a = new ArrayList<Agendamento>();
        //Declarar a variável de escolha
        String op;
        //variavel em que o usuário vai escolher as opções do programa
        Boolean O = true;
       //Percorrer opções em que o programa vai fazer 
        while(O){
            //Escolher as opções desejadas
            op=JOptionPane.showInputDialog(null,"1. Cadastrar e consultar Funcionario\n"
                    +"2. Cadastrar e consultar Cliente\n"
            +"3.Alterar Funcionario\n"
                    +"4.Alterer Cliente\n"
                    
            +"5. Remover Funcionario\n" 
                    +"6.Remover cliente\n"
            +"7.Efetuar e consultar Agendamento\n"
                    +"8 Alterar Agendamento\n"
            +"9. Excluir Agendamento\n"
            +"10. Sair");
            //Variável para mostrar os dados na lista após cadastrado
            String mostrar_dados_cadastrados="";
            
            
            
            
            //Escolher as opções abaixo
            switch(op){
                
                //Cadastrar o funcionario
                case "1": 
               
                    
            //Cadastrar os dados do funcionario
                    
                        String nome= JOptionPane.showInputDialog(null, "Digite o nome do funcionario");
                        String sobrenome= JOptionPane.showInputDialog(null, "Digite o sobrenome do funcionario");
                        double salario= Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o salario do funcionario"));
                        String tipocorte = JOptionPane.showInputDialog(null, "Digite o tipo de corte que o funcionario trabalha");
                        String datanascimento= JOptionPane.showInputDialog(null, "Digite a data de nascimento do funcionario");
                        String telefone= JOptionPane.showInputDialog(null, "Digite o contato do funcionario");
                        String endereco= JOptionPane.showInputDialog(null, "Digite o endereço que o funcionario mora");
                        int cpf= Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o cpf do funcionario"));
                        String email= JOptionPane.showInputDialog(null, "Digite o email do funcionario");
                      
                      //Metodo construtor
                        f.add(new Funcionario(nome, sobrenome, salario, tipocorte, datanascimento, endereco, telefone, cpf, email)); 
                      //Laço para guardar na lista cada dado do funcionario
                        for(int aa=0; aa< f.size(); aa++){
                        
                            mostrar_dados_cadastrados+= (aa+1)+""+"Name: "+f.get(aa).nome
                                +"\n"+"Sobrenome:"+f.get(aa).sobrenome
                                +"\n "+"Salario:"+f.get(aa).salario
                                +"\n"+"Tipo de corte:"+f.get(aa).tipoCorte
                                +"\n"+"Data de nascimento:"+f.get(aa).datanascimento
                                +"\n "+"Telefone:"+f.get(aa).telefone
                                +"\n "+"Endereço:"+f.get(aa).endereco
                                +"\n "+"CPF:"+f.get(aa).cpf
                                +"\n "+"Email:"+f.get(aa).email+"\n\n";
                    }
                    //Laço que vai imprimir na tela os dados
                        for (int aa=0; aa<f.size();aa++){
                            JOptionPane.showMessageDialog(null,"Mostrar dados do funcionario:"+f.get(aa).ImprimirDados()
                             +"\n"+"Salario do Funcionario:"+f.get(aa).CalcularSalario());
                    }  
                        
                        
                        
                        
                        
                break; //Sair do loop
                        
                        
         ////Cadastrar o cliente           
                case "2":
                    
                    //Digitar os dados do cliente
                     String nomee= JOptionPane.showInputDialog(null, "Digite o nome do cliente");
                     String sobrenomee= JOptionPane.showInputDialog(null, "Digite o sobrenome do cliente");
                    
                     String datanascimentoo= JOptionPane.showInputDialog(null, "Digite a data de nascimento do cliente");
                     String telefonee= JOptionPane.showInputDialog(null, "Digite o telefone do cliente");
                     String enderecoo= JOptionPane.showInputDialog(null, "Digite o endereco do cliente");
                     int cpff= Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o cpf do cliente"));
                     String emaill= JOptionPane.showInputDialog(null, "Digite o email do cliente");
                      //Metodo construtor do cliente
                       c.add(new Cliente(nomee, sobrenomee, datanascimentoo, telefonee, enderecoo, cpff, emaill));
                       //Laço para Guardar no sistema os dados digitados
                      for(int aa=0; aa< c.size(); aa++){
                     
                      mostrar_dados_cadastrados+= (aa+1)+""+"Nome: "+c.get(aa).nomee
                                +"\n"+"Sobrenome:"+c.get(aa).sobrenomee
                               
                               
                                +"\n"+"Data de nascimento:"+c.get(aa).datanascimentoo
                                +"\n "+"Telefone:"+c.get(aa).telefonee
                                +"\n "+"Endereço:"+c.get(aa).enderecoo
                                +"\n "+"CPF:"+c.get(aa).cpff
                                +"\n "+"Email:"+c.get(aa).emaill+"\n\n";
                      }
                      //Laço para imprimir os dados do cliente
                     for (int aa=0; aa<c.size();aa++){
                            JOptionPane.showMessageDialog(null,"Mostrar dados do cliente:"+c.get(aa).ImprimirDados());
                     }
                     
                break;//Sair do loop
                    
                    //Alterar funcionario
                case "3":
                    //Digitar os novos dados
                      String  alterar_funcionario = JOptionPane.showInputDialog("Alterar o funcionario");
                      String novo_nome= JOptionPane.showInputDialog(null, "Digite o nome do funcionario");
                      String novo_sobrenome= JOptionPane.showInputDialog(null, "Digite o sobrenome do funcionario");
                      double novo_salario= Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o salario do funcionario"));
                      String novo_tipocorte = JOptionPane.showInputDialog(null, "Digite o tipo de corte que o funcionario trabalha");
                      String nova_datanascimento= JOptionPane.showInputDialog(null, "Digite a data de nascimento do funcionario");
                      String novo_telefone= JOptionPane.showInputDialog(null, "Digite o contato do funcionario");
                      String novo_endereco= JOptionPane.showInputDialog(null, "Digite o endereço que o funcionario mora");
                      int novo_cpf= Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o cpf do funcionario"));
                      String novo_email= JOptionPane.showInputDialog(null, "Digite o email do funcionario");
                 //Laço para fazer as alteracoes na sequencia
                 for(int aa=0; aa<f.size(); aa++)
                  {
                   if(f.get(aa).getNome().equals(alterar_funcionario))
                    {
                     f.get(aa).setNome(novo_nome);
                     
                     f.get(aa).setSobrenome(novo_sobrenome);
                     f.get(aa).setSalario(novo_salario);
                     f.get(aa).setTipoCorte(novo_tipocorte);
                     f.get(aa).setDatanascimento(nova_datanascimento);
                     
                     f.get(aa).setTelefone(novo_telefone);
                     
                     f.get(aa).setEndereco(novo_endereco);
                     f.get(aa).setCpf(novo_cpf);
                     f.get(aa).setEmail(novo_email);
                     //Atualizar os novos dados alterados
                     mostrar_dados_cadastrados +=  (aa+1)+""+"Nome: "+f.get(aa).nome
                                +"\n"+"Sobrenome:"+f.get(aa).sobrenome
                                +"\n "+"Tipo de corte:"+f.get(aa).tipoCorte
                                +"\n"+"Salario:"+f.get(aa).salario
                             
                                +"\n"+"Data de nascimento:"+f.get(aa).datanascimento
                                 +"\n"+"Telefone:"+f.get(aa).telefone
                                 +"\n "+"Endereco:"+f.get(aa).endereco
                                 +"\n"+"CPF:"+f.get(aa).cpf
                                 +"\n"+"Email:"+f.get(aa).email+"\n\n";
                               
                    }
                    //Mostrar a tabela atualizada
                          for (int aaa=0; aaa<f.size();aaa++){
                            JOptionPane.showMessageDialog(null,"Mostrar dados do funcionario:"+f.get(aaa).ImprimirDados()
                                        +"\n"+"Salario do Funcionario:"+f.get(aaa).CalcularSalario());
                    }  }
                        
                        
                        
                break;//Sair do loop
                
                     //Alterar cliente   
                case "4":
                    //Digitar os novos dados
                     String  alterar_cliente = JOptionPane.showInputDialog("Alterar o cliente");
                          
                     String novo_nomee= JOptionPane.showInputDialog(null, "Digite o seu nome:");
                     String novo_sobrenomee= JOptionPane.showInputDialog(null, "Digite o seu sobrenome:");
                    
                     String nova_dataanascimento= JOptionPane.showInputDialog(null, "Digite a data de nascimento:");
                      
                     String novo_telefonee= JOptionPane.showInputDialog(null, "Digite o telefone");
                 
                     String novo_enderecoo= JOptionPane.showInputDialog(null, "Digite o endereço:");
                     int novo_cpff= Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o cpf:"));
                     String novo_emaill= JOptionPane.showInputDialog(null, "Digite o email");
                      //Laço para fazer as alterações
                 for(int aa=0; aa<c.size(); aa++)
                  {
                   if(c.get(aa).getNome().equals(alterar_cliente))
                    {
                     c.get(aa).setNome(novo_nomee);
                     
                     c.get(aa).setSobrenome(novo_sobrenomee);
                     c.get(aa).setDatanascimento(nova_dataanascimento);
                     
                     c.get(aa).setTelefone(novo_telefonee);
                     
                     c.get(aa).setEndereco(novo_enderecoo);
                     c.get(aa).setCpf(novo_cpff);
                     c.get(aa).setEmail(novo_emaill);
                     //Atualizar os novos dados digitados
                     mostrar_dados_cadastrados +=  (aa+1)+""+"Nome: "+c.get(aa).nomee
                                +"\n"+"Sobrenome:"+c.get(aa).sobrenomee
                                +"\n "+"Telefone:"+c.get(aa).telefonee
                               
                                +"\n"+"Data de nascimnento:"+c.get(aa).datanascimentoo+"\n\n";
                    }
                    //Mostrar a tabela atualizada
                          for (int aaa=0; aaa<c.size();aaa++){
                             JOptionPane.showMessageDialog(null,"Mostrar dados do cliente:"+c.get(aaa).ImprimirDados());
             
                    }  }
                        
                        
                        
                break;//Sair do loop
                        
                    
                    
                    ////Excluir o funcionario cadastrado     
                                     
                                 
                                       
                case "5":
                    
                    //Digitar o nome do funcionario cadastrado
                    String excluir_funcionario=JOptionPane.showInputDialog("Delete o funcionario cadastrado");
                    //Ulitizar o laço para remover os dados do registro
                   for(int aa=0; aa<f.size(); aa++)
                    {  //Remover os dados do registro
                       if(f.get(aa).nome.equals(excluir_funcionario))
                        f.remove(aa);
                        
                    } //Utlizar o laço para atualizar os registros apos excluidos
                     for( int aa = 0 ; aa  < f.size(); aa++)
                   {
                     mostrar_dados_cadastrados +=  (aa+1)+""+"Nome: "+f.get(aa).nome
                                +"\n"+"Sobrenome:"+f.get(aa).sobrenome
                               +"\n "+"Salario:"+f.get(aa).salario
                               +"\n"+"Tipo de corte:"+f.get(aa).tipoCorte
                                +"\n"+"Data de nascimento:"+f.get(aa).datanascimento
                               +"\n "+"Telefone:"+f.get(aa).telefone
                               +"\n "+"Endereço:"+f.get(aa).endereco
                                +"\n "+"CPF:"+f.get(aa).cpf
                                +"\n "+"Email:"+f.get(aa).email+"\n\n"; 
                   } //Mostrar a tabela atualizada
                   
                     for (int aa=0; aa<f.size();aa++){
                            JOptionPane.showMessageDialog(null,"Mostrar dados do funcionario:"+f.get(aa).ImprimirDados()
                            +"\n"+"Salario do Funcionario:"+f.get(aa).CalcularSalario());
                    }  
                
        
                ///Excluir o cliente cadastrado
                case "6":
                     //Digitar o nome do cliente cadastrado
                     String excluir_cliente=JOptionPane.showInputDialog("Delete o cliente cadastrado");
                    //Utilizar o laço para remover os dados do registro
                    for(int aa=0; aa<c.size(); aa++)
                    {   // Remover os dados do registro
                        if(c.get(aa).nomee.equals(excluir_cliente))
                        c.remove(aa);
                        
                    }//Utlizar o laço para atualizar os registros apos os dados excluidos
                       for( int aa = 0 ; aa  < c.size(); aa++)
                   {
                     mostrar_dados_cadastrados +=  (aa+1)+""+"Nome: "+c.get(aa).nomee
                                +"\n"+"Sobrenome:"+c.get(aa).sobrenomee
                               
                               
                                +"\n"+"Data de nascimento:"+c.get(aa).datanascimentoo
                                +"\n "+"Telefone:"+c.get(aa).telefonee
                                +"\n "+"Endereço:"+c.get(aa).enderecoo
                                +"\n "+"CPF:"+c.get(aa).cpff
                                +"\n "+"Email:"+c.get(aa).emaill+"\n\n"; 
                   }//Mostrar a tabela atualizadda
                    JOptionPane.showMessageDialog(null, mostrar_dados_cadastrados);
                    
                    
                    
                break;//Sair do loop
                    
                    
                    ////Cadastrar o agendamento
                case "7":
                    //Digitar os dados
                    String noome= JOptionPane.showInputDialog(null, "Digite o seu nome:");
                    String soobrenome= JOptionPane.showInputDialog(null, "Digite o seu sobrenome:");
                    
                    String tipoocorte= JOptionPane.showInputDialog(null, "Digite o corte que você quer:");
                      
                    String dataa= JOptionPane.showInputDialog(null, "Digite a data que você quer o atendimento:");
                      
                    a.add(new Agendamento(noome, soobrenome, tipoocorte, dataa));
                      //Laço para guardar os dados digitados 
                       for(int aa=0; aa< a.size(); aa++){
                     
                        mostrar_dados_cadastrados+= (aa+1)+""+"N0me: "+a.get(aa).noome
                                +"\n"+"Sobrenome:"+a.get(aa).soobrenome
                                +"\n "+"Tipo de corte:"+a.get(aa).tipooCorte
                               
                                +"\n"+"Data:"+a.get(aa).dataa+"\n\n";
                               
                      }
                   //Laço que vai imprimir na tela os dados
                        for (int aa=0; aa<a.size();aa++){
                            JOptionPane.showMessageDialog(null,"Mostrar dados do agendamento:"+a.get(aa).ImprimirDados());
             
                    }  
                        
                        
                        
                        
                        
                break;//Sair do pool
                        
                       
                       
                       //Alterar o agendamento
                case "8":
                        //Digitar os novos dados
                          String  alterar_agendamento = JOptionPane.showInputDialog("Alterar o agendamento");
                          
                           String novo_noome= JOptionPane.showInputDialog(null, "Digite o seu nome:");
                           String novo_soobrenome= JOptionPane.showInputDialog(null, "Digite o seu sobrenome:");
                    
                           String novo_tipoocorte= JOptionPane.showInputDialog(null, "Digite o corte que você quer:");
                      
                           String nova_dataa= JOptionPane.showInputDialog(null, "Digite a data que você quer o atendimento:");
                 //Laço para atualizar os dados
                 for(int aa=0; aa<a.size(); aa++)
                  {//Alterar os dados
                   if(a.get(aa).getNome().equals(alterar_agendamento))
                    {
                     a.get(aa).setNome(novo_noome);
                     
                     a.get(aa).setSobrenome(novo_soobrenome);
                     
                     a.get(aa).setTipoCorte(novo_tipoocorte);
                     a.get(aa).setData(nova_dataa);
                     //Laço para guardar os dados digitados
                     mostrar_dados_cadastrados +=  (aa+1)+""+"Nome: "+a.get(aa).noome
                                +"\n"+"Sobrenome:"+a.get(aa).soobrenome
                                +"\n "+"Tipo de corte:"+a.get(aa).tipooCorte
                               
                                +"\n"+"Data:"+a.get(aa).dataa+"\n\n";
                    }
                    //Mostrar a tabela atualizada
                          for (int aaa=0; aaa<a.size();aaa++){
                            JOptionPane.showMessageDialog(null,"Mostrar dados do agendamento:"+a.get(aaa).ImprimirDados());
             
                    }  }
                        
                        
                     //Sair do loop   
                break;
                        
    
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
               //Excluir o agendamento feito
                case "9":
                          //Digitar o nume do cliente ja cadastrado
                          String excluir_agendamento=JOptionPane.showInputDialog("Delete o cliente cadastrado");
                                  
                    //Usar o laço pra remover os dados do registro
                    for(int aa=0; aa<a.size(); aa++)
                    {////REmover os nomes do registro
                        if(a.get(aa).noome.equals(excluir_agendamento))
                        a.remove(aa);
                        
                    }//usar o laco para atualizar o registro apos os dados excluidos
                       for( int aa = 0 ; aa  < a.size(); aa++)
                   {
                     mostrar_dados_cadastrados +=  (aa+1)+""+"Nome: "+a.get(aa).noome
                                +"\n"+"Sobrenome:"+a.get(aa).soobrenome
                                +"\n"+"Tipo Corte:"+a.get(aa).tipooCorte
                               
                                +"\n"+"Data:"+a.get(aa).dataa+"\n\n";
                                
                   }//Mostra a tabela atualizada
                    JOptionPane.showMessageDialog(null, mostrar_dados_cadastrados);
                    
                    
                    
                break; //Sair do loop
 
                          
                    
                //Opção para sair do programa
                case "10":
                   O=false;
                   
                break;  //Sair do loop
                            
                           
                    
                    
                    //Digitar opção inválida
                default:
                            
                  JOptionPane.showMessageDialog(null,"Opção não existente");
            }}}}