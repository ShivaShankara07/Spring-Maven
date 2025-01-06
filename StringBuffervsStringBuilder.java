public class StringBuffervsStringBuilder {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer(50);
        // System.out.println(sb.capacity());
        sb.append("FirstWord");
        System.out.println(sb);
        String NextWord = sb.toString();
        System.out.println(NextWord + " N");
        StringBuffer sb1 = new StringBuffer(NextWord);
        System.out.println(sb1+"a");
        String Word3 = sb1.toString();
        System.out.println(Word3);
        sb1.reverse();
        System.out.println(sb1);
        sb1.replace(2,4,"ha");
        System.out.println(sb1);
        StringBuilder sBs1 = new StringBuilder();
        sBs1.append(Word3+"2");
        System.out.println(sBs1.toString());
    }
}