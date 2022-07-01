import java.util.Objects;

interface Complex<T> 
{
    T getReal();
    T getImaginary();
    double abs();
    Complex<T> conjugate();

    Complex<T> add(Complex<T> c);
    Complex<T> sub(Complex<T> c);
    Complex<T> times(Complex<T> c);
    Complex<T> div(Complex<T> c);
}


class DoubleComplex implements Complex<Double> 
{
    private final Double real;
    private final Double imaginary;

    public DoubleComplex(double re, double img) 
    {
        real = re;
        imaginary = img;
    }

    public Double getReal() { return real; }
    public Double getImaginary() { return imaginary; }

    public String toString() 
    {
        if (imaginary == 0) return real + "";
        if (real == 0) return imaginary + "i";
        if (imaginary <  0) return real + " - " + (-imaginary) + "i";
        return real + " + " + imaginary + "i";
    }

    public double abs() 
    {
        return Math.hypot(real, imaginary);
    }

    public Complex<Double> conjugate() 
    {
        return new DoubleComplex(real, -imaginary);
    }

    public Complex<Double> add(Complex<Double> c) 
    {
        return new DoubleComplex(this.real + c.getReal(), this.imaginary + c.getImaginary());
    }

    public Complex<Double> sub(Complex<Double> c) 
    {
        return new DoubleComplex(this.real - c.getReal(), this.imaginary - c.getImaginary());
    }

    public Complex<Double> times(Complex<Double> c) 
    {
        double re = this.real * c.getReal() - this.imaginary * c.getImaginary();
        double img = this.real * c.getImaginary() + this.imaginary * c.getReal();
        return new DoubleComplex(re, img);
    }
 
    public Complex<Double> div(Complex<Double> c) 
    {
        double scale = c.getReal() * c.getReal() + c.getImaginary() * c.getImaginary();
        DoubleComplex c1= new DoubleComplex(c.getReal()/scale, -c.getImaginary()/scale);
        return this.times(c1);
    }
}


class MyComplex
{
    public static void main(String args[])
    {
         DoubleComplex a = new DoubleComplex(5.0, 6.0);
         DoubleComplex b = new DoubleComplex(-3.0, 4.0);

         System.out.println("\nComplex number a = " + a + "\n");
         System.out.println("Complex number b = " + b + "\n");

         System.out.println("a + b = " + a.add(b) + "\n");
         System.out.println("a - b = " + a.sub(b) + "\n");
         System.out.println("a * b = " + a.times(b) + "\n");
         System.out.println("a / b = " + a.div(b) + "\n");
       
         System.out.println("abslute value of a = " + a.abs() + "\n");
         System.out.println("abslute value of b = " + b.abs() + "\n");

         System.out.println("the conjugate of a = " + a.conjugate() + "\n");
         System.out.println("the conjugate of b = " + b.conjugate() + "\n");
     }
}