package kr.or.ddit;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Test extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=utf-8");
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = new Date();
		String today = sdf.format(date);
		
		PrintWriter pw = resp.getWriter();
		pw.write("<html>");
		pw.write("	<body>");
		pw.write("<h1>hello, today: "+today+"</h1>");
		pw.write("	</body>");
		pw.write("</html>");
	}
	
}
