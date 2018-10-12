package model;

import java.util.ArrayList;

public class ChatModel
{
	private String favoriteHoliday;
	private ArrayList<ChatModel> responseList = new ArrayList<ChatModel>();
	private ArrayList<ChatModel> spookyList = new ArrayList<ChatModel>();
	private String content; 
	private String currentUser;
	private String joke;
	
	public ChatModel()
	{
		//Default Constructor
	}
	public ChatModel(String favoriteHoliday, ArrayList<ChatModel> responseList, 
			ArrayList<ChatModel> spookyList, String content, String currentUser, String joke)
	{
		this.favoriteHoliday = favoriteHoliday;
		this.responseList = responseList;
		this.spookyList = spookyList;
		this.content = content;
		this.currentUser = currentUser;
		this.joke = joke;
	}
	public String getfavoriteHoliday()
	{
		return favoriteHoliday;
	}
	public ArrayList<ChatModel> getResponseList()
	{
		return responseList;
	}
	public ArrayList<ChatModel> getSpookyList()
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
	public void setFavoriteHoliday(String favoriteHoliday)
	{
		this.favoriteHoliday = favoriteHoliday;
	}
	public void setResponseList(ArrayList<ChatModel> responseList)
	{
		this.responseList = responseList;
	}
	public void setSpookyList(ArrayList<ChatModel> spookyList)
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
