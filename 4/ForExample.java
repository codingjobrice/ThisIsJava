import java.util.Scanner;

public class ForExample {
    public static void main(String[] args){
        // for 문 (1부터 9까지 합)
        int sum = 0;
        for(int i =0;i<10; i++){
            sum += i;
        }
        System.out.println(sum);

        // while 문
        int i = 0;
        while(true){
            System.out.println(i);
            i++;
            if(i==10){
                break;
            }
        }

        // 문자열 입력 받기
        Scanner scanner = new Scanner(System.in);
        //String inputString = scanner.nextLine();

        // do while 문
        String inputString;

        do{
            inputString = scanner.nextLine();
        }while(! inputString.equals("q"));
    }
    
}
