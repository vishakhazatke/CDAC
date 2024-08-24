class Studentstatus {

    public static void main(String[] args) {
        
    int sub1Marks = 45;
    int sub2Marks = 30;
    int sub3Marks = 50;

    int failCount = 0 ;

    switch(sub1Marks > 40 ? 1 : 0){
        case 0: failCount++;
    }
    switch(sub2Marks > 40 ? 1:0){
        case 0: failCount++;
    }
    switch (sub3Marks > 40 ? 1 :0) {
      case 0 : failCount++;
    }
    switch(failCount){
        case 0:
        System.out.println("Student is passed in all 3 subjects");
        break;

        case 1:
        System.out.println("Student is fail in"+ " " +failCount+" subjects");
        break;
    }
  }
}

    /*if(sub1Marks > 40){
        passCount++;
    }
    else{
        failCount++;
    }
    if(sub2Marks > 40){
        passCount++;
    }
    else{
        failCount++;
    }
    if(sub3Marks > 40){
        passCount++;
    }
    else{
        failCount++;
    }
    if(passCount == 3){
        System.out.println("Student is pass in all 3 subjects");
    }
    else{
        System.out.println("Student is fail in"+ " " +failCount+" subjects");
    }*/
    
    