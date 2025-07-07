package com.PurpleMesh.AlgorithmPrograms;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.PurpleMesh.Utility.Utility;

public class CustomizeMessage {

	public static void main(String[] args) {
		String message = "Hello <<name>>, We have your full name as <<full name>> in our system. "
                + "your contact number is 91-xxxxxxxxxx. "
                + "Please, let us know in case of any clarification. "
                + "Thank you BridgeLabz 01/01/2016.";

		
		System.out.println("Enter Your Name:");
		String name = Utility.getNextLine();
		
		System.out.println("Enter Your Full Name:");
		String fullName = Utility.getNextLine();
		
	System.out.println("Enter your Mobile Number: ");
		String mobile = Utility.getNextLine();
		
		String currentDate = new SimpleDateFormat("dd/MM/yyyy").format(new Date());
	
		message=message.replaceAll("<<name>>",name);
		message=message.replaceAll("<<full name>>",fullName);
		message=message.replaceAll("91-xxxxxxxxxx",mobile);
		message=message.replaceAll("01/01/2016",currentDate);


		
		System.out.println(message);
	}

}
