package Ejercicio5;

public class Articulos {
  
  private int codigo;
  private String descripcion;
  private double precioCompra;
  private double precioVenta;
  private int stock;

  public Articulos(int codigo, String descripcion, double precioCompra, double precioVenta, int stock) {
    this.codigo = codigo;
    this.descripcion = descripcion;
    this.precioCompra = precioCompra;
    this.precioVenta = precioVenta;
    this.stock = stock;
  }

  public int getCodigo() {
    return this.codigo;
  }

  public void setCodigo(int codigo){
    this.codigo = codigo;
  }

  public String getDescripcio() {
    return this.descripcion;
  }

  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }

  public double getPrecioCompra() {
    return this.precioCompra;
  }

  public void setPrecioCompra(double precioCompra) {
    this.precioCompra = precioCompra;
  }

  public double getPrecioVenta() {
    return this.precioVenta;
  }

  public void setPrecioVenta(double precioVenta) {
    this.precioVenta = precioVenta;
  }
  
  public int getStock() {
    return this.stock;
  }

  public void setStock(int stock) {
    this.stock = stock;
  }

  public String toString() {
    return "Codigo: " + this.codigo + "\nDescripcion: " + this.descripcion + "\nPrecio de Compra: " + this.precioCompra + "\nPrecio de venta: " + this.precioVenta + "\nCantidad: " + this.stock;
  }

}
