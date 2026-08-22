// class Solution {
//     public boolean detectCapitalUse(String word) {

//         // boolean res = false;

//         // if(word.length() == 1){
//         //     if((word.charAt(0) > 64 && word.charAt(0) < 91)){
//         //         return true;
//         //     }
//         //     // else if(word.charAt(0) > 96 && word.charAt(0) < 123){
//         //     //     return true;
//         //     // }else{
//         //     //     return false;
//         //     // }
//         // }
//         // for (int i = 1; i < word.length(); i++) {
//         //     if ((word.charAt(0) > 64 && word.charAt(0) < 91) && (word.charAt(i) < 65 && word.charAt(i) > 90)) {
//         //         return true;
//         //     }
//         // }

//         // for (int i = 0; i < word.length(); i++) {
//         //     if (word.charAt(i) > 64 && word.charAt(i) < 91) {
//         //         res = true;
//         //     }
//         // }
//         // for (int i = 0; i < word.length(); i++) {
//         //     if ((word.charAt(i) > 96 && word.charAt(i) < 123)) {
//         //         res = true;
//         //     }else{
//         //         res = false;
//         //     }
//         // }
//         // return res;

//     }
// }

class Solution {

    public static boolean fun(char s) {
        return Character.isUpperCase(s);
    }

    public boolean detectCapitalUse(String s) {

        int c = 0;
        char arr[] = s.toCharArray();

        if (fun(arr[0])) {
            c++;
        }

        for (int i = 1; i < arr.length; i++) {
            if (fun(arr[i])) {
                c++;
            }
        }
        if (arr.length == c) {
            return true;
        } else if (c == 0) {
            return true;
        }

        if (c == 1 && fun(arr[0])) {
            return true;
        }

        return false;
    }
}