package br.inatel.estantedelidos.controller.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.xdevapi.Statement;

import br.inatel.estantedelidos.model.Produto;

public class ProdutoDAO {

	//objeto responsavel por preparar as consultas dinamicas
    PreparedStatement pst;
    //objeto responsavel por preparar as consultas estaticas
    Statement st;
    //objeto responsavel por referenciar a tabela resultante da busca
    ResultSet rs;

    boolean sucesso = false;
    

    //Inserir dados
    public boolean inserirUsuario(Produto novoProduto) {
    	
        //conectar ao banco de dados
        Connection con = AccessDataBase.connectToDb();
        //comando em SQL
        String sql;
        sql = "INSERT INTO Vendedor(nome, tipo, valor, vendedor_id) values (?,?,?,?)";
        //comando recebe parametros - consulta dinamica
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, novoProduto.getNome());
            pst.setString(2, novoProduto.getTipo());
            if (novoProduto.getValor() != 0) 
                pst.setFloat(3, novoProduto.getValor());
            pst.setInt(4, novoProduto.getVendedorId());
            pst.execute();
            sucesso = true;
        } catch (SQLException ex) {
            System.out.println("Erro: " + ex.getMessage());
        } finally {
            try {
                //Encerra a conexao
                con.close();
                pst.close();
            } catch (SQLException ex) {
                System.out.println("Erro: " + ex.getMessage());
            }
        }
        return sucesso;
    }
}

