import java.text.MessageFormat;

public class TextBlocks {

    public static void main(String[] args) {
        String json = """
                '{'
                   "id": {0, number,#},
                   "name": "{1}",
                   "salary": "{2, number}"
                '}'
                """;

        Object[] arguments = {
                1001,     // id
                "John Doe",  // name
                34000       // salary
        };

        String formattedTextBlock3 = MessageFormat.format(json, arguments);
        System.out.println(formattedTextBlock3);
    }
}
