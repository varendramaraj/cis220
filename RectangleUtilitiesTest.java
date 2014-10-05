package Rectangle.Test;

import Rectangle.RectangleUtilities;

public class RectangleUtilitiesTest {
	
	public static void main(String args[]){

		RectangleUtilities r = new RectangleUtilities();
		
		boolean 

		ans = r.containsPoint(8,5,6,3,4,5);
		System.out.println(ans?"Point in rectangle : TEST PASSED":"Point outside rectangle : TEST FAILED");

		ans = r.containsPoint(6,7,6,3,4,5);
		System.out.println(ans?"Point on rectangle : TEST PASSED":"Point outside rectangle : TEST FAILED");

		ans = r.containsPoint(3,2,6,3,4,5);
		System.out.println(ans?"Point in/on rectangle TEST FAILED":"Point outside rectangle : TEST PASSED");


		//intersects

		ans = r.intersects(2,3,3,3,4,2,4,3);
		System.out.println(ans?"Rectangles intersect : TEST PASSED":"Rectangles does not intersects : TEST FAILED");
		// test with both rectangles intersecting

		ans = r.intersects(2,3,3,3,6,7,2,2);
		System.out.println(ans?"Rectangles intersect : TEST FAILED":"Rectangles does not intersects : TEST PASSED");
		// test with both rectangles not intersecting

		ans = r.intersects(2,3,3,3,1,4,5,1);
		System.out.println(ans?"Rectangles intersect : TEST PASSED":"Rectangles does not intersects : TEST FAILED");
		//test with main point out of the initial rectangle

		ans = r.intersects(2,3,3,3,5,3,3,3);
		System.out.println(ans?"Rectangles intersect : TEST PASSED":"Rectangles does not intersects : TEST FAILED");
		//test with both rectangles intersecting by boarder only

	}
}//close class