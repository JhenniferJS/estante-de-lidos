package br.inatel.estantedelidos.controller.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.inatel.estantedelidos.controller.database.ProdutoDAO;
import br.inatel.estantedelidos.model.Produto;

public class MaterialList implements Actions{

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		ProdutoDAO produtoDAO = new ProdutoDAO();
		List<Produto> materiais = null;
		try {
			materiais = produtoDAO.buscarProduto("material");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		HttpSession session = request.getSession();
		session.setAttribute("materiais", materiais);

		return "forward:materiais.jsp";
	}

}
