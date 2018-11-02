package chat.controller;

import java.util.Scanner;
import java.util.ArrayList;
import javax.swing.JOptionPane;

import chat.model.Chatbot;

public class ChatController
{
	private Chatbot Chatbot; 
	private Scanner inputScanner;
	private Chatbot simpleBot;
	

	public ChatController()
	{
		Chatbot = new Chatbot();
		inputScanner = new Scanner(System.in);
	}
	public String interactWithChatbot(String text)
	{
		String output = "";
		String userResponse = JOptionPane.showInputDialog(null, "Hey bud, what's up?");
		output = Chatbot.processText(userResponse);
		return output;
		//First output of Chatbot and allows interaction between chatbot and userResponse
	}
	public void start()
	{
		String userInput = "";
		while(!userInput.equalsIgnoreCase("quit"))
		{
			userInput = interactWithChatbot(userInput);
			//"quit" option in Chatbot from userInput
		}
		askUser();
		//made askUser() public
	}
	public Chatbot getChatbot()
	{
		return simpleBot;
		//simpleBot variable creation in controller
	}
	public String useChatbotCheckers(String content)
	{
		content = simpleBot.getContent();
		simpleBot.spookyChecker(content);
		//simpleBot checks arrayList content using userChatbotCheckers String method
		
		return content;
	}
	public boolean validInt(String maybeInt) // Validity checker method
	{
		boolean isValid = false;
		
		try
		{
			Integer.parseInt(maybeInt);
			isValid = true;
		}
		catch(NumberFormatException error)
		{
			JOptionPane.showMessageDialog(null, "You need to type in a number my spooky one :O");
		}
		return isValid;
	}
	private void askUser() //End result of askUser in chatbot (not finished yet)
	{
		Chatbot userChat = new Chatbot();
		
		//String response = JOptionPane.showInputDialog(null, "What is your favorite holiday?");
		
	}
}
