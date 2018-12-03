package chat.view;

import javax.swing.* ;
import chat.controller.ChatController;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChatPanel extends JPanel 
{
	private ChatController appController;
	private ChatPanel appPanel;
	private JLabel firstLabel;
	private JButton firstButton;
	private SpringLayout appLayout;
	
	public ChatPanel(ChatController appController)
	{
		super();
		this.appController = appController;
		
		firstLabel = new JLabel("Hello :)");
		firstButton = new JButton("Boop!");
		appLayout = new SpringLayout();
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	private void changeBackground()
	{
		
	}
	private void setupPanel()
	{
		this.setLayout(appLayout);
		this.add(firstButton);
		this.add(firstLabel);
	}
	private void setupLayout()
	{
		appLayout.putConstraint(SpringLayout.EAST, firstLabel,  -350,  SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.NORTH, firstLabel,  100,  SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.WEST, firstButton,  350,  SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.SOUTH, firstButton, -135, SpringLayout.SOUTH, this);
	}
	private void setupListeners()
	{
		
	}
	
}
