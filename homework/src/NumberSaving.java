public class NumberSaving {
    public NumberSaving( int input) {
        targenNumber = input;
        return;
    }

    int targenNumber;


    public boolean isThreeDigets()
    {
        String temp = Integer.toString(targenNumber);
        //System.out.println( "Current length " + temp.length());
        return temp.length() == 3;
    }
    public boolean islastIsSeven()
    {
        System.out.println("Last is " + (targenNumber%10)+". Is it 7? "+ ((targenNumber%10) == 7));
        return (targenNumber%10) == 7;
    }

    public boolean isDividableByTwo() {
        System.out.println("Is dividable by 2 ? " + (targenNumber%2 == 0) );
        return targenNumber%2 == 0;
    }

    //создаём число
    // Определяем количество знаков
    // если знаков 3 - сигналим.
    // определяем, является ли его последняя цифра семёркой
    // Определите, является ли число чётным.



}