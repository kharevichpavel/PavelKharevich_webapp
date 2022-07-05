package by.kharevich.app.controller.impl;

import java.io.IOException;

import by.kharevich.app.controller.Command;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class DoLogination implements Command {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String login;
		String password;
		
		login = request.getParameter("login");
		
		response.getWriter().print("do logination");
		
	}

}
