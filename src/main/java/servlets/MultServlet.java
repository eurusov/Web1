package servlets;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MultServlet extends HttpServlet {

    public void doGet(HttpServletRequest request,
                      HttpServletResponse response) throws IOException {

        String value = request.getParameter("value");

        response.setContentType("text/plain");

//        if (value == null || value.isEmpty()) {
//            response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
//            response.getWriter().println(0);
//        } else {
        try {
            long val = Long.parseLong(value);
            response.setStatus(HttpServletResponse.SC_OK);
            response.getWriter().println(val * 2);
        } catch (NumberFormatException e) {
            response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
            response.getWriter().println(0);
        }
//        }
    }
}
