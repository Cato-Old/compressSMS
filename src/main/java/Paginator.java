import java.util.ArrayList;
import java.util.List;

public class Paginator {
    private final int SMS_LENGTH;

    Paginator (int length) throws IllegalArgumentException {
        if (length > 0){
            SMS_LENGTH = length;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public String[] paginate(String text){
        List<String> pages = new ArrayList<>();
        for (int i = 0; i < text.length(); i += SMS_LENGTH){
            if (text.length() - i > SMS_LENGTH){
                pages.add(text.substring(i ,i+SMS_LENGTH));
            } else {
                pages.add(text.substring(i));
            }
        }
        return pages.toArray(new String[0]);
    }
}