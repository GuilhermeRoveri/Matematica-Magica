public class Challenge{
    public static void main(String[] args){
        int myNumber=8;
        //É o número original

        int stepOne = myNumber * myNumber;
        int stepTwo = stepOne + myNumber;
        int stepThree = stepTwo  / myNumber;
        int stepFour = stepThree + 17;
        int stepFive = stepFour - myNumber;
        int stepSix = stepFive / 6;
        System.out.println(stepSix);

        //O valor sempre será igual a 3, independente do númer colocado na variável int ''myNubmer'''
    }
}