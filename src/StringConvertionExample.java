void main() {
    // 1. String -> StringBuilder / StringBuffer
    String str = "Hello";

    StringBuilder sb = new StringBuilder(str);
    StringBuffer sbf = new StringBuffer(str);

    System.out.println("String → StringBuilder: " + sb);
    System.out.println("String → StringBuffer: " + sbf);

    // 2. StringBuilder / StringBuffer -> String
    String strFromSB = sb.toString();
    String strFromSBF = sbf.toString();

    System.out.println("StringBuilder → String: " + strFromSB);
    System.out.println("StringBuffer → String: " + strFromSBF);

    // 3. StringBuilder <-> StringBuffer (через String)
    StringBuffer sbfFromSB = new StringBuffer(sb.toString());
    StringBuilder sbFromSBF = new StringBuilder(sbf.toString());

    System.out.println("StringBuilder → StringBuffer: " + sbfFromSB);
    System.out.println("StringBuffer → StringBuilder: " + sbFromSBF);
}