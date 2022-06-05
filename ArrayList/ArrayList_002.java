package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArrayList_002 {

	public static void main(String[] args) {

		class Gato implements Comparable<Gato> {
			private String nome;
			private Integer idade;
			private String cor;

			public Gato(String nome, Integer idade, String cor) {
				this.nome = nome;
				this.idade = idade;
				this.cor = cor;
			}

			public String getNome() {
				return nome;
			}

			public void setNome(String nome) {
				this.nome = nome;
			}

			public Integer getIdade() {
				return idade;
			}

			public void setIdade(Integer idade) {
				this.idade = idade;
			}

			public String getCor() {
				return cor;
			}

			public void setCor(String cor) {
				this.cor = cor;
			}

			@Override
			public String toString() {
				return "Gato { " + "nome= " + nome + ", idade= " + idade + ", cor= " + cor + " }";
			}

			@Override
			public int compareTo(Gato gato) {
				return this.getNome().compareToIgnoreCase(gato.getNome());
			}
		}

		class ComparatorIdade implements Comparator<Gato> {
			@Override
			public int compare(Gato g1, Gato g2) {
				return Integer.compare(g1.getIdade(), g2.getIdade());
			}
		}
		class ComparatorCor implements Comparator<Gato> {

			@Override
			public int compare(Gato g1, Gato g2) {
				return g1.getCor().compareToIgnoreCase(g2.getCor());
			}
		}
		class ComparatorNomeCorIdade implements Comparator<Gato> {
			
			@Override
			public int compare(Gato g1, Gato g2) {
				int nome = g1.getNome().compareToIgnoreCase(g2.getNome());
				if(nome != 0) return nome;
				
				int cor = g1.getNome().compareToIgnoreCase(g2.getCor());
				if(cor != 0) return cor;
				
				return Integer.compare(g1.getIdade(), g2.getIdade());
			}
		}

		List<Gato> meusGatos = new ArrayList<>() {
			{
				add(new Gato("John", 18, "preto"));
				add(new Gato("Simba", 6, "tigrado"));
				add(new Gato("Jon", 12, "amarelo"));
			}
		};
		System.out.println("-- Ordem de Iserção ---");
		System.out.println(meusGatos);

		System.out.println("-- Ordem Aleatória ---");
		Collections.shuffle(meusGatos);
		System.out.println(meusGatos);

		System.out.println("-- Ordem Natural (nome) ---");
		Collections.sort(meusGatos);
		System.out.println(meusGatos);

		System.out.println("-- Ordem idade ---");
		Collections.sort(meusGatos, new ComparatorIdade());
		// meusGatos.sort(new ComparatorIdade());
		System.out.println(meusGatos);

		System.out.println("-- Ordem Cor ---");
		meusGatos.sort(new ComparatorCor());
		System.out.println(meusGatos);
		
		System.out.println("-- Ordem Nome/Cor/Idade ---");
		Collections.sort(meusGatos, new ComparatorNomeCorIdade());
		System.out.println(meusGatos);
	}

}
