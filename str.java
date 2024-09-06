public class str {
    public static void main(String[]args){
        String s=new String();
        s="zkkokontssp";
        char firstNonRepeting='0';
        char[] A=s.toCharArray();
        for (int i=0;i<s.length();i++){
            char current=s.charAt(i);
            boolean isUnique=true;
            for (int j=0;j<s.length();j++){
                if(i!=j&&s.charAt(i)==s.charAt(j)){
                    isUnique=false;
                    break;

                }

            }
            if (isUnique){
                firstNonRepeting=current;
                break;
            }

        }
        if (firstNonRepeting!='0'){
            System.out.println(firstNonRepeting);
        }
        else {
            System.out.println("Not Found");
        }
    }
}
