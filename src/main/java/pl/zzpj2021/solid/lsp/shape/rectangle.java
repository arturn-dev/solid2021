package pl.zzpj2021.solid.lsp.shape;

public class Rectangle extends Shape {
  private double width;
  private double height;

  public Rectangle(double width, double height) {
    this.width = width;
    this.height = height;
  }

  @Override
  public double calcSurfaceArea() {
    return width * height;
  }

  @Override
  public double calcPerimeter() {
    return 2 * width + 2 * height;
  }
}