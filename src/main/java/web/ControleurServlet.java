package web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import phone.Iphone;
import phone.PhoneImpl;
import phone.Smartphone;

@WebServlet(name = "cs", urlPatterns = { "/controller" })

public class ControleurServlet extends HttpServlet{
	private Iphone phone;

    public void init() throws ServletException {
        phone = new PhoneImpl();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String mc = request.getParameter("motCle");
        PhoneModel mod = new PhoneModel();
        mod.setMotCle(mc);
        List<Smartphone> prods = phone.getProduitsParMotCle(mc);
        mod.setPhones(prods);
        request.setAttribute("modele", mod);
        request.getRequestDispatcher("PhonesView.jsp").forward(request, response);
    }
}
