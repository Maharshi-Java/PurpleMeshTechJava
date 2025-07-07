package com.PurpleMesh.BasicCorePrograms;

import java.util.Scanner;

public class ReplaceStringTemplate {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Replaced String ");
		String replaced = scanner.nextLine();
		if(replaced.length()<3)
		{
			System.out.println("Enter UserName has min 3 char  ");
		}
		
		String template = " Hello <<UserName>>, How are you?";
		String result = template.replace("<<UserName>>",replaced );
		
		System.out.println(result);
		scanner.close();
		
	}


}
