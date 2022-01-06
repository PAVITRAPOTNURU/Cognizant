

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Enity.Scores;
import Util.DBUtil;
import dao.ScoresDAO;

/**
 * Servlet implementation class GetScoreCard
 */
@WebServlet(name="/getScores")
public class GetScoreCard extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public GetScoreCard() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ScoresDAO sdao=new ScoresDAO();
		PrintWriter pw=response.getWriter();
		List<Scores> l1=sdao.displayScores();
		pw.println("<table width=200 height=200 border=1>");
		for(Scores s:l1) {
			pw.println("<tr><td>"+s.getPlayerName()+"</td><td>"+s.getRunsScored()+"</td><td>"+s.getRunsScored()+"</td></tr>");
			
		}
		pw.println("</table>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
