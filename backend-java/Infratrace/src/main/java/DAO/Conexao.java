package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexao {

    public static Connection getConexao() {

        Connection conexao = null;
        String usuario = "root";
        String senha   = "root";
        String caminho = "jdbc:mysql://127.0.0.1:3306";
        try{
            conexao = DriverManager.getConnection(caminho,
                    usuario,
                    senha);
            System.out.println("Conexao efetuada com sucesso !!!");
        }
        catch ( SQLException erro) {
            System.err.println("Erro em efetuar conexão com o "
                    + "banco de dados: " + erro);
        }
        return conexao;
    }
}

