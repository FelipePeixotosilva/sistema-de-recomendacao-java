import org.apache.mahout.cf.taste.common.TasteException;
import org.apache.mahout.cf.taste.eval.RecommenderBuilder;
import  org.apache.mahout.cf.taste.eval.RecommenderBuilder;
import org.apache.mahout.cf.taste.eval.RecommenderEvaluator;
import org.apache.mahout.cf.taste.impl.eval.AverageAbsoluteDifferenceRecommenderEvaluator;
import org.apache.mahout.cf.taste.model.DataModel;
import org.apache.mahout.common.RandomUtils;
import java.io.IOException;

public class Avaliador {
    public static void main (String[] args)throws IOException,TasteException{
        RandomUtils.useTestSeed();

        DataModel modelo = new recomendador().getModeloDeFilmes();
        RecommenderEvaluator evaluator = new AverageAbsoluteDifferenceRecommenderEvaluator();
        recomendadorBuilder builder = new recomendadorBuilder();
        double erro = evaluator.evaluate(builder, null, modelo, 0.9, 0.1);
        System.out.println("a taxa de erro desse siste,aa de recomendacao atual é");
        System.out.println(erro);
    }

}
