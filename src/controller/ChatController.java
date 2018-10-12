package controller;

import java.util.Scanner;
import model.ChatModel;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ChatController
{
	private ChatModel Chatbot; 
	private Scanner inputScanner;
	
	public String interactWithChatbot(String userInput)
	{
		return null;
	}
	
	public ChatController()
	{
		Chatbot = new ChatModel();
		inputScanner = new Scanner(System.in);
	}
	public void start()
	{
		String userInput = JOptionPane.showInputDialog(null, " ");
		while(!userInput.equalsIgnoreCase("quit"))
		{
			JOptionPane.showInputDialog(null, " ");
		}
		askUser();
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
	private void lotsOfResponses()
	{
		ArrayList<ChatModel> Chatbot = new ArrayList<ChatModel>();
		
	}
	private void askUser()
	{
		ChatModel userChat = new ChatModel();
		
		String response = JOptionPane.showInputDialog(null, "What is your favorite holiday?");
		
	}
}
