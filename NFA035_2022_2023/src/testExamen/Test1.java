package testExamen;

public class Test1 {
public static void main(String[] args){

StringBuffer sb = new StringBuffer("toto");
StringBuffer sb1 = sb;
sb=sb.append("**************************");
if(sb==sb1)
System.out.println("même objet");
}
}

