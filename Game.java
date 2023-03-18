/** 
 * @author rhear (rheiformes)
 * 
 * @sources:
 * https://www.setgame.com/sites/default/files/instructions/SET%20INSTRUCTIONS%20-%20ENGLISH.pdf
 * https://www.youtube.com/watch?v=164HZw_PKyk&ab_channel=KINDanon
 * https://sanderevers.github.io/2019/09/11/finding-sets.html
 * https://www.geeksforgeeks.org/robot-class-java-awt/
 * 
 * @notes:
 * 
 */

import java.awt.*;
import java.util.*;

public class Game {
	
	GameCard[][] board = new GameCard[3][4];
	
	public Game(GameCard[][] board) {
		this.board = board;
	}
	
	
	public static void main(String[] args) {
		test1();
		//Runtime run = Runtime.getRuntime();
		
		
		
	}
	
	
	static boolean areSET(GameCard a, GameCard b, GameCard c) {
		if (val(a.color, b.color, c.color) 
				+ val(a.shape, b.shape, c.shape)
				+ val(a.shade, b.shade, c.shade)
				+ val(a.number, b.number, c.number) == 4) {
			return true;
		}
		return false;
	}
		
	/*** 
	 * @param enumA: any obj
	 * @param enumB: any obj
	 * @param enumC: any obj
	 * @return integer: 1 if all inputs are same or unique, 0 if not
	 */
	static int val(Object enumA, Object enumB, Object enumC) {
		if (enumA==enumB && enumB==enumC) {
			return 1;
		}
		if (enumA!=enumB && enumB!=enumC && enumA!=enumC) {
			return 1;
		}
		return 0;
	}
	
	


	
	static void test1() {
		GameCard gcA = new GameCard(Color.GREEN, Shape.DIAMOND, Shade.EMPTY, 0);
		GameCard gcB = new GameCard(Color.RED, Shape.DIAMOND, Shade.EMPTY, 0);
		GameCard gcC = new GameCard(Color.PURPLE, Shape.DIAMOND, Shade.EMPTY, 0);
		System.out.println(areSET(gcA, gcB, gcC));
	}
}
