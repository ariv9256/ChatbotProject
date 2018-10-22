package chat.controller;

import java.util.Scanner;
import java.util.ArrayList;
import javax.swing.JOptionPane;

import chat.model.ChatModel;

public class ChatController
{
	private ChatModel Chatbot; 
	private Scanner inputScanner;
	private ChatModel simpleBot;
	

	public ChatController()
	{
		Chatbot = new ChatModel();
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
	public ChatModel getChatbot()
	{
		return simpleBot;
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
		ChatModel userChat = new ChatModel();
		
		String response = JOptionPane.showInputDialog(null, "What is your favorite holiday?");
		
	}
}
