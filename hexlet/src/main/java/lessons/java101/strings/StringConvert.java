package lessons.java101.strings;

public class StringConvert {

    public static void main(String[] args) {
        Integer.toString(12);
        //or
        Integer i = new Integer(12);
        i.toString();
        // same for Double, Long, Short


        // public static int parseInt(String s) throws NumberFormatException { return parseInt(2,10);}
        float a = Float.parseFloat("12.");  // возвращает примитив
        Float f = Float.valueOf("12.");     // возвращает объект
        float b = f.floatValue();           // достаем примитив из данного объекта

        double d = 834.34;
        String s = Double.toString(d);
        int dot = s.indexOf('.');   // 3
        System.out.println(dot + " digits " +  "before decimal point.");
        System.out.println((s.length() - dot - 1) + " digits after decimal point.");    // 6 (не 5 так как длинна считается с 1) - 3 - 1

        // при комипиляции необходимо задать 2 значение в поле аргументов
        if(args.length == 2) {
            float arg0 = (Float.parseFloat(args[0]));
            float arg1 = (Float.valueOf(args[1]).floatValue());

            System.out.println(arg0 + arg1);
        } else {
            System.out.println("input 2 args in command line");
        }

    }

}
