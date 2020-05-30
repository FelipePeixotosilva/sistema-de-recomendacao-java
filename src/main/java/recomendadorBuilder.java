import org.apache.mahout.cf.taste.common.TasteException;
import org.apache.mahout.cf.taste.eval.RecommenderBuilder;
import org.apache.mahout.cf.taste.impl.neighborhood.ThresholdUserNeighborhood;
import org.apache.mahout.cf.taste.impl.recommender.GenericUserBasedRecommender;
import org.apache.mahout.cf.taste.impl.similarity.PearsonCorrelationSimilarity;
import org.apache.mahout.cf.taste.model.DataModel;
import org.apache.mahout.cf.taste.neighborhood.UserNeighborhood;
import org.apache.mahout.cf.taste.recommender.Recommender;
import org.apache.mahout.cf.taste.recommender.UserBasedRecommender;
import org.apache.mahout.cf.taste.similarity.UserSimilarity;
/*Dentro dessa classe eu implementei RecommenderBuilder, ele e como
fosse a interface do mauhout para construir esse recomendador,
criei recommender que ele vai construir o recomendador pegar o modelo
de dados, lancar um exception, com isso ele vai instanciar uma parte
do user similarity para fazer relação entre os usuarios, sempre voltando
ao modelo de dados
Vai instanciar um nova propriedade entre vizinha entre as pessoas,
siguinifica que tem ter 0.1 de vizinhança entre as pessoas
* */
public class recomendadorBuilder implements RecommenderBuilder{
    public Recommender buildRecommender (DataModel model) throws TasteException{
        UserSimilarity similarity = new PearsonCorrelationSimilarity(model);
        UserNeighborhood neighborhood = new ThresholdUserNeighborhood(0.1, similarity,model);
        UserBasedRecommender recommender = new GenericUserBasedRecommender(model, neighborhood,similarity);
        return recommender;
    }
}
