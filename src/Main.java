public class Main {
    public static void main(String[] args) {


        String[] days = {"sunday", "monday", "tuesday", "wednesday", "thursday", "friday", "saturday"};
        int[] temp =  {45, 29, 10, 22, 41, 28, 33};
        int[] rain = {95, 60, 25, 5, 0, 75, 90};



        for (int i = 0; i < temp.length; i++) {
                if (temp[i] < 32 && rain[i]>50) {
                    System.out.println("It is going to snow " + days[i]);
                }
        }


    }






}



