
public class TestaLivro {
	public static void main(String args[]) {
		
		Livro l1,l2,l3,l4,l5;
		
		l1 = new Livro("Memórias Póstumas de Brás Cubas","Machado de Assis",1881,"Romance",1,1,true);
		l2 = new Livro("O Guarani","José de Alencar",1857,"Romance",1,2,true);
		l3 = new Livro("Iracema","José de Alencar",1865,"Romance",1,3,false);
		l4 = new Livro("Agosto","Rubem Fonseca",1992,"Romance",2,1,true);
		l5 = new Livro("Vidas Secas","Graciliano Ramos",1933,"Romance",2,2,false);
		
		l1.emprestar();
		l2.emprestar();
		l3.emprestar();
		l4.emprestar();
		l5.emprestar();
		
		l1.imprimir();
		l2.imprimir();
		l3.imprimir();
		l4.imprimir();
		l5.imprimir();
		
		l1.devolver();
		l2.devolver();
		l3.devolver();
		l4.devolver();
		l5.devolver();
		
		l1.imprimir();
		l2.imprimir();
		l3.imprimir();
		l4.imprimir();
		l5.imprimir();
	}
}
