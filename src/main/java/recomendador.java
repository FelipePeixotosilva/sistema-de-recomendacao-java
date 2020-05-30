import org.apache.mahout.cf.taste.impl.model.file.FileDataModel;
import org.apache.mahout.cf.taste.model.DataModel;

import java.io.File;
import java.io.IOException;
//fazendo a leitura do csv com base de dados livros
public class recomendador {
    public DataModel getModeloLivros() throws  IOException{
        return getModelo("livros.csv");
    }

    private DataModel getModelo (String path) throws IOException {
        File file = new File("src/main/resources" + path);
        return new FileDataModel(file);
    }
    //fazendo a leitura do csv com base de dados filmes
    public DataModel getModeloDeFilmes() throws IOException{
        return  getModelo("filmes.csv");
    }


}
