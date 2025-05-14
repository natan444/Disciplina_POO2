/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aulas.rede;

import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author aluno
 */
public class Servidor {
    public static void main(String[] args) throws Exception{
        String ip= "10.105.15.245";
        int porta= 12345;
        InetAddress endereco= InetAddress.getByName(ip);
        
        ServerSocket servidor = new ServerSocket();
        
        System.out.println("Servidor inicializado:" + servidor);
        System.out.println("Esperando por conexão");
        
        Socket conexao= servidor.accept();
        System.out.println("COnexão realizada" + conexao);
        
        ObjectOutputStream output;
        output= new ObjectOutputStream(conexao.getOutputStream());
        output.flush();
        
        ObjectInputStream input;
        input= new ObjectInputStream(conexao.getInputStream());
        
        String mensagem;
        
        mensagem= "Olá Cliente";
        output.writeObject(mensagem);
        output.flush();
        System.out.println("Mensagem enviada"+ mensagem);
        
        mensagem= (String)input.readObject();
        System.out.println("Mensagem recebida"+ mensagem);
        
        
        
        
        
        
    }
}
