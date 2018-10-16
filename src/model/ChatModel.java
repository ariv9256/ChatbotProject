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
		responseList.add("What is your favorite holiday?");
		responseList.add("I can't do the understanding of that statement");
		responseList.add("What are you doing?");
		
		spookyList.add("What is your favorite holiday(it should be obvious).");
		spookyList.add("Jack Skellington is the bestest!");
		spookyList.add("B O O");
		spookyList.add("If you were to be a halloween monster, what would it be?");
		spookyList.add("Cause this is thriller!");
		spookyList.add("Would you like to do the trick or treat?");
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
