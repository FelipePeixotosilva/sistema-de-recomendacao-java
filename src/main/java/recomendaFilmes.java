import org.apache.mahout.cf.taste.common.TasteException;
import org.apache.mahout.cf.taste.model.DataModel;
import org.apache.mahout.cf.taste.recommender.RecommendedItem;
import org.apache.mahout.cf.taste.recommender.Recommender;
import java.io.IOException;
import java.util.List;
/*
Nessa classe, ela esta como principal, pedi para pegar o modelo de filmes
no datamodel
vai instanciar esse recommender builder que configurou na outra classe
vai gerar uma lista sobre a recomendacao, vai fazer um laco para cada recomendacao
list recomend usuario "userId:4" "howMany:3" recomendacoes


* */
public class recomendaFilmes {
    public static void main(String[] args) throws  IOException,TasteException{
        DataModel filmes = new recomendador().getModeloDeFilmes();
        Recommender recommender = new recomendadorBuilder().buildRecommender(filmes);
        List<RecommendedItem> recommendations = recommender.recommend(4, 3);
        for(RecommendedItem recommendadtions :recommendations);
        System.out.println("Voce pode gostar desse filme");
        System.out.println(recommendations);
    }
}
