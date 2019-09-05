package principlesofSoftwareDesign.OpenClosePrinciple;

//房子
public class House {

	int width;
	int length;
	String addr;

	public House(int width, int length, String addr) {
		this.width = width;
		this.length = length;
		this.addr = addr;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public int getSquare() {
		return width * length;
	}

	@Override
	public String toString() {
		return "House [width=" + width + ", length=" + length + ", addr=" + addr + "]";
	}

}
