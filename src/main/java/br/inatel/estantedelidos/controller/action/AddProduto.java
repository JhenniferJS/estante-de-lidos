package br.inatel.estantedelidos.controller.action;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.inatel.estantedelidos.controller.database.ProdutoDAO;
import br.inatel.estantedelidos.model.Produto;

public class AddProduto implements Actions {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		System.out.println("Entrando no action");
		
		String nomeProduto = request.getParameter("produto-nome");
		String tipoProduto = request.getParameter("produto-tipo");
		String valor = request.getParameter("produto-valor");
		float valorProduto = 0f;
		if(!valor.isEmpty()) {
			valorProduto = Float.parseFloat(valor);
		}
		String nomeVendedor = request.getParameter("vendedor-nome");
		String telefone = request.getParameter("telefone");
		String gratis = request.getParameter("produto-gratis");
		boolean isGratis = false;
		if(gratis != null) {
			isGratis = true;
		}
		
		Produto produto = new Produto(nomeVendedor, telefone, nomeProduto, tipoProduto, valorProduto, isGratis);
		ProdutoDAO produtoDAO = new ProdutoDAO();
		try {
			produtoDAO.inserirProduto(produto);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		System.out.println("Nome produto: " + nomeProduto);
		System.out.println("Nome vendedor: " + nomeVendedor);
		System.out.println("Telefone: " + telefone);
		System.out.println("Valor: " + valorProduto);
		System.out.println("Tipo: " + tipoProduto);
		
		return "redirect:main?action=Index";
	}
}
