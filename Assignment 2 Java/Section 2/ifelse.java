/* Write a program to classify student grades based on the following criteria: 
 If the score is greater than or equal to 90, print "A" 
 If the score is between 80 and 89, print "B" 
 If the score is between 70 and 79, print "C" 
 If the score is between 60 and 69, print "D" 
 If the score is less than 60, print "F"
*/

class Cond { 
    public static void main(String arg[]) { 
        int score = 55; 
        
        if(score >= 90) { 
            System.out.println("A"); 
        } else if(score >= 80 && score <=89) { 
            System.out.println("B"); 
        } else if(score >= 70 && score <= 79) { 
            System.out.println("C"); 
        } else if(score >= 60 && score <= 69) { 
            System.out.println("D"); 
        } else { 
            System.out.println("F"); 
        } 
    } 
}

