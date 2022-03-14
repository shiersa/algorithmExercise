package utils;

public class PrintStr {

    static String equalLine = "===============================================================";
    static String longEqualLine = "==============================================================================================";
    static String beginLine = "----------------------------|BEGIN|----------------------------";
    static String endLine = "-----------------------------|END|-----------------------------";
    static String minusLine = "---------------------------------------------------------------";
    static String wordsLineHead = "----------------------------|";
    static String wordsLineTail = "|-----------------------------";
    static String splitStr = "|";
    static String beginStr = "BEGIN";
    static String endStr = "END";
    static String beginSplitStr = splitStr + beginStr +splitStr;
    static String endSplitStr = splitStr + endStr +splitStr;

    public static void printEqualLine(){
        System.out.println(equalLine);
    }

    public static void printLongEqualLine(){
        System.out.println(longEqualLine);
    }

    public static void printMinusLine(){
        System.out.println(minusLine);
    }

    public static void printBeginLine(){
        System.out.println(beginLine);
    }

    public static void printEndLine(){
        System.out.println(endLine);
    }

    public static void nameBeginLine(String name){
        System.out.println(wordsLineHead + name + beginSplitStr + wordsLineTail);
    }

    public static void nameEndLine(String name) {
        System.out.println(wordsLineHead + name + endSplitStr + wordsLineTail);
    }


}
