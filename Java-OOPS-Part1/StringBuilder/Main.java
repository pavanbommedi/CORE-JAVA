package StringBuilder;

public class Main {
    public static void main(String[] args) {
        String s="Hello World";
        StringBuilder builder = new StringBuilder(s);
        builder.append(" and Good Bye");
        System.out.println(builder);
        builder.deleteCharAt(6).insert(6,'w');
        System.out.println(builder);
        // builder.reverse().setLength(10);
        // System.out.println(builder);
        System.out.println(builder.charAt(1));
        System.out.println(builder.substring(3 ,8));
       

    }

}
