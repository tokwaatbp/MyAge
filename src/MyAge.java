import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/*
******************************************************************************
@author tofu.

@version 1.ob
******************************************************************************
*/

public class MyAge extends JFrame
{
        
    private JLabel birthYear, currentYear, myAge;
	
    private JTextField birthYearTF, currentYearTF, myAgeTF;
	
    private JButton calculate, exit;
	
    private CalculateButtonHandler cbHandler;
    private ExitButtonHandler ebHandler;
	
    private static final int WIDTH = 400;
    private static final int HEIGHT = 300;
	
    public MyAge()
    {
        birthYear = new JLabel("Enter the year you were born: ", +
                                SwingConstants.RIGHT);
		
	currentYear = new JLabel("Enter the present year: ", +
                                SwingConstants.RIGHT);
		
	myAge = new JLabel("Your age is: ", SwingConstants.RIGHT);
		
	birthYearTF = new JTextField(4);
	currentYearTF = new JTextField(4);
	myAgeTF = new JTextField(3);
		
	calculate = new JButton("Calculate");
	cbHandler = new CalculateButtonHandler();
	calculate.addActionListener(cbHandler);
		
	exit = new JButton("Exit");
	ebHandler = new ExitButtonHandler();
	exit.addActionListener(ebHandler);
		
            setTitle("What's my age again?");
		
            Container pane = getContentPane();
		
            pane.setLayout(new GridLayout(4, 2));
		
            pane.add(birthYear);
            pane.add(birthYearTF);
            pane.add(currentYear);
            pane.add(currentYearTF);
            pane.add(myAge);
            pane.add(myAgeTF);
            pane.add(calculate);
            pane.add(exit);
		
            setSize(WIDTH, HEIGHT);
            setVisible(true);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            
            }
		
    private class CalculateButtonHandler implements ActionListener
    {
	public void actionPerformed(ActionEvent e)
	{
            int birthYear, currentYear, myAge;
				
		birthYear = Integer.parseInt(birthYearTF.getText());
		currentYear = Integer.parseInt(currentYearTF.getText());
		myAge = currentYear - birthYear;
                                
                myAgeTF.setText("" + myAge);
		
                }
                }
				
    private class ExitButtonHandler implements ActionListener
    {
	public void actionPerformed(ActionEvent e)
	{
            System.exit(0);
				
            }
            }
				
    public static void main(String[]args)
    {
        MyAge myAge = new MyAge();
			
			
	}
	}