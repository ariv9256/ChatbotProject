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
		this.content = new String("default content");
		this.currentUser = new String("default user");
		this.joke = new String (" ");
		
		this.responseList = new ArrayList<String>();
		this.spookyList = new ArrayList<String>();
		buildLists();
	}
	public Chatbot(ArrayList<String> responseList, 
			ArrayList<String> spookyList, String content, String currentUser, String joke)
	{
		this.responseList = getResponseList();
		this.spookyList = getSpookyList();
		this.content = content;
		this.currentUser = currentUser;
		this.joke = joke;
		
		buildLists();
	
	}
	public Chatbot(String content)
	{
		this.content = content;
		this.currentUser = new String("default user");
		this.joke = new String (" ");
		
		this.responseList = new ArrayList<String>();
		this.spookyList = new ArrayList<String>();
		buildLists();
	}
	private void buildLists() //Builds arrayLists for chatbot
	{
		responseList.add("Hello there! How are you in this lovely evening?");
		responseList.add("That is mean goodbye :( Leave me alone");
		responseList.add("Oh really now");
		responseList.add("I can't do the understanding of that statement");
		responseList.add("What do you mean?");
		responseList.add("Woah cool");
		responseList.add("Okay!");
		responseList.add("Now what?");
		responseList.add("Haha");
		responseList.add("That's strange..");
		responseList.add("That's funny!");
		responseList.add("*burp*");
		responseList.add("Meep");
		responseList.add("Hmm. Well..");
		responseList.add("j");
		responseList.add("j");
		responseList.add("j");
		
		spookyList.add("Halloween");
		spookyList.add("spooky");
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
		public String processText(String content) //Return userResponse method
		{
			String answer = ""; 
			
			if(!legitimacyChecker(content))
			{
				answer += "You said: you really should not send null\n";
			}
			else 
			{
				answer += "You said: " +content+ "\n";
			
				if(contentChecker(content))
				{
					answer += "You said the special words.\n";
				}
				int randomIndex = (int) (responseList.size() * Math.random());
				answer += "Chatbot says: " +responseList.get(randomIndex) + "\n";
			}
			
			return answer;
		}
		public boolean spookyChecker(String content)//Checks spookiness 
		{
			boolean isSpooky = false;
			//input = getContent();
			String specialContent = "";
			
			//Spooky for list checking contents of spookyList 
			for (String spookyPhrase : getSpookyList())
			{
				//isSpooky = input.contains(spookyPhrase);
				if (content.contains(spookyPhrase))
				{
					isSpooky = true;
				}
			}
			return isSpooky;
		}
		public Boolean legitimacyChecker(String content) //Checks for actual input instead of keyboard bash
		{
			setContent(content);
			//content = getContent();
			boolean isLegitimate = true;
			if(content == null || content.equals(""))
			{
				isLegitimate = false;
			}
			else if(content.contains("sdf") || content.contains("cvb"))
			{
				isLegitimate = false;
			}
			else if (content.equalsIgnoreCase(""))
			{
				isLegitimate = false;
			}
			else if(content.length() >= 1)
			{
				isLegitimate = true;
			}
			else
			{
				isLegitimate = false;
			}
			return isLegitimate;
		}
		public Boolean contentChecker(String special)
		{
			boolean isValid = true;
		
			if(special == null)
			{
				isValid = false;
			}
			else if(special.equals(content))
			{
				isValid = true;
			}
			else if(special.startsWith(content + " "))
			{
				isValid = false;
			}
			else if(special.endsWith(" " + content))
			{
				isValid = false;
			}
			else
			{
				isValid = true;
			}
			return isValid;
	}
	public String getCurrentuser()
	{
		return currentUser;
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
