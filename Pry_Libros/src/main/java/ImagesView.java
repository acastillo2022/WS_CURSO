import java.util.ArrayList;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class ImagesView {
     
    private ArrayList<String> images;
     
    @PostConstruct
    public void init() {
        images = new ArrayList<String>();
        for (int i = 1; i <= 3; i++) {
            images.add("emelnorte" + i + ".jpg");
        }
    }
 
    public ArrayList<String> getImages() {
        return images;
    }
}