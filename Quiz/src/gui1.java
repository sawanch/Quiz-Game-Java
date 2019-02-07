import javax.swing.*;

class gui1 {
	public static void main(String args[]) {
		Demo f = new Demo();
		f.setTitle("QUIZ");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setBounds(200, 200, 500, 500);

		f.setVisible(true);
	}

}

class Demo extends JFrame {

	// Declaration of object of JRadioButton class.
	JRadioButton jRadioButton1, jRadioButton2, jRadioButton3, jRadioButton4;

	// Declaration of object of JButton class.
	JButton jButton;

	// Declaration of object of ButtonGroup class.
	ButtonGroup G1;

	// Declaration of object of JLabel class.
	JLabel L1;

	// Constructor of Demo class.
	public Demo() {

		// Setting layout as null of JFrame.
		this.setLayout(null);

		// Initialization of object of "JRadioButton" class.
		jRadioButton1 = new JRadioButton();

		jRadioButton2 = new JRadioButton();

		jRadioButton3 = new JRadioButton();

		jRadioButton4 = new JRadioButton();

		// Initialization of object of "JButton" class.
		jButton = new JButton("Next");

		// Initialization of object of "ButtonGroup" class.
		G1 = new ButtonGroup();

		// Initialization of object of " JLabel" class.
		L1 = new JLabel("Que1:Which one among these is not a datatype");

		// setText(...) function is used to set text of radio button.
		// Setting text of "jRadioButton1".
		jRadioButton1.setText("int");

		// Setting text of "jRadioButton2".
		jRadioButton2.setText("float");

		// Setting text of "jRadioButton3".
		jRadioButton3.setText("boolean");
		// Setting text of "jRadioButton4".
		jRadioButton4.setText("char");

		// Setting Bounds of "jRadioButton1".
		jRadioButton1.setBounds(40, 50, 120, 50);

		// Setting Bounds of "jRadioButton2".
		jRadioButton2.setBounds(40, 100, 120, 50);

		// Setting Bounds of "jRadioButton3".
		jRadioButton3.setBounds(40, 150, 120, 50);

		// Setting Bounds of "jRadioButton4".
		jRadioButton4.setBounds(40, 200, 120, 50);

		// Setting Bounds of "jButton".
		jButton.setBounds(125, 300, 80, 30);

		// Setting Bounds of JLabel "L1".
		L1.setBounds(20, 20, 400, 50);

		// "this" keyword in java refers to current object.
		// Adding "jRadioButton1" on JFrame.
		this.add(jRadioButton1);

		// Adding "jRadioButton2" on JFrame.
		this.add(jRadioButton2);

		// Adding "jRadioButton3" on JFrame.
		this.add(jRadioButton3);

		// Adding "jRadioButton4" on JFrame.
		this.add(jRadioButton4);

		// Adding "jButton" on JFrame.
		this.add(jButton);

		// Adding JLabel "L2" on JFrame.
		this.add(L1);

		// Adding "jRadioButton1" and "jRadioButton3" in a Button Group "G2".
		G1.add(jRadioButton1);
		G1.add(jRadioButton2);
	}
}
