package Lilia.week2;

public class swapTwoNumbers {
    public static void main(String[] args) {
        //Swap two variable' values without using a third variable

        String var1 = "Liliia";
        String var2 = "Iliash";
        System.out.println(var1 + " " + var2);

        var1 = var1 + var2;
        var2 = var1.substring(0, (var1.length() -var2.length()));
        var1 = var1.substring(var2.length());

        System.out.println(var1 + " " + var2);

    }
}
