public class FractionOthers {
    private int numerator;
    private int denominator;

    public FractionOthers(int numerator,int denominator){
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
    public void add(FractionOthers fraction){
        this.numerator=this.numerator*fraction.denominator+fraction.numerator*this.denominator;
        this.denominator=this.denominator*fraction.denominator;

    }
    public void sub(FractionOthers fraction){
        this.numerator=this.numerator*fraction.denominator-fraction.numerator*this.denominator;
        this.denominator=this.denominator*fraction.denominator;

    }
    public void multiplication(FractionOthers fraction){
        this.numerator*=fraction.numerator;
        this.denominator*=fraction.denominator;
    }
    public void division(FractionOthers fraction){
        this.numerator*=fraction.denominator;
        this.denominator*=fraction.numerator;
    }
    public String toString(){
        return numerator +"/"+ denominator;
    }
    //GCD
    public static int gcd(int a,int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
    //LCD
    public static int lcd(int a,int b){
        return (a*b)/gcd(a,b);
    }
    //factorial
    public static int factorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact*=i;
        }
        return fact;
    }
    //prime
    public static boolean isPrime(int n){
        if(n<2){
           return false;
        }
        for(int i=2;i<=n;i++){
            if(n%i==0){
               return false;
            }
        }
        return true;
    }
    //leapyear
    public static boolean isLeapyear(int year){
        return (year%4==0 && year%100!=0) || (year%400==0);
    }
    //sum of digits
    public static int sumofDigits(int num){
        int sum=0;
        while(num!=0){
            sum+=num%10;
            num/=10;
        }
        return sum;
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

       System.out.println("GCD: "+gcd(12,18 ));
       System.out.println("LCD"+lcd(12,18));
       System.out.println("FACTORIAL"+factorial(5));
       System.out.println("prime"+isPrime(7));
       System.out.println("Leapyear"+isLeapyear(2024));
       System.out.println("SumOfDigits"+sumofDigits(1234));

    }
    }
    

