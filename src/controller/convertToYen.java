package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.USD;

/**
 * Servlet implementation class convertToYen
 */
@WebServlet("/convertToYen")
public class convertToYen extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public convertToYen() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String userMoney = request.getParameter("userMoney");
		USD usd = new USD(Double.parseDouble(userMoney));
		usd.convertToYen();
		
		request.setAttribute("userYen", usd);
		getServletContext().getRequestDispatcher("/convert_yen_view.jsp").forward(request, response);
	}

}
