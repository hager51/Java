import java.util.ArrayList;
import java.util.List;

abstract class Shape {
	abstract void draw();
}

class Rectangle extends Shape {
	void draw() {
		System.out.println("Rectangle Shape");
	}
}

class Circle extends Shape {
	void draw() {
		System.out.println("Circle Shape");
	}
}

class TestShape {
	public static void myShape(List<? extends Shape> shapes)
	{
		for(Shape shape: shapes)
		{
          		shape.draw();
     	}
    }
}

class ShapDraw {
	public static void main(String args[]){
		List<Rectangle> rect = new ArrayList<>(){
			{
				add(new Rectangle());
			}
		};
		TestShape.myShape(rect);
		List<Circle> circ = new ArrayList<>(){
			{
				add(new Circle());		
			}
		};
		

        TestShape.myShape(circ);
	}
}