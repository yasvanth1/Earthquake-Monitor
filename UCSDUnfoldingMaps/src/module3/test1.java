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
		
		backgroundImg.resize(0, 200); //0 so after giving height Java will automatically adjust the width to fit the image (dynamic)
		image(backgroundImg, 0,0);
		int [] color = SunColorSec(second());
		fill(color [01],color [1], color [2]);				// sunny yellow colour
		ellipse(width/7,height/5,width/7,height/7);
		
	}
	
	public int[] SunColorSec (float seconds) {

		int[] rgb = new int [3]; // made a new array which will hold 3 values rgb
		
		float diffFrom30 = Math.abs(30 - seconds);
		
		float ratio = diffFrom30/30;
		rgb[0] = (int) (255*ratio);
		rgb[1]=  (int)(255*ratio); 
		rgb[2] = 0;
		
		
		return rgb;
		
		
		
	}
	
	
}
