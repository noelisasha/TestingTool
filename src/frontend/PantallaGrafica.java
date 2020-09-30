package frontend;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.GridBagLayout;
import backend.LeerCodigo;
import backend.RespuestaAnalisis;

import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Rectangle;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.JSplitPane;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import javax.swing.filechooser.FileNameExtensionFilter;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class PantallaGrafica extends JFrame{
	
	JButton btnTestear;
	
	public PantallaGrafica() {
		setTitle("Herramienta de Testeo");
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		this.setBounds(new Rectangle(703, 460));
		
		JPanel panel = new JPanel();
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{17, 288, 0, 0, 0, 80, 80, 0, 0};
		gbl_panel.rowHeights = new int[]{38, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 1.0, 0.0, 0.0, 0.0, 1.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel lblNewLabel_2 = new JLabel("Resultados del Testeo");
		lblNewLabel_2.setFont(new Font("Dialog", Font.BOLD, 15));
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.gridwidth = 6;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 1;
		gbc_lblNewLabel_2.gridy = 0;
		panel.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		JLabel lblNewLabel = new JLabel("Total");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 5;
		gbc_lblNewLabel.gridy = 1;
		panel.add(lblNewLabel, gbc_lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Porcentaje");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 6;
		gbc_lblNewLabel_1.gridy = 1;
		panel.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		JLabel lbl1 = new JLabel("Cantidad total de l\u00EDneas");
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
		gbc_txtLineasTotal.gridx = 5;
		gbc_txtLineasTotal.gridy = 2;
		panel.add(txtLineasTotal, gbc_txtLineasTotal);
		txtLineasTotal.setColumns(10);
		
		txtLineasPorc = new JTextField();
		txtLineasPorc.setEditable(false);
		GridBagConstraints gbc_txtLineasPorc = new GridBagConstraints();
		gbc_txtLineasPorc.insets = new Insets(0, 0, 5, 5);
		gbc_txtLineasPorc.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtLineasPorc.gridx = 6;
		gbc_txtLineasPorc.gridy = 2;
		panel.add(txtLineasPorc, gbc_txtLineasPorc);
		txtLineasPorc.setColumns(10);
		
		JLabel lbl2 = new JLabel("Total de caracteres");
		GridBagConstraints gbc_lbl2 = new GridBagConstraints();
		gbc_lbl2.anchor = GridBagConstraints.WEST;
		gbc_lbl2.insets = new Insets(0, 0, 5, 5);
		gbc_lbl2.gridx = 1;
		gbc_lbl2.gridy = 3;
		panel.add(lbl2, gbc_lbl2);
		
		txtCaractTotal = new JTextField();
		txtCaractTotal.setEditable(false);
		GridBagConstraints gbc_txtCaractTotal = new GridBagConstraints();
		gbc_txtCaractTotal.insets = new Insets(0, 0, 5, 5);
		gbc_txtCaractTotal.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtCaractTotal.gridx = 5;
		gbc_txtCaractTotal.gridy = 3;
		panel.add(txtCaractTotal, gbc_txtCaractTotal);
		txtCaractTotal.setColumns(10);
		
		txtCaractPorc = new JTextField();
		txtCaractPorc.setEditable(false);
		GridBagConstraints gbc_txtCaractPorc = new GridBagConstraints();
		gbc_txtCaractPorc.insets = new Insets(0, 0, 5, 5);
		gbc_txtCaractPorc.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtCaractPorc.gridx = 6;
		gbc_txtCaractPorc.gridy = 3;
		panel.add(txtCaractPorc, gbc_txtCaractPorc);
		txtCaractPorc.setColumns(10);
		
		JLabel lbl3 = new JLabel("Cantidad de l\u00EDneas de c\u00F3digo");
		GridBagConstraints gbc_lbl3 = new GridBagConstraints();
		gbc_lbl3.anchor = GridBagConstraints.WEST;
		gbc_lbl3.insets = new Insets(0, 0, 5, 5);
		gbc_lbl3.gridx = 1;
		gbc_lbl3.gridy = 4;
		panel.add(lbl3, gbc_lbl3);
		
		txtLineasCodTotal = new JTextField();
		txtLineasCodTotal.setEditable(false);
		GridBagConstraints gbc_txtLineasCodTotal = new GridBagConstraints();
		gbc_txtLineasCodTotal.insets = new Insets(0, 0, 5, 5);
		gbc_txtLineasCodTotal.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtLineasCodTotal.gridx = 5;
		gbc_txtLineasCodTotal.gridy = 4;
		panel.add(txtLineasCodTotal, gbc_txtLineasCodTotal);
		txtLineasCodTotal.setColumns(10);
		
		txtLineasCodPorc = new JTextField();
		txtLineasCodPorc.setEditable(false);
		GridBagConstraints gbc_txtLineasCodPorc = new GridBagConstraints();
		gbc_txtLineasCodPorc.insets = new Insets(0, 0, 5, 5);
		gbc_txtLineasCodPorc.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtLineasCodPorc.gridx = 6;
		gbc_txtLineasCodPorc.gridy = 4;
		panel.add(txtLineasCodPorc, gbc_txtLineasCodPorc);
		txtLineasCodPorc.setColumns(10);
		
		JLabel lbl4 = new JLabel("Cantidad de caracteres de c\u00F3digo");
		GridBagConstraints gbc_lbl4 = new GridBagConstraints();
		gbc_lbl4.anchor = GridBagConstraints.WEST;
		gbc_lbl4.insets = new Insets(0, 0, 5, 5);
		gbc_lbl4.gridx = 1;
		gbc_lbl4.gridy = 5;
		panel.add(lbl4, gbc_lbl4);
		
		txtCharCodTotal = new JTextField();
		txtCharCodTotal.setEditable(false);
		GridBagConstraints gbc_txtCharCodTotal = new GridBagConstraints();
		gbc_txtCharCodTotal.insets = new Insets(0, 0, 5, 5);
		gbc_txtCharCodTotal.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtCharCodTotal.gridx = 5;
		gbc_txtCharCodTotal.gridy = 5;
		panel.add(txtCharCodTotal, gbc_txtCharCodTotal);
		txtCharCodTotal.setColumns(10);
		
		txtCharCodPorc = new JTextField();
		txtCharCodPorc.setEditable(false);
		GridBagConstraints gbc_txtCharCodPorc = new GridBagConstraints();
		gbc_txtCharCodPorc.insets = new Insets(0, 0, 5, 5);
		gbc_txtCharCodPorc.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtCharCodPorc.gridx = 6;
		gbc_txtCharCodPorc.gridy = 5;
		panel.add(txtCharCodPorc, gbc_txtCharCodPorc);
		txtCharCodPorc.setColumns(10);
		
		JLabel lbl5 = new JLabel("Cantidad de l\u00EDneas de comentarios");
		GridBagConstraints gbc_lbl5 = new GridBagConstraints();
		gbc_lbl5.anchor = GridBagConstraints.WEST;
		gbc_lbl5.insets = new Insets(0, 0, 5, 5);
		gbc_lbl5.gridx = 1;
		gbc_lbl5.gridy = 6;
		panel.add(lbl5, gbc_lbl5);
		
		txtLineaCommTotal = new JTextField();
		txtLineaCommTotal.setEditable(false);
		GridBagConstraints gbc_txtLineaCommTotal = new GridBagConstraints();
		gbc_txtLineaCommTotal.insets = new Insets(0, 0, 5, 5);
		gbc_txtLineaCommTotal.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtLineaCommTotal.gridx = 5;
		gbc_txtLineaCommTotal.gridy = 6;
		panel.add(txtLineaCommTotal, gbc_txtLineaCommTotal);
		txtLineaCommTotal.setColumns(10);
		
		txtLineaCommPorc = new JTextField();
		txtLineaCommPorc.setEditable(false);
		GridBagConstraints gbc_txtLineaCommPorc = new GridBagConstraints();
		gbc_txtLineaCommPorc.insets = new Insets(0, 0, 5, 5);
		gbc_txtLineaCommPorc.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtLineaCommPorc.gridx = 6;
		gbc_txtLineaCommPorc.gridy = 6;
		panel.add(txtLineaCommPorc, gbc_txtLineaCommPorc);
		txtLineaCommPorc.setColumns(10);
		
		JLabel lbl6 = new JLabel("Cantidad de caracteres de comentarios");
		GridBagConstraints gbc_lbl6 = new GridBagConstraints();
		gbc_lbl6.anchor = GridBagConstraints.WEST;
		gbc_lbl6.insets = new Insets(0, 0, 5, 5);
		gbc_lbl6.gridx = 1;
		gbc_lbl6.gridy = 7;
		panel.add(lbl6, gbc_lbl6);
		
		txtCharCommTotal = new JTextField();
		txtCharCommTotal.setEditable(false);
		GridBagConstraints gbc_txtCharCommTotal = new GridBagConstraints();
		gbc_txtCharCommTotal.insets = new Insets(0, 0, 5, 5);
		gbc_txtCharCommTotal.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtCharCommTotal.gridx = 5;
		gbc_txtCharCommTotal.gridy = 7;
		panel.add(txtCharCommTotal, gbc_txtCharCommTotal);
		txtCharCommTotal.setColumns(10);
		
		txtCharCommPorc = new JTextField();
		txtCharCommPorc.setEditable(false);
		GridBagConstraints gbc_txtCharCommPorc = new GridBagConstraints();
		gbc_txtCharCommPorc.insets = new Insets(0, 0, 5, 5);
		gbc_txtCharCommPorc.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtCharCommPorc.gridx = 6;
		gbc_txtCharCommPorc.gridy = 7;
		panel.add(txtCharCommPorc, gbc_txtCharCommPorc);
		txtCharCommPorc.setColumns(10);
		
		JLabel lbl7 = new JLabel("L\u00EDneas vac\u00EDas");
		GridBagConstraints gbc_lbl7 = new GridBagConstraints();
		gbc_lbl7.anchor = GridBagConstraints.WEST;
		gbc_lbl7.insets = new Insets(0, 0, 5, 5);
		gbc_lbl7.gridx = 1;
		gbc_lbl7.gridy = 8;
		panel.add(lbl7, gbc_lbl7);
		
		txtLineasVaciasTotal = new JTextField();
		txtLineasVaciasTotal.setEditable(false);
		GridBagConstraints gbc_txtLineasVaciasTotal = new GridBagConstraints();
		gbc_txtLineasVaciasTotal.insets = new Insets(0, 0, 5, 5);
		gbc_txtLineasVaciasTotal.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtLineasVaciasTotal.gridx = 5;
		gbc_txtLineasVaciasTotal.gridy = 8;
		panel.add(txtLineasVaciasTotal, gbc_txtLineasVaciasTotal);
		txtLineasVaciasTotal.setColumns(10);
		
		txtLineasVaciasPorc = new JTextField();
		txtLineasVaciasPorc.setEditable(false);
		GridBagConstraints gbc_txtLineasVaciasPorc = new GridBagConstraints();
		gbc_txtLineasVaciasPorc.insets = new Insets(0, 0, 5, 5);
		gbc_txtLineasVaciasPorc.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtLineasVaciasPorc.gridx = 6;
		gbc_txtLineasVaciasPorc.gridy = 8;
		panel.add(txtLineasVaciasPorc, gbc_txtLineasVaciasPorc);
		txtLineasVaciasPorc.setColumns(10);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Archivo");
		menuBar.add(mnNewMenu);
		
		JMenuItem menuNuevoTest = new JMenuItem("Nuevo Testeo");
		menuNuevoTest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtPathAlArchivo.setText("");
				txtLineasTotal.setText("");
				txtLineasPorc.setText("");
				txtCaractTotal.setText("");
				txtCaractPorc.setText("");
				txtLineasCodTotal.setText("");
				txtLineasCodPorc.setText("");
				txtCharCodTotal.setText("");
				txtCharCodPorc.setText("");
				txtLineaCommTotal.setText("");
				txtLineaCommPorc.setText("");
				txtCharCommTotal.setText("");
				txtCharCommPorc.setText("");
				txtLineasVaciasTotal.setText("");
				txtLineasVaciasPorc.setText("");
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
		splitPane.setResizeWeight(0.3);
		splitPane.setOrientation(JSplitPane.VERTICAL_SPLIT);
		getContentPane().add(splitPane, BorderLayout.CENTER);
		
		JPanel panel1 = new JPanel();
		splitPane.setLeftComponent(panel1);
		GridBagLayout gbl_panel1 = new GridBagLayout();
		gbl_panel1.columnWidths = new int[]{27, 195, 150, 150, 150, 27, 0};
		gbl_panel1.rowHeights = new int[]{32, 0, 0, 0};
		gbl_panel1.columnWeights = new double[]{1.0, 1.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
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
		gbc_textField_3.insets = new Insets(0, 0, 5, 0);
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
		
		
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(0, 0, 0, 5);
		gbc_btnNewButton.gridx = 1;
		gbc_btnNewButton.gridy = 2;
		panel1.add(btnExaminar, gbc_btnNewButton);
		
		btnTestear = new JButton("Testear");
		btnTestear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LeerCodigo lc = new LeerCodigo();
				RespuestaAnalisis resp = new RespuestaAnalisis();
				
				String pathTest = txtPathAlArchivo.getText();
				
				resp = lc.analizar(pathTest, resp);
				
				txtLineasTotal.setText(resp.getLineasDeCodigo().toString());
				//txtCaractTotal.setText(resp.);
				txtLineasCodTotal.setText(resp.getLineasTotales().toString());
				//txtLineasCodPorc.setText(resp.getPorc);
				txtLineasVaciasTotal.setText(resp.getLineasEnBlanco().toString());
				//txtLineasVaciasPorc.setText();
				txtLineaCommTotal.setText(resp.getLineasComentadas().toString());
				txtLineaCommPorc.setText(resp.getPorcentajeLineasComentadas().toString());
				
				
				
				System.out.println(resp);
			}
		});
		btnTestear.setMinimumSize(new Dimension(97, 26));
		btnTestear.setMaximumSize(new Dimension(97, 26));
		GridBagConstraints gbc_btnTestear = new GridBagConstraints();
		gbc_btnTestear.insets = new Insets(0, 0, 0, 5);
		gbc_btnTestear.gridx = 2;
		gbc_btnTestear.gridy = 2;
		panel1.add(btnTestear, gbc_btnTestear);
		
		splitPane.setRightComponent(panel);
	}
	private static final long serialVersionUID = 8591170168706138850L;
	private JTextField txtLineasTotal;
	private JTextField txtLineasPorc;
	private JTextField txtCaractTotal;
	private JTextField txtCaractPorc;
	private JTextField txtLineasCodTotal;
	private JTextField txtLineasCodPorc;
	private JTextField txtCharCodTotal;
	private JTextField txtCharCodPorc;
	private JTextField txtLineaCommTotal;
	private JTextField txtLineaCommPorc;
	private JTextField txtCharCommTotal;
	private JTextField txtCharCommPorc;
	private JTextField txtLineasVaciasTotal;
	private JTextField txtLineasVaciasPorc;
	private JTextField txtPathAlArchivo;
	private JTextField textField_2;
	private JTextField textField_3;
	
	
}
