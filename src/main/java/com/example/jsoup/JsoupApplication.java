package com.example.jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class JsoupApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(JsoupApplication.class, args);

		List<Sneaker> sneakers = new ArrayList<>();
		Document doc = Jsoup.connect("url").get();

		Elements postTitleElements = doc.getElementsByClass("cell___DVxJ3");
//		postTitleElements.forEach(postTitleElement ->
//				System.out.println(postTitleElement.getElementsByClass("badge___TIWT0 brandBadge___eZZUq").text() + " | "
//						+ postTitleElement.getElementsByClass("name___vIcd9").text()));
		for (Element postTitleElement : postTitleElements) {
			String link = postTitleElement.getElementsByClass("content___NYh1q").attr("href");

			Sneaker sneaker = new Sneaker();
			sneaker.setLink(link);
			sneaker.setBrand(postTitleElement.getElementsByClass("badge___TIWT0 brandBadge___eZZUq").text());
			sneaker.setModel(postTitleElement.getElementsByClass("name___vIcd9").text());

			sneakers.add(sneaker);
		}

		sneakers.forEach(System.out::println);
	}
}
