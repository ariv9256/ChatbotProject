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
	private JButton chatButton;
	private JButton checkerButton;
	private JButton loadButton;
	private JButton saveButton;
	private JTextField chatField;
	private JTextArea chatArea;
	private JScrollPane chatPane;
	private SpringLayout appLayout;
	
	public ChatPanel(ChatController app)
	{
		super();
		this.appController = app;
		
		firstLabel = new JLabel("Hello :)");
		chatButton = new JButton("Chat");
		checkerButton = new JButton("Check Text");
		loadButton = new JButton("Load");
		saveButton = new JButton("Save");
		chatField = new JTextField("Talk to bot here", 50);
		chatArea = new JTextArea("Chat Area", 20, 50);
		chatPane = new JScrollPane();
		appLayout = new SpringLayout();
		
		setupScrollPane();
		setupPanel();
		setupLayout();
		setupListeners();
	}
	private void changeBackground()
	{
		
	}
	private void setupScrollPane()
	{
		
	}
	private void setupPanel()
	{
		this.setLayout(appLayout);
		this.add(chatButton);
		this.add(checkerButton);
		this.add(loadButton);
		this.add(saveButton);
		this.add(chatField);
		this.add(chatArea);
		this.add(chatPane);
		this.add(firstLabel);
	}
	private void setupLayout()
	{
		appLayout.putConstraint(SpringLayout.EAST, firstLabel,  -350,  SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.NORTH, firstLabel,  100,  SpringLayout.NORTH, this);
	}
	private void setupListeners()
	{
		
	}
	
}
