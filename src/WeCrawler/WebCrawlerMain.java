package WeCrawler;
public class WebCrawlerMain {

	public static void main(String[] args) {
		WebCrawler webCrawler = new WebCrawler();
		webCrawler.discover("https://www.google.com");
	}

}
