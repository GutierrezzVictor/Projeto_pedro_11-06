package DTO;

public class UsuarioDTO {
	
	private int id_usuario, trainer_id, Cliente_id, produtos_id;
	private String nome_usuario, email_cadastro, cpf_cadastro, telefone_cadastro, senha_usuario,Trainer,Age,Address,Mobile;
	private String Cliente,Cliente_Age,Cliente_Address,Cliente_Mobile;
	private String produtos,produtos_marca,produtos_quantidade,produtos_preco;
	
	public int getProdutos_id() {
		return produtos_id;
	}
	public void setProdutos_id(int produtos_id) {
		this.produtos_id = produtos_id;
	}
	public String getProdutos() {
		return produtos;
	}
	public void setProdutos(String produtos) {
		this.produtos = produtos;
	}
	public String getProdutos_marca() {
		return produtos_marca;
	}
	public void setProdutos_marca(String produtos_marca) {
		this.produtos_marca = produtos_marca;
	}
	public String getProdutos_quantidade() {
		return produtos_quantidade;
	}
	public void setProdutos_quantidade(String produtos_quantidade) {
		this.produtos_quantidade = produtos_quantidade;
	}
	public String getProdutos_preco() {
		return produtos_preco;
	}
	public void setProdutos_preco(String produtos_preco) {
		this.produtos_preco = produtos_preco;
	}
	public int getCliente_id() {
		return Cliente_id;
	}
	public void setCliente_id(int cliente_id) {
		Cliente_id = cliente_id;
	}
	public String getCliente() {
		return Cliente;
	}
	public void setCliente(String cliente) {
		Cliente = cliente;
	}
	public String getCliente_Age() {
		return Cliente_Age;
	}
	public void setCliente_Age(String cliente_Age) {
		Cliente_Age = cliente_Age;
	}
	public String getCliente_Address() {
		return Cliente_Address;
	}
	public void setCliente_Address(String cliente_Address) {
		Cliente_Address = cliente_Address;
	}
	public String getCliente_Mobile() {
		return Cliente_Mobile;
	}
	public void setCliente_Mobile(String cliente_Mobile) {
		Cliente_Mobile = cliente_Mobile;
	}
	public int getId_usuario() {
		return id_usuario;
	}
	public void setId_usuario(int id_usuario) {
		this.id_usuario = id_usuario;
	}
	public String getNome_usuario() {
		return nome_usuario;
	}
	public void setNome_usuario(String nome_usuario) {
		this.nome_usuario = nome_usuario;
	}
	public String getSenha_usuario() {
		return senha_usuario;
	}
	public void setSenha_usuario(String senha_usuario) {
		this.senha_usuario = senha_usuario;
	}
	public String getEmail_cadastro() {
		return email_cadastro;
	}

	public void setEmail_cadastro(String email_cadastro) {
		this.email_cadastro = email_cadastro;
	}

	public String getCpf_cadastro() {
		return cpf_cadastro;
	}

	public void setCpf_cadastro(String cpf_cadastro) {
		this.cpf_cadastro = cpf_cadastro;
	}

	public String getTelefone_cadastro() {
		return telefone_cadastro;
	}

	public void setTelefone_cadastro(String telefone_cadastro) {
		this.telefone_cadastro = telefone_cadastro;
	}
	
	public String getTrainer() {
		return Trainer;
	}

	public void setTrainer( String Trainer) {
		this.Trainer = Trainer;
	}
	
	public String getAge() {
		return Age;
	}

	public void setAge( String Age) {
		this.Age = Age;
	}
	
	public String getAddress() {
		return Address;
	}

	public void setAddress( String Address) {
		this.Address = Address;
	}
	
	public String getMobile() {
		return Mobile;
	}

	public void setMobile( String Mobile) {
		this.Mobile = Mobile;
	}
	public int getTrainer_id() {
		return trainer_id;
	}
	public void setTrainer_id(int trainer_id) {
		this.trainer_id = trainer_id;
	}
	
	

}