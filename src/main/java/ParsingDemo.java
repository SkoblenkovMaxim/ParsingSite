import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.IOException;

public class ParsingDemo {
    public static void main(String[] args) throws IOException {
        String url = "https://www.mk.ru/polls/";
        Document document = Jsoup.connect(url).get();
        Elements voteRight = document.getElementsByClass("right_block vote_right");
        for (Element blockVoteRight : voteRight) {
            System.out.println(blockVoteRight.text());
            Elements href = document.getElementsByTag("<a>");
            System.out.println(href.text());
        }
    }
}
