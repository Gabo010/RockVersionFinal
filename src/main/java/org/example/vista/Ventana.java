package org.example.vista;

import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame {
    private JLabel lblId;
    private JLabel lblGenero;
    private JLabel lblBanda;
    private JLabel lblCancionConocida;
    private JLabel lblPaisOrigen;
    private JLabel lblUrl;
    private TextField txtGenero;
    private TextField txtBanda;
    private TextField txtCancionConocida;
    private TextField txtPaisOrigen;
    private TextField txtUrl;
    private Button btnAgregar;
    private Button btnCargar;
    private JLabel lblId2;
    private JLabel lblGenero2;
    private JLabel lblBanda2;
    private JLabel lblCancionConocida2;
    private JLabel lblPaisOrigen2;
    private JLabel lblUrl2;
    private TextField txtId;
    private TextField txtGenero2;
    private TextField txtBanda2;
    private TextField txtCancionConocida2;
    private TextField txtPaisOrige2n;
    private TextField txtUrl2;
    private Button btnModificar;
    private Button btnBorrar;
    private JTable tabla;
    private JScrollPane scrollPane;
    private GridLayout layout;
    private JLabel imagenBandas;
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;
    private JPanel panel4;

    public JLabel getLblId() {
        return lblId;
    }

    public void setLblId(JLabel lblId) {
        this.lblId = lblId;
    }

    public JLabel getLblGenero() {
        return lblGenero;
    }

    public void setLblGenero(JLabel lblGenero) {
        this.lblGenero = lblGenero;
    }

    public JLabel getLblBanda() {
        return lblBanda;
    }

    public void setLblBanda(JLabel lblBanda) {
        this.lblBanda = lblBanda;
    }

    public JLabel getLblCancionConocida() {
        return lblCancionConocida;
    }

    public void setLblCancionConocida(JLabel lblCancionConocida) {
        this.lblCancionConocida = lblCancionConocida;
    }

    public JLabel getLblPaisOrigen() {
        return lblPaisOrigen;
    }

    public void setLblPaisOrigen(JLabel lblPaisOrigen) {
        this.lblPaisOrigen = lblPaisOrigen;
    }

    public JLabel getLblUrl() {
        return lblUrl;
    }

    public void setLblUrl(JLabel lblUrl) {
        this.lblUrl = lblUrl;
    }

    public TextField getTxtGenero() {
        return txtGenero;
    }

    public void setTxtGenero(TextField txtGenero) {
        this.txtGenero = txtGenero;
    }

    public TextField getTxtBanda() {
        return txtBanda;
    }

    public void setTxtBanda(TextField txtBanda) {
        this.txtBanda = txtBanda;
    }

    public TextField getTxtCancionConocida() {
        return txtCancionConocida;
    }

    public void setTxtCancionConocida(TextField txtCancionConocida) {
        this.txtCancionConocida = txtCancionConocida;
    }

    public TextField getTxtPaisOrigen() {
        return txtPaisOrigen;
    }

    public void setTxtPaisOrigen(TextField txtPaisOrigen) {
        this.txtPaisOrigen = txtPaisOrigen;
    }

    public TextField getTxtUrl() {
        return txtUrl;
    }

    public void setTxtUrl(TextField txtUrl) {
        this.txtUrl = txtUrl;
    }

    public Button getBtnAgregar() {
        return btnAgregar;
    }

    public void setBtnAgregar(Button btnAgregar) {
        this.btnAgregar = btnAgregar;
    }

    public Button getBtnCargar() {
        return btnCargar;
    }

    public void setBtnCargar(Button btnCargar) {
        this.btnCargar = btnCargar;
    }

    public JLabel getLblId2() {
        return lblId2;
    }

    public void setLblId2(JLabel lblId2) {
        this.lblId2 = lblId2;
    }

    public JLabel getLblGenero2() {
        return lblGenero2;
    }

    public void setLblGenero2(JLabel lblGenero2) {
        this.lblGenero2 = lblGenero2;
    }

    public JLabel getLblBanda2() {
        return lblBanda2;
    }

    public void setLblBanda2(JLabel lblBanda2) {
        this.lblBanda2 = lblBanda2;
    }

    public JLabel getLblCancionConocida2() {
        return lblCancionConocida2;
    }

    public void setLblCancionConocida2(JLabel lblCancionConocida2) {
        this.lblCancionConocida2 = lblCancionConocida2;
    }

    public JLabel getLblPaisOrigen2() {
        return lblPaisOrigen2;
    }

    public void setLblPaisOrigen2(JLabel lblPaisOrigen2) {
        this.lblPaisOrigen2 = lblPaisOrigen2;
    }

    public JLabel getLblUrl2() {
        return lblUrl2;
    }

    public void setLblUrl2(JLabel lblUrl2) {
        this.lblUrl2 = lblUrl2;
    }

    public TextField getTxtId() {
        return txtId;
    }

    public void setTxtId(TextField txtId) {
        this.txtId = txtId;
    }

    public TextField getTxtGenero2() {
        return txtGenero2;
    }

    public void setTxtGenero2(TextField txtGenero2) {
        this.txtGenero2 = txtGenero2;
    }

    public TextField getTxtBanda2() {
        return txtBanda2;
    }

    public void setTxtBanda2(TextField txtBanda2) {
        this.txtBanda2 = txtBanda2;
    }

    public TextField getTxtCancionConocida2() {
        return txtCancionConocida2;
    }

    public void setTxtCancionConocida2(TextField txtCancionConocida2) {
        this.txtCancionConocida2 = txtCancionConocida2;
    }

    public TextField getTxtPaisOrige2n() {
        return txtPaisOrige2n;
    }

    public void setTxtPaisOrige2n(TextField txtPaisOrige2n) {
        this.txtPaisOrige2n = txtPaisOrige2n;
    }

    public TextField getTxtUrl2() {
        return txtUrl2;
    }

    public void setTxtUrl2(TextField txtUrl2) {
        this.txtUrl2 = txtUrl2;
    }

    public Button getBtnModificar() {
        return btnModificar;
    }

    public void setBtnModificar(Button btnModificar) {
        this.btnModificar = btnModificar;
    }

    public Button getBtnBorrar() {
        return btnBorrar;
    }

    public void setBtnBorrar(Button btnBorrar) {
        this.btnBorrar = btnBorrar;
    }

    public JTable getTabla() {
        return tabla;
    }

    public void setTabla(JTable tabla) {
        this.tabla = tabla;
    }

    public JScrollPane getScrollPane() {
        return scrollPane;
    }

    public void setScrollPane(JScrollPane scrollPane) {
        this.scrollPane = scrollPane;
    }

    @Override
    public GridLayout getLayout() {
        return layout;
    }

    public void setLayout(GridLayout layout) {
        this.layout = layout;
    }

    public JLabel getImagenBandas() {
        return imagenBandas;
    }

    public void setImagenBandas(JLabel imagenBandas) {
        this.imagenBandas = imagenBandas;
    }

    public JPanel getPanel1() {
        return panel1;
    }

    public void setPanel1(JPanel panel1) {
        this.panel1 = panel1;
    }

    public JPanel getPanel2() {
        return panel2;
    }

    public void setPanel2(JPanel panel2) {
        this.panel2 = panel2;
    }

    public JPanel getPanel3() {
        return panel3;
    }

    public void setPanel3(JPanel panel3) {
        this.panel3 = panel3;
    }

    public JPanel getPanel4() {
        return panel4;
    }

    public void setPanel4(JPanel panel4) {
        this.panel4 = panel4;
    }
    public void limpieza(){
        txtGenero.setText("");
        txtBanda.setText("");
        txtCancionConocida.setText("");
        txtPaisOrigen.setText("");
        txtUrl.setText("");
    }

    public Ventana(String title) throws HeadlessException {
        super(title);
        this.setSize(1200,1000);
        layout = new GridLayout(2,2);
        this.getContentPane().setLayout(layout);

        //Panel1
        panel1 = new JPanel(new FlowLayout());
        panel1.setBackground(new Color(252, 54, 54));
        lblId = new JLabel("ID:");
        lblGenero = new JLabel("Genero:");
        lblBanda = new JLabel("Banda:");
        lblCancionConocida  = new JLabel("Cancion mas conocida:");
        lblPaisOrigen = new JLabel("Pais de origen de la banda:");
        lblUrl = new JLabel("URL:");

        txtId = new TextField(3);
        txtId.setText("0");
        txtId.setEnabled(false);
        txtGenero = new TextField(15);
        txtBanda = new TextField(10);
        txtCancionConocida = new TextField(10);
        txtPaisOrigen = new TextField(10);
        txtUrl = new TextField(40);
        btnAgregar = new Button("Agregar");


        panel1.add(lblId);
        panel1.add(txtId);

        panel1.add(lblGenero);
        panel1.add(txtGenero);

        panel1.add(lblBanda);
        panel1.add(txtBanda);

        panel1.add(lblCancionConocida);
        panel1.add(txtCancionConocida);

        panel1.add(lblPaisOrigen);
        panel1.add(txtPaisOrigen);

        panel1.add(lblUrl);
        panel1.add(txtUrl);

        //panel1.add(lblEspacio1);

        panel1.add(btnAgregar);


        //Panel2
        panel2 = new JPanel(new FlowLayout());
        panel2.setBackground(new Color(39, 229, 213));
        btnCargar = new Button("Cargar");
        tabla = new JTable();
        scrollPane = new JScrollPane(tabla);
        panel2.add(btnCargar);
        panel2.add(scrollPane);


        //Panel3
        panel3 = new JPanel(new FlowLayout());
        panel3.setBackground(new Color(39, 253, 58));
        imagenBandas = new JLabel("");
        panel3.add(imagenBandas);


        //Panel4
        panel4 = new JPanel(new FlowLayout());
        panel4.setBackground(new Color(238, 63, 228));
        lblId2 = new JLabel("ID:");
        lblGenero2 = new JLabel("Genero:");
        lblBanda2 = new JLabel("Banda:");
        lblCancionConocida2  = new JLabel("Cancion mas conocida:");
        lblPaisOrigen2 = new JLabel("Pais de origen de la banda:");
        lblUrl2 = new JLabel("URL:");


        txtGenero2 = new TextField(15);
        txtBanda2 = new TextField(10);
        txtCancionConocida2 = new TextField(10);
        txtPaisOrige2n = new TextField(10);
        txtUrl2 = new TextField(40);
        btnModificar = new Button("Modificar");
        btnBorrar = new Button("Eliminar");


        panel4.add(lblGenero2);
        panel4.add(txtGenero2);

        panel4.add(lblBanda2);
        panel4.add(txtBanda2);

        panel4.add(lblCancionConocida2);
        panel4.add(txtCancionConocida2);

        panel4.add(lblPaisOrigen2);
        panel4.add(txtPaisOrige2n);

        panel4.add(lblUrl2);
        panel4.add(txtUrl2);

        panel4.add(btnModificar);
        panel4.add(btnBorrar);

        this.getContentPane().add(panel1,0);
        this.getContentPane().add(panel2,1);
        this.getContentPane().add(panel3,2);
        this.getContentPane().add(panel4,3);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);







    }
}
