package chat.model;

import java.util.ArrayList;

public class Chatbot
{
	private ArrayList<String> responseList = new ArrayList<String>();
	private ArrayList<String> spookyList = new ArrayList<String>();
	private String content; 
	private String currentUser;
	private String joke;
	
	public Chatbot()
	{
		//Default Constructor
	}
	public Chatbot(ArrayList<Chatbot> responseList, 
			ArrayList<Chatbot> spookyList, String content, String currentUser, String joke)
	{
		this.responseList = new ArrayList<String>();
		this.spookyList = new ArrayList<String>();
		this.content = new String("Default spoop :(");
		this.currentUser = new String("Default empty spooky");
		this.joke = "What instrument does a skeleton play?";
		
		buildTheLists();
	
	}
	public Chatbot(String content)
	{
		this.content = "default content";
		this.currentUser = new String("default user");
		this.joke = new String (" ");
		
		this.responseList = new ArrayList<String>();
		this.spookyList = new ArrayList<String>();
		buildTheLists();
	}
	private void buildTheLists() //Builds arrayLists for chatbot
	{
		responseList.add("Hello there! How are you in this lovely evening?");
		responseList.add("That is mean goodbye :( Leave me alone");
		responseList.add("What is your name?");
		responseList.add("I can't do the understanding of that statement");
		responseList.add("What are you doing?");
		responseList.add("What do you like to do?");
		responseList.add("");
		responseList.add("");
		responseList.add("");
		responseList.add("");
		responseList.add("");
		responseList.add("");
		responseList.add("");
		responseList.add("");
		responseList.add("");
		responseList.add("");
		
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
		public String processText(String userText) //Return userResponse method
		{
			String answer = ""; 
			
			if(userText == null)
			{
				answer += "You really should not send null";
			}
			
			answer += "You said: " + userText;
			
			if (contentChecker(userText))
			{
				answer += "You said the special words.\n";
			}
			int randomIndex = (int) (responseList.size() * Math.random());
			answer += "Chatbot says: " + responseList.get(randomIndex);
			
			return answer;
	}
		public boolean spookyChecker(String input)//Checks spookiness 
		{
			Boolean isSpooky = false;
			input = getContent();
			
			//Spooky for list checking contents of spookyList 
			for (String spookyPhrase : getSpookyList())
			{
				isSpooky = input.contains(spookyPhrase);
				if (isSpooky = true)
				{
					return isSpooky;
				}
			}
			return isSpooky;
		}
		public Boolean legitimacyChecker(String content) //Checks for actual input instead of keyboard bash
		{
			content = getContent();
			Boolean isLegitimate = false;
			if(content == null || content.equals(""))
			{
				isLegitimate = false;
			}
			else if (content.equalsIgnoreCase("true"))
			{
				isLegitimate = false;
			}
			else
			{
				isLegitimate = false;
			}
			return isLegitimate;
		}
		public Boolean contentChecker(String input)
		{
			Boolean isValid = true;
		
			if(input == null)
			{
				isValid = false;
			}
			else if(input.length() < 2)
			{
				isValid = false;
			}
		else if(input.contains("sdf") || input.contains("cvb"))
		{
			isValid = false;
		}
			return isValid;
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
