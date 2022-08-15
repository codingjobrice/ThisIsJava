public class IfExample {
    public static void main(String[] args){
        //if 문
        int score = 100;

        if (score> 80){
            System.out.println("합격입니다.");
        }else{
            System.out.println("탈락입니다.");
        }

        // switch문
        int num = (int)(Math.random()*6)+1;
        switch(num){
            case 1:
                System.out.println("1입니다");
                break;
            default:
                System.out.println("나머지입니다.");
                break;
        }
        

    }
    
}
