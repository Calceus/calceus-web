package br.com.calceus.modelo;

import java.util.ArrayList;
import java.util.List;

import br.com.calceus.DAO.FornecedorDAO;

public class Fornecedor {

	private int idFornecedor;
	private String razaoSocial; 
	private String cnpj;
	private int telefone;
	private String site;
	private String obs;
	
	private FornecedorDAO dao;
	
	public Fornecedor() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Fornecedor(String razaoSocial, String cnpj, int telefone, String site, String obs) {
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
		this.telefone = telefone;
		this.site = site;
		this.obs = obs;
	}

	public Fornecedor(int idFornecedor, String razaoSocial, String cnpj, int telefone, String site, String obs) {
		this.idFornecedor = idFornecedor;
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
		this.telefone = telefone;
		this.site = site;
		this.obs = obs;
	}
	
	public int getIdFornecedor() {
		return idFornecedor;
	}
	public void setIdFornecedor(int idFornecedor) {
		this.idFornecedor = idFornecedor;
	}
	public String getCnpj() {
		return cnpj;
	}
	public String getRazaoSocial() {
		return razaoSocial;
	}
	
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	public int getTelefone(){
		return telefone;
	}
	public String getSite() {
		return site;
	}
	public String getObs() {
		return obs;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getRazaoSocial();
	}
	
	public boolean salvar(Fornecedor fornecedor){
		dao = new FornecedorDAO();
		return dao.salvar(fornecedor);
	}
	
	public List<String> listar(){	
		List<String> fornecedores = new ArrayList<>();
		dao = new FornecedorDAO();
		//faz um array de fornecedores e atribui o toString ao ListS
		for (Fornecedor f : dao.listar()) {
			fornecedores.add(f.getRazaoSocial());
		}
		return fornecedores;
	}
	public List<Fornecedor> listarFornecedores() {
		dao = new FornecedorDAO();
		return dao.listarFornecedores();
	}
	public boolean excluir(int cod) {
		dao = new FornecedorDAO();
		return dao.excluir(cod);
	}
	public String consultarFornecedor(int idFornecedor){
		dao = new FornecedorDAO();
		return dao.buscafornecedor(idFornecedor);
	}
}
