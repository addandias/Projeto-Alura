import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Principal {

    public static void main(String[] args) {

        Filme meuFilme = new Filme();
        meuFilme.setNome("Senna");
        meuFilme.setAnoDelancamento(2010);
        meuFilme.setDuracaoEmMinutos(106);
        System.out.println("duração do filme: " + meuFilme.getDuracaoEmMinutos());

        meuFilme.fichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(10);
        meuFilme.avalia(6);
        System.out.println("nota geral: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegamedia());

        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoDelancamento(2000);
        lost.fichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        System.out.println("duração da série: " + lost.getDuracaoEmMinutos());

        Filme outroFilme = new Filme();
        outroFilme.setNome("Top Gun");
        outroFilme.setAnoDelancamento(2022);
        outroFilme.setDuracaoEmMinutos(123);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);
    }
}