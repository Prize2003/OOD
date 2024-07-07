public class MyPolynomial {
    private double[] coeffs;

    public MyPolynomial(double... coeffs){
        this.coeffs=coeffs;
    }


    public int getDegree(){
        return coeffs.length-1;
    }

    public String toString(){
         StringBuilder sb = new StringBuilder();
        for (int i = coeffs.length - 1; i >= 0; i--) {
            if (coeffs[i] == 0) continue;
            if (i == coeffs.length - 1) {
                sb.append(coeffs[i]);
            } else {
                sb.append(coeffs[i] >= 0 ? " + " : " - ");
                sb.append(Math.abs(coeffs[i]));
            }
            if (i > 0) {
                sb.append("x");
                if (i > 1) {
                    sb.append("^").append(i);
                }
            }
        }
        return sb.toString();
    }

    public double evaluate(double x) {
        double result = 0.0;
        for (int i = 0; i < coeffs.length; i++) {
            result += coeffs[i] * Math.pow(x, i);
        }
        return result;
    }

    public MyPolynomial add(MyPolynomial other) {
        int maxDegree = Math.max(this.getDegree(), other.getDegree());
        double[] newCoeffs = new double[maxDegree + 1];

        for (int i = 0; i <= maxDegree; i++) {
            newCoeffs[i] = (i <= this.getDegree() ? this.coeffs[i] : 0) +
                           (i <= other.getDegree() ? other.coeffs[i] : 0);
        }

        return new MyPolynomial(newCoeffs);
    }

    // Multiply another polynomial with this polynomial
    public MyPolynomial multiply(MyPolynomial other) {
        int newDegree = this.getDegree() + other.getDegree();
        double[] newCoeffs = new double[newDegree + 1];

        for (int i = 0; i <= this.getDegree(); i++) {
            for (int j = 0; j <= other.getDegree(); j++) {
                newCoeffs[i + j] += this.coeffs[i] * other.coeffs[j];
            }
        }

        return new MyPolynomial(newCoeffs);
    }


}
