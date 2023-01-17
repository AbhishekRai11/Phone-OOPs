public class Landline  implements Phone{
    private String myPhoneNo;
    private boolean isRinging;

    private boolean isPowerOn;

    public Landline(String myPhoneNo){
        this.myPhoneNo=myPhoneNo;
        isRinging=false;
        isPowerOn=true;
    }

    public String getMyPhoneNo() {
        return myPhoneNo;
    }

    public void setMyPhoneNo(String myPhoneNo) {
        this.myPhoneNo = myPhoneNo;
    }

    public void setRinging(boolean ringing) {
        isRinging = ringing;
    }

    public boolean isPowerOn() {
        return isPowerOn;
    }

    public void setPowerOn(boolean powerOn) {
        isPowerOn = powerOn;
    }



    @Override
    public void powerOn() {
        this.isPowerOn=true;
    }

    @Override
    public void callNumber(String phoneNo) {
       if(isPowerOn==true){
           System.out.println("you are dialing the no:"+phoneNo );
       }
       else {
           System.out.println("Your Phone is not on");
       }
       return;
    }

    @Override
    public void receiveCall(String phoneNo) {
        if(isPowerOn==true && myPhoneNo.equals(phoneNo)){
            this.isRinging=true;
            System.out.println("hey call is coming"+myPhoneNo);

        }
        else {
            System.out.println("call not received");
        }
        return;
    }


    @Override
    public boolean answerCall() {
        if(isRinging==true){
            System.out.println("call answer");
            this.isRinging=false;
            return true;
        }
        return false;
    }

    @Override
    public boolean isRinging() {
        if(isRinging==true){
            return true;
        }
        else return false;
    }
}
