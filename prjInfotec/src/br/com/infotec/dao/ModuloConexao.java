package br.com.infotec.dao;

import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.DriverManager;


public class ModuloConexao {

    //Metodo responsavel por estabelecer a conexao com o banco.
    public Connection conectorBD() {

        Connection conexao ;

        try {
            // A linha abaixo chama o drive de conexão.
            String driver = "com.mysql.cj.jdbc.Driver";
            // Armazenandoinformações referente ao banco de dados.
            String url = "jdbc:mysql://localhost:3306/dbinfo";
            String user = "root";
            String senha = "s1st3m4s";
            //Estabelecendo a conexao com o banco.

            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, senha);
            return conexao;

        } catch (Exception e) {
            JOptionPane.showInternalMessageDialog(null, "ModuloConexao: " + e);
        }

        return null;

    }
}
