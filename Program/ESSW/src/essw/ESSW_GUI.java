
package essw;

import java.awt.EventQueue;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSeparator;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ESSW_GUI extends JFrame {

	private JPanel contentPane_ESSW;
	private int testCounter=0;//nach Test weg
	private String stamm ="System_Time (in sec) : ";
	private JLabel lblButtonFirstFloorFloor;
	private JLabel lblButtonGroundFloorFloor;
	private JLabel lblArrivalLightFirstFloor;
	private JLabel lblArrivalLightGroundFloor;
	private JCheckBox chckbxBellGroundFloor;
	private JCheckBox chckbxBellFirstFloor;
	private JLabel lblButtonGroundFloorElevator;
	private JLabel lblButtonFirstFloorElevator;
	private JLabel lblLeftDoorGroundFloor;
	private JLabel lblRightDoorGroundFloor;
	private JLabel lblLeftDoorFirstFloor;
	private JLabel lblRightDoorFirstFloor;
	private JLabel lblTimePerson1;
	private JLabel lblTimePerson2;
	private JLabel lblperson3FirstFloor;
	private JLabel lblperson2FirstFloor;
	private JLabel lblperson1FirstFloor;
	private JLabel lblperson4FirstFloor;
	private JLabel lblperson5FirstFloor;
	private JLabel lblperson1GroundFloor;
	private JLabel lblperson2GroundFloor;
	private JLabel lblperson3GroundFloor;
	private JLabel lblperson4GroundFloor;
	private JLabel lblperson5GroundFloor;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ESSW_GUI frame = new ESSW_GUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ESSW_GUI() {
		setTitle("System_Time (in sec) : 0");
		setResizable(false);
		setAlwaysOnTop(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 550);
		setVisible(true);
		contentPane_ESSW = new JPanel();
		contentPane_ESSW.setBackground(Color.WHITE);
		contentPane_ESSW.setForeground(Color.BLACK);
		contentPane_ESSW.setVisible(true);
		contentPane_ESSW.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane_ESSW);
		contentPane_ESSW.setLayout(null);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 254, 868, 2);
		contentPane_ESSW.add(separator);
		
		JLabel lblFirstFloor = new JLabel("");
		lblFirstFloor.setBounds(758, 92, 90, 90);
		lblFirstFloor.setIcon(new ImageIcon(ESSW_GUI.class.getResource("/essw/first_floor_icon.jpg")));
		contentPane_ESSW.add(lblFirstFloor);
		
		JLabel lblGroundFloor = new JLabel("");
		lblGroundFloor.setBounds(758, 364, 90, 90);
		lblGroundFloor.setIcon(new ImageIcon(ESSW_GUI.class.getResource("/essw/ground_floor_icon.jpg")));
		contentPane_ESSW.add(lblGroundFloor);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(715, 11, 2, 494);
		separator_1.setOrientation(SwingConstants.VERTICAL);
		contentPane_ESSW.add(separator_1);
		
		lblLeftDoorFirstFloor = new JLabel("");
		lblLeftDoorFirstFloor.setOpaque(true);
		lblLeftDoorFirstFloor.setBackground(Color.BLACK);
		lblLeftDoorFirstFloor.setBounds(384, 103, 110, 140);
		contentPane_ESSW.add(lblLeftDoorFirstFloor);
		
		lblRightDoorFirstFloor = new JLabel("New label");
		lblRightDoorFirstFloor.setOpaque(true);
		lblRightDoorFirstFloor.setForeground(Color.BLACK);
		lblRightDoorFirstFloor.setBackground(Color.BLACK);
		lblRightDoorFirstFloor.setBounds(496, 103, 110, 140);
		contentPane_ESSW.add(lblRightDoorFirstFloor);
		
		lblLeftDoorGroundFloor = new JLabel("");
		lblLeftDoorGroundFloor.setOpaque(true);
		lblLeftDoorGroundFloor.setBackground(Color.BLACK);
		lblLeftDoorGroundFloor.setBounds(384, 370, 110, 140);
		contentPane_ESSW.add(lblLeftDoorGroundFloor);
		
		lblRightDoorGroundFloor = new JLabel("");
		lblRightDoorGroundFloor.setOpaque(true);
		lblRightDoorGroundFloor.setBackground(Color.BLACK);
		lblRightDoorGroundFloor.setBounds(496, 370, 110, 140);
		contentPane_ESSW.add(lblRightDoorGroundFloor);
		
		lblButtonGroundFloorFloor = new JLabel(" Button");
		lblButtonGroundFloorFloor.setBackground(Color.ORANGE);
		lblButtonGroundFloorFloor.setOpaque(true);
		lblButtonGroundFloorFloor.setBounds(334, 465, 40, 14);
		contentPane_ESSW.add(lblButtonGroundFloorFloor);
		
		lblButtonFirstFloorFloor = new JLabel(" Button");
		lblButtonFirstFloorFloor.setBackground(Color.ORANGE);
		lblButtonFirstFloorFloor.setOpaque(true);
		lblButtonFirstFloorFloor.setBounds(333, 198, 40, 14);
		contentPane_ESSW.add(lblButtonFirstFloorFloor);
		
		lblArrivalLightFirstFloor = new JLabel("Arrived");
		lblArrivalLightFirstFloor.setBackground(Color.ORANGE);
		lblArrivalLightFirstFloor.setOpaque(true);
		lblArrivalLightFirstFloor.setHorizontalTextPosition(SwingConstants.CENTER);
		lblArrivalLightFirstFloor.setHorizontalAlignment(SwingConstants.CENTER);
		lblArrivalLightFirstFloor.setBounds(458, 81, 68, 14);
		contentPane_ESSW.add(lblArrivalLightFirstFloor);
		
		lblArrivalLightGroundFloor = new JLabel("Arrived");
		lblArrivalLightGroundFloor.setOpaque(true);
		lblArrivalLightGroundFloor.setBackground(Color.ORANGE);
		lblArrivalLightGroundFloor.setHorizontalTextPosition(SwingConstants.CENTER);
		lblArrivalLightGroundFloor.setHorizontalAlignment(SwingConstants.CENTER);
		lblArrivalLightGroundFloor.setBounds(458, 348, 68, 14);
		contentPane_ESSW.add(lblArrivalLightGroundFloor);
		
		lblButtonFirstFloorElevator = new JLabel(" Button");
		lblButtonFirstFloorElevator.setOpaque(true);
		lblButtonFirstFloorElevator.setBackground(Color.ORANGE);
		lblButtonFirstFloorElevator.setBounds(546, 198, 40, 14);
		contentPane_ESSW.add(lblButtonFirstFloorElevator);
		
		lblButtonGroundFloorElevator = new JLabel(" Button");
		lblButtonGroundFloorElevator.setOpaque(true);
		lblButtonGroundFloorElevator.setBackground(Color.ORANGE);
		lblButtonGroundFloorElevator.setBounds(546, 465, 40, 14);
		contentPane_ESSW.add(lblButtonGroundFloorElevator);
		
		chckbxBellFirstFloor = new JCheckBox("Bell");
		chckbxBellFirstFloor.setEnabled(false);
		chckbxBellFirstFloor.setBounds(562, 77, 57, 23);
		contentPane_ESSW.add(chckbxBellFirstFloor);
		
		chckbxBellGroundFloor = new JCheckBox("Bell");
		chckbxBellGroundFloor.setEnabled(false);
		chckbxBellGroundFloor.setBounds(562, 344, 57, 23);
		contentPane_ESSW.add(chckbxBellGroundFloor);
		
		JButton btnNewButton = new JButton("testIncr. +auf");//nach Test weg
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				increaseTestCounter();
				openElevatorGroundFloor();
				openElevatorFirstFloor();
			}
		});
		btnNewButton.setBounds(164, 29, 110, 23);
		contentPane_ESSW.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Person 2");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 81, 57, 14);
		contentPane_ESSW.add(lblNewLabel);
		
		JLabel lblPerson = new JLabel("Person 1");
		lblPerson.setHorizontalAlignment(SwingConstants.CENTER);
		lblPerson.setBounds(10, 343, 57, 14);
		contentPane_ESSW.add(lblPerson);
		
		JLabel lblNewLabel_1 = new JLabel("Time Pers. 2 (in sec.)");
		lblNewLabel_1.setBounds(10, 11, 122, 14);
		contentPane_ESSW.add(lblNewLabel_1);
		
		JLabel lblTimePers = new JLabel("Time Pers. 1 (in sec.)");
		lblTimePers.setBounds(10, 267, 122, 14);
		contentPane_ESSW.add(lblTimePers);
		
		lblTimePerson2 = new JLabel("time");
		lblTimePerson2.setHorizontalAlignment(SwingConstants.CENTER);
		lblTimePerson2.setBounds(39, 33, 57, 14);
		contentPane_ESSW.add(lblTimePerson2);
		
		lblTimePerson1 = new JLabel("time");
		lblTimePerson1.setHorizontalAlignment(SwingConstants.CENTER);
		lblTimePerson1.setBounds(39, 292, 57, 14);
		contentPane_ESSW.add(lblTimePerson1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(10, 50, 129, 2);
		contentPane_ESSW.add(separator_2);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(10, 310, 129, 2);
		contentPane_ESSW.add(separator_3);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setOrientation(SwingConstants.VERTICAL);
		separator_4.setBounds(137, 11, 2, 41);
		contentPane_ESSW.add(separator_4);
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setOrientation(SwingConstants.VERTICAL);
		separator_5.setBounds(137, 271, 2, 41);
		contentPane_ESSW.add(separator_5);
		
		JButton btnZwei = new JButton("zu");//nach Test weg
		btnZwei.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				closeElevatorGroundFloor();
				closeElevatorFirstFloor();
			}
		});
		btnZwei.setBounds(164, 63, 110, 23);
		contentPane_ESSW.add(btnZwei);
		
		lblperson5FirstFloor = new JLabel("");
		lblperson5FirstFloor.setOpaque(true);
		lblperson5FirstFloor.setIcon(new ImageIcon(ESSW_GUI.class.getResource("/essw/Unbenannt6.png")));
		lblperson5FirstFloor.setBounds(487, 163, 80, 80);
		contentPane_ESSW.add(lblperson5FirstFloor);
		
		lblperson5GroundFloor = new JLabel("");
		lblperson5GroundFloor.setIcon(new ImageIcon(ESSW_GUI.class.getResource("/essw/Unbenannt6.png")));
		lblperson5GroundFloor.setOpaque(true);
		lblperson5GroundFloor.setBounds(487, 430, 80, 80);
		contentPane_ESSW.add(lblperson5GroundFloor);
		
		JLabel lblElevatorBackgroundFirstFloor = new JLabel("");
		lblElevatorBackgroundFirstFloor.setOpaque(true);
		lblElevatorBackgroundFirstFloor.setBackground(Color.DARK_GRAY);
		lblElevatorBackgroundFirstFloor.setBounds(384, 103, 222, 140);
		contentPane_ESSW.add(lblElevatorBackgroundFirstFloor);
		
		JLabel label_2 = new JLabel("");
		label_2.setBackground(Color.DARK_GRAY);
		label_2.setOpaque(true);
		label_2.setBounds(383, 370, 223, 140);
		contentPane_ESSW.add(label_2);
		
		lblperson1FirstFloor = new JLabel("");
		lblperson1FirstFloor.setIcon(new ImageIcon(ESSW_GUI.class.getResource("/essw/Unbenannt.png")));
		lblperson1FirstFloor.setBounds(10, 163, 80, 80);
		contentPane_ESSW.add(lblperson1FirstFloor);
		
		lblperson2FirstFloor = new JLabel("");
		lblperson2FirstFloor.setIcon(new ImageIcon(ESSW_GUI.class.getResource("/essw/Unbenannt.png")));
		lblperson2FirstFloor.setBounds(94, 163, 80, 80);
		contentPane_ESSW.add(lblperson2FirstFloor);
		
		lblperson3FirstFloor = new JLabel("");
		lblperson3FirstFloor.setIcon(new ImageIcon(ESSW_GUI.class.getResource("/essw/Unbenannt.png")));
		lblperson3FirstFloor.setBounds(184, 163, 80, 80);
		contentPane_ESSW.add(lblperson3FirstFloor);
		
		lblperson4FirstFloor = new JLabel("");
		lblperson4FirstFloor.setIcon(new ImageIcon(ESSW_GUI.class.getResource("/essw/Unbenannt.png")));
		lblperson4FirstFloor.setBounds(274, 163, 80, 80);
		contentPane_ESSW.add(lblperson4FirstFloor);
		
		lblperson1GroundFloor = new JLabel("");
		lblperson1GroundFloor.setIcon(new ImageIcon(ESSW_GUI.class.getResource("/essw/Unbenannt.png")));
		lblperson1GroundFloor.setBounds(10, 430, 80, 80);
		contentPane_ESSW.add(lblperson1GroundFloor);
		
		lblperson2GroundFloor = new JLabel("");
		lblperson2GroundFloor.setIcon(new ImageIcon(ESSW_GUI.class.getResource("/essw/Unbenannt.png")));
		lblperson2GroundFloor.setBounds(94, 430, 80, 80);
		contentPane_ESSW.add(lblperson2GroundFloor);
		
		lblperson3GroundFloor = new JLabel("");
		lblperson3GroundFloor.setIcon(new ImageIcon(ESSW_GUI.class.getResource("/essw/Unbenannt.png")));
		lblperson3GroundFloor.setBounds(184, 430, 80, 80);
		contentPane_ESSW.add(lblperson3GroundFloor);
		
		lblperson4GroundFloor = new JLabel("");
		lblperson4GroundFloor.setIcon(new ImageIcon(ESSW_GUI.class.getResource("/essw/Unbenannt.png")));
		lblperson4GroundFloor.setBounds(274, 430, 80, 80);
		contentPane_ESSW.add(lblperson4GroundFloor);
		
		JButton btnDa = new JButton("da");//nach Test weg
		btnDa.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				setlblperson1FirstFloor(true);
				setlblperson2FirstFloor(true);
				setlblperson3FirstFloor(true);
				setlblperson4FirstFloor(true);
				setlblperson5FirstFloor(true);
				setlblperson1GroundFloor(true);
				setlblperson2GroundFloor(true);
				setlblperson3GroundFloor(true);
				setlblperson4GroundFloor(true);
				setlblperson5GroundFloor(true);
			}
		});
		btnDa.setBounds(28, 129, 89, 23);
		contentPane_ESSW.add(btnDa);
		
		JButton btnWeg = new JButton("weg");//nach Test weg
		btnWeg.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setlblperson1FirstFloor(false);
				setlblperson2FirstFloor(false);
				setlblperson3FirstFloor(false);
				setlblperson4FirstFloor(false);
				setlblperson5FirstFloor(false);
				setlblperson1GroundFloor(false);
				setlblperson2GroundFloor(false);
				setlblperson3GroundFloor(false);
				setlblperson4GroundFloor(false);
				setlblperson5GroundFloor(false);
			}
		});
		btnWeg.setBounds(142, 129, 89, 23);
		contentPane_ESSW.add(btnWeg);
		
		JButton btnNewButton_1 = new JButton("an");//nach Test weg
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setlblArrivalLightFirstFloor(true);
				setlblArrivalLightGroundFloor(true);
				setlblButtonFirstFloorElevator(true);
				setlblButtonGroundFloorElevator(true);
				setlblButtonFirstFloorFloor(true);
				setlblButtonGroundFloorFloor(true);
				activateBellFirstFloor();
				activateBellGroundFloor();				
			}
		});
		btnNewButton_1.setBounds(28, 103, 89, 23);
		contentPane_ESSW.add(btnNewButton_1);
		
		JButton btnAus = new JButton("aus");//nach Test weg
		btnAus.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setlblArrivalLightFirstFloor(false);
				setlblArrivalLightGroundFloor(false);
				setlblButtonFirstFloorElevator(false);
				setlblButtonGroundFloorElevator(false);
				setlblButtonFirstFloorFloor(false);
				setlblButtonGroundFloorFloor(false);
				deactivateBellFirstFloor();
				deactivateBellGroundFloor();	
			}
		});
		btnAus.setBounds(142, 103, 89, 23);
		contentPane_ESSW.add(btnAus);
	}
	public void increaseTestCounter()//nach Test weg
	{
		testCounter++;
		setTimeTitle();
		setlblTimePerson1(String.valueOf(testCounter));
		setlblTimePerson2(String.valueOf(testCounter));
		//System.out.println(stamm+String.valueOf(testCounter));
	}
	public void setTimeTitle()
	{
		setTitle(stamm+String.valueOf(testCounter));
	}
 	public void setButtonFloor(boolean isFirstFloor,boolean anAus)
	{
		if(isFirstFloor==false)
			setlblButtonGroundFloorFloor(anAus);
		else
			setlblButtonFirstFloorFloor(anAus);
	}
 	public void setArrivallight(boolean isFirstFloor,boolean anAus)
 	{
 		if(isFirstFloor==false)
 			setlblArrivalLightGroundFloor(anAus);
 		else
 			setlblArrivalLightFirstFloor(anAus);
 	}
 	public void setButtonElevator(boolean isFirstFloor,boolean anAus)
 	{
 		if(isFirstFloor==false)
 			setlblButtonGroundFloorElevator(anAus);
 		else
 			setlblButtonFirstFloorElevator(anAus);
 	}
 	public void activateBell(boolean isFirstFloor)
 	{
 		if(isFirstFloor==false)
 			activateBellGroundFloor();
 		else
 			activateBellFirstFloor();
 	}
	public void deactivateBell(boolean isFirstFloor)
 	{
 		if(isFirstFloor==false)
 			deactivateBellGroundFloor();
 		else
 			deactivateBellFirstFloor();
 	}
	public void setTimePerson(boolean isPerson2,String time)
	{
		if(isPerson2==false)
			setlblTimePerson1(time);
		else
			setlblTimePerson2(time);
	}
	public void openElevator(boolean isFirstFloor)
	{
		if(isFirstFloor==false)
			openElevatorGroundFloor();
		else
			openElevatorFirstFloor();
	}
	public void closeElevator(boolean isFirstFloor)
	{
		if(isFirstFloor==false)
			closeElevatorGroundFloor();
		else
			closeElevatorFirstFloor();
	}
	public void setPersonVisibleTrue(boolean isFirstFloor,int nummer )
	{
		if(isFirstFloor==false)
		{
			switch(nummer)
			{
			case 1:
				setlblperson1GroundFloor(true);
				break;
			case 2:
				setlblperson2GroundFloor(true);
				break;
			case 3:
				setlblperson3GroundFloor(true);
				break;
			case 4:
				setlblperson4GroundFloor(true);
				break;
			case 5:
				setlblperson5GroundFloor(true);
				break;
			}
		}
		else
		{
			switch(nummer)
			{
			case 1:
				setlblperson1FirstFloor(true);
				break;
			case 2:
				setlblperson2FirstFloor(true);
				break;
			case 3:
				setlblperson3FirstFloor(true);
				break;
			case 4:
				setlblperson4FirstFloor(true);
				break;
			case 5:
				setlblperson5FirstFloor(true);
				break;
			}			
		}
		
	}
	public void setPersonVisibleFalse(boolean isFirstFloor,int nummer )
	{
		if(isFirstFloor==false)
		{
			switch(nummer)
			{
			case 1:
				setlblperson1GroundFloor(false);
				break;
			case 2:
				setlblperson2GroundFloor(false);
				break;
			case 3:
				setlblperson3GroundFloor(false);
				break;
			case 4:
				setlblperson4GroundFloor(false);
				break;
			case 5:
				setlblperson5GroundFloor(false);
				break;
			}
		}
		else
		{
			switch(nummer)
			{
			case 1:
				setlblperson1FirstFloor(false);
				break;
			case 2:
				setlblperson2FirstFloor(false);
				break;
			case 3:
				setlblperson3FirstFloor(false);
				break;
			case 4:
				setlblperson4FirstFloor(false);
				break;
			case 5:
				setlblperson5FirstFloor(false);
				break;
			}			
		}		
	}
	private void setlblButtonFirstFloorFloor(boolean anAus)
	{
		if(anAus==false)
			lblButtonFirstFloorFloor.setBackground(Color.ORANGE);
		else
			lblButtonFirstFloorFloor.setBackground(Color.GREEN);
	}
	private void setlblButtonGroundFloorFloor(boolean anAus)
	{
		if(anAus==false)
			lblButtonGroundFloorFloor.setBackground(Color.ORANGE);
		else
			lblButtonGroundFloorFloor.setBackground(Color.GREEN);
	}
	private void setlblArrivalLightFirstFloor(boolean anAus)
	{
		if(anAus==false)
			lblArrivalLightFirstFloor.setBackground(Color.ORANGE);
		else
			lblArrivalLightFirstFloor.setBackground(Color.GREEN);		
	}
	private void setlblArrivalLightGroundFloor(boolean anAus)
	{
		if(anAus==false)
			lblArrivalLightGroundFloor.setBackground(Color.ORANGE);
		else
			lblArrivalLightGroundFloor.setBackground(Color.GREEN);		
	}
	private void setlblButtonGroundFloorElevator(boolean anAus)
	{
		if(anAus==false)
			lblButtonGroundFloorElevator.setBackground(Color.ORANGE);
		else
			lblButtonGroundFloorElevator.setBackground(Color.GREEN);	
	}
	private void setlblButtonFirstFloorElevator(boolean anAus)
	{
		if(anAus==false)
			lblButtonFirstFloorElevator.setBackground(Color.ORANGE);
		else
			lblButtonFirstFloorElevator.setBackground(Color.GREEN);	
	}
	private void activateBellGroundFloor()
	{
		chckbxBellGroundFloor.setSelected(true);
		java.awt.Toolkit.getDefaultToolkit().beep();
	}
	private void deactivateBellGroundFloor()
	{
		chckbxBellGroundFloor.setSelected(false);
	}
	private void activateBellFirstFloor()
	{
		chckbxBellFirstFloor.setSelected(true);
		java.awt.Toolkit.getDefaultToolkit().beep();
	}
	private void deactivateBellFirstFloor()
	{
		chckbxBellFirstFloor.setSelected(false);
	}
	private void setlblTimePerson1(String value)
	{
		lblTimePerson1.setText(value);
	}
	private void setlblTimePerson2(String value)
	{
		lblTimePerson2.setText(value);		
	}
	private void openElevatorGroundFloor()
	{
		//110 width ->10 width
		//140 heigth ->140 heigth
		if(lblLeftDoorGroundFloor.getWidth()<=10)
			return;

		lblLeftDoorGroundFloor.setBounds(lblLeftDoorGroundFloor.getX(), lblLeftDoorGroundFloor.getY(), 
										lblLeftDoorGroundFloor.getWidth()-100,lblLeftDoorGroundFloor.getHeight());
		lblRightDoorGroundFloor.setBounds(lblRightDoorGroundFloor.getX()+100,lblRightDoorGroundFloor.getY(),
										lblRightDoorGroundFloor.getWidth()-100,lblRightDoorGroundFloor.getHeight());
	}
	private void openElevatorFirstFloor()
	{
		//110 width ->10 width
		//140 heigth ->140 heigth
		if(lblLeftDoorFirstFloor.getWidth()<=10)
			return;

		lblLeftDoorFirstFloor.setBounds(lblLeftDoorFirstFloor.getX(), lblLeftDoorFirstFloor.getY(), 
										lblLeftDoorFirstFloor.getWidth()-100,lblLeftDoorFirstFloor.getHeight());
		lblRightDoorFirstFloor.setBounds(lblRightDoorFirstFloor.getX()+100,lblRightDoorFirstFloor.getY(),
										lblRightDoorFirstFloor.getWidth()-100,lblRightDoorFirstFloor.getHeight());
	}
	private void closeElevatorGroundFloor()
	{
		//10 width ->110 width
		//140 heigth ->140 heigth
		if(lblLeftDoorGroundFloor.getWidth()>=110)
			return;
		
		lblLeftDoorGroundFloor.setBounds(lblLeftDoorGroundFloor.getX(), lblLeftDoorGroundFloor.getY(), 
				lblLeftDoorGroundFloor.getWidth()+100,lblLeftDoorGroundFloor.getHeight());
		lblRightDoorGroundFloor.setBounds(lblRightDoorGroundFloor.getX()-100,lblRightDoorGroundFloor.getY(),
				lblRightDoorGroundFloor.getWidth()+100,lblRightDoorGroundFloor.getHeight());
	}
	private void closeElevatorFirstFloor()
	{
		
		//10 width ->110 width
		//140 heigth ->140 heigth
		if(lblLeftDoorFirstFloor.getWidth()>=110)
			return;
		
		lblLeftDoorFirstFloor.setBounds(lblLeftDoorFirstFloor.getX(), lblLeftDoorFirstFloor.getY(), 
				lblLeftDoorFirstFloor.getWidth()+100,lblLeftDoorFirstFloor.getHeight());
		lblRightDoorFirstFloor.setBounds(lblRightDoorFirstFloor.getX()-100,lblRightDoorFirstFloor.getY(),
				lblRightDoorFirstFloor.getWidth()+100,lblRightDoorFirstFloor.getHeight());
	}
	private void setlblperson1FirstFloor(boolean daWeg)
	{
		if(daWeg==false)
			lblperson1FirstFloor.setVisible(false);
		else
			lblperson1FirstFloor.setVisible(true);	
	}
	private void setlblperson2FirstFloor(boolean daWeg)
	{
		if(daWeg==false)
			lblperson2FirstFloor.setVisible(false);
		else
			lblperson2FirstFloor.setVisible(true);	
	}
	private void setlblperson3FirstFloor(boolean daWeg)
	{
		if(daWeg==false)
			lblperson3FirstFloor.setVisible(false);
		else
			lblperson3FirstFloor.setVisible(true);	
	}
	private void setlblperson4FirstFloor(boolean daWeg)
	{
		if(daWeg==false)
			lblperson4FirstFloor.setVisible(false);
		else
			lblperson4FirstFloor.setVisible(true);	
	}
	private void setlblperson5FirstFloor(boolean daWeg)
	{
		if(daWeg==false)
			lblperson5FirstFloor.setVisible(false);
		else
			lblperson5FirstFloor.setVisible(true);	
	}
	private void setlblperson1GroundFloor(boolean daWeg)
	{
		if(daWeg==false)
			lblperson1GroundFloor.setVisible(false);
		else
			lblperson1GroundFloor.setVisible(true);	
	}
	private void setlblperson2GroundFloor(boolean daWeg)
	{
		if(daWeg==false)
			lblperson2GroundFloor.setVisible(false);
		else
			lblperson2GroundFloor.setVisible(true);	
	}
	private void setlblperson3GroundFloor(boolean daWeg)
	{
		if(daWeg==false)
			lblperson3GroundFloor.setVisible(false);
		else
			lblperson3GroundFloor.setVisible(true);	
	}
	private void setlblperson4GroundFloor(boolean daWeg)
	{
		if(daWeg==false)
			lblperson4GroundFloor.setVisible(false);
		else
			lblperson4GroundFloor.setVisible(true);	
	}
	private void setlblperson5GroundFloor(boolean daWeg)
	{
		if(daWeg==false)
			lblperson5GroundFloor.setVisible(false);
		else
			lblperson5GroundFloor.setVisible(true);	
	}
}