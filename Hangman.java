import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.util.*;
import javax.swing.JApplet;

public class Hangman extends JApplet
{
	private static SinglePlayer singlePlayer;
	private static MultiPlayer multiPlayer;
	private static JTabbedPane tPane;
	
	public static void reset()
	{
		tPane.removeAll();
		singlePlayer = new SinglePlayer();
		try {
			multiPlayer = new MultiPlayer();
		} catch (IOException e) {
			e.printStackTrace();
		}
		tPane.add("Single Player", singlePlayer);
		tPane.add("Multi Player", multiPlayer);
	}
	
	public void init()
	{	
		singlePlayer = new SinglePlayer();
		try {
			multiPlayer = new MultiPlayer();
		} catch (IOException e) {
			e.printStackTrace();
		}
		tPane = new JTabbedPane();
		
		tPane.addTab("Single Player", singlePlayer);
	    tPane.addTab("Multi Player", multiPlayer);
		setSize(400,400);
		getContentPane().add(tPane);
		setVisible(true);
	}
}
