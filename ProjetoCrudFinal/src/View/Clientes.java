package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

import DAO.UsuarioDAO;
import DTO.UsuarioDTO;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.print.PrinterException;
import java.util.ArrayList;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Clientes extends JFrame {

	private JPanel contentPane;
	private JTextField txtCliente;
	private JTextField txtAge;
	private JTextField txtAddress;
	private JTextField txtMobile;
	private JTextField txtID;
	private JTable table;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Clientes frame = new Clientes();
					frame.setVisible(true);
					frame.listarValores();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Clientes() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 993, 649);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel contentPane_1 = new JPanel();
		contentPane_1.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane_1.setBounds(0, 0, 982, 610);
		contentPane.add(contentPane_1);
		contentPane_1.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(-1, 0, 973, 81);
		panel.setBackground(new Color(30, 144, 255));
		contentPane_1.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Clientes");
		lblNewLabel.setBounds(414, 36, 130, 34);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		panel.add(lblNewLabel);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 55, 22);
		panel.add(menuBar);
		
		JMenu mnNewMenu = new JMenu("Menu");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Adicionar Personal");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Trainer trainer = new Trainer();
				trainer.setVisible(true);
				dispose();
			}
		});
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Adicionar Produtos");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Produtos produtos = new Produtos();
				produtos.setVisible(true);
				dispose();
			}
		});
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Cadastrar Usuarios");
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmCadastroVIEW cadastro = new frmCadastroVIEW();
				cadastro.setVisible(true);
				dispose();
				
			}
		});
		mnNewMenu.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Voltar");
		mntmNewMenuItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main main = new Main();
				main.setVisible(true);
				dispose();
			}
		});
		mnNewMenu.add(mntmNewMenuItem_3);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Sair");
		mntmNewMenuItem_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmLoginView login = new frmLoginView();
				login.setVisible(true);
				dispose();
			}
		});
		mnNewMenu.add(mntmNewMenuItem_4);
		
		JLabel lblNewLabel_1 = new JLabel("Cliente");
		lblNewLabel_1.setBounds(10, 135, 112, 14);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		contentPane_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Idade");
		lblNewLabel_2.setBounds(10, 181, 46, 24);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		contentPane_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Endereço");
		lblNewLabel_3.setBounds(10, 230, 70, 14);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		contentPane_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Telefone");
		lblNewLabel_4.setBounds(10, 274, 70, 14);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		contentPane_1.add(lblNewLabel_4);
		
		txtCliente = new JTextField();
		txtCliente.setBounds(131, 134, 131, 20);
		txtCliente.setColumns(10);
		contentPane_1.add(txtCliente);
		
		txtAge = new JTextField();
		txtAge.setBounds(131, 185, 131, 20);
		txtAge.setColumns(10);
		contentPane_1.add(txtAge);
		
		txtAddress = new JTextField();
		txtAddress.setBounds(131, 229, 131, 20);
		txtAddress.setColumns(10);
		contentPane_1.add(txtAddress);
		
		txtMobile = new JTextField();
		txtMobile.setBounds(131, 273, 131, 20);
		txtMobile.setColumns(10);
		contentPane_1.add(txtMobile);
		
		txtID = new JTextField();
		txtID.setBounds(39, 102, 131, 20);
		txtID.setEnabled(false);
		txtID.setColumns(10);
		contentPane_1.add(txtID);
		
		JLabel lblNewLabel_1_1 = new JLabel("ID");
		lblNewLabel_1_1.setBounds(10, 103, 112, 14);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		contentPane_1.add(lblNewLabel_1_1);
		
		JScrollPane TabelaCliente = new JScrollPane();
		TabelaCliente.setBounds(432, 160, 500, 259);
		contentPane_1.add(TabelaCliente);
		
		table = new JTable();
		TabelaCliente.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID", "Cliente", "Idade", "Endere\u00E7o", "Telefone"
			}
		));
		
		textField = new JTextField();
		textField.setBounds(496, 134, 195, 20);
		textField.addKeyListener(new KeyAdapter() {
			public void keyReleased(KeyEvent e) {
				String searchKeyword = textField.getText();
		        DefaultTableModel tableModel = (DefaultTableModel) table.getModel();
		        TableRowSorter<DefaultTableModel> rowSorter = new TableRowSorter<>(tableModel);
		        table.setRowSorter(rowSorter);
		        rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + searchKeyword));
			}
		});
		textField.setColumns(10);
		contentPane_1.add(textField);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(244, 164, 96));
		panel_1.setBounds(-1, 80, 973, 530);
		contentPane_1.add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton = new JButton("Adicionar");
		btnNewButton.setBounds(435, 350, 164, 23);
		panel_1.add(btnNewButton);
		
		JButton btnpesquisar = new JButton("Pesquisar");
		btnpesquisar.setBounds(435, 384, 164, 23);
		panel_1.add(btnpesquisar);
		
		JButton btnCarregarCampos = new JButton("CARREGAR CAMPOS");
		btnCarregarCampos.setBounds(435, 421, 164, 23);
		panel_1.add(btnCarregarCampos);
		
		JButton btnNewButton_1 = new JButton("Limpar");
		btnNewButton_1.setBounds(639, 350, 164, 23);
		panel_1.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Alterar");
		btnNewButton_2.setBounds(639, 384, 164, 23);
		panel_1.add(btnNewButton_2);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setBounds(639, 421, 164, 23);
		panel_1.add(btnExcluir);
		
		JButton btnPrint = new JButton("Print");
		btnPrint.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				try {
		            table.print(); // Imprime a tabela
		        } catch (PrinterException ex) {
		            ex.printStackTrace();
		        }
			
			}
		});
		btnPrint.setBounds(435, 471, 164, 23);
		panel_1.add(btnPrint);
		btnExcluir.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				ExcluirCliente();
				listarValores();
			}
		});
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				AlterarCliente();
				listarValores();
			}
		});
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				LimparCampos();
			}
		});
		btnCarregarCampos.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				CarregarCampos();
			}
		});
		btnpesquisar.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				listarValores();
			}
		});
		btnNewButton.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				AdicionarCliente();
				listarValores();
			}
		});
		
		JLabel lblNewLabel_1_2 = new JLabel("Pesquisar");
		lblNewLabel_1_2.setBounds(413, 136, 112, 18);
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		contentPane_1.add(lblNewLabel_1_2);
	}
	
	private void AdicionarCliente(){
		String Cliente_id,Cliente,Cliente_Age, Cliente_Address,Cliente_Mobile;
		
		Cliente_id = txtID.getText();
		Cliente = txtCliente.getText();
		Cliente_Age = txtAge.getText();
		Cliente_Address = txtAddress.getText();
		Cliente_Mobile = txtMobile.getText();
		
		if (Cliente.isEmpty()) {
	        JOptionPane.showMessageDialog(null, "Por favor, preencha o campo do cliente.");
	        txtCliente.requestFocus();
	        return;
	    }

	    if (Cliente_Age.isEmpty()) {
	        JOptionPane.showMessageDialog(null, "Por favor, preencha o campo da idade.");
	        txtAge.requestFocus();
	        return;
	    }

	    if (Cliente_Address.isEmpty()) {
	        JOptionPane.showMessageDialog(null, "Por favor, preencha o campo do endereço.");
	        txtAddress.requestFocus();
	        return;
	    }

	    if (Cliente_Mobile.isEmpty()) {
	        JOptionPane.showMessageDialog(null, "Por favor, preencha o campo do telefone.");
	        txtMobile.requestFocus();
	        return;
	    }
		

		DTO.UsuarioDTO objusuariodto = new UsuarioDTO();
		objusuariodto.setCliente(Cliente);
		objusuariodto.setCliente_Age(Cliente_Age);
		objusuariodto.setCliente_Address(Cliente_Address);
		objusuariodto.setCliente_Mobile(Cliente_Mobile);
		
		
		UsuarioDAO objcadastrodao = new UsuarioDAO();
		objcadastrodao.adicionarCliente(objusuariodto);
		JOptionPane.showMessageDialog(null, "Cliente Adicionado");
	
	}
	
	private void listarValores() {
		try {
			UsuarioDAO usuarioDAO = new UsuarioDAO();
			
			DefaultTableModel DefaultTableModel = (DefaultTableModel) table.getModel();
			DefaultTableModel.setNumRows(0);
			
			ArrayList<UsuarioDTO> lista = usuarioDAO.PesquisarCliente();
			
			for(int num = 0; num < lista.size(); num ++) {
				DefaultTableModel.addRow(new Object[]{
						lista.get(num).getCliente_id(),
						lista.get(num).getCliente(),
						lista.get(num).getCliente_Age(),
						lista.get(num).getCliente_Address(),
						lista.get(num).getCliente_Mobile(),
				});
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Erro");
		}
	}
	
	private void CarregarCampos() {
		int setar = table.getSelectedRow();
		
		txtID.setText(table.getModel().getValueAt(setar, 0).toString());
		txtCliente.setText(table.getModel().getValueAt(setar, 1).toString());
		txtAge.setText(table.getModel().getValueAt(setar, 2).toString());
		txtAddress.setText(table.getModel().getValueAt(setar, 3).toString());
		txtMobile.setText(table.getModel().getValueAt(setar, 4).toString());
	}
	
	private void LimparCampos() {
		txtCliente.setText("");
		txtAge.setText("");
		txtAddress.setText("");
		txtMobile.setText("");
		txtCliente.requestFocus();
	}
	
	private void AlterarCliente() {
		int Cliente_id;
		String Cliente,Cliente_Age, Cliente_Address,Cliente_Mobile;
		
		Cliente_id =  Integer.parseInt(txtID.getText());
		Cliente = txtCliente.getText();
		Cliente_Age = txtAge.getText();
		Cliente_Address = txtAddress.getText();
		Cliente_Mobile = txtMobile.getText();
		
		DTO.UsuarioDTO objusuariodto = new UsuarioDTO();
		objusuariodto.setCliente_id(Cliente_id);
		objusuariodto.setCliente(Cliente);
		objusuariodto.setCliente_Age(Cliente_Age);
		objusuariodto.setCliente_Address(Cliente_Address);
		objusuariodto.setCliente_Mobile(Cliente_Mobile);
		
		UsuarioDAO objusuariodao = new UsuarioDAO();
		objusuariodao.AlterarCliente(objusuariodto);
		
		
	}
	
	private void ExcluirCliente(){
		int Cliente_id;
		
		Cliente_id = Integer.parseInt(txtID.getText());
		
		DTO.UsuarioDTO objusuariodto = new UsuarioDTO();
		objusuariodto.setCliente_id(Cliente_id);
		
		UsuarioDAO objusuariodao = new UsuarioDAO();
		objusuariodao.ExcluirCliente(objusuariodto);
	}
}
