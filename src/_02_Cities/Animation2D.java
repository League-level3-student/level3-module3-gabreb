package _02_Cities;

public class Animation2D extends Animation implements Drawable{

	@Override
	public void draw() {
		System.out.println("drawing");
	}
	public int getFramerate() {
		return 24;
	}
	public static void main(String[] args) {
		Animation2D a2d = new Animation2D();
		a2d.draw();
		System.out.println(a2d.getFramerate());
	}

}
