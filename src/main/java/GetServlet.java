import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import models.TaskModel;
import repo.TaskRepo;

public class GetServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("tasks", TaskRepo.getInstance().getModels());

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/GetDemo.jsp");
        requestDispatcher.forward(req, resp);
    }
}
