package br.inatel.estantedelidos.controller.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.inatel.estantedelidos.controller.database.ProdutoDAO;
import br.inatel.estantedelidos.model.Produto;

public class LivroList implements Actions {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		System.out.println("entrou no listLivro");
		ProdutoDAO produtoDAO = new ProdutoDAO();
		List<Produto> livros = null;
		try {
			livros = produtoDAO.buscarProduto("livro");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		HttpSession session = request.getSession();
		session.setAttribute("livros", livros);

		return "forward:livros.jsp";
	}

}
