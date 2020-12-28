package com.client;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;

import com.ecommerce.HibernateUtil;
import com.entity.EProduct;

@WebServlet("/ListProducts")
public class ListProducts extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ListProducts() {

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			Session session = HibernateUtil.getSession();
			List<EProduct> list = session.createQuery("from EProduct").list();
			session.close();
			PrintWriter out = response.getWriter();
			out.println("<html><body>");
			out.println("<b>Product Listing</b><br>");
			for (EProduct p : list) {
				out.println("ID: " + String.valueOf(p.getID()) + ", Name: " + p.getName() + ", Price: "
						+ String.valueOf(p.getPrice()) + ", Date Added: " + p.getDateAdded().toString() + "<br>");
			}

			out.println("</body></html>");

		} catch (Exception ex) {
			throw ex;
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
