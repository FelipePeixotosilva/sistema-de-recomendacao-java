import org.apache.mahout.cf.taste.common.TasteException;
import org.apache.mahout.cf.taste.model.DataModel;
import org.apache.mahout.cf.taste.recommender.RecommendedItem;
import org.apache.mahout.cf.taste.recommender.Recommender;
import java.io.IOException;
import java.util.List;

public class recomendaLivros {
    public static void main(String[] args)throws TasteException,IOException {
        DataModel produtos = new recomendador().getModeloLivros();
        Recommender recommender = new recomendadorBuilder().buildRecommender(produtos);
        System.out.println("Usuario1");
        List <RecommendedItem> recomendations = recommender.recommend(1,4);
        for (RecommendedItem recomendation : recomendations){
            System.out.println("Usuario 1, estes livros cobinam com você");
            System.out.println(recomendation);
        }
    }
}
