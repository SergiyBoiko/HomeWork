import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class SimpleDesing extends JFrame{
	private static JButton button = new JButton("Check");
	private JPanel panel = new JPanel();
	private static JTextField inputField = new JTextField();
	private static JTextArea outputField = new JTextArea();
	private static JFrame window;
	public SimpleDesing(){
		super("ValidatePhone");
		panel.setLayout(null);
		button.setSize(80, 20);
		button.setLocation(200,20);
		panel.add(button);
		inputField.setSize(170, 20);
		inputField.setLocation(20,20);
		panel.add(inputField);
		outputField.setSize(260, 100);
		outputField.setLocation(20,50);
		outputField.setEditable(false);
		panel.add(outputField);
		setContentPane(panel);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);		
		setSize(300, 200);

	}
	public static void main (String [] args) {

		button.addActionListener(e ->{
			if(ValidateNumber.checkPhoneNumber(inputField.getText())==false){
				outputField.setText(inputField.getText()+" - "+"Phone number incorrect\n"+"Please enter the phone number");
				inputField.setText("");

			}else{
				outputField.setText(inputField.getText()+" - "+"Phone number correct\n"+
						""+Calculations.calculationCharNumber(inputField.getText()));
				inputField.setText("");
			}
		});

		window = new SimpleDesing();
		window.setVisible(true);
	}
}