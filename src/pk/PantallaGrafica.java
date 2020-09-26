package pk;

import javax.swing.JFrame;
import javax.swing.JSplitPane;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import java.awt.GridBagLayout;
import java.awt.Image;

import javax.swing.JTree;

import backend.LeerCodigo;
import backend.RespuestaAnalisis;

import javax.swing.JList;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Rectangle;

import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import java.awt.Toolkit;



public class PantallaGrafica extends JFrame{
	public PantallaGrafica() {
		setTitle("Herramienta de Testeo");
		
		JSplitPane splitPane = new JSplitPane();
		splitPane.setResizeWeight(1.0);
		getContentPane().add(splitPane, BorderLayout.CENTER);
		
		this.setBounds(new Rectangle(655, 335));
		
		JPanel panel = new JPanel();
		splitPane.setRightComponent(panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{17, 0, 0, 118, 118, 0, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel lblNewLabel = new JLabel("Total");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 3;
		gbc_lblNewLabel.gridy = 2;
		panel.add(lblNewLabel, gbc_lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Porcentaje");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 4;
		gbc_lblNewLabel_1.gridy = 2;
		panel.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		JLabel lbl1 = new JLabel("Cantidad total de l\u00EDneas");
		GridBagConstraints gbc_lbl1 = new GridBagConstraints();
		gbc_lbl1.anchor = GridBagConstraints.WEST;
		gbc_lbl1.insets = new Insets(0, 0, 5, 5);
		gbc_lbl1.gridx = 1;
		gbc_lbl1.gridy = 3;
		panel.add(lbl1, gbc_lbl1);
		
		txtLineasTotal = new JTextField();
		GridBagConstraints gbc_txtLineasTotal = new GridBagConstraints();
		gbc_txtLineasTotal.insets = new Insets(0, 0, 5, 5);
		gbc_txtLineasTotal.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtLineasTotal.gridx = 3;
		gbc_txtLineasTotal.gridy = 3;
		panel.add(txtLineasTotal, gbc_txtLineasTotal);
		txtLineasTotal.setColumns(10);
		
		txtLineasPorc = new JTextField();
		GridBagConstraints gbc_txtLineasPorc = new GridBagConstraints();
		gbc_txtLineasPorc.insets = new Insets(0, 0, 5, 5);
		gbc_txtLineasPorc.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtLineasPorc.gridx = 4;
		gbc_txtLineasPorc.gridy = 3;
		panel.add(txtLineasPorc, gbc_txtLineasPorc);
		txtLineasPorc.setColumns(10);
		
		JLabel lbl2 = new JLabel("Total de caracteres");
		GridBagConstraints gbc_lbl2 = new GridBagConstraints();
		gbc_lbl2.anchor = GridBagConstraints.WEST;
		gbc_lbl2.insets = new Insets(0, 0, 5, 5);
		gbc_lbl2.gridx = 1;
		gbc_lbl2.gridy = 4;
		panel.add(lbl2, gbc_lbl2);
		
		txtCaractTotal = new JTextField();
		GridBagConstraints gbc_txtCaractTotal = new GridBagConstraints();
		gbc_txtCaractTotal.insets = new Insets(0, 0, 5, 5);
		gbc_txtCaractTotal.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtCaractTotal.gridx = 3;
		gbc_txtCaractTotal.gridy = 4;
		panel.add(txtCaractTotal, gbc_txtCaractTotal);
		txtCaractTotal.setColumns(10);
		
		txtCaractPorc = new JTextField();
		GridBagConstraints gbc_txtCaractPorc = new GridBagConstraints();
		gbc_txtCaractPorc.insets = new Insets(0, 0, 5, 5);
		gbc_txtCaractPorc.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtCaractPorc.gridx = 4;
		gbc_txtCaractPorc.gridy = 4;
		panel.add(txtCaractPorc, gbc_txtCaractPorc);
		txtCaractPorc.setColumns(10);
		
		JLabel lbl3 = new JLabel("Cantidad de l\u00EDneas de c\u00F3digo");
		GridBagConstraints gbc_lbl3 = new GridBagConstraints();
		gbc_lbl3.anchor = GridBagConstraints.WEST;
		gbc_lbl3.insets = new Insets(0, 0, 5, 5);
		gbc_lbl3.gridx = 1;
		gbc_lbl3.gridy = 5;
		panel.add(lbl3, gbc_lbl3);
		
		txtLineasCodTotal = new JTextField();
		GridBagConstraints gbc_txtLineasCodTotal = new GridBagConstraints();
		gbc_txtLineasCodTotal.insets = new Insets(0, 0, 5, 5);
		gbc_txtLineasCodTotal.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtLineasCodTotal.gridx = 3;
		gbc_txtLineasCodTotal.gridy = 5;
		panel.add(txtLineasCodTotal, gbc_txtLineasCodTotal);
		txtLineasCodTotal.setColumns(10);
		
		txtLineasCodPorc = new JTextField();
		GridBagConstraints gbc_txtLineasCodPorc = new GridBagConstraints();
		gbc_txtLineasCodPorc.insets = new Insets(0, 0, 5, 5);
		gbc_txtLineasCodPorc.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtLineasCodPorc.gridx = 4;
		gbc_txtLineasCodPorc.gridy = 5;
		panel.add(txtLineasCodPorc, gbc_txtLineasCodPorc);
		txtLineasCodPorc.setColumns(10);
		
		JLabel lbl4 = new JLabel("Cantidad de caracteres de c\u00F3digo");
		GridBagConstraints gbc_lbl4 = new GridBagConstraints();
		gbc_lbl4.anchor = GridBagConstraints.WEST;
		gbc_lbl4.insets = new Insets(0, 0, 5, 5);
		gbc_lbl4.gridx = 1;
		gbc_lbl4.gridy = 6;
		panel.add(lbl4, gbc_lbl4);
		
		txtCharCodTotal = new JTextField();
		GridBagConstraints gbc_txtCharCodTotal = new GridBagConstraints();
		gbc_txtCharCodTotal.insets = new Insets(0, 0, 5, 5);
		gbc_txtCharCodTotal.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtCharCodTotal.gridx = 3;
		gbc_txtCharCodTotal.gridy = 6;
		panel.add(txtCharCodTotal, gbc_txtCharCodTotal);
		txtCharCodTotal.setColumns(10);
		
		textField_7 = new JTextField();
		GridBagConstraints gbc_textField_7 = new GridBagConstraints();
		gbc_textField_7.insets = new Insets(0, 0, 5, 5);
		gbc_textField_7.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_7.gridx = 4;
		gbc_textField_7.gridy = 6;
		panel.add(textField_7, gbc_textField_7);
		textField_7.setColumns(10);
		
		JLabel lbl5 = new JLabel("Cantidad de l\u00EDneas de comentarios");
		GridBagConstraints gbc_lbl5 = new GridBagConstraints();
		gbc_lbl5.anchor = GridBagConstraints.WEST;
		gbc_lbl5.insets = new Insets(0, 0, 5, 5);
		gbc_lbl5.gridx = 1;
		gbc_lbl5.gridy = 7;
		panel.add(lbl5, gbc_lbl5);
		
		txtLineaCommTotal = new JTextField();
		GridBagConstraints gbc_txtLineaCommTotal = new GridBagConstraints();
		gbc_txtLineaCommTotal.insets = new Insets(0, 0, 5, 5);
		gbc_txtLineaCommTotal.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtLineaCommTotal.gridx = 3;
		gbc_txtLineaCommTotal.gridy = 7;
		panel.add(txtLineaCommTotal, gbc_txtLineaCommTotal);
		txtLineaCommTotal.setColumns(10);
		
		txtLineaCommPorc = new JTextField();
		GridBagConstraints gbc_txtLineaCommPorc = new GridBagConstraints();
		gbc_txtLineaCommPorc.insets = new Insets(0, 0, 5, 5);
		gbc_txtLineaCommPorc.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtLineaCommPorc.gridx = 4;
		gbc_txtLineaCommPorc.gridy = 7;
		panel.add(txtLineaCommPorc, gbc_txtLineaCommPorc);
		txtLineaCommPorc.setColumns(10);
		
		JLabel lbl6 = new JLabel("Cantidad de caracteres de comentarios");
		GridBagConstraints gbc_lbl6 = new GridBagConstraints();
		gbc_lbl6.anchor = GridBagConstraints.WEST;
		gbc_lbl6.insets = new Insets(0, 0, 5, 5);
		gbc_lbl6.gridx = 1;
		gbc_lbl6.gridy = 8;
		panel.add(lbl6, gbc_lbl6);
		
		txtCharCommTotal = new JTextField();
		GridBagConstraints gbc_txtCharCommTotal = new GridBagConstraints();
		gbc_txtCharCommTotal.insets = new Insets(0, 0, 5, 5);
		gbc_txtCharCommTotal.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtCharCommTotal.gridx = 3;
		gbc_txtCharCommTotal.gridy = 8;
		panel.add(txtCharCommTotal, gbc_txtCharCommTotal);
		txtCharCommTotal.setColumns(10);
		
		txtCharCommPorc = new JTextField();
		GridBagConstraints gbc_txtCharCommPorc = new GridBagConstraints();
		gbc_txtCharCommPorc.insets = new Insets(0, 0, 5, 5);
		gbc_txtCharCommPorc.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtCharCommPorc.gridx = 4;
		gbc_txtCharCommPorc.gridy = 8;
		panel.add(txtCharCommPorc, gbc_txtCharCommPorc);
		txtCharCommPorc.setColumns(10);
		
		JLabel lbl7 = new JLabel("L\u00EDneas vac\u00EDas");
		GridBagConstraints gbc_lbl7 = new GridBagConstraints();
		gbc_lbl7.anchor = GridBagConstraints.WEST;
		gbc_lbl7.insets = new Insets(0, 0, 5, 5);
		gbc_lbl7.gridx = 1;
		gbc_lbl7.gridy = 9;
		panel.add(lbl7, gbc_lbl7);
		
		txtLineasVaciasTotal = new JTextField();
		GridBagConstraints gbc_txtLineasVaciasTotal = new GridBagConstraints();
		gbc_txtLineasVaciasTotal.insets = new Insets(0, 0, 5, 5);
		gbc_txtLineasVaciasTotal.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtLineasVaciasTotal.gridx = 3;
		gbc_txtLineasVaciasTotal.gridy = 9;
		panel.add(txtLineasVaciasTotal, gbc_txtLineasVaciasTotal);
		txtLineasVaciasTotal.setColumns(10);
		
		txtLineasVaciasPorc = new JTextField();
		GridBagConstraints gbc_txtLineasVaciasPorc = new GridBagConstraints();
		gbc_txtLineasVaciasPorc.insets = new Insets(0, 0, 5, 5);
		gbc_txtLineasVaciasPorc.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtLineasVaciasPorc.gridx = 4;
		gbc_txtLineasVaciasPorc.gridy = 9;
		panel.add(txtLineasVaciasPorc, gbc_txtLineasVaciasPorc);
		txtLineasVaciasPorc.setColumns(10);
		
		JButton Testear = new JButton("Testear");
		GridBagConstraints gbc_Testear = new GridBagConstraints();
		gbc_Testear.anchor = GridBagConstraints.BELOW_BASELINE;
		gbc_Testear.insets = new Insets(0, 0, 5, 5);
		gbc_Testear.gridx = 1;
		gbc_Testear.gridy = 11;
		panel.add(Testear, gbc_Testear);
		
		JSplitPane splitPane_1 = new JSplitPane();
		splitPane_1.setResizeWeight(0.5);
		splitPane_1.setOrientation(JSplitPane.VERTICAL_SPLIT);
		splitPane.setLeftComponent(splitPane_1);
		
		JTree tree = new JTree();
		splitPane_1.setLeftComponent(tree);
		
		JList<Integer> list = new JList<Integer>();
		splitPane_1.setRightComponent(list);
		
		
		//////////////////////////////////////////////////////
		
		LeerCodigo lc = new LeerCodigo();
		RespuestaAnalisis resp = new RespuestaAnalisis();
		
		String pathTest = "C:\\Users\\Luciano\\Documents\\Universisdad\\2020\\2 - Analisis de Software\\Tests\\test.java";
		
		resp = lc.analizar(pathTest, resp);
		
		System.out.println(resp);
		
		//////////////////////////////////////////////////////

		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Archivo");
		menuBar.add(mnNewMenu);
		
		JMenuItem menuTestear = new JMenuItem("Testear");
		mnNewMenu.add(menuTestear);
		
		JMenuItem menuSalir = new JMenuItem("Nuevo Testeo");
		mnNewMenu.add(menuSalir);
		
		JMenuItem menuNuevoTest = new JMenuItem("Salir");
		mnNewMenu.add(menuNuevoTest);
	}
	private static final long serialVersionUID = 8591170168706138850L;
	private JTextField txtLineasTotal;
	private JTextField txtLineasPorc;
	private JTextField txtCaractTotal;
	private JTextField txtCaractPorc;
	private JTextField txtLineasCodTotal;
	private JTextField txtLineasCodPorc;
	private JTextField txtCharCodTotal;
	private JTextField textField_7;
	private JTextField txtLineaCommTotal;
	private JTextField txtLineaCommPorc;
	private JTextField txtCharCommTotal;
	private JTextField txtCharCommPorc;
	private JTextField txtLineasVaciasTotal;
	private JTextField txtLineasVaciasPorc;
	
	
}
