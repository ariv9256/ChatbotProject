package chat.controller;

import java.util.Scanner;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import chat.view.ChatFrame;
import chat.view.ChatPanel;
import chat.model.ChatTwitter;

import chat.model.Chatbot;

public class ChatController
{ 
	private Scanner inputScanner;
	private Chatbot simpleBot;
	private ChatFrame appFrame;
	private ChatTwitter myTwitter;
	

	public ChatController()
	{
		simpleBot = new Chatbot();
		myTwitter = new ChatTwitter(this);
		//inputScanner = new Scanner(System.in);
		appFrame = new ChatFrame(this);
	}
	public String interactWithChatbot(String content)
	{
		String output = "";
		output += simpleBot.processText(content);
		return output;
		//First output of Chatbot and allows interaction between chatbot and userResponse
	}
	public void start()
	{
		//String userInput = "";
		//while(!userInput.equalsIgnoreCase("quit")) 
		//{
		//	userInput = interactWithChatbot(userInput);
			//"quit" option in Chatbot from userInput
		//}
		//askUser();
		//made askUser() public
	}
	public Chatbot getChatbot()
	{
		return simpleBot;
		//simpleBot variable creation in controller
	}
	public String useChatbotCheckers(String content)
	{
		String testedValues = "The following checkers passed:";
		if(simpleBot.contentChecker(content))
		{
			testedValues += "\nContent Checker";
		}
		if(simpleBot.spookyChecker(content))
		{
			testedValues += "\nSpooky Checker Happy Halloween";
		}
		if(simpleBot.legitimacyChecker(content))
		{
			testedValues += "\nLegitimacy Checker";
		}
		
		return testedValues;
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
	private void close()
	{
		System.exit(0);
	}
	public void handleErrors(Exception error)
	{
		JOptionPane.showMessageDialog(appFrame, error.getMessage());
	}
	public ChatFrame getAppFrame()
	{
		return appFrame;
	}
	private void askUser() //End result of askUser in chatbot (not finished yet)
	{
		
		//String response = JOptionPane.showInputDialog(null, "What is your favorite holiday?");
		
	}
	public void tweet(String text)
	{
		myTwitter.sendTweet(text);
	}
	public String findWords(String user)
	{
		String results = myTwitter.getMostCommonWord(user);
		return results;
	}
}
