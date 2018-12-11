package chat.controller;

import java.util.Calendar;
import java.util.Scanner;
import java.io.IOException;
import java.io.File;
import java.io.PrintWriter;

public class IOController
{
	public static void saveText(ChatController appController, String path, String textToSave)
	{
		try
		{
			String filename = path;
			Calendar date = Calendar.getInstance();
			filename += "/" + date.get(Calendar.MONTH) + " " + date.getActualMaximum(Calendar.DAY_OF_MONTH);
			filename += date.get(Calendar.HOUR)+ "-" + date.get(Calendar.MINUTE); 
			filename += " chatbot save.txt";
			
			File saveFile = new File(filename);
			Scanner textScanner = new Scanner(textToSave);
			PrintWriter saveText = new PrintWriter(saveFile);
			
			while(textScanner.hasNext()) 
			{
				String currentLine = textScanner.nextLine();
				saveText.println(currentLine);
			}
			
			textScanner.close();
			saveText.close();
		}
		catch(IOException error)
		{
			appController.handleErrors(error);
		}
		catch(Exception genericError)
		{
			appController.handleErrors(genericError);
		}
	}
	public static String loadFile(ChatController appController, String path)
	{
		String contents = "";
		
		try
		{
			File saveFile = new File(path);
			Scanner fileScanner;
			if(saveFile.exists())
			{
				fileScanner = new Scanner(saveFile);
				while(fileScanner.hasNext())
				{
					contents += fileScanner.nextLine() + "\n";
				}
			}
		}
		catch(IOException error)
		{
			appController.handleErrors(error);
		}
		catch(Exception genericError)
		{
			appController.handleErrors(genericError);
		}
		return contents;
	}
}
