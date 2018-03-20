package chapter;

public class Box1 {
	int width,length,height;
	
	Box1(int w,int l,int h){
		width = w;
		length = l;
		height = h;
		
	}
	boolean isSameBox(Box1 obj){
		if((obj.width == width) &(obj.length == length) & (obj.height == height))
			return true;
		else
			return false;
	}
}
