package BM23AI041;

public class Boxing {
    public static void main(String[] args){
        Integer boxedint=Integer.valueOf(10);
        Float boxedfloat=Float.valueOf(10.465f);
        Boolean boxedbool=Boolean.valueOf(true);
        Double boxeddouble=Double.valueOf(120.2);
        Character boxedchar=Character.valueOf('f');
        int unboxint=boxedint.intValue();
        float unboxfloat=boxedfloat.floatValue();
        boolean unboxbool=boxedbool.booleanValue();
        double unboxdouble=boxeddouble.doubleValue();
        char unboxchar=boxedchar.charValue();
        System.out.println("Boxed int: "+boxedint);
        System.out.println("Unboxed int: "+unboxint);
        System.out.println("Boxed float: "+boxedfloat);
        System.out.println("Unboxed float: "+unboxfloat);
        System.out.println("Boxed boolean: "+boxedbool);
        System.out.println("Unboxed boolean: "+unboxbool);
        System.out.println("Boxed double: "+boxeddouble);
        System.out.println("Unboxed double: "+unboxdouble);
        System.out.println("Boxed character: "+boxedchar);
        System.out.println("Unboxed character: "+unboxchar);
    }
}
