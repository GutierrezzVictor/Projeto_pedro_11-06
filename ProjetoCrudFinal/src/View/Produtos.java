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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class Produtos extends JFrame {

	private JPanel contentPane;
	private JTextField txtprodutos;
	private JTextField txtmarca;
	private JTextField txtquant;
	private JTextField txtpreco;
	private JTextField txtID;
	private JTextField textField_5;
	private JTable tblProduto;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Produtos frame = new Produtos();
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
	public Produtos() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 982, 647);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel contentPane_1 = new JPanel();
		contentPane_1.setLayout(null);
		contentPane_1.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane_1.setBounds(0, 0, 972, 614);
		contentPane.add(contentPane_1);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(30, 144, 255));
		panel.setBounds(0, 0, 972, 81);
		contentPane_1.add(panel);
		
		JLabel lblNewLabel = new JLabel("Produtos");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel.setBounds(418, 11, 114, 45);
		panel.add(lblNewLabel);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 43, 22);
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
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Adicionar Clientes");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Clientes cliente = new Clientes();
				cliente.setVisible(true);
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
		
		JLabel lblNewLabel_1 = new JLabel("Produtos");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(10, 135, 112, 14);
		contentPane_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Marca");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2.setBounds(10, 181, 46, 24);
		contentPane_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Quantidade");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3.setBounds(10, 230, 111, 19);
		contentPane_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Preço");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_4.setBounds(10, 274, 70, 19);
		contentPane_1.add(lblNewLabel_4);
		
		txtprodutos = new JTextField();
		txtprodutos.setColumns(10);
		txtprodutos.setBounds(131, 134, 131, 20);
		contentPane_1.add(txtprodutos);
		
		txtmarca = new JTextField();
		txtmarca.setColumns(10);
		txtmarca.setBounds(131, 185, 131, 20);
		contentPane_1.add(txtmarca);
		
		txtquant = new JTextField();
		txtquant.setColumns(10);
		txtquant.setBounds(131, 229, 131, 20);
		contentPane_1.add(txtquant);
		
		txtpreco = new JTextField();
		txtpreco.setColumns(10);
		txtpreco.setBounds(131, 273, 131, 20);
		contentPane_1.add(txtpreco);
		
		JButton btnNewButton = new JButton("Adicionar");
		btnNewButton.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				AdicionarProdutos();
				listarValores();
			}
		});
		btnNewButton.setBounds(379, 485, 163, 23);
		contentPane_1.add(btnNewButton);
		
		txtID = new JTextField();
		txtID.setEnabled(false);
		txtID.setColumns(10);
		txtID.setBounds(39, 102, 131, 20);
		contentPane_1.add(txtID);
		
		JLabel lblNewLabel_1_1 = new JLabel("ID");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_1.setBounds(10, 103, 112, 14);
		contentPane_1.add(lblNewLabel_1_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(379, 137, 565, 337);
		contentPane_1.add(scrollPane);
		
		tblProduto = new JTable();
		scrollPane.setViewportView(tblProduto);
		tblProduto.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID", "Produto", "Marca", "Quantidade", "Pre\u00E7o"
			}
		));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(244, 164, 96));
		panel_1.setBounds(0, 81, 972, 594);
		contentPane_1.add(panel_1);
		panel_1.setLayout(null);
		
		textField_5 = new JTextField();
		textField_5.setBounds(466, 28, 193, 20);
		panel_1.add(textField_5);
		textField_5.addKeyListener(new KeyAdapter() {
			public void keyReleased(KeyEvent e) {
				String searchKeyword = textField_5.getText();
				DefaultTableModel tableModel = (DefaultTableModel) tblProduto.getModel();
		        TableRowSorter<DefaultTableModel> rowSorter = new TableRowSorter<>(tableModel);
		        tblProduto.setRowSorter(rowSorter);
		        rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + searchKeyword));
			}
		});
		textField_5.setColumns(10);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Pesquisar");
		lblNewLabel_1_1_1.setBounds(386, 26, 93, 20);
		panel_1.add(lblNewLabel_1_1_1);
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JButton btnpesquisar = new JButton("Pesquisar");
		btnpesquisar.setBounds(378, 433, 164, 23);
		panel_1.add(btnpesquisar);
		
		JButton btnCarregarCampos = new JButton("CARREGAR CAMPOS");
		btnCarregarCampos.setBounds(552, 407, 164, 23);
		panel_1.add(btnCarregarCampos);
		
		JButton btnNewButton_1 = new JButton("Limpar");
		btnNewButton_1.setBounds(552, 433, 164, 23);
		panel_1.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Alterar");
		btnNewButton_2.setBounds(378, 467, 164, 23);
		panel_1.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Print");
		btnNewButton_3.setBounds(378, 502, 156, 23);
		panel_1.add(btnNewButton_3);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setBounds(552, 467, 164, 23);
		panel_1.add(btnExcluir);
		btnExcluir.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				ExcluirProdutos();
				listarValores();
			}
		});
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
		            tblProduto.print(); // Imprime a tabela
		        } catch (PrinterException ex) {
		            ex.printStackTrace();
		        }
			}
		});
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				AlterarProdutos();
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
	}
	
	private void AdicionarProdutos(){
		
		String produtos_id,produtos,produtos_marca, produtos_quantidade, produtos_preco;
		
		produtos_id = txtID.getText();
		produtos = txtprodutos.getText();
		produtos_marca = txtmarca.getText();
		produtos_quantidade = txtquant.getText();
		produtos_preco = txtpreco.getText();
		
		
		

		DTO.UsuarioDTO objusuariodto = new UsuarioDTO();
		objusuariodto.setProdutos(produtos);
		objusuariodto.setProdutos_marca(produtos_marca);
		objusuariodto.setProdutos_quantidade(produtos_quantidade);
        objusuariodto.setProdutos_preco(produtos_preco);
		
		
		UsuarioDAO objcadastrodao = new UsuarioDAO();
		objcadastrodao.adicionarProdutos(objusuariodto);
		JOptionPane.showMessageDialog(null, "Produto Adicionado");
	
	}
	
	private void listarValores() {
		try {
			UsuarioDAO usuarioDAO = new UsuarioDAO();
			
			DefaultTableModel DefaultTableModel = (DefaultTableModel) tblProduto.getModel();
			DefaultTableModel.setNumRows(0);
			
			ArrayList<UsuarioDTO> lista = usuarioDAO.PesquisarProdutos();
			
			for(int num = 0; num < lista.size(); num ++) {
				DefaultTableModel.addRow(new Object[]{
						lista.get(num).getProdutos_id(),
						lista.get(num).getProdutos(),
						lista.get(num).getProdutos_marca(),
						lista.get(num).getProdutos_quantidade(),
						lista.get(num).getProdutos_preco(),
				});
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Erro");
		}
	}
	
	private void CarregarCampos() {
		int setar = tblProduto.getSelectedRow();
		
		txtID.setText(tblProduto.getModel().getValueAt(setar, 0).toString());
		txtprodutos.setText(tblProduto.getModel().getValueAt(setar, 1).toString());
		txtmarca.setText(tblProduto.getModel().getValueAt(setar, 2).toString());
		txtquant.setText(tblProduto.getModel().getValueAt(setar, 3).toString());
		txtpreco.setText(tblProduto.getModel().getValueAt(setar, 4).toString());
	}
	
	private void LimparCampos() {
		txtprodutos.setText("");
		txtmarca.setText("");
		txtquant.setText("");
		txtpreco.setText("");
		txtprodutos.requestFocus();
	}
	
	private void AlterarProdutos() {
		int produto_id;
		String produto,produto_marca, produto_quantidade,produto_preco;
		
		produto_id =  Integer.parseInt(txtID.getText());
		produto = txtprodutos.getText();
		produto_marca = txtmarca.getText();
		produto_quantidade = txtquant.getText();
		produto_preco = txtpreco.getText();
		
		DTO.UsuarioDTO objusuariodto = new UsuarioDTO();
		objusuariodto.setProdutos_id(produto_id);
		objusuariodto.setProdutos(produto);
		objusuariodto.setProdutos_marca(produto_marca);
		objusuariodto.setProdutos_quantidade(produto_quantidade);
		objusuariodto.setProdutos_preco(produto_preco);
		
		UsuarioDAO objusuariodao = new UsuarioDAO();
		objusuariodao.AlterarProdutos(objusuariodto);
		
		
	}
	
	private void ExcluirProdutos(){
		int produto_id;
		
		produto_id = Integer.parseInt(txtID.getText());
		
		DTO.UsuarioDTO objusuariodto = new UsuarioDTO();
		objusuariodto.setProdutos_id(produto_id);
		
		UsuarioDAO objusuariodao = new UsuarioDAO();
		objusuariodao.ExcluirProdutos(objusuariodto);
	}
	
	
}
