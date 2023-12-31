package actividad_1_1_a.Interfaces;

import actividad_1_1_a.Clases.BoletinPublicado;
import actividad_1_1_a.Clases.ComprobacionDeErrores;
import actividad_1_1_a.Clases.RevistaPublicada;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class RegistroBoletin extends javax.swing.JFrame {

    ArrayList<BoletinPublicado> nuevoBoletinPublicados = new ArrayList<>();
    ArrayList<RevistaPublicada> nuevaRevistaPublicadas = new ArrayList<>();

    public RegistroBoletin(ArrayList<BoletinPublicado> array, ArrayList<RevistaPublicada> array2) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.nuevoBoletinPublicados = array;
        this.nuevaRevistaPublicadas = array2;

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        registroBoletinJPanel = new javax.swing.JPanel();
        resgitroBoletinJLabel = new javax.swing.JLabel();
        nombreBoletinJLabel = new javax.swing.JLabel();
        nombreBoletinJTextField = new javax.swing.JTextField();
        fechaBoletinJLabel = new javax.swing.JLabel();
        fechaBoletinJTextField = new javax.swing.JTextField();
        numeroDePaginasJLabel = new javax.swing.JLabel();
        numeroDePaginasJTextField = new javax.swing.JTextField();
        precioBoletinJLabel = new javax.swing.JLabel();
        precioBoletinJTextField = new javax.swing.JTextField();
        registrarBoletinJButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(390, 250));
        setResizable(false);

        registroBoletinJPanel.setMaximumSize(new java.awt.Dimension(390, 250));
        registroBoletinJPanel.setMinimumSize(new java.awt.Dimension(390, 250));
        registroBoletinJPanel.setPreferredSize(new java.awt.Dimension(390, 250));

        resgitroBoletinJLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        resgitroBoletinJLabel.setText("REGISTRO BOLET�N");

        nombreBoletinJLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        nombreBoletinJLabel.setText("Nombre:");

        fechaBoletinJLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        fechaBoletinJLabel.setText("Fecha:");

        numeroDePaginasJLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        numeroDePaginasJLabel.setText("N�mero de paginas:");

        precioBoletinJLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        precioBoletinJLabel.setText("Precio:");

        registrarBoletinJButton.setText("REGISTRAR");
        registrarBoletinJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarBoletinJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout registroBoletinJPanelLayout = new javax.swing.GroupLayout(registroBoletinJPanel);
        registroBoletinJPanel.setLayout(registroBoletinJPanelLayout);
        registroBoletinJPanelLayout.setHorizontalGroup(
            registroBoletinJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registroBoletinJPanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(registroBoletinJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(resgitroBoletinJLabel)
                    .addGroup(registroBoletinJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(registroBoletinJPanelLayout.createSequentialGroup()
                            .addGroup(registroBoletinJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(nombreBoletinJLabel)
                                .addComponent(fechaBoletinJLabel))
                            .addGap(18, 18, 18)
                            .addGroup(registroBoletinJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(fechaBoletinJTextField)
                                .addComponent(nombreBoletinJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(registroBoletinJPanelLayout.createSequentialGroup()
                            .addComponent(numeroDePaginasJLabel)
                            .addGap(18, 18, 18)
                            .addComponent(numeroDePaginasJTextField))
                        .addGroup(registroBoletinJPanelLayout.createSequentialGroup()
                            .addComponent(precioBoletinJLabel)
                            .addGap(18, 18, 18)
                            .addComponent(precioBoletinJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(registrarBoletinJButton))))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        registroBoletinJPanelLayout.setVerticalGroup(
            registroBoletinJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registroBoletinJPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(resgitroBoletinJLabel)
                .addGap(18, 18, 18)
                .addGroup(registroBoletinJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreBoletinJLabel)
                    .addComponent(nombreBoletinJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(registroBoletinJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fechaBoletinJLabel)
                    .addComponent(fechaBoletinJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(registroBoletinJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numeroDePaginasJLabel)
                    .addComponent(numeroDePaginasJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(registroBoletinJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(precioBoletinJLabel)
                    .addComponent(precioBoletinJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(registrarBoletinJButton))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(registroBoletinJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(registroBoletinJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registrarBoletinJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarBoletinJButtonActionPerformed

        boolean estaMal = false;
        BoletinPublicado nuevoBoletinPublicado = new BoletinPublicado();
        ComprobacionDeErrores ex = new ComprobacionDeErrores();
        String stringDelDialogo = "[i] Detectado varios errores: \n";

       
        if (!nombreBoletinJTextField.getText().isEmpty()) {

            nuevoBoletinPublicado.setNombre(nombreBoletinJTextField.getText());

        } else {

            stringDelDialogo += " - El nombre del bolet�n esta vacio.\n";
            estaMal = true;
        }

        if (!fechaBoletinJTextField.getText().isEmpty()
                && ex.comprobarFechaFormato(fechaBoletinJTextField.getText())) {

            nuevoBoletinPublicado.setFecha(fechaBoletinJTextField.getText());
        } else {

            stringDelDialogo += " - La fecha debe tener el formato XX/XX/XXXX y tiene que tener los meses y dias correctos y no puede estar vac�o.\n";
            estaMal = true;
        }

        if (!numeroDePaginasJTextField.getText().isEmpty()
                && ex.comprobarNumeroDePagina(numeroDePaginasJTextField.getText())
                && !ex.comprobarNumerosNegativos(Integer.parseInt(numeroDePaginasJTextField.getText()))) {

            nuevoBoletinPublicado.setNumeroDePaginas(Integer.parseInt(numeroDePaginasJTextField.getText()));
        } else {

            stringDelDialogo += " - El n�mero de p�ginas solo admite n�meros y no peude estar vac�o ni ser un n�mero negativo.\n";
            estaMal = true;

        }

        if (!precioBoletinJTextField.getText().isEmpty()
                && ex.comprobarPrecioConComa(precioBoletinJTextField.getText())
                && !ex.comprobarNumerosNegativos(Float.parseFloat(precioBoletinJTextField.getText()))) {

            nuevoBoletinPublicado.setPrecio(Float.parseFloat(precioBoletinJTextField.getText()));
        } else {

            stringDelDialogo += " - El precio no admite n�meros negativos, su formato es 0.0 y no puede estar el campo vacio.\n";
            estaMal = true;

        }

        if (estaMal) {
            JOptionPane.showMessageDialog(null, stringDelDialogo, "ERROR AL REGISTRAR BOLET�N", JOptionPane.ERROR_MESSAGE);

        } else {

            stringDelDialogo = "";
            stringDelDialogo = "[i] Boletin a�adido con exito";
            this.nuevoBoletinPublicados.add(nuevoBoletinPublicado);
            PantallaPrincipal nuePantallaPrincipal = new PantallaPrincipal(nuevaRevistaPublicadas, nuevoBoletinPublicados);
            nuePantallaPrincipal.setVisible(true);
            JOptionPane.showMessageDialog(null, stringDelDialogo, "BOLET�N CREADO", JOptionPane.INFORMATION_MESSAGE);

            this.dispose();
        }
    }//GEN-LAST:event_registrarBoletinJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fechaBoletinJLabel;
    private javax.swing.JTextField fechaBoletinJTextField;
    private javax.swing.JLabel nombreBoletinJLabel;
    private javax.swing.JTextField nombreBoletinJTextField;
    private javax.swing.JLabel numeroDePaginasJLabel;
    private javax.swing.JTextField numeroDePaginasJTextField;
    private javax.swing.JLabel precioBoletinJLabel;
    private javax.swing.JTextField precioBoletinJTextField;
    private javax.swing.JButton registrarBoletinJButton;
    private javax.swing.JPanel registroBoletinJPanel;
    private javax.swing.JLabel resgitroBoletinJLabel;
    // End of variables declaration//GEN-END:variables

}
