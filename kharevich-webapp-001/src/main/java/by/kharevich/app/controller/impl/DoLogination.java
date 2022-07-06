package by.kharevich.app.controller.impl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;


import by.kharevich.app.controller.Command;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class DoLogination implements Command {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		String login;
		String password;
		login = request.getParameter("login");
		password = request.getParameter("password");
		String log = login+"="+password;
		
		File file = new File("C:/Users/shish/git/PavelKharevich_webapp/kharevich-webapp-001/src/main/resources/log.txt");
				
		try (BufferedReader reader = new BufferedReader(new FileReader(file)))  {
		    String value = reader.readLine();
		    boolean isContains = Files.lines(Paths.get("C:/Users/shish/git/PavelKharevich_webapp/kharevich-webapp-001/src/main/resources/log.txt")).anyMatch(e->e.contains(log));
		    if(value==null) {
				response.sendRedirect("controller?command=go_to_registration_page");
			}else if(isContains==true){
				response.sendRedirect("controller?command=go_to_main_page");					
			}else {
				response.sendRedirect("controller?command=go_to_registration_page");				
			}
		}catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }				
	}
}
