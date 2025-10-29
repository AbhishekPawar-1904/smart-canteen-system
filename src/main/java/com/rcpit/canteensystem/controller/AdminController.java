package com.rcpit.canteensystem.controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.rcpit.canteensystem.dao.UserDao;

@Controller
public class AdminController {

    @Autowired
    private UserDao userDao;

    // --- Admin Login ---
    @RequestMapping("/adminLogin")
    public String adminLoginPage() {
        return "adminlogin"; // Returns adminlogin.jsp
    }

    @RequestMapping(path="/submitadminlogin", method=RequestMethod.POST)
    public String submitAdminLogin(HttpServletRequest request, Model m) {
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        // Simple validation (in a real app, you would check the database)
        if ("admin@rcpit.ac.in".equals(email) && "admin123".equals(password)) {
            return "admindashboard"; // Returns admindashboard.jsp
        } else {
            m.addAttribute("error", "Invalid credentials, please try again.");
            return "adminlogin";
        }
    }

    // --- Admin Dashboard ---
    @RequestMapping("/admindashboard")
    public String showAdminDashboard() {
        return "admindashboard";
    }
}