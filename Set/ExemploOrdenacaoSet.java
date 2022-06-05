package Set;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class ExemploOrdenacaoSet {

	public static void main(String[] args) {

		class Serie implements Comparable<Serie> {
			private String nome;
			private String genero;
			private Integer tempoEpsodio;

			public Serie(String nome, String genero, Integer tempoEpsodio) {
				this.nome = nome;
				this.genero = genero;
				this.tempoEpsodio = tempoEpsodio;
			}

			public String getNome() {
				return nome;
			}

			public void setNome(String nome) {
				this.nome = nome;
			}

			public String getGenero() {
				return genero;
			}

			public void setGenero(String genero) {
				this.genero = genero;
			}

			public Integer getTempoEpsodio() {
				return tempoEpsodio;
			}

			public void setTempoEpsodio(Integer tempoEpsodio) {
				this.tempoEpsodio = tempoEpsodio;
			}

			@Override
			public String toString() {
				return "Serie [nome=" + nome + ", genero=" + genero + ", tempoEpsodio=" + tempoEpsodio + "]";
			}

			@Override
			public int hashCode() {
				return Objects.hash(nome, genero, tempoEpsodio);
			}

			@Override
			public boolean equals(Object obj) {
				if (this == obj)
					return true;
				if (obj == null)
					return false;
				if (getClass() != obj.getClass())
					return false;
				Serie serie = (Serie) obj;
				return Objects.equals(nome, serie.nome) && Objects.equals(genero, serie.genero)
						&& Objects.equals(tempoEpsodio, serie.tempoEpsodio);
			}

			@Override
			public int compareTo(Serie serie) {
				int tempoEpsodio = Integer.compare(this.getTempoEpsodio(), serie.getTempoEpsodio());
				if (tempoEpsodio != 0)
					return tempoEpsodio;

				return this.getGenero().compareTo(serie.getGenero());

			}

		}

		System.out.println("-- Ordem Aleatoria--");
		Set<Serie> minhasSerie = new HashSet<>() {
			{
				add(new Serie("got", "fantasia", 60));
				add(new Serie("dark", "drama", 60));
				add(new Serie("that", "70s show", 25));

			}
		};
		for (Serie serie : minhasSerie) {
			System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpsodio());
		}

		System.out.println("--Ordem de Inserção--");
		Set<Serie> minhasSeries1 = new LinkedHashSet<>() {
			{
				add(new Serie("got", "fantasia", 60));
				add(new Serie("dark", "drama", 60));
				add(new Serie("that", "70s show", 25));

			}
		};
		for (Serie serie : minhasSeries1) {
			System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpsodio());
		}

		System.out.println("--Ordem natural (TempoEpsodio)--");
		Set<Serie> minhasSeries2 = new TreeSet<>(minhasSeries1);
		for (Serie serie : minhasSeries2) {
			System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpsodio());
		}

		class ComparatoNomeGeneroTempoEpsodio implements Comparator<Serie> {

			@Override
			public int compare(Serie s1, Serie s2) {
				int nome = s1.getNome().compareTo(s2.getNome());
				if (nome != 0) return nome;
				
				int genero = s1.getGenero().compareTo(s2.getGenero());
				if (genero != 0) return genero;
				
				return Integer.compare(s1.getTempoEpsodio(), s2.getTempoEpsodio());
			}
		}
		System.out.println("-Ordem Nome/Gênero/TempoEpsodio--");
		Set<Serie> minhasSeries3 = new TreeSet<>(new ComparatoNomeGeneroTempoEpsodio());
		minhasSeries3.addAll(minhasSerie);
		for (Serie serie : minhasSeries3) {
			System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpsodio());
		}

	}

}
