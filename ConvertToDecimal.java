public class ConvertToDecimal {
  public static int convertToDecimal(String binary){
    int conversion = 1;
    int result = 0;
    for(int i = 1; i<=binary.length(); i++){
      System.out.println(i);
      if(binary.charAt(binary.length() - i) == '1') {
        System.out.println("i : " + i);
        result += conversion;
        System.out.println("Result : " + result);
      }
      conversion *=2;
      System.out.println("conversion : "+conversion);
    }
    return result;
  }
}
