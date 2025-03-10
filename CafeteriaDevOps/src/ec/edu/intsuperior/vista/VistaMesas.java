package ec.edu.intsuperior.vista;

import javax.swing.*;
import java.awt.*;

public class VistaMesas extends JFrame {
    private JTable tablaMesas;
    private JButton btnLiberar, btnOcupar;

    public VistaMesas() {
        setTitle("Control de Mesas");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panelPrincipal = new JPanel(new BorderLayout());

        // Tabla de mesas con datos de ejemplo
        tablaMesas = new JTable(new Object[][]{
            {"Mesa 1", "Disponible"},
            {"Mesa 2", "Ocupada"},
            {"Mesa 3", "Disponible"}
        }, new String[]{"Mesa", "Estado"});
        panelPrincipal.add(new JScrollPane(tablaMesas), BorderLayout.CENTER);

        // Panel de botones
        JPanel panelBotones = new JPanel();
        btnLiberar = new JButton("Liberar Mesa");
        btnOcupar = new JButton("Ocupar Mesa");
        panelBotones.add(btnLiberar);
        panelBotones.add(btnOcupar);
        panelPrincipal.add(panelBotones, BorderLayout.SOUTH);

        add(panelPrincipal);
    }

    // Getters para componentes
    public JButton getBtnLiberar() {
        return btnLiberar;
    }
    public JButton getBtnOcupar() {
        return btnOcupar;
    }
    public JTable getTablaMesas() {
        return tablaMesas;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new VistaMesas().setVisible(true);
        });
    }
}
