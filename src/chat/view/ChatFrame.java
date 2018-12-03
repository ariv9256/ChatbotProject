package chat.view;

import javax.swing.JFrame;
import chat.controller.ChatController;

public class ChatFrame 
{
	private ChatController appController;
	private ChatPanel appPanel;
	
	public ChatFrame()
	{
		super();
		this.appController = appController;
		this.appPanel = new ChatPanel(appController);
		
		setupFrame();
	}
	private void setupFrame()
	{
		this.setContentPane(appPanel);
		this.setSize(800, 800);
		this.setTitle("Hello there family :)");
		this.setResizable(true);
		this.setVisible(true);
	}
}
