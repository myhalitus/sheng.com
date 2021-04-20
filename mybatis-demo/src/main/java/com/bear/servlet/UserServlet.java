package com.bear.servlet;

import com.bear.pojo.User;
import com.bear.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


@WebServlet("/UserServlet")
public class UserServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    UserServiceImpl userServiceImpl = new UserServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String dos = req.getParameter("do");
        System.out.println(dos);

        if ("select".equals(dos)) {
            try {
                List<User> list = userServiceImpl.selectUserService();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if ("insert".equals(dos)) {
            try {
                userServiceImpl.insertUserService(new User(10, "zou", "0"));
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        } else if ("update".equals(dos)) {
            try {
                userServiceImpl.updateUserService(new User(10, "zou", "1"));
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        } else if ("delete".equals(dos)) {
            try {
                userServiceImpl.delUserService(10);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        // TODO Auto-generated method stub
        doGet(req, res);
    }

}
