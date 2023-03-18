/** 
 * @author rhear (rheiformes)
 * 
 * @notes
 * 
 */

// game card features
enum Color {
	RED,
	GREEN,
	PURPLE
}

enum Shape {
	DIAMOND,
	OVAL,
	SQUIGGLE
}

enum Shade {
	EMPTY,
	STRIPED,
	FULL
}

public class GameCard {

	Color color;
	Shape shape;
	Shade shade;
	int number; //number of shapes: 1, 2, or 3
	
	/***
	 * 
	 * @param c: Color (Color.____ enum)
	 * @param shp: Shape (Shape.___ enum)
	 * @param shd: Shade (Shade.___ enum)
	 * @param num: Number (int)
	 */
	GameCard(Color c, Shape shp, Shade shd, int num) {
		this.color = c;
		this.shape = shp;
		this.shade = shd;
		this.number = num;
	}
	
	@Override
	public String toString() {
		return "Color: " + this.color.name()
				+ "\tShape: " + this.shape.name()
				+ "\tShade: " + this.shade.name()
				+ "\tNumber: " + this.number;
			
		
	}
	
	
	
	
}
