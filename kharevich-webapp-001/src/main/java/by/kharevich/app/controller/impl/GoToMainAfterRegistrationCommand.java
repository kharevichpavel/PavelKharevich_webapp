package by.kharevich.app.controller.impl;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;


import by.kharevich.app.controller.Command;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class GoToMainAfterRegistrationCommand implements Command {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String login;
		String password;
		login = request.getParameter("login");
		password = request.getParameter("password");
		String log = login+"="+password;
		
		File file = new File("C:/Users/shish/git/PavelKharevich_webapp/kharevich-webapp-001/src/main/resources/log.txt");		
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true)))  {		    
            writer.write(log+"\n");
            writer.close();
		    request.getRequestDispatcher("WEB-INF/jsp/main.jsp").forward(request, response);
		}catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }		
	}
}