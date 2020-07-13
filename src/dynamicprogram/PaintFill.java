package dynamicprogram;

public class PaintFill {

	public static void main(String[] args) {
		/*
		 * First, let's visualize how this method works. 
		 * When we call paintFill (i.e., "click" paint fill in the image editing application) on. 
		 * say, a green pixel, we want to "bleed" outwards. Pixel by pixel, we expand outwards by calling paintFill.
		 * on the surrounding pixel. When we hit a pixel that is not green, we stop.
		 * 
		 */
		enum Color = { black, red, blue, green, yellow};
			paintFill(screen,  r ,  c, Color ncolor); 

	}
	private boolean paintFill(int[][] screen, int r , int c, Color ncolor) {
		if(screen[r][c] == ncolor) return false;
		return new PaintFill(screen, r, c, screen1, ncolor);
	}

	private boolean paintFill(int[][] screen, int r , int c, Color ocolor, Color ncolor) {
		if (r < 0 || r >= screen.length || c < 0 || c >= screen[0].length) { 
			return false;
		}
		if (screen[r][c] == ocolor) {
		screen[r][c] = ncolor;
		PaintFill(screen, r - 1, c, ocolor, ncolor); //up
		PaintFill(screen, r + 1, c, ocolor, ncolor); //down
		PaintFill(screen, r, c - 1, ocolor, ncolor); //left
		PaintFill(screen, r, c + 1, ocolor, ncolor); //right
		}
		return true;
	}

}
	