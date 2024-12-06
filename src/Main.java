import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Main 
{
	private static int num1 = 0; 
    private static String operation = "";
    
	public static void main(String[] args) 
	{
		
		JFrame Tframe = new JFrame();
		Tframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Tframe.setSize(500 , 500);
		Tframe.setLayout(new BorderLayout());
		
		JTextField tf = new JTextField(15);
		
		JButton button = new JButton();
		button.setText("Reset");
		
		button.addActionListener(new ActionListener()
				{

					@Override
					public void actionPerformed(ActionEvent e) 
					{
						tf.setText("");
					}
			
				}
				);
		
		JLabel label = new JLabel();
		label.setText("Enter Number : ");
		label.setFont(new Font("MV Boli" , Font.BOLD , 14));
		
		JPanel TextPanel = new JPanel();
		TextPanel.setLayout(new FlowLayout());
		TextPanel.setBounds(0 , 0 , 500 , 100);
		TextPanel.add(label);
		TextPanel.add(tf);
		TextPanel.add(button);
		
		JButton butt9 = new JButton();
		butt9.setText("9");
		JButton butt8 = new JButton();
		butt8.setText("8");
		JButton butt7 = new JButton();
		butt7.setText("7");
		JButton butt6 = new JButton();
		butt6.setText("6");
		JButton butt5 = new JButton();
		butt5.setText("5");
		JButton butt4 = new JButton();
		butt4.setText("4");
		JButton butt3 = new JButton();
		butt3.setText("3");
		JButton butt2 = new JButton();
		butt2.setText("2");
		JButton butt1 = new JButton();
		butt1.setText("1");
		JButton butt0 = new JButton();
		butt0.setText("0");
		JButton buttpl = new JButton();
		buttpl.setText("+");
		JButton buttmin = new JButton();
		buttmin.setText("-");
		JButton buttmul = new JButton();
		buttmul.setText("*");
		JButton buttdiv = new JButton();
		buttdiv.setText("/");
		JButton butteq = new JButton();
		butteq.setText("=");
		JButton buttcl = new JButton();
		buttcl.setText("C");
		
		
		
		JPanel ButtPanel = new JPanel();
		ButtPanel.setLayout(new GridLayout(4,3,5,5));
		ButtPanel.setBounds(100 , 100 , 500 , 100);
		ButtPanel.add(butt9);
		ButtPanel.add(butt8);
		ButtPanel.add(butt7);
		ButtPanel.add(butt6);
		ButtPanel.add(butt5);
		ButtPanel.add(butt4);
		ButtPanel.add(butt3);
		ButtPanel.add(butt2);
		ButtPanel.add(butt1);
		ButtPanel.add(butt0);
		ButtPanel.add(buttpl);
		ButtPanel.add(buttmin);
		ButtPanel.add(buttmul);
		ButtPanel.add(buttdiv);
		ButtPanel.add(butteq);
		ButtPanel.add(buttcl);
		
		buttcl.addActionListener(new ActionListener()
				{

					@Override
					public void actionPerformed(ActionEvent e) 
					{
						tf.setText("");
					}
			
				}
				);
		butt9.addActionListener(new ActionListener()
				{

					@Override
					public void actionPerformed(ActionEvent e) 
					{
						String currentText = tf.getText();
				        tf.setText(currentText + "9");
					}
			
				}
				);
		butt8.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				String currentText = tf.getText();
		        tf.setText(currentText + "8");
			}
	
		}
		);
		
		butt7.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				String currentText = tf.getText();
		        tf.setText(currentText + "7");
			}
	
		}
		);
		
		butt6.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				String currentText = tf.getText();
		        tf.setText(currentText + "6");
			}
	
		}
		);
		
		butt5.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				String currentText = tf.getText();
		        tf.setText(currentText + "5");
			}
	
		}
		);
		
		butt4.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				String currentText = tf.getText();
		        tf.setText(currentText + "4");
			}
	
		}
		);
		
		butt3.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				String currentText = tf.getText();
		        tf.setText(currentText + "3");
			}
	
		}
		);
		
		butt2.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				String currentText = tf.getText();
		        tf.setText(currentText + "2");
			}
	
		}
		);
		
		butt1.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				String currentText = tf.getText();
		        tf.setText(currentText + "1");
			}
	
		}
		);
		
		butt0.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				String currentText = tf.getText();
		        tf.setText(currentText + "0");
			}
	
		}
		);
		
		buttpl.addActionListener(new ActionListener()
				{

					@Override
					public void actionPerformed(ActionEvent e) 
					{
						 try 
						 {
			                    num1 = Integer.parseInt(tf.getText());
			                    operation = "+";
			                    tf.setText(""); 
			                } 
						 catch (NumberFormatException ex) 
						 {
			                    tf.setText("Invalid Input");
			                }
					}
				}
			
				);
		buttmin.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				 try 
				 {
	                    num1 = Integer.parseInt(tf.getText());
	                    operation = "-";
	                    tf.setText(""); 
	                } 
				 catch (NumberFormatException ex) 
				 {
	                    tf.setText("Invalid Input");
	                }
			}
		}
	
		);
		
		buttmul.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				 try 
				 {
	                    num1 = Integer.parseInt(tf.getText());
	                    operation = "*";
	                    tf.setText(""); 
	                } 
				 catch (NumberFormatException ex) 
				 {
	                    tf.setText("Invalid Input");
	                }
			}
		}
		);
		
		buttdiv.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				 try 
				 {
	                    num1 = Integer.parseInt(tf.getText());
	                    operation = "/";
	                    tf.setText(""); 
	                } 
				 catch (NumberFormatException ex) 
				 {
	                    tf.setText("Invalid Input");
	                }
			}
		}
	
		);

		butteq.addActionListener(new ActionListener()
				{

					@Override
					public void actionPerformed(ActionEvent e) 
					{
						try 
						{    
		                    int num2 = Integer.parseInt(tf.getText());
		                    float result = 0;
		                    if (operation.equals("+")) 
		                    {
		                        result = num1 + num2;
		                    }
		                    else if (operation.equals("-"))
		                    {
		                    	result = num1 - num2;
		                    }
		                    else if (operation.equals("*"))
		                    {
		                    	result = num1 * num2;
		                    }
		                    else if (operation.equals("/"))
		                    {
		                    	result = num1 / num2;
		                    }
		                    tf.setText(String.valueOf(result));

		                    operation = "";
		                } 
						catch (NumberFormatException ex) 
						{
		                    tf.setText("Invalid Input");
		                }	
					}
				}
				);
		
		Tframe.add(TextPanel, BorderLayout.NORTH); 
        Tframe.add(ButtPanel, BorderLayout.CENTER);
		Tframe.setVisible(true);
		

	}

}