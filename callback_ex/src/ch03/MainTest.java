package ch03;

public class MainTest {

	public static void main(String[] args) {
		
		// ��Ŀ ���� ��ü ����
		HackerNews hackerNews = new HackerNews();
		
		SBSNews sbsNews = new SBSNews();
		
		// ��� �ۼ�
		MyArticle article = new MyArticle(hackerNews, sbsNews);
		article.complete();
		

		
	}

}
