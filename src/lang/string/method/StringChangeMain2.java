package lang.string.method;

public class StringChangeMain2 {

    public static void main(String[] args) {
        String strWithSpace = "     Java Programming";

        System.out.println("소문자 변환 : " + strWithSpace.toLowerCase());
        System.out.println("대문자 변환 : " + strWithSpace.toUpperCase());

        System.out.println("공백 제거(trim) : '" + strWithSpace.trim() + "'");
        System.out.println("공백 제거(strip) : '" + strWithSpace.strip() + "'");
        System.out.println("앞공백 제거(stripLeading) : '" + strWithSpace.stripLeading() + "'");
        System.out.println("뒤공백 제거(stripTrailing) : '" + strWithSpace.stripTrailing() + "'");
    }

}
