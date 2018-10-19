package ch22brigepattern.brigepatterndemo;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     //白色
        ColorType red = new Red();
        FontType font=new KaiTiType();
        FillType fill=new GridFill();
        LineType line=new DashDotlineType();
        //正方形
        Shape square = new Square();
        //白色的正方形
        square.setColor(red);
        square.setFills(fill);
        square.setFont(font);
        square.setLine(line);
        square.draw();
        
        //长方形
        Shape rectange = new Rectangle();
        rectange.setColor(red);
        rectange.setFills(fill);
        rectange.setFont(font);
        rectange.setLine(line);
        rectange.draw();
	}

}
