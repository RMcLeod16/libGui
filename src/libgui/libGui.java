package libgui;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 * Class Library that helps create and locate various GUI elements into a container.
 * 
 * @author Russell McLeod
 *
 */
public class libGui extends Container
{
	/**
	 * Method to create a JLabel and add it to a SpringLayout and Container.
	 * 
	 * @param _layout
	 * The SpringLayout to add the JLabel to.
	 * 
	 * @param _labelText
	 * The text to display on the JLabel.
	 * 
	 * @param _x
	 * The x coordinate for the location of the JLabel.
	 * 
	 * @param _y
	 * The y coordinate for the location of the JLabel.
	 * 
	 * @param _container
	 * The container in which to add the JLabel.
	 * 
	 * @return
	 * The created JLabel with location constraints.
	 */
	public static JLabel LocateALabel(SpringLayout _layout, String _labelText, int _x, int _y, Container _container)
	{
		JLabel _jLabel = new JLabel(_labelText);
		_container.add(_jLabel);
		_layout.putConstraint(SpringLayout.WEST, _jLabel, _x, SpringLayout.WEST, _container);
		_layout.putConstraint(SpringLayout.NORTH, _jLabel, _y, SpringLayout.NORTH, _container);
		return _jLabel;
	}
	
	/**
	 * Method to create a JTextField and add it to a SpringLayout and Container.
	 * 
	 * @param _layout
	 * The SpringLayout to add the JTextField to.
	 * 
	 * @param _width
	 * The Width (In no. of characters) of the JTextField.
	 * 
	 * @param _x
	 * The x coordinate for the location of the JTextField.
	 * 
	 * @param _y
	 * The y coordinate for the location of the JTextField.
	 * 
	 * @param _container
	 * The container in which to add the JTextField.
	 * 
	 * @return
	 * The created JTextField with location constraints.
	 */
	public static JTextField LocateATextField(SpringLayout _layout, int _width, int _x, int _y, Container _container)
	{
		JTextField _jTextField = new JTextField(_width);
		_jTextField.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		_container.add(_jTextField);
		_layout.putConstraint(SpringLayout.WEST, _jTextField, _x, SpringLayout.WEST, _container);
		_layout.putConstraint(SpringLayout.NORTH, _jTextField, _y, SpringLayout.NORTH, _container);
		return _jTextField;
	}
	
	/**
	 * Method to create a JButton and add it to a SpringLayout and Container.
	 * 
	 * @param _layout
	 * The SpringLayout to add the JButton to.
	 * 
	 * @param buttonText
	 * The text to display on the JButton.
	 * 
	 * @param _x
	 * The x coordinate for the location of the JButton.
	 * 
	 * @param _y
	 * The y coordinate for the location of the JButton.
	 * 
	 * @param _container
	 * The container in which to add the JButton.
	 * 
	 * @param _actionListener
	 * The ActionListener to add to the JButton.
	 * 
	 * @return
	 * The created JButton with location constraints.
	 */
	public static JButton LocateAButton(SpringLayout _layout, String buttonText, int _x, int _y, Container _container, ActionListener _actionListener)
	{
		JButton _jButton = new JButton(buttonText);
		_container.add(_jButton);
		_jButton.addActionListener(_actionListener);
		_layout.putConstraint(SpringLayout.WEST, _jButton, _x, SpringLayout.WEST, _container);
		_layout.putConstraint(SpringLayout.NORTH, _jButton, _y, SpringLayout.NORTH, _container);
		return _jButton;
	}
	
	/**
	 * Method to create a JComboBox and add it to a SpringLayout and Container.
	 * 
	 * @param _layout
	 * The SpringLayout to add the JComboBox to.
	 * 
	 * @param _items
	 * A String array of the list items to add to the JComboBox.
	 * 
	 * @param _x
	 * The x coordinate for the location of the JComboBox.
	 * 
	 * @param _y
	 * The y coordinate for the location of the JComboBox.
	 * 
	 * @param _container
	 * The container in which to add the JComboBox.
	 * 
	 * @return
	 * The created JComboBox with location constraints.
	 */
	public static JComboBox<Object> LocateAComboBox(SpringLayout _layout, String[] _items, int _x, int _y, Container _container)
	{
		JComboBox<Object> _jComboBox = new JComboBox<Object>(_items);
		_container.add(_jComboBox);
		_layout.putConstraint(SpringLayout.WEST, _jComboBox, _x, SpringLayout.WEST, _container);
		_layout.putConstraint(SpringLayout.NORTH, _jComboBox, _y, SpringLayout.NORTH, _container);
		return _jComboBox;
	}
	
	/**
	 * Method to create a JPanel and add it to a SpringLayout and Container.
	 * 
	 * @param _layout
	 * The SpringLayout to add the JComboBox to.
	 * 
	 * @param _x
	 * The x coordinate for the location of the JComboBox.
	 * 
	 * @param _y
	 * The y coordinate for the location of the JComboBox.
	 * 
	 * @param _width
	 * Thew width of the JPanel.
	 * 
	 * @param _height
	 * The Height of the JPanel.
	 * 
	 * @param _container
	 * The container in which to add the JPanel.
	 * 
	 * @return
	 * The created JPanel with location constraints.
	 */
	public static JPanel LocateAPanel(SpringLayout _layout, int _x, int _y, int _width, int _height, Container _container)
	{
		JPanel _jPanel = new JPanel();
		_jPanel.setPreferredSize(new Dimension(_width, _height));
		_container.add(_jPanel);
		_layout.putConstraint(SpringLayout.WEST, _jPanel, _x, SpringLayout.WEST, _container);
		_layout.putConstraint(SpringLayout.NORTH, _jPanel, _y, SpringLayout.NORTH, _container);
		_jPanel.setLayout(_layout);
		return _jPanel;
	}
}
