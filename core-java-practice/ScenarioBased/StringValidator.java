// class Solution {
//     public boolean isValidUsername(String username) {
//         return validate(username, 0);
//     }

//     private boolean validate(String username, int index) {
//         if (index == username.length()) {
//             return true;
//         }

//         char ch = username.charAt(index);

//         if (ch < 'a' || ch > 'z') {
//             return false;
//         }

//         return validate(username, index + 1);
//     }
// }

public class StringValidator{
    public boolean validator(String username, int index){
        if(index==username.length()){
            return true;
        }
        char[] ch = username.toCharArray();
        if(ch[index]<'a'||ch[index]>'z'){
            return false;
        }
        return validator(username,index+1);
    }
    public static void main(String[] args) {
        StringValidator StringValidator = new StringValidator();
        boolean rs = StringValidator.validator("aditya", 0);
        System.out.println(rs);
    }
}