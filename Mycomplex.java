public class Mycomplex {
    private double real;
    private double imag;

    public Mycomplex(){
        real=0;
        imag=0;
    }

    public Mycomplex(double real,double imag){
        this.real=real;
        this.imag=imag;
    }

    public double getReal(){
        return real;
    }

    public void setReal(double real){
        this.real=real;
    }

    public double getImag(){
        return imag;
    }

    public void setImag(double imag){
        this.imag=imag;
    }

    public void setValue(double real,double imag){
        this.real=real;
        this.imag=imag;
    }

    public String toString(){
        return real+imag+"i";
    }

    public boolean isReal(){
        if (imag==0) {
            return true;
        }
        else{
            return false;
        }
    }

    public boolean isImaginary(){
        if (real==0) {
            return true;
        }
        else{
            return false;
        }
    }

    public boolean equals(double real,double imag){
        if(this.real==real && this.imag==imag){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean equals(Mycomplex another){
        if(this.real==another.getReal() && this.imag==another.getImag()){
            return true;
        }
        else{
            return false;
        }
    }

    public double magnitude(){
        return Math.sqrt(Math.pow(real, 2)+Math.pow(imag,2));
    }

    public Mycomplex addInto(Mycomplex right){
        this.real+=right.getReal();
        this.imag+=right.getImag();
        return this;
    }

    public Mycomplex addNew(Mycomplex right){
        Mycomplex sum=new Mycomplex();
        sum.real=this.real+right.getReal();
        sum.imag=this.imag+right.getImag();
        return sum;
    }
}
 