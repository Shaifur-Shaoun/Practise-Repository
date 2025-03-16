public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator,int denominator){
        this.numerator=numerator;
        this.denominator=denominator;
    }
    public int getNumerator(){
        return numerator;
    }
    public int getDenominator(){
        return denominator;
    }
    public void setNumerator(int numerator){
        this.numerator=numerator;
    }
    public void setDenominator(int denominator){
        this.denominator=denominator;
    }
    public void add(Fraction fraction){
        this.numerator=this.numerator*fraction.denominator+fraction.numerator*this.denominator;
        this.denominator=this.denominator*fraction.denominator;

    }
    public void sub(Fraction fraction){
        this.numerator=this.numerator*fraction.denominator-fraction.numerator*this.denominator;
        this.denominator=this.denominator*fraction.denominator;

    }
    public void multiplication(Fraction fraction){
        this.numerator*=fraction.numerator;
        this.denominator*=fraction.denominator;
    }
    public void division(Fraction fraction){
        this.numerator*=fraction.denominator;
        this.denominator*=fraction.numerator;
    }
    public String toString(){
        return numerator +"/"+ denominator;
    }
    public static void main(String[] args) {
        Fraction f1=new Fraction(1,4);
        Fraction f2=new Fraction(3,5);

        System.out.println(f1);
        System.out.println(f2);

        System.out.println(f1.getNumerator());
        System.out.println(f1.getDenominator());

        f1.setNumerator(2);
        f1.setDenominator(7);
        System.out.println("Updated :"+ f1);

        Fraction addresult=new Fraction(f1.getNumerator(), f1.getDenominator());
        addresult.add(f2);
        System.out.println(addresult);

        Fraction subresult=new Fraction(f1.getNumerator(), f1.getDenominator());
        subresult.sub(f2);
        System.out.println(subresult);

        Fraction mulresult=new Fraction(f1.getNumerator(), f1.getDenominator());
        mulresult.multiplication(f2);
        System.out.println(mulresult);

        Fraction Divresult=new Fraction(f1.getNumerator(), f1.getDenominator());
        Divresult.division(f2);
        System.out.println(Divresult);



    }
    }
    

