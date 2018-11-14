package fr.training.jap.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.training.jap.business.Person;
import fr.training.jap.service.IService;
import fr.training.jap.service.ServiceImpl;

/**
 * Servlet implementation class DeletePerson
 */
@WebServlet("/DeletePerson")
public class DeletePerson extends HttpServlet {
	private static final long serialVersionUID = 1L;
    IService service = new ServiceImpl();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeletePerson() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		int id = Integer.parseInt(request.getParameter("id"));
		Person p = service.getPerson(id);
		System.out.println("Servlet: " + p);
        service.deletePerson(p);
        request.getRequestDispatcher("/ListPerson").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
