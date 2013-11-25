class Circle {
	double radius;
	double diameter;
	double circumference;
	double area;
}

class Cone {
	Circle base;
	double height;
	double volume;
	double surface;
}

public class RoundAndRound {
	public static void main(String[] args) {
		Circle circle1 = new Circle();
		circle1.radius = 5.1;
		circle1.diameter = circle1.radius * 2;
		circle1.circumference = 2 * Math.PI * circle1.radius;
		circle1.area = Math.PI * Math.pow(circle1.radius, circle1.radius);

		Circle circle2 = new Circle();
		circle2.radius = 17.5;
		circle2.diameter = circle2.radius * 2;
		circle2.circumference = 2 * Math.PI * circle2.radius;
		circle2.area = Math.PI * Math.pow(circle2.radius, circle2.radius);

		System.out.println("circle1.radius = " + circle1.radius);
		System.out.println("circle1.diameter = " + circle1.diameter);
		System.out.println("circle1.circumference = " + circle1.circumference);
		System.out.println("circle1.area = " + circle1.area);

		System.out.println("circle2.radius = " + circle2.radius);
		System.out.println("circle2.diameter = " + circle2.diameter);
		System.out.println("circle2.circumference = " + circle2.circumference);
		System.out.println("circle2.area = " + circle2.area);
		
		Cone cone1 = new Cone();
		cone1.base = circle1;
		cone1.height = 10.3;
		cone1.volume = (cone1.base.area*cone1.height)/3;
		cone1.surface = cone1.base.area+Math.PI*cone1.base.radius*Math.sqrt(Math.pow(cone1.base.radius, cone1.base.radius));
		
		Cone cone2 = new Cone();
		cone2.base = circle2;
		cone2.height = 10.3;
		cone2.volume = (cone2.base.area*cone2.height)/3;
		cone2.surface = cone2.base.area+Math.PI*cone2.base.radius*Math.sqrt(Math.pow(cone2.base.radius, cone2.base.radius));
		
		System.out.println("cone1.base = " + cone1.base);
		System.out.println("cone1.height = " + cone1.height);
		System.out.println("cone1.volume = " + cone1.volume);
		System.out.println("cone1.surface = " + cone1.surface);
		
		System.out.println("cone2.base = " + cone2.base);
		System.out.println("cone2.height = " + cone2.height);
		System.out.println("cone2.volume = " + cone2.volume);
		System.out.println("cone2.surface = " + cone2.surface);
	}
}