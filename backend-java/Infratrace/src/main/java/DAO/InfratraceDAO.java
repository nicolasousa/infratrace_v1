package DAO;
import Model.Datacenter.Ativo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class InfratraceDAO{/*
    String sSql;
    Connection con;
    PreparedStatement pstmt;

    public void adicionarAtivo(Ativo a) {
        try {
            // 1° Abrir conexao
            // 2° Preparar a instrução SQL
            // 3° Setar parâmetros
            // 4° Executar a instrução SQL
            // 5° Fechar conexao
            sSql = "INSERT INTO ativo() VALUES(?, ?, ?, ?, ?)";
            con = Conexao.getConexao();
            pstmt = con.prepareStatement(sSql);
            pstmt.setString(1, a.getRa());
            pstmt.setString(2, a.getNome());
            pstmt.setString(3, a.getCelular());
            pstmt.setString(4, a.getEmail());
            pstmt.setInt(5, a.getSemestre());

            pstmt.executeUpdate();
            pstmt.close();
            con.close();
        }
        catch(SQLException erro){
            System.err.println("Erro ao gravar "
                    + "o aluno: " + erro);
        }

    }
    public Alunos consultaAlunoPorRA(String ra) {
        ResultSet rs;
        Alunos a = null;

        sSql = "SELECT alu_ra, alu_nome, alu_email, alu_celular "
                + "FROM aluno "
                + "WHERE alu_ra = ?";

        try {
            con = Conexao.getConexao();
            pstmt = con.prepareStatement(sSql);
            pstmt.setString(1, ra);

            rs = pstmt.executeQuery();

            if (rs.next()) {
                a = new Alunos();

                a.setRa(rs.getString("alu_ra"));
                a.setNome(rs.getString("alu_nome"));
                a.setEmail(rs.getString("alu_email"));
                a.setCelular(rs.getString("alu_celular"));
            }

            rs.close();
            pstmt.close();
            con.close();
        }
        catch (SQLException erro) {
            System.out.println("Erro ao consultar aluno - "
                    + erro.getMessage());
        }

        return a;
    }
*/
}

