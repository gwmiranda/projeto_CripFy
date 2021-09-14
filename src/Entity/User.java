package Entity;

import java.time.LocalDate;

public class User {

	 private Long id;
	    private String userName;
	    private String senha;
	    private String nome;
	    private String email;
	    private Boolean preferencias;
	    private LocalDate dataCriacao;
	    private LocalDate dataEdicao;

	    public User() {
	    }

	    public User(Long id, String userName, String senha, String nome, String email, Boolean preferencias, LocalDate dataCriacao, LocalDate dataEdicao) {
	        this.id = id;
	        this.userName = userName;
	        this.senha = senha;
	        this.nome = nome;
	        this.email = email;
	        this.preferencias = preferencias;
	        this.dataCriacao = dataCriacao;
	        this.dataEdicao = dataEdicao;
	    }

	    public Long getId() {
	        return id;
	    }

	    public String getUserName() {
	        return userName;
	    }

	    public void setUserName(String userName) {
	        this.userName = userName;
	    }

	    public String getSenha() {
	        return senha;
	    }

	    public void setSenha(String senha) {
	        this.senha = senha;
	    }

	    public String getNome() {
	        return nome;
	    }

	    public void setNome(String nome) {
	        this.nome = nome;
	    }

	    public String getEmail() {
	        return email;
	    }

	    public void setEmail(String email) {
	        this.email = email;
	    }

	    public Boolean getPreferencias() {
	        return preferencias;
	    }

	    public void setPreferencias(Boolean preferencias) {
	        this.preferencias = preferencias;
	    }

	    public LocalDate getDataCriacao() {
	        return dataCriacao;
	    }

	    public void setDataCriacao(LocalDate dataCriacao) {
	        this.dataCriacao = dataCriacao;
	    }

	    public LocalDate getDataEdicao() {
	        return dataEdicao;
	    }

	    public void setDataEdicao(LocalDate dataEdicao) {
	        this.dataEdicao = dataEdicao;
	    }

	    @Override
	    public String toString() {
	        return "Usuario{" +
	                "id=" + id +
	                ", userName='" + userName + '\'' +
	                ", senha='" + senha + '\'' +
	                ", nome='" + nome + '\'' +
	                ", email='" + email + '\'' +
	                ", preferencias=" + preferencias +
	                ", dataCriacao=" + dataCriacao +
	                ", dataEdicao=" + dataEdicao +
	                '}';
	    }
}
