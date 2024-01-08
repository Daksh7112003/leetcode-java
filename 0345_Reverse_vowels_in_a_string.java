// class Solution {
//     public String reverseVowels(String s) {
//         char[] arr = s.toCharArray();

//         int li = 0;
//         int ri = arr.length - 1;

//         while (li < ri) {
//             char chr = arr[li];
//             char chl = arr[ri];

//             if (isVowel(chl) && isVowel(chr)) {
//                 // Swap the vowels
//                 char temp = arr[li];
//                 arr[li] = arr[ri];
//                 arr[ri] = temp;

//                 // Move the pointers
//                 li++;
//                 ri--;
//             } else if (isVowel(chl)) {
//                 li++;
//             } else if (isVowel(chr)) {
//                 ri--;
//             } else {
//                 li++;
//                 ri--;
//             }
//         }
//         return new String(arr);
//     }

// //     boolean isVowel(char ch) {
// //         ch = Character.toLowerCase(ch);
// //         return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
// //     }
// // }


//  boolean isVowel(char ch){


//         if(ch=='a' || ch=='A'){
//             return true;

//         }

//          else  if(ch=='e' || ch=='E'){
//             return true;

//         }
//         else   if(ch=='i' || ch=='I'){
//             return true;

//         }
//   else if(ch=='o' || ch=='O'){
//             return true;

//         }
// else{
//     return false;

// }
//  }
// }
















class Solution {
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();

        int li = 0;
        int ri = arr.length - 1;

        while (li < ri) {
            char chr = arr[li];
            char chl = arr[ri];

            if (isVowel(chl) && isVowel(chr)) {
                // Swap the vowels
                char temp = arr[li];
                arr[li] = arr[ri];
                arr[ri] = temp;

                // Move the pointers
                li++;
                ri--;
            } else if (isVowel(chl)) {
                li++;
            } else if (isVowel(chr)) {
                ri--;
            } else {
                li++;
                ri--;
            }
        }
        return new String(arr);
    }

    boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}





// //     boolean isVowel(char ch){


// //         if(ch=='a' || ch=='A'){
// //             return true;

// //         }

// //          else  if(ch=='e' || ch=='E'){
// //             return true;

// //         }
// //         else   if(ch=='i' || ch=='I'){
// //             return true;

// //         }
// //   else if(ch=='o' || ch=='O'){
// //             return true;

// //         }
// // else{
// //     return false;

// // // }
        




    
