package model;

import java.util.ArrayList;

public class ChatModel
{
	private ArrayList<String> responseList = new ArrayList<String>();
	private ArrayList<String> spookyList = new ArrayList<String>();
	private String content; 
	private String currentUser;
	private String joke;
	
	public ChatModel()
	{
		//Default Constructor
	}
	public ChatModel(ArrayList<ChatModel> responseList, 
			ArrayList<ChatModel> spookyList, String content, String currentUser, String joke)
	{
		this.responseList = new ArrayList<String>();
		this.spookyList = new ArrayList<String>();
		this.content = new String("Default spoop :(");
		this.currentUser = new String("Default empty spooky");
		this.joke = "What instrument does a skeleton play?";
		
		buildTheLists();
	
	}
	private void buildTheLists()
	{
		responseList.add("Hello there! How are you in this lovely evening?");
		responseList.add("That is mean goodbye :( Leave me alone");
		responseList.add("What is your name?");
		responseList.add("I can't do the understanding of that statement");
		responseList.add("What are you doing?");
		responseList.add("What do you like to do?");
		
		spookyList.add("What is your favorite holiday(it should be obvious).");
		spookyList.add("Jack Skellington is the bestest!");
		spookyList.add("B O O");
		spookyList.add("If you were to be a halloween monster, what would it be?");
		spookyList.add("Cause this is thriller!");
		spookyList.add("Would you like to do the trick or treat?");
		spookyList.add("Do you carve pumpkins for spooky day?");
		spookyList.add("What is your favorite piece of candy?");
		spookyList.add("Do you have a halloween costsume prepared?");
		spookyList.add("Do you believe in spooky ghosts?");
		spookyList.add("Did you know pumpkins aren't only orange? They can be white, blue, and green.");
		spookyList.add("Do you like bats? How about vampire bats?");
		spookyList.add("Have you ever seen a bat on Halloween? That's considered good luck.");
		spookyList.add("Are you an adult? Do you still dress up for Halloween?");
		
	}
	public String processText(String userText)
	{
		String answer = ""; 
		
		answer += "You said: " + userText; 
		
		return answer;
	}
	public ArrayList<String> getResponseList()
	{
		return responseList;
	}
	public ArrayList<String> getSpookyList()
	{
		return spookyList;
	}
	public String getContent()
	{
		return content;
	}
	public String getCurrentUser()
	{
		return currentUser;
	}
	public String getJoke()
	{
		return joke;
	}
	public void setResponseList(ArrayList<String> responseList)
	{
		this.responseList = responseList;
	}
	public void setSpookyList(ArrayList<String> spookyList)
	{
		this.spookyList = spookyList;
	}
	public void setContent(String content)
	{
		this.content = content;
	}
	public void setCurrentUser(String currentuser)
	{
		this.currentUser = currentuser;
	}
	public void setJoke(String joke)
	{
		this.joke = joke;
	}
}
