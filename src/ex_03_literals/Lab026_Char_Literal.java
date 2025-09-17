package ex_03_literals;

public class Lab026_Char_Literal {
    public static void main(String[] args) {

        char c1 = 'A';
        char c2 = '&';
        char c3 = '~';
        char c4 = '$';
        char c5 = '^';
        char c6 = '#';
        char c7 = '@';
        char c8 = ' '; // blank space

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println(c5);
        System.out.println(c6);
        System.out.println(c7);
        System.out.println(c8);

//        Escape Sequence

        char new_line = '\n';
        char tab_line = '\t';
        char back_space = '\b';
        char carriage_return = '\r';

        System.out.println(new_line);
        System.out.println(tab_line);
        System.out.println(back_space);
        System.out.println(carriage_return);

        System.out.println("Samiroraon");
        System.out.println("Samir"+new_line+"Oraon");
        System.out.println("Samir\noraon");
        System.out.println("Samir"+tab_line+"Oraon");
        System.out.println("Samir"+back_space+"oraon");

        System.out.println("This_is_first_line"+new_line+"This_is_second_line\nThis_is_third_line");

//        // ASCII, (limited numbers) - A -> 65

        char dollar = '$';
        System.out.println(dollar);

        char my_smile = '\u1f60';
        System.out.println(my_smile);

        char c11 = '\u1f60';



    }
}
