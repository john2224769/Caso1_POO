package vista;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelEntradaDatos extends JPanel
{
    // atributos 

    private JLabel lbImagen;
    private ImageIcon iImagen;
    private JLabel lbRadio;
    private JTextField tfRadio;

    // metodos 

    // metodo constructor

    public PanelEntradaDatos ()
    {
        this.setLayout(null);
        this.setBackground(Color.yellow);

        // Creacion y adicion de la imagen al panel
        iImagen = new ImageIcon(getClass().getResource("/vista/circulo.png"));
        lbImagen = new JLabel(iImagen);
        lbImagen.setBounds(20, 15, 200, 200);
        this.add(lbImagen);

        // Creacion y adicion de etiqueta label lbRadio
        lbRadio = new JLabel("Radio :");
        lbRadio.setFont(new Font("Arial", Font.BOLD, 20));
        lbRadio.setForeground(Color.orange);
        lbRadio.setBounds(260, 115, 100, 20);
        this.add(lbRadio);

        // Creacion y adicion de caja de texto tfRadio
        tfRadio = new JTextField();
        tfRadio.setBounds(360, 115, 100, 25);
        this.add(tfRadio);

        // Borde del panel
        TitledBorder borde = BorderFactory.createTitledBorder("Datos de entrada");
        borde.setTitleColor(Color.red);
        this.setBorder(borde);
    }

    // Metodo de acceso a la informacion 
    public String gerRadio ()
    {
        return tfRadio.getText();
    }

    // Borrar el contenido de la caja de texto
    public void borrar()
    {
        tfRadio.setText(" ");
    }
}