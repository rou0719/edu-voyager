package servlet;

import java.io.IOException;
import java.util.Enumeration;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ParamListServlet
 */
@WebServlet("/ParamListServlet")
public class ParamListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ParamListServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		request.setCharacterEncoding("UTF-8");
		
		response.setContentType("text; charset=UTF-8");
		PrintWriter out = response.getWriter();
				
		Enumeration names = request.getParameterNames();
		
		while(names.hasMoreElements()){
			String name = (String) names.nextElement();
			String[] values = (String[]) request.getParameterValues(name);
			for (int i = 0; i < values.length; i++) {
				out.println(name + " = " + values[i]);
				out.println("\n");
			}
		}
	}
}
