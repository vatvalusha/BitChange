package change.bit;

/**
 * Created by User on 07.02.2017.
 */
public class BitChange {

    static private int changeOne(int pos, int bit, int value){
        System.out.println(Integer.toString(value,2));
        switch (bit){
            case 1:
                return value | (1 << (pos-1));
            case 0:
                return value & ~(1 <<(pos-1));
            default:
                System.out.println("Incorrect bit!!");
                break;
        }
        return 0;
    }

    public static void main(String[] args) {
        boolean t = true;
        System.out.println(Integer.toString(changeOne(6,0, 2_147_483_647),2));

        int a = 127;
        System.out.println("COMMIT");

        System.out.println(Integer.toString(a,2));
        System.out.println( Integer.toString(a & ~(1 << 3),2));
        byte b = 15;
        System.out.println(Integer.toString(b,2));

        System.out.println("10:  " + Integer.toString(10,2));
        System.out.println("~ 10:" + Integer.toString(~10,2));

        System.out.println("14:" + Integer.toString(14,2));

        System.out.println("dfghjkl");
        System.out.println(Integer.toString(10&14,2));
        System.out.println(("1: " +Integer.toString(1 << 6,2)));
        b = (byte) (b | (1 << 6));
        System.out.println(Integer.toString(b,2));
    }
}
