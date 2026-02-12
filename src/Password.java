import java.util.Random;

public class Password {
    private String CHARACTERES = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890!@#$%¨&*()_";
    private int pwdLenght;
private String pwd = "";

    public Password(int pwdLenght) {
        this.pwdLenght = pwdLenght;
    }
    public Password() {};

    public void setPwdLenght(int pwdLenght){
        this.pwdLenght = pwdLenght;
    }
    public int getPwdLenght(){
        return this.pwdLenght;
    }
//mudança para commitar só
    public String generatePwd(){
        Random rdm = new Random();

        for (int i = 0; i < pwdLenght; i++){
            int number = rdm.nextInt(73);
            char tmp = CHARACTERES.charAt(number);

            pwd += tmp;


        }
        return pwd;
    }

}
