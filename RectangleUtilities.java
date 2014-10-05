package Rectangle;

public class RectangleUtilities {
	
	public boolean containsPoint(int px, int py, int rx, int ry, int w, int h){

		
		if(((px<=(rx+w)) && (py<=(ry+h))) && ((px>=rx) && (py>=ry))){
			return true; 
		}else{
			return false;
		}// end if else

	}// close contains point



Boolean result;
	public boolean intersects(int r1x, int r1y, int r1w, int r1h, int r2x, int r2y, int r2w, int r2h){
		int a,b,c,d;
		result=false; // to reset each instance due to global variable and keep a default
		for(a=r1x; a<=(r1w+r1x); a++){
			for(b=r1y; b<=(r1h+r1h); b++){
				for(c=r2x; c<=(r2w+r2x); c++){       // Nested FOR to compare all points of both rectangles
					for(d=r2y; d<=(r2h+r2y); d++){   // such that intersection can be determined
						if((a==c)&&(b==d)){
							result= true;
						}//end if
					}
				}
			}
		}// end main FOR
		
		 return result;
	}// close intersects

 
}//close class

