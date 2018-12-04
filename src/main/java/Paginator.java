import java.util.ArrayList;
import java.util.List;

public class Paginator {
    private final int SMS_LENGHT;

    Paginator(int lenght){
        SMS_LENGHT = lenght;
    }

    public String[] paginate(String text){
        List<String> pages = new ArrayList<>();
        for (int i = 0; i < text.length(); i += SMS_LENGHT){
            if (text.length() - i > SMS_LENGHT){
                pages.add(text.substring(i,i+SMS_LENGHT));
            } else {
                pages.add(text.substring(i));
            }
        }
        return pages.toArray(new String[0]);
    }
}
