package pl.zzpj2021.solid.lsp.shape;

public class Circle extends Shape {
  private double radius;

  public Circle(double radius) { this.radius = radius; }

  @Override
  public double calcSurfaceArea() {
    return Math.PI * (radius * radius);
  }

  @Override
  public double calcPerimeter() {
    return 2 * Math.PI * radius;
  }
}