package br.inatel.estantedelidos.controller.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

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
    public boolean inserirProduto(Produto novoProduto) throws ClassNotFoundException{
    	
        //conectar ao banco de dados
        Connection con = AccessDataBase.connectToDb();
        //comando em SQL
        String sql;
        sql = "INSERT INTO Produto(nomeVendedor, telefone, nomeProduto, tipo, valor) values (?,?,?,?,?)";
        //comando recebe parametros - consulta dinamica
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, novoProduto.getNomeVendedor());
            pst.setString(2, novoProduto.getTelefone());
            pst.setString(3, novoProduto.getNomeProduto());
            pst.setString(4, novoProduto.getTipo());
            if (novoProduto.getValor() != 0) 
                pst.setFloat(5, novoProduto.getValor());
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
    
    public ArrayList<Produto> buscarProduto(String tipo) throws ClassNotFoundException {
        ArrayList<Produto> listaProduto = new ArrayList<>();
        Connection con = AccessDataBase.connectToDb();

        //COMANDO EM SQL
        String sql = "SELECT nomeVendedor, telefone, nomeProduto, valor FROM Produto WHERE tipo = ?";
        //O comando nao recebe parametros -> consulta estatica (st)

        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, tipo);
            rs = pst.executeQuery();
            while (rs.next()) {	
                Produto produto = new Produto(rs.getString("NomeVendedor"), rs.getString("Telefone"), rs.getString("NomeProduto"), tipo, rs.getFloat("Valor"));
                listaProduto.add(produto);
            }
        } catch (SQLException ex) {
            System.out.println("ERRO: " + ex.getMessage());
        } finally {
            try {
                //Encerra a conexao
                con.close();
            } catch (SQLException ex) {
                System.out.println("ERRO: " + ex.getMessage());
            }
        }
        return listaProduto;
    }
}

