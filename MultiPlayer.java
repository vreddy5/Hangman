import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.Timer;

import java.util.*;
import java.io.*;
import java.util.concurrent.TimeUnit;

public class MultiPlayer extends JPanel implements ActionListener
{
	private JPanel panel1;
	private JPanel panel2;
	private JPanel letterPanel;
	private JTextField input;
	private JLabel error;
	private JLabel guess;
	private JLabel list;
	private JLabel wrong;
	private JPanel blank = new JPanel();
	private JPanel blank1 = new JPanel();
	private JPanel blank2 = new JPanel();
	private JPanel blank3 = new JPanel();
	private JPanel blank4 = new JPanel();
	private JPanel blank5 = new JPanel();
	private JPanel blank6 = new JPanel();
	private JPanel blank7 = new JPanel();
	private JPanel blank8 = new JPanel();
	private JPanel blank9 = new JPanel();
	private JPanel blank10 = new JPanel();
	private static String word;
	private JTextField initial;
	private JLabel enter;
	private JPanel first;
	private JPanel second;
	private JButton submit;
	private JButton letter;
	private String [] letters;
	private String incorrect = "Incorrect letters: ";
	private JPanel graphics;
	private int strike = 0;
	private int correct =0;
	private int gui = 0;
	
	public MultiPlayer() throws IOException
	{
		setLayout(new GridLayout(9,1));
		
		initial = new JTextField();
		enter = new JLabel();
		enter.setText("Enter a word:");
		
		first = new JPanel(new GridLayout(1,4));
		
		first.add(blank9);
		first.add(enter);
		first.add(initial);
		first.add(blank10);
		
		
		second = new JPanel(new GridLayout(1,3));
		submit = new JButton("Submit");
		
		second.add(blank7);
		second.add(submit);
		second.add(blank8);
		submit.addActionListener(this);
		
		add(blank);
		add(blank1);
		add(blank2);
		add(first);
		add(blank3);
		add(second);
		add(blank4);
		add(blank5);
		add(blank6);
	}
	
	public String toString1()
	{
		String result = "";
		for (int i=0; i<letters.length; i++)
		{
			result = result + letters[i];
		}
		return result;
	}
	
	public void actionPerformed (ActionEvent e)
	{
		removeAll();
		
		setLayout(new GridLayout(1,2));
		
		String word;
		word = initial.getText();
		
		for (int i=0;i<word.length();i++)
		{
			Character.toLowerCase(word.charAt(i));
		}
		
		JPanel big = new JPanel (new GridLayout(1,4));
		panel1 = new JPanel (new GridLayout (4,1));
		graphics = new JPanel();
		graphics.setBackground(Color.white);
		big.add(panel1);
		big.add(graphics);
		
		Graphics g = graphics.getGraphics();
	
		
		error = new JLabel();
		error.setForeground(Color.red);
		error.setText("You have "+(7-strike)+" strikes remaining");
		panel1.add(error);
		
		panel2 = new JPanel (new GridLayout (2,4));
		guess = new JLabel("Please guess a letter: ");
		panel2.add(guess);
		input = new JTextField();
		panel2.add(input);
		panel2.add(blank);
		panel2.add(blank1);
		panel2.add(blank3);
		letter = new JButton("Submit");
		letter.addActionListener(new guessListener());
		panel2.add(letter);
		panel2.add(blank4);
		panel2.add(blank5);
		
		panel1.add(panel2);
		
		letterPanel = new JPanel(new GridLayout(1,3));
		letterPanel.add(blank8);
		list = new JLabel();
		letters = new String[word.length()];
		for (int i=0;i<word.length();i++)
		{
			letters[i] = "_ ";
		}
		list.setText(toString1());
		letterPanel.add(list);
		letterPanel.add(blank9);
		panel1.add(letterPanel);
		
		wrong = new JLabel (incorrect);
		panel1.add(wrong);
	
		add(big);
	}
	
	private class guessListener implements ActionListener
	{
		public void actionPerformed (ActionEvent e)
		{
				String guess = input.getText();
				word = initial.getText();
				input.setText("");
				boolean flag = false;
				
				if (guess.length() != 1)
				{
					error.setText("Invalid guess. Please enter only one letter");
				}
				else
				{
					for (int i = 0; i<guess.length(); i++)
					{
						if (guess.charAt(i)!="a".charAt(0)&&guess.charAt(i)!="b".charAt(0)&&guess.charAt(i)!="c".charAt(0)&&guess.charAt(i)!="d".charAt(0)&&guess.charAt(i)!="e".charAt(0)&&guess.charAt(i)!="f".charAt(0)&&guess.charAt(i)!="g".charAt(0)&&guess.charAt(i)!="h".charAt(0)&&guess.charAt(i)!="i".charAt(0)&&guess.charAt(i)!="j".charAt(0)&&guess.charAt(i)!="k".charAt(0)&&guess.charAt(i)!="l".charAt(0)&&guess.charAt(i)!="m".charAt(0)&&guess.charAt(i)!="n".charAt(0)&&guess.charAt(i)!="o".charAt(0)&&guess.charAt(i)!="p".charAt(0)&&guess.charAt(i)!="q".charAt(0)&&guess.charAt(i)!="r".charAt(0)&&guess.charAt(i)!="s".charAt(0)&&guess.charAt(i)!="t".charAt(0)&&guess.charAt(i)!="u".charAt(0)&&guess.charAt(i)!="v".charAt(0)&&guess.charAt(i)!="w".charAt(0)&&guess.charAt(i)!="x".charAt(0)&&guess.charAt(i)!="y".charAt(0)&&guess.charAt(i)!="z".charAt(0))
						{
							error.setText("Invalid guess. Please guess only lowercase letters");
						}
						else
							flag = true;
					}
				}
				
				if (flag == true)
				{
					int count = 0;
					
					for (int i=0; i<letters.length; i++)
					{
						if(letters[i].charAt(0) == guess.charAt(0))
						{
							error.setText("You already guessed this letter. Please try again");
							count = 1;
							break;
						}
					}
					
					for (int i=18; i<incorrect.length(); i++)
					{
						if(incorrect.charAt(i) == guess.charAt(0))
						{
							error.setText("You already guessed this letter. Please try again");
							count = 1;
							break;
						}
					}
					
					if(count == 0)
					{
						for (int i=0; i<word.length(); i++)
						{
							if(guess.charAt(0) == word.charAt(i))
							{
								letters[i] = guess + " ";
								list.setText(toString1());
								count = 1;
								correct++;
								error.setText("Great work! You have "+(7-strike)+" strikes remaining");
								if(correct == word.length())
								{
									error.setForeground(Color.blue);
									error.setText("Congratulations, you won!");
								}
									
							}
						}
					}
					
					if(count == 0)
					{
						incorrect += guess + ", ";
						wrong.setText(incorrect);
						gui++;
						strike++;
						error.setText("Keep trying! You have "+(7-strike)+" strikes remaining");
						if(strike == 7)
						{
							error.setText("Sorry, the correct word is "+word);
						}
					}
					
					Graphics g = graphics.getGraphics();
					
					switch(gui)
					{
					case 0:
						break;
					case 1:
						g.drawLine(175, 450, 350, 450);
						g.drawLine(250, 450, 250, 100);
						g.drawLine(250, 100, 325, 100);
						g.drawLine(325, 100, 325, 125);
						break;
					case 2:
						g.drawOval(300, 125, 50, 50);
						break;
					case 3:
						g.drawLine(325, 175, 325, 225);
						break;
					case 4:
						g.drawLine(325, 175, 300, 200);
						break;
					case 5:
						g.drawLine(325, 175, 350, 200);
						break;
					case 6:
						g.drawLine(325, 225, 300, 250);
						break;
					case 7:
						g.drawLine(325, 225, 350, 250);
						break;
					}
					if(correct == word.length() || strike == 7)
					{
						int delay = 3000;
						Timer timer = new Timer( delay, new ActionListener(){
						  @Override
						  public void actionPerformed( ActionEvent e ){
							  Hangman.reset();
						  }
						} );
						timer.setRepeats( false );
						timer.start();
					}
						
				}
			
			}
		}
}
