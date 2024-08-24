class Discountcalculation {
    public static void main(String[] args) {
        int totalpurchase = 1000;
        int discount = 0;
        String membershipcard = "No";


        if(totalpurchase >= 1000){
        
            if(membershipcard.equals("Yes")){
                discount = (totalpurchase / 100)*25;
            }
            else {
                discount = (totalpurchase/100)*20;
            }
            System.out.println("Total discount is " + discount );
        }
        else if(totalpurchase >= 500){
        
            if(membershipcard.equals("Yes") ){
                discount = (totalpurchase/100)*15;
            }
            else{
                discount = (totalpurchase/100)*10;
            }
            System.out.println("Total discount is " + discount );
        }
        else{
            
            if(membershipcard.equals("Yes") ){
                discount = (totalpurchase/100)*10;
            }
            else{
                discount = (totalpurchase/100)*5;
            }
            System.out.println("Total discount is " + discount );
        }
     }

}
