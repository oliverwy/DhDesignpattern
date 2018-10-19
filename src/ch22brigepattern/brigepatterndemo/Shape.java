package ch22brigepattern.brigepatterndemo;

public abstract class Shape {
	ColorType color; 
	LineType line;
	FontType font;
	FillType fills;
	public ColorType getColor() {
		return color;
	}
	public void setColor(ColorType color) {
		this.color = color;
	}
	public LineType getLine() {
		return line;
	}
	public void setLine(LineType line) {
		this.line = line;
	}
	public FontType getFont() {
		return font;
	}
	public void setFont(FontType font) {
		this.font = font;
	}
	public FillType getFills() {
		return fills;
	}
	public void setFills(FillType fills) {
		this.fills = fills;
	}
	public abstract void draw() ;
}

class Circle extends Shape{

    public void draw() {
       	String style=color.setColorType("")+font.setFont("")
    	+line.setLineType("")+fills.fillShape("");
        System.out.println(style+"的"+"圆形");
     }
}

class Rectangle extends Shape{

    public void draw() {
    	String style=color.setColorType("")+font.setFont("")
    	+line.setLineType("")+fills.fillShape("");
        System.out.println(style+"的"+"长方形");
    }

}

class Square extends Shape{

    public void draw() {
       	String style=color.setColorType("")+font.setFont("")
    	+line.setLineType("")+fills.fillShape("");
        System.out.println(style+"的"+"正方形");
    }

}

