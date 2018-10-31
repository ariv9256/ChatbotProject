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
	}
	public void start()
	{
		String userInput = "";
		while(!userInput.equalsIgnoreCase("quit"))
		{
			userInput = interactWithChatbot(userInput);
		}
		askUser();
	}
	public Chatbot getChatbot()
	{
		return simpleBot;
	}
	public String useChatbotCheckers(String content)
	{
		content = simpleBot.getContent();
		simpleBot.spookyChecker(content);
		
		return content;
	}
	public boolean validInt(String maybeInt)
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
	private void askUser()
	{
		Chatbot userChat = new Chatbot();
		
		String response = JOptionPane.showInputDialog(null, "What is your favorite holiday?");
		
	}
}
