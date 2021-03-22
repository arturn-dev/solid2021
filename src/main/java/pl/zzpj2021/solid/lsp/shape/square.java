package pl.zzpj2021.solid.lsp.shape;

public class Square extends Shape {
  private double width;

  public Square(double width) { this.width = width; }

  @Override
  public double calcSurfaceArea() {
    return width * width;
  }

  @Override
  public double calcPerimeter() {
    return 4 * width;
  }
}