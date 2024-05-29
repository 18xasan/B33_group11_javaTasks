package Lilia.week4;


public class RemoveDuplicates {

    public static void main(String[] args) {

        //Write a return method that can remove the duplicated values from String
        //Ex: removeDup("AAABBBCCC") ==> ABC

        removeDup("AAABBBCCC");
    }
    public static void removeDup(String str){
        String removeDublic = "";
        for (int i = 0; i < str.length(); i++) {
            if(!removeDublic.contains(String.valueOf(str.charAt(i)))) {
                removeDublic += String.valueOf(str.charAt(i));
            }
        }
        System.out.println(removeDublic);

}
}
