package oo.composicao;

public class CursoTeste {

	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno("Ana");
		Aluno aluno2 = new Aluno("Bia");
		Aluno aluno3 = new Aluno("Lia");
		
		Curso curso1 = new Curso("Java Completo");
		Curso curso2 = new Curso("Web 2020");
		Curso curso3 = new Curso("React Native");
		
		curso1.adcionarAluno(aluno1);
		curso1.adcionarAluno(aluno2);
		
		curso2.adcionarAluno(aluno3);
		curso2.adcionarAluno(aluno1);
		
		aluno1.adicionarCurso(curso3);
		aluno2.adicionarCurso(curso3);
		aluno3.adicionarCurso(curso3);
		
		
		for(Aluno aluno: curso1.alunos) {
			System.out.println("Estou matriculado no curso " + curso1.nome);
			System.out.println("... e meu nome é " + aluno.nome);
			System.out.println();
		}
		for(Aluno aluno: curso2.alunos) {
			System.out.println("Estou matriculado no curso "+ curso2.nome);
			System.out.println("... e meu nome é " + aluno.nome);
			System.out.println();
		}
		for(Aluno aluno: curso3.alunos) {
			System.out.println("Estou matriculado no curso " + curso3.nome);
			System.out.println("... e meu nome é " + aluno.nome);
			System.out.println();
		}
		
		for(Curso curso: aluno1.cursos) {
			System.out.println("Meu nome é " + aluno1.nome);
			System.out.println("... estou cursando o curso "+ curso.nome);
			System.out.println();
		}
		
		System.out.println(aluno1.cursos.get(0).alunos);
		
		Curso cursoEncontrado = aluno1.obterCursoPorNome("JAVA COMPLETO");
		
		if(cursoEncontrado != null) {
			System.out.println(cursoEncontrado.nome);
			System.out.println(cursoEncontrado.alunos);
		}
		
		
	}
}
