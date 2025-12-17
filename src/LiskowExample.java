class Rectangle {
    protected int width;
    protected int height;

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getArea() {
        return width * height;
    }
}

class Square extends Rectangle {

    @Override
    public void setWidth(int width) {
        this.width = width;
        this.height = width;
    }

    @Override
    public void setHeight(int height) {
        this.width = height;
        this.height = height;
    }
}

void resizeRectangle(Rectangle rect) {
    rect.setWidth(5);
    rect.setHeight(10);
    System.out.println(rect.getArea());
}

void main() {
    Rectangle r = new Rectangle();
    resizeRectangle(r);

    Rectangle s = new Square();
    resizeRectangle(s); //Expected 50, but got 100
}