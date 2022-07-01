package P2;

import java.util.zip.ZipEntry;

public class B {private short s;
    private int i;
    private long l;
    private float f;
    private double d;
    private char c;
    private String str;
    private boolean b;
    public static void main (String args[ ])
    {
        B df = new B();
        df.s =100;
        df.i =200;
        df.l =300;
        df.f =5.5f;
        df.d =10.55;
        df.c = 'Z';
        df.str = "SoftEng";
        df.b = true;
        System.out.println ("\n short s =" + df.s);
        System.out.println ("\n int i =" + df.i);
        System.out.println ("\n long l =" + df.l );
        System.out.println ("\n float f =" + df.f);
        System.out.println ("\n double d =" + df.d);
        System.out.println ("\n char c =" + df.c);
        System.out.println ("\n String s =" + df.str);
        System.out.println("\n boolean b =" + df.b);
    }
}
