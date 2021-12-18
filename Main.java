package finalProject;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.Image;
import java.awt.Graphics2D;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Main {
	
	
	public static void main(String[] args) {

		//fonts
		Font regFont = new Font("Century", Font.PLAIN, 25);
		Font inputFont = new Font("Courier", Font.PLAIN, 20);
		//labels and fields
		JTextArea aboutField = new JTextArea();
		JTextField nameField = new JTextField();
		JTextField adField = new JTextField();
		JTextField pnField = new JTextField();
		JTextField eField = new JTextField();
		JFrame frame = new JFrame();
		JLabel background, aboutLabel, titleLabel, nameLabel, textLabel, adLabel, pnLabel, eLabel;

		//buttons and bg
		ImageIcon next = new ImageIcon(new ImageIcon("arrow.png").getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
		JButton arrow = new JButton(next);
		ImageIcon pfp1 = new ImageIcon("pfp1.jpg");
		ImageIcon pfp2 = new ImageIcon("pfp2.jpg");
		ImageIcon pfp3 = new ImageIcon("pfp3.png");
		ImageIcon pfp4 = new ImageIcon("pfp4.png");
		ImageIcon bg = new ImageIcon("background.jpg");
		
		
		//background for program
		background = new JLabel("", bg, JLabel.CENTER);
		background.setBounds(0,0,650,650);
		frame.add(background);
		
		//submitbutton
		JPanel submitPanel;
		JButton submitButton;
		submitPanel = new JPanel();
		submitPanel.setBounds(450, 525, 100, 40);
		submitPanel.setBackground(Color.white);
		
		submitButton = new JButton("Next");
		submitButton.setBackground(Color.white);
		submitButton.setForeground(Color.black);
		submitButton.setFont(inputFont);
		submitButton.setBorder(BorderFactory.createBevelBorder(5));
		submitPanel.add(submitButton);
		background.add(submitPanel);
		
		//other buttons////////////////////////////////////////////////////////
		///////////////////////////////////////////////////////////////////////
		JPanel submit2Panel;
		JButton submit2Button;
		submit2Panel = new JPanel();
		submit2Panel.setBounds(450, 525, 100, 40);
		submit2Panel.setBackground(Color.white);
		
		submit2Button = new JButton("Next");
		submit2Button.setBackground(Color.white);
		submit2Button.setForeground(Color.black);
		submit2Button.setFont(inputFont);
		submit2Button.setBorder(BorderFactory.createBevelBorder(5));
		submit2Panel.add(submit2Button);
		background.add(submit2Panel);
		submit2Panel.setVisible(false);
		
		JPanel submit3Panel;
		JButton submit3Button;
		submit3Panel = new JPanel();
		submit3Panel.setBounds(450, 525, 100, 40);
		submit3Panel.setBackground(Color.white);
		
		submit3Button = new JButton("Next");
		submit3Button.setBackground(Color.white);
		submit3Button.setForeground(Color.black);
		submit3Button.setFont(inputFont);
		submit3Button.setBorder(BorderFactory.createBevelBorder(5));
		submit3Panel.add(submit3Button);
		background.add(submit3Panel);
		submit3Panel.setVisible(false);
		
		JPanel submit4Panel;
		JButton submit4Button;
		submit4Panel = new JPanel();
		submit4Panel.setBounds(450, 525, 100, 40);
		submit4Panel.setBackground(Color.white);
		
		submit4Button = new JButton("Next");
		submit4Button.setBackground(Color.white);
		submit4Button.setForeground(Color.black);
		submit4Button.setFont(inputFont);
		submit4Button.setBorder(BorderFactory.createBevelBorder(5));
		submit4Panel.add(submit4Button);
		background.add(submit4Panel);
		submit4Panel.setVisible(false);
		
		JPanel submit5Panel;
		JButton submit5Button;
		submit5Panel = new JPanel();
		submit5Panel.setBounds(450, 525, 100, 40);
		submit5Panel.setBackground(Color.white);
		
		submit5Button = new JButton("Next");
		submit5Button.setBackground(Color.white);
		submit5Button.setForeground(Color.black);
		submit5Button.setFont(inputFont);
		submit5Button.setBorder(BorderFactory.createBevelBorder(5));
		submit5Panel.add(submit5Button);
		background.add(submit5Panel);
		submit5Panel.setVisible(false);
		////////////////////////////////////////////////////////////////////////////////////////
		///////////////////////////////////////////////////////////////////////////////////////
		
		
		//PANELS AND LABELS//////////////////////////////////
		/////////////////////////////////////////
		//panel for the name
		JPanel namePanel = new JPanel();
		namePanel.setBounds(300, 110, 80, 40);
		namePanel.setBackground(Color.white);
		//text for the name panel
		nameLabel = new JLabel("Name: ");
		nameLabel.setForeground(Color.black);
		nameLabel.setFont(regFont);	
		namePanel.add(nameLabel);
		//name input
		nameField.setBounds(400, 115, 180, 30);
		nameField.setBackground(new Color(240, 240, 250));
		nameField.setFont(inputFont);
		background.add(namePanel);
		background.add(nameField);
		
		//panel for the ad
		JPanel adPanel = new JPanel();
		adPanel.setBounds(295, 150, 110, 40);
		adPanel.setBackground(Color.white);
		//text for the ad panel
		adLabel = new JLabel("Address: ");
		adLabel.setForeground(Color.black);
		adLabel.setFont(regFont);	
		adPanel.add(adLabel);
		//ad input
		adField.setBounds(400, 160, 180, 30);
		adField.setBackground(new Color(240, 240, 250));
		adField.setFont(inputFont);
		background.add(adPanel);
		background.add(adField);
		adPanel.setVisible(false);
		adField.setVisible(false);
		
		//panel for the phone#
		JPanel pnPanel = new JPanel();
		pnPanel.setBounds(295, 150, 110, 40);
		pnPanel.setBackground(Color.white);
		//text for the ad panel
		pnLabel = new JLabel("Phone #: ");
		pnLabel.setForeground(Color.black);
		pnLabel.setFont(regFont);	
		pnPanel.add(pnLabel);
		//ad input
		pnField.setBounds(400, 160, 180, 30);
		pnField.setBackground(new Color(240, 240, 250));
		pnField.setFont(inputFont);
		background.add(pnPanel);
		background.add(pnField);
		pnPanel.setVisible(false);
		pnField.setVisible(false);
		
		//panel for the phone#
		JPanel ePanel = new JPanel();
		ePanel.setBounds(295, 150, 110, 40);
		ePanel.setBackground(Color.white);
		//text for the email panel
		eLabel = new JLabel("Email: ");
		eLabel.setForeground(Color.black);
		eLabel.setFont(regFont);	
		ePanel.add(eLabel);
		//email input
		eField.setBounds(400, 160, 180, 30);
		eField.setBackground(new Color(240, 240, 250));
		eField.setFont(inputFont);
		background.add(ePanel);
		background.add(eField);
		ePanel.setVisible(false);
		eField.setVisible(false);
		
		//text after submit//
		textLabel = new JLabel();
		textLabel.setFont(regFont);
		textLabel.setBounds(300, -120, 500, 500);
		//textLabel.setBackground(Color.black);
		textLabel.setForeground(Color.black);
		textLabel.setVisible(false);
		background.add(textLabel);
		///////////////////////////////////////////////////////////////////////
		////////////////////////////////////////////////////////////////////////
		
		
		//BUTTON FUNCTIONS/////////////////////////////////////////////////////
		///////////////////////////////////////////////////////////////////////
		submitButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent evt) {
				if(evt.getSource() == submitButton) {
					
					textLabel.setVisible(true);
					namePanel.setVisible(false);
					nameField.setVisible(false);
					//checks if name is empty or has numbers
					

					
					try {
						Integer.parseInt(nameField.getText());
						textLabel.setText("-Numbers in the name");
						submitButton.setVisible(false);
						submitPanel.setVisible(false);
						
					}
					catch(NumberFormatException e) {
						//add something saying welcome
						textLabel.setText("Welcome, " + nameField.getText() + "!");
						submitPanel.setVisible(false);
						submit2Panel.setVisible(true);
						
					}
					
					if(nameField.getText().trim().isEmpty()) {
						textLabel.setText("-No name inputted");
						submitButton.setVisible(false);
						submitPanel.setVisible(false);
					}
					
					

				}
				
			}
		});
		
		submit2Button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent evt) {
				if(evt.getSource() == submit2Button) {
					
					//textLabel.setVisible(true);
					namePanel.setVisible(false);
					nameField.setVisible(false);
					adPanel.setVisible(true);
					adField.setVisible(true);
					submit2Panel.setVisible(false);
					submit3Panel.setVisible(true);
				}
				
			}
		});
		submit3Button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent evt) {
				if(evt.getSource() == submit3Button) {
					
					textLabel.setVisible(true);
					namePanel.setVisible(false);
					nameField.setVisible(false);
					//adPanel.setVisible(true);
					//adField.setVisible(true);
					//submit3Panel.setVisible(true);
					
					if(adField.getText().trim().isEmpty()) {
						textLabel.setText("-No address inputted");
						submit3Button.setVisible(false);
						submit3Panel.setVisible(false);
					}
					else {
						adPanel.setVisible(false);
						adField.setVisible(false);
						textLabel.setText("Now we need your #");
						pnPanel.setVisible(true);
						pnField.setVisible(true);
						submit3Panel.setVisible(false);
						submit4Panel.setVisible(true);
					}
				}
				
			}
		});
		submit4Button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent evt) {
				if(evt.getSource() == submit4Button) {
					
					textLabel.setVisible(true);
					pnPanel.setVisible(false);
					pnField.setVisible(false);
					
					try {
						Integer.parseInt(pnField.getText());
						textLabel.setText("Thank you! Now the email...");
						submit4Panel.setVisible(false);
						ePanel.setVisible(true);
						eField.setVisible(true);
						submit5Panel.setVisible(true);
						
					}
					catch(NumberFormatException e) {
						//add something saying welcome
						textLabel.setText("Must put only numbers!");
						
						submit4Panel.setVisible(false);
						
					}
					if(adField.getText().trim().isEmpty()) {
						textLabel.setText("-No phone # inputted");
						submit4Button.setVisible(false);
						submit4Panel.setVisible(false);
					}

				}
				
			}
		});
		submit5Button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent evt) {
				if(evt.getSource() == submit5Button) {
					
					textLabel.setVisible(true);
					ePanel.setVisible(false);
					eField.setVisible(false);
					//adPanel.setVisible(true);
					//adField.setVisible(true);
					//submit3Panel.setVisible(true);
					
					if(eField.getText().trim().isEmpty()) {
						textLabel.setText("-No email inputted");
						//submit3Button.setVisible(false);
						submit5Panel.setVisible(false);
					}
					else {
						ePanel.setVisible(false);
						eField.setVisible(false);
						submit5Panel.setVisible(false);
						//aboutField.setVisible(false);
						
						textLabel.setText("Your profile is done! Thx!");
						
					}
				}
				
			}
		});
		
		//arrow btn for pfp
		arrow.setBounds(210, 150, 50, 50);
		arrow.setBorder(BorderFactory.createEmptyBorder());
		arrow.setBackground(new Color(255, 255, 200));
		frame.add(arrow);
		
		///////////////////////////////////////////////////////////////////
		///////////////////////////////////////////////////////////////////
		
		//pfp
		ImageIcon pfp = new ImageIcon(new ImageIcon("pfp.png").getImage().getScaledInstance(190, 200, Image.SCALE_DEFAULT));
		JPanel pfpPanel = new JPanel();
		pfpPanel.setBounds(40, 50, 190, 200);
		pfpPanel.setBackground(Color.white);
		JLabel pfpLabel = new JLabel(pfp);
		pfpPanel.add(pfpLabel);
		background.add(pfpPanel);
		
		//arrow function
		arrow.addActionListener(new ActionListener() {
			int x = 0;
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == arrow) {
					if(x == 0) {
						pfpLabel.setIcon(pfp1);
					}
					else if(x == 1) {
						pfpLabel.setIcon(pfp2);
					}
					else if(x == 2) {
						pfpLabel.setIcon(pfp3);
					}
					else if(x == 3) {
						pfpLabel.setIcon(pfp4);
					}
					
					x++;
					if(x > 3) x = 0;
				}
			}
		});
		
		
		//LEFT SIDE PANEL///////////////////////////////////////////////
		//////////////////////////////////////////////////////////////////
		//panel for the about me
		JPanel aboutPanel = new JPanel();
		aboutPanel.setBounds(60, 250, 150, 40);
		aboutPanel.setBackground(new Color(255, 255, 255, 240));
		//text for the about me panel
		aboutLabel = new JLabel("About me: ");
		aboutLabel.setForeground(Color.black);
		aboutLabel.setFont(regFont);
		aboutPanel.add(aboutLabel);
		background.add(aboutPanel);
		//about me input
		aboutField.setBounds(30, 300, 220, 205);
		aboutField.setBackground(Color.white);
		aboutField.setFont(inputFont);
		aboutField.setLineWrap(true);
		aboutField.setWrapStyleWord(true);
		aboutField.setBackground(new Color(255, 255, 250));
		aboutField.setBorder(BorderFactory.createEtchedBorder(1));
		background.add(aboutField);
		
		//label for pfp picture and about me
		JPanel lpanel = new JPanel();
		lpanel.setBounds(10, 30, 250, 500);
		lpanel.setBorder(BorderFactory.createDashedBorder(null));
		lpanel.setBackground(new Color(255,255,255,240));
		background.add(lpanel);
		///////////////////////////////////////////////////////////////
		////////////////////////////////////////////////////////////////
		
		//title
		JPanel titlePanel = new JPanel();
		titlePanel.setBounds(300, 50, 300, 40);
		titlePanel.setBackground(new Color(255, 255, 255, 240));
		//text for the title panel
		titleLabel = new JLabel("Welcome to your profile");
		titleLabel.setForeground(Color.black);
		titleLabel.setFont(regFont);
		titlePanel.add(titleLabel);
		background.add(titlePanel);
		
		
		//label for editing
		JPanel rpanel = new JPanel();
		rpanel.setBounds(275, 100, 350, 400);
		rpanel.setBorder(BorderFactory.createDashedBorder(null));
		rpanel.setBackground(new Color(255,255,255,240));
		background.add(rpanel);
		
		
		//window
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(650, 650);
		frame.getContentPane().setBackground(new Color(50, 50, 50));
		frame.setLayout(null);
		frame.setResizable(false);
		frame.setTitle("user profile");
		frame.setVisible(true);
		background.requestFocusInWindow();

	}

}
