class GoodMorningMessage {
    public static void main(String[] args) {
        int time = 8;

        if (time >= 5 && time <= 12){
            System.out.println("Good Morning");
        }
        else if (time >= 13 && time <=17){
            System.out.println("Good afternoon");
        }
        else if (time >= 18 && time <=22){
            System.out.println("Good Evening");
        }
        else {
            System.out.println("Good Night");
        }


    }   
}
