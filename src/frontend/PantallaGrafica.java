package frontend;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.GridBagLayout;

import backend.ArchivoAnalisis;
import backend.ClaseAnalisis;
import backend.LeerCodigo;
import backend.RespuestaAnalisis;

import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Rectangle;

import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.JSplitPane;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;


public class PantallaGrafica extends JFrame{
	
	JButton btnTestear;
	
	public PantallaGrafica() {
		setTitle("Herramienta de Testeo");
		
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		this.setBounds(new Rectangle(703, 460));
		
		JPanel panel = new JPanel();
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{17, 180, 50, 180, 50, 0, 0};
		gbl_panel.rowHeights = new int[]{38, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 1.0, 1.0, 1.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel lblNewLabel_2 = new JLabel("Resultados del Testeo");
		lblNewLabel_2.setFont(new Font("Dialog", Font.BOLD, 15));
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.gridwidth = 4;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 1;
		gbc_lblNewLabel_2.gridy = 0;
		panel.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		JLabel lbl1 = new JLabel("Cant. de l\u00EDneas totales:");
		GridBagConstraints gbc_lbl1 = new GridBagConstraints();
		gbc_lbl1.anchor = GridBagConstraints.WEST;
		gbc_lbl1.insets = new Insets(0, 0, 5, 5);
		gbc_lbl1.gridx = 1;
		gbc_lbl1.gridy = 2;
		panel.add(lbl1, gbc_lbl1);
		
		txtLineasTotal = new JTextField();
		txtLineasTotal.setEditable(false);
		GridBagConstraints gbc_txtLineasTotal = new GridBagConstraints();
		gbc_txtLineasTotal.insets = new Insets(0, 0, 5, 5);
		gbc_txtLineasTotal.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtLineasTotal.gridx = 2;
		gbc_txtLineasTotal.gridy = 2;
		panel.add(txtLineasTotal, gbc_txtLineasTotal);
		txtLineasTotal.setColumns(10);
		
		lblComplex = new JLabel("Complejidad Ciclom\u00E1tica:");
		GridBagConstraints gbc_lblComplex = new GridBagConstraints();
		gbc_lblComplex.anchor = GridBagConstraints.WEST;
		gbc_lblComplex.insets = new Insets(0, 0, 5, 5);
		gbc_lblComplex.gridx = 3;
		gbc_lblComplex.gridy = 2;
		panel.add(lblComplex, gbc_lblComplex);
		
		txtComplCiclo = new JTextField();
		txtComplCiclo.setEditable(false);
		GridBagConstraints gbc_txtComplCiclo = new GridBagConstraints();
		gbc_txtComplCiclo.insets = new Insets(0, 0, 5, 5);
		gbc_txtComplCiclo.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtComplCiclo.gridx = 4;
		gbc_txtComplCiclo.gridy = 2;
		panel.add(txtComplCiclo, gbc_txtComplCiclo);
		txtComplCiclo.setColumns(10);
		
		JLabel lbl3 = new JLabel("Cant. de l\u00EDneas de c\u00F3digo:");
		GridBagConstraints gbc_lbl3 = new GridBagConstraints();
		gbc_lbl3.anchor = GridBagConstraints.WEST;
		gbc_lbl3.insets = new Insets(0, 0, 5, 5);
		gbc_lbl3.gridx = 1;
		gbc_lbl3.gridy = 3;
		panel.add(lbl3, gbc_lbl3);
		
		txtLineasCodTotal = new JTextField();
		txtLineasCodTotal.setEditable(false);
		GridBagConstraints gbc_txtLineasCodTotal = new GridBagConstraints();
		gbc_txtLineasCodTotal.insets = new Insets(0, 0, 5, 5);
		gbc_txtLineasCodTotal.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtLineasCodTotal.gridx = 2;
		gbc_txtLineasCodTotal.gridy = 3;
		panel.add(txtLineasCodTotal, gbc_txtLineasCodTotal);
		txtLineasCodTotal.setColumns(10);
		
		lblNewLabel_1 = new JLabel("Fan In:");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 3;
		gbc_lblNewLabel_1.gridy = 3;
		panel.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		txtFanIn = new JTextField();
		txtFanIn.setEditable(false);
		GridBagConstraints gbc_txtFanIn = new GridBagConstraints();
		gbc_txtFanIn.insets = new Insets(0, 0, 5, 5);
		gbc_txtFanIn.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtFanIn.gridx = 4;
		gbc_txtFanIn.gridy = 3;
		panel.add(txtFanIn, gbc_txtFanIn);
		txtFanIn.setColumns(10);
		
		JLabel lbl5 = new JLabel("Cant. de l\u00EDneas comentadas:");
		GridBagConstraints gbc_lbl5 = new GridBagConstraints();
		gbc_lbl5.anchor = GridBagConstraints.WEST;
		gbc_lbl5.insets = new Insets(0, 0, 5, 5);
		gbc_lbl5.gridx = 1;
		gbc_lbl5.gridy = 4;
		panel.add(lbl5, gbc_lbl5);
		
		txtLineaCommTotal = new JTextField();
		txtLineaCommTotal.setEditable(false);
		GridBagConstraints gbc_txtLineaCommTotal = new GridBagConstraints();
		gbc_txtLineaCommTotal.insets = new Insets(0, 0, 5, 5);
		gbc_txtLineaCommTotal.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtLineaCommTotal.gridx = 2;
		gbc_txtLineaCommTotal.gridy = 4;
		panel.add(txtLineaCommTotal, gbc_txtLineaCommTotal);
		txtLineaCommTotal.setColumns(10);
		
		lblNewLabel_4 = new JLabel("Fan Out:");
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_4.gridx = 3;
		gbc_lblNewLabel_4.gridy = 4;
		panel.add(lblNewLabel_4, gbc_lblNewLabel_4);
		
		txtFanOut = new JTextField();
		txtFanOut.setEditable(false);
		GridBagConstraints gbc_txtFanOut = new GridBagConstraints();
		gbc_txtFanOut.insets = new Insets(0, 0, 5, 5);
		gbc_txtFanOut.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtFanOut.gridx = 4;
		gbc_txtFanOut.gridy = 4;
		panel.add(txtFanOut, gbc_txtFanOut);
		txtFanOut.setColumns(10);
		
		JLabel lbl7 = new JLabel("Cant. de l\u00EDneas en blanco:");
		GridBagConstraints gbc_lbl7 = new GridBagConstraints();
		gbc_lbl7.anchor = GridBagConstraints.WEST;
		gbc_lbl7.insets = new Insets(0, 0, 5, 5);
		gbc_lbl7.gridx = 1;
		gbc_lbl7.gridy = 5;
		panel.add(lbl7, gbc_lbl7);
		
		txtLineasVaciasTotal = new JTextField();
		txtLineasVaciasTotal.setEditable(false);
		GridBagConstraints gbc_txtLineasVaciasTotal = new GridBagConstraints();
		gbc_txtLineasVaciasTotal.insets = new Insets(0, 0, 5, 5);
		gbc_txtLineasVaciasTotal.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtLineasVaciasTotal.gridx = 2;
		gbc_txtLineasVaciasTotal.gridy = 5;
		panel.add(txtLineasVaciasTotal, gbc_txtLineasVaciasTotal);
		txtLineasVaciasTotal.setColumns(10);
		
		txtHalLong = new JLabel("Halstead - Longitud:");
		GridBagConstraints gbc_txtHalLong = new GridBagConstraints();
		gbc_txtHalLong.anchor = GridBagConstraints.WEST;
		gbc_txtHalLong.insets = new Insets(0, 0, 5, 5);
		gbc_txtHalLong.gridx = 3;
		gbc_txtHalLong.gridy = 5;
		panel.add(txtHalLong, gbc_txtHalLong);
		
		textField_5 = new JTextField();
		textField_5.setEditable(false);
		GridBagConstraints gbc_textField_5 = new GridBagConstraints();
		gbc_textField_5.insets = new Insets(0, 0, 5, 5);
		gbc_textField_5.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_5.gridx = 4;
		gbc_textField_5.gridy = 5;
		panel.add(textField_5, gbc_textField_5);
		textField_5.setColumns(10);
		
		lblNewLabel_3 = new JLabel("Porc. Comentarios:");
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_3.gridx = 1;
		gbc_lblNewLabel_3.gridy = 6;
		panel.add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		txtLineaCommPorc = new JTextField();
		txtLineaCommPorc.setEditable(false);
		GridBagConstraints gbc_txtLineaCommPorc = new GridBagConstraints();
		gbc_txtLineaCommPorc.insets = new Insets(0, 0, 5, 5);
		gbc_txtLineaCommPorc.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtLineaCommPorc.gridx = 2;
		gbc_txtLineaCommPorc.gridy = 6;
		panel.add(txtLineaCommPorc, gbc_txtLineaCommPorc);
		txtLineaCommPorc.setColumns(10);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Archivo");
		menuBar.add(mnNewMenu);
		
		JMenuItem menuNuevoTest = new JMenuItem("Nuevo Testeo");
		menuNuevoTest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtPathAlArchivo.setText("");
				txtLineasTotal.setText("");
				txtLineasCodTotal.setText("");
				txtLineaCommTotal.setText("");
				txtLineaCommPorc.setText("");
				txtLineasVaciasTotal.setText("");
			}
		});
		
		JMenuItem menuTestear = new JMenuItem("Testear");
		menuTestear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnTestear.doClick();				
			}
		});
		mnNewMenu.add(menuTestear);
		mnNewMenu.add(menuNuevoTest);
		
		JMenuItem menuSalir = new JMenuItem("Salir");
		menuSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		mnNewMenu.add(menuSalir);
		
		JSplitPane splitPane = new JSplitPane();
		splitPane.setResizeWeight(1.0);
		splitPane.setOrientation(JSplitPane.VERTICAL_SPLIT);
		getContentPane().add(splitPane, BorderLayout.CENTER);
		
		JPanel panel1 = new JPanel();
		splitPane.setLeftComponent(panel1);
		GridBagLayout gbl_panel1 = new GridBagLayout();
		gbl_panel1.columnWidths = new int[]{27, 195, 195, 150, 150, 27, 0};
		gbl_panel1.rowHeights = new int[]{32, 0, 0, 0};
		gbl_panel1.columnWeights = new double[]{1.0, 1.0, 1.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel1.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel1.setLayout(gbl_panel1);
		
		textField_2 = new JTextField();
		textField_2.setVisible(false);
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.gridheight = 3;
		gbc_textField_2.insets = new Insets(0, 0, 0, 5);
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.gridx = 0;
		gbc_textField_2.gridy = 0;
		panel1.add(textField_2, gbc_textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_0 = new JLabel("Archivo a Analizar");
		lblNewLabel_0.setHorizontalTextPosition(SwingConstants.LEFT);
		lblNewLabel_0.setHorizontalAlignment(SwingConstants.LEFT);
		GridBagConstraints gbc_lbl = new GridBagConstraints();
		gbc_lbl.anchor = GridBagConstraints.WEST;
		gbc_lbl.insets = new Insets(0, 0, 5, 5);
		gbc_lbl.gridx = 1;
		gbc_lbl.gridy = 0;
		panel1.add(lblNewLabel_0, gbc_lbl);
		
		textField_3 = new JTextField();
		textField_3.setVisible(false);
		textField_3.setColumns(10);
		GridBagConstraints gbc_textField_3 = new GridBagConstraints();
		gbc_textField_3.gridheight = 3;
		gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_3.gridx = 5;
		gbc_textField_3.gridy = 0;
		panel1.add(textField_3, gbc_textField_3);
		
		txtPathAlArchivo = new JTextField();
		GridBagConstraints gbc_txtPathAlArchivo = new GridBagConstraints();
		gbc_txtPathAlArchivo.gridwidth = 4;
		gbc_txtPathAlArchivo.insets = new Insets(0, 0, 5, 5);
		gbc_txtPathAlArchivo.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtPathAlArchivo.gridx = 1;
		gbc_txtPathAlArchivo.gridy = 1;
		panel1.add(txtPathAlArchivo, gbc_txtPathAlArchivo);
		txtPathAlArchivo.setColumns(10);
		
		btnTestear = new JButton("Testear");
		btnTestear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LeerCodigo lc = new LeerCodigo();
				RespuestaAnalisis resp = new RespuestaAnalisis();
				ArchivoAnalisis respMetodo = new ArchivoAnalisis();
				
				String pathTest = txtPathAlArchivo.getText();
				
				respMetodo = lc.analizar(pathTest);
				
				/*Esto de aca abajo es simplemente para mostrar por pantalla cada clase y sus metodos.
				 tendriamos que mostrarlo en la ventana cada vez que se selecciona un metodo.*/
				
				for (ClaseAnalisis clase : respMetodo.getClases()) {
					System.out.println("Clase:" + clase.getNombreClase());
					for (RespuestaAnalisis metodo : clase.getMetodos()) {
						System.out.println("Metodo:" + metodo.getNombreMetodo());
						System.out.println(metodo.toString());
						System.out.println("-----------------");
					}
					
				}
				
				//Primera Columna
				txtLineasTotal.setText((resp.getLineasTotales() != null) ? resp.getLineasTotales().toString() : "");
				txtLineasCodTotal.setText((resp.getLineasDeCodigo() != null) ? resp.getLineasDeCodigo().toString() : "");
				txtLineasVaciasTotal.setText((resp.getLineasEnBlanco() != null) ? resp.getLineasEnBlanco().toString() : "");
				txtLineaCommTotal.setText((resp.getLineasComentadas() != null) ? resp.getLineasComentadas().toString() : "");
				txtLineasVaciasTotal.setText((resp.getLineasEnBlanco() != null) ? resp.getLineasEnBlanco().toString() : "");
				txtLineaCommPorc.setText((resp.getPorcentajeLineasComentadas() != null) ? resp.getPorcentajeLineasComentadas().toString() : "");
				
				//Segunda Columna
				txtComplCiclo.setText((resp.getComplejidadCiclomatica() != null) ? resp.getComplejidadCiclomatica().toString() : "");
				//txtFanIn.setText(resp.getFanIn().toString());
				//txtFanOut.setText(resp.getFanOut().toString());
				textField_5.setText((resp.getHalsteadVolumen() != null) ? resp.getHalsteadVolumen().toString() : "");
				textField_6.setText((resp.getHalsteadLongitud() != null) ? resp.getHalsteadLongitud().toString() : "");
				textField_7.setText((resp.getHalsteadEsfuerzo() != null) ? resp.getHalsteadEsfuerzo().toString() : "");
				
			}
		});
		
		JButton btnExaminar = new JButton("Examinar...");
		btnExaminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFileChooser fileChooser = new JFileChooser();
				int seleccion = fileChooser.showOpenDialog(btnExaminar);
				if (seleccion == JFileChooser.APPROVE_OPTION)
				{
				   String path = fileChooser.getSelectedFile().getAbsolutePath();
				   txtPathAlArchivo.setText(path);
				}
			}
		});
		
		cmbClases = new JComboBox();
		GridBagConstraints gbc_cmbClases = new GridBagConstraints();
		gbc_cmbClases.insets = new Insets(0, 0, 0, 5);
		gbc_cmbClases.fill = GridBagConstraints.HORIZONTAL;
		gbc_cmbClases.gridx = 1;
		gbc_cmbClases.gridy = 2;
		panel1.add(cmbClases, gbc_cmbClases);
		//cmbClases.setModel(new DefaultComboBoxModel<String>(respMetodo.getClases()));
		
		cmbMetodos = new JComboBox();
		GridBagConstraints gbc_cmbMetodos = new GridBagConstraints();
		gbc_cmbMetodos.insets = new Insets(0, 0, 0, 5);
		gbc_cmbMetodos.fill = GridBagConstraints.HORIZONTAL;
		gbc_cmbMetodos.gridx = 2;
		gbc_cmbMetodos.gridy = 2;
		panel1.add(cmbMetodos, gbc_cmbMetodos);
		
		
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(0, 0, 0, 5);
		gbc_btnNewButton.gridx = 3;
		gbc_btnNewButton.gridy = 2;
		panel1.add(btnExaminar, gbc_btnNewButton);
		btnTestear.setMinimumSize(new Dimension(97, 26));
		btnTestear.setMaximumSize(new Dimension(97, 26));
		GridBagConstraints gbc_btnTestear = new GridBagConstraints();
		gbc_btnTestear.insets = new Insets(0, 0, 0, 5);
		gbc_btnTestear.gridx = 4;
		gbc_btnTestear.gridy = 2;
		panel1.add(btnTestear, gbc_btnTestear);
		
		splitPane.setRightComponent(panel);
		
		txtHalVol = new JLabel("Halstead - Volumen:");
		GridBagConstraints gbc_txtHalVol = new GridBagConstraints();
		gbc_txtHalVol.anchor = GridBagConstraints.WEST;
		gbc_txtHalVol.insets = new Insets(0, 0, 5, 5);
		gbc_txtHalVol.gridx = 3;
		gbc_txtHalVol.gridy = 6;
		panel.add(txtHalVol, gbc_txtHalVol);
		
		textField_6 = new JTextField();
		textField_6.setEditable(false);
		GridBagConstraints gbc_textField_6 = new GridBagConstraints();
		gbc_textField_6.insets = new Insets(0, 0, 5, 5);
		gbc_textField_6.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_6.gridx = 4;
		gbc_textField_6.gridy = 6;
		panel.add(textField_6, gbc_textField_6);
		textField_6.setColumns(10);
		
		txtHalEsf = new JLabel("Halstead - Esfuerzo:");
		GridBagConstraints gbc_txtHalEsf = new GridBagConstraints();
		gbc_txtHalEsf.anchor = GridBagConstraints.WEST;
		gbc_txtHalEsf.insets = new Insets(0, 0, 5, 5);
		gbc_txtHalEsf.gridx = 3;
		gbc_txtHalEsf.gridy = 7;
		panel.add(txtHalEsf, gbc_txtHalEsf);
		
		textField_7 = new JTextField();
		textField_7.setEditable(false);
		GridBagConstraints gbc_textField_7 = new GridBagConstraints();
		gbc_textField_7.insets = new Insets(0, 0, 5, 5);
		gbc_textField_7.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_7.gridx = 4;
		gbc_textField_7.gridy = 7;
		panel.add(textField_7, gbc_textField_7);
		textField_7.setColumns(10);
	}
	private static final long serialVersionUID = 8591170168706138850L;
	private JTextField txtLineasTotal;
	private JTextField txtLineasCodTotal;
	private JTextField txtLineaCommTotal;
	private JTextField txtLineaCommPorc;
	private JTextField txtLineasVaciasTotal;
	private JTextField txtPathAlArchivo;
	private JTextField textField_2;
	private JTextField textField_3;
	private JLabel lblNewLabel_3;
	private JLabel lblComplex;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_4;
	private JLabel txtHalLong;
	private JLabel txtHalVol;
	private JLabel txtHalEsf;
	private JTextField txtComplCiclo;
	private JTextField txtFanIn;
	private JTextField txtFanOut;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JComboBox cmbClases;
	private JComboBox cmbMetodos;
	
	
}
