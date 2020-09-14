
public class Livro {
	private String titulo;
	private String autor;
	private int ano;
	private String categoria;
	private int estante;
	private int prateleira;
	private boolean emprestado;

	public Livro(String titulo, String autor, int ano, String categoria, int estante, int prateleira,
			boolean emprestado) {
		this.titulo = titulo;
		this.autor = autor;
		this.ano = ano;
		this.categoria = categoria;
		this.estante = estante;
		this.prateleira = prateleira;
		this.emprestado = emprestado;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public int getEstante() {
		return estante;
	}

	public void setEstante(int estante) {
		this.estante = estante;
	}

	public int getPrateleira() {
		return prateleira;
	}

	public void setPrateleira(int prateleira) {
		this.prateleira = prateleira;
	}

	public boolean isEmprestado() {
		return emprestado;
	}

	public void emprestar() {
		emprestado = true;
	}

	public void devolver() {
		emprestado = false;
	}

	public void imprimir() {
		System.out.println("Título    :  " + titulo);
		System.out.println("Autor     :  " + autor);
		System.out.println("Ano       :  " + ano);
		System.out.println("Categoria :  " + categoria);
		System.out.println("Estante   :  " + estante);
		System.out.println("Prateleira:  " + prateleira);
		if (emprestado == true) {
			System.out.println("Emprestado");
		} else {
			System.out.println("Disponível");
		}
		System.out.println("");
	}
}
