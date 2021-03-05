package task1;

public class Complex {
    private int numarReal;
    private int numarImaginar;

    public Complex(int numarReal, int numarImaginar) {
        this.numarReal = numarReal;
        this.numarImaginar = numarImaginar;
    }

    public Complex() {
        this(0,0);
    }

    public Complex(Complex complex) {
        this.numarReal = complex.numarReal;
        this.numarImaginar = complex.numarImaginar;
    }

    public int getNumarReal() {
        return numarReal;
    }

    public void setNumarReal(int numarReal) {
        this.numarReal = numarReal;
    }

    public int getNumarImaginar() {
        return numarImaginar;
    }

    public void setNumarImaginar(int numarImaginar) {
        this.numarImaginar = numarImaginar;
    }

    public void addWithComplex(Complex complex) {
        this.numarReal += complex.getNumarReal();
        this.numarImaginar += complex.getNumarImaginar();
    }

    public void showNumber() {
        System.out.println(this.numarReal + " " + this.numarImaginar + "i");
    }
}
