import javax.swing.JOptionPane;

public class Greeter 
{public static void main(String[] args)

	
	{
	System.out.println("oi");
	String name = JOptionPane.showInputDialog("Enter your name");
	JOptionPane.showMessageDialog(null, "Hello " + name);
}
}
