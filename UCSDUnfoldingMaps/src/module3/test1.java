package module3;

import processing.core.*;

public class test1 extends PApplet {

	private String URL = "https://upload.wikimedia.org/wikipedia/commons/a/af/Miami_Beach_-_Sand_Dune_Flora_-_Coconut_Palms.jpg";
	private PImage backgroundImg;
	
	
	public void setup() {
		size(200,200);
		backgroundImg = loadImage(URL,"jpg");
	}
	
	public void draw () {
		
		backgroundImg.resize(200, 200);
		image(backgroundImg, 0,0);
		
	}
	
}
