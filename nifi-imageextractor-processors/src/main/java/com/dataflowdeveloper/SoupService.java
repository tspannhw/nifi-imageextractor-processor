package com.dataflowdeveloper;

import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 * 
 * @author tspann
 *
 */
public class SoupService {

	private static final String HTML_IMAGE_TAG_NAME = "img";
	private static final String HTML_SRC_TAG_NAME = "[src]";

  
	/**
	 * extract images from an HTML file in URL
	 *
	 * @param url
	 * @return Image List
	 */
	public List<Image> extract(String url) {
		List<Image> imagesReturned = new ArrayList<>();

		try {
			Document doc = Jsoup.connect(url).get();
			Elements images = doc.select(HTML_SRC_TAG_NAME);
			Image image = null;
 
			for (Element src : images) {
		        if (src.tagName().equals(HTML_IMAGE_TAG_NAME)) { 
		        	// can also get height, widht, alt
	                image = new Image(src.attr("abs:src"));
	                imagesReturned.add(image);
		        }
			}
		} catch (Exception x) {
			x.printStackTrace();
		}
		return imagesReturned;
	}
}