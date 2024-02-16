import javax.swing.*;
import java.awt.*;

public class Login {

    public static void main(String[] args) {
        
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.BLACK);
        
        JLabel label = new JLabel("Bienvenido al sistema");
        label.setForeground(Color.WHITE);
        label.setFont(new Font("Arial", Font.BOLD, 24));
        label.setBounds(50, 20, 200, 30);
        panel.add(label);
        
        JLabel correoLabel = new JLabel("Correo electrónico:");
        correoLabel.setForeground(Color.WHITE);
        correoLabel.setBounds(20, 70, 120, 20);
        panel.add(correoLabel);
        
        JTextField correoTextField = new JTextField();
        correoTextField.setBounds(150, 70, 120, 20);
        panel.add(correoTextField);
        
        JLabel contraseñaLabel = new JLabel("Contraseña:");
        contraseñaLabel.setForeground(Color.WHITE);
        contraseñaLabel.setBounds(20, 100, 120, 20);
        panel.add(contraseñaLabel);
        
        JPasswordField contraseñaField = new JPasswordField();
        contraseñaField.setBounds(150, 100, 120, 20);
        panel.add(contraseñaField);
        
        JButton accederButton = new JButton("ACCEDER");
        accederButton.setBounds(100, 140, 100, 30);
        accederButton.setEnabled(false);
        panel.add(accederButton);
        
        JFrame ventana = new JFrame();
        ventana.add(panel);
        
        ventana.setSize(300, 200);
        ventana.setTitle("Mi Ventana");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
    }
}
