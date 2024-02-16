import javax.swing.JFrame;

public class Ventana extends JFrame {

    public Ventana() {
        setTitle("Mi Ventana");
        setSize(400, 300); 
        setLocationRelativeTo(null); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    }	
    
	public static void main(String[] args) {

		Ventana ventana = new Ventana();
		ventana.setVisible(true);

	}

}
