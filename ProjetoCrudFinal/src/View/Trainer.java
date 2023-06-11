package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

import DAO.UsuarioDAO;
import DTO.UsuarioDTO;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.print.PrinterException;
import java.util.ArrayList;

import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Trainer extends JFrame {

	private JPanel contentPane;
	private JTextField txtTrainer;
	private JTextField txtAge;
	private JTextField txtAddress;
	private JTextField txtMobile;
	private JTable TabelaTrainer;
	private JTextField txtID;
	private JTextField textField;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Trainer frame = new Trainer();
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
	public Trainer() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 988, 653);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));


		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(30, 144, 255));
		panel.setBounds(0, 0, 972, 81);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Personal Trainers");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel.setBounds(345, 25, 241, 45);
		panel.add(lblNewLabel);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 43, 22);
		panel.add(menuBar);
		
		JMenu mnNewMenu = new JMenu("Menu");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Adicionar Produtos");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Produtos produtos = new Produtos();
				produtos.setVisible(true);
				dispose();
			}
		});
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Adicionar Clientes");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Clientes clientes = new Clientes();
				clientes.setVisible(true);
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
		
		JLabel lblNewLabel_1 = new JLabel("Personal");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(10, 135, 112, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Idade");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2.setBounds(10, 181, 46, 24);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Endereço");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3.setBounds(10, 230, 70, 19);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Telefone");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_4.setBounds(10, 274, 70, 14);
		contentPane.add(lblNewLabel_4);
		
		txtTrainer = new JTextField();
		txtTrainer.setBounds(93, 134, 131, 20);
		contentPane.add(txtTrainer);
		txtTrainer.setColumns(10);
		
		txtAge = new JTextField();
		txtAge.setColumns(10);
		txtAge.setBounds(93, 185, 131, 20);
		contentPane.add(txtAge);
		
		txtAddress = new JTextField();
		txtAddress.setColumns(10);
		txtAddress.setBounds(90, 229, 131, 20);
		contentPane.add(txtAddress);
		
		txtMobile = new JTextField();
		txtMobile.setColumns(10);
		txtMobile.setBounds(90, 273, 131, 20);
		contentPane.add(txtMobile);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(367, 137, 540, 256);
		contentPane.add(scrollPane);
		
		TabelaTrainer = new JTable();
		scrollPane.setViewportView(TabelaTrainer);
		TabelaTrainer.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID", "PersonalTrainer", "Idade", "Endereço", "Telefone"
			}
		));
		
		txtID = new JTextField();
		txtID.setEnabled(false);
		txtID.setColumns(10);
		txtID.setBounds(93, 104, 131, 20);
		contentPane.add(txtID);
		
		JLabel lblNewLabel_1_1 = new JLabel("ID");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_1.setBounds(10, 103, 112, 14);
		contentPane.add(lblNewLabel_1_1);
		
		textField = new JTextField();
		textField.addKeyListener(new KeyAdapter() {
			public void keyReleased(KeyEvent e) {
				String searchKeyword = textField.getText();
		        DefaultTableModel tableModel = (DefaultTableModel) TabelaTrainer.getModel();
		        TableRowSorter<DefaultTableModel> rowSorter = new TableRowSorter<>(tableModel);
		        TabelaTrainer.setRowSorter(rowSorter);
		        rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + searchKeyword));
			}
		});
		textField.setColumns(10);
		textField.setBounds(458, 106, 131, 20);
		contentPane.add(textField);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(244, 164, 96));
		panel_1.setBounds(0, 81, 972, 533);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton = new JButton("Adicionar");
		btnNewButton.setBounds(370, 319, 164, 23);
		panel_1.add(btnNewButton);
		
		JButton btnpesquisar = new JButton("Listar");
		btnpesquisar.setBounds(370, 353, 164, 23);
		panel_1.add(btnpesquisar);
		
		JButton btnCarregarCampos = new JButton("CARREGAR CAMPOS");
		btnCarregarCampos.setBounds(370, 387, 164, 23);
		panel_1.add(btnCarregarCampos);
		
		JButton btnNewButton_1 = new JButton("Limpar");
		btnNewButton_1.setBounds(566, 319, 164, 23);
		panel_1.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Alterar");
		btnNewButton_2.setBounds(566, 353, 164, 23);
		panel_1.add(btnNewButton_2);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setBounds(566, 387, 164, 23);
		panel_1.add(btnExcluir);
		
		JLabel lblNewLabel_1_2 = new JLabel("Pesquisar");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_2.setBounds(375, 25, 74, 23);
		panel_1.add(lblNewLabel_1_2);
		
		JButton btnNewButton_3 = new JButton("Print");
		btnNewButton_3.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				try {
		            TabelaTrainer.print(); // Imprime a tabela
		        } catch (PrinterException ex) {
		            ex.printStackTrace();
		        }
			}
		});
		btnNewButton_3.setBounds(370, 422, 164, 23);
		panel_1.add(btnNewButton_3);
		btnExcluir.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				ExcluirTrainer();
				listarValores();
				LimparCampos();
			}
		});
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				AlterarTrainer();
				listarValores();
				LimparCampos();
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
				String trainer_id,Trainer,Age, Address, Mobile;
				
				trainer_id = txtID.getText();
				Trainer = txtTrainer.getText();
				Age = txtAge.getText();
				Address = txtAddress.getText();
				Mobile = txtMobile.getText();
				

				DTO.UsuarioDTO objusuariodto = new UsuarioDTO();
				objusuariodto.setTrainer(Trainer);
				objusuariodto.setAge(Age);
				objusuariodto.setAddress(Address);
				objusuariodto.setMobile(Mobile);
				
				if (Trainer.isEmpty() || Age.isEmpty() || Address.isEmpty() || Mobile.isEmpty()) {
	                JOptionPane.showMessageDialog(null, "Todos os campos devem ser preenchidos.");
	                if (Trainer.isEmpty()) {
	                    txtTrainer.requestFocus();
	                } else if (Age.isEmpty()) {
	                    txtAge.requestFocus();
	                } else if (Address.isEmpty()) {
	                    txtAddress.requestFocus();
	                } else {
	                    txtMobile.requestFocus();
	                }
	                return;
	            }

				
				
				UsuarioDAO objcadastrodao = new UsuarioDAO();
				objcadastrodao.cadastrarTrainer(objusuariodto);
				JOptionPane.showMessageDialog(null, "Trainer Adicionado");
				listarValores();
			}
		});
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Pesquisar");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_1_1.setBounds(378, 103, 84, 23);
		contentPane.add(lblNewLabel_1_1_1);
	}
	
	
	private void listarValores() {
		try {
			UsuarioDAO usuarioDAO = new UsuarioDAO();
			
			DefaultTableModel DefaultTableModel = (DefaultTableModel) TabelaTrainer.getModel();
			DefaultTableModel.setNumRows(0);
			
			ArrayList<UsuarioDTO> lista = usuarioDAO.PesquisarTrainer();
			
			for(int num = 0; num < lista.size(); num ++) {
				DefaultTableModel.addRow(new Object[]{
						lista.get(num).getTrainer_id(),
						lista.get(num).getTrainer(),
						lista.get(num).getAge(),
						lista.get(num).getAddress(),
						lista.get(num).getMobile(),
				});
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Erro");
		}
	}
	
	private void CarregarCampos() {
		int setar = TabelaTrainer.getSelectedRow();
		
		txtID.setText(TabelaTrainer.getModel().getValueAt(setar, 0).toString());
		txtTrainer.setText(TabelaTrainer.getModel().getValueAt(setar, 1).toString());
		txtAge.setText(TabelaTrainer.getModel().getValueAt(setar, 2).toString());
		txtAddress.setText(TabelaTrainer.getModel().getValueAt(setar, 3).toString());
		txtMobile.setText(TabelaTrainer.getModel().getValueAt(setar, 4).toString());
	}
	
	private void LimparCampos() {
		txtTrainer.setText("");
		txtAge.setText("");
		txtAddress.setText("");
		txtMobile.setText("");
		txtTrainer.requestFocus();
	}
	
	private void AlterarTrainer() {
		int trainer_id;
		String Trainer,Age, Address, Mobile;
		
		trainer_id = Integer.parseInt(txtID.getText());
		Trainer = txtTrainer.getText();
		Age = txtAge.getText();
		Address = txtAddress.getText();
		Mobile = txtMobile.getText();
		
		DTO.UsuarioDTO objusuariodto = new UsuarioDTO();
		objusuariodto.setTrainer_id(trainer_id);
		objusuariodto.setTrainer(Trainer);
		objusuariodto.setAge(Age);
		objusuariodto.setAddress(Address);
		objusuariodto.setMobile(Mobile);
		
		UsuarioDAO objusuariodao = new UsuarioDAO();
		objusuariodao.AlterarTrainer(objusuariodto);
		listarValores();
		
	}
	
	private void ExcluirTrainer(){
		int trainer_id;
		
		trainer_id = Integer.parseInt(txtID.getText());
		
		DTO.UsuarioDTO objusuariodto = new UsuarioDTO();
		objusuariodto.setTrainer_id(trainer_id);
		
		UsuarioDAO objusuariodao = new UsuarioDAO();
		objusuariodao.ExcluirTrainer(objusuariodto);
		listarValores();
	}
	

	
	
}
