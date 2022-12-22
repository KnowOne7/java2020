package Exercise;

public class NumberToWords {

        public static void numberToWords(int number){
            if(number <0){
                System.out.println("Invalid Value");
            }
            while(number > 0){
                int lastDigit = number % 10;
                number = number / 10;
                System.out.println(lastDigit);
                switch (lastDigit){
                    case 1:{
                        System.out.println("One");
                        System.out.println(number);
                        continue;
                    }
                    case 2: {
                        System.out.println("Two");
                        System.out.println(number);
                        continue;
                    }

                }
                //public static booelan reverse(int number){

                //}
            }


        }
}