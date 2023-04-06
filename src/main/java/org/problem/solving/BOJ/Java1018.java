package org.problem.solving.BOJ;

//java 1018
//버퍼리더가 'x x'를 뽑기 너무 불편해서 scanner사용.
//지민이는 자신의 저택에서 MN개의 단위 정사각형으로 나누어져 있는 M×N 크기의 보드를 찾았다. 어떤 정사각형은 검은색으로 칠해져 있고, 나머지는 흰색으로 칠해져 있다. 지민이는 이 보드를 잘라서 8×8 크기의 체스판으로 만들려고 한다.
//
//체스판은 검은색과 흰색이 번갈아서 칠해져 있어야 한다. 구체적으로, 각 칸이 검은색과 흰색 중 하나로 색칠되어 있고, 변을 공유하는 두 개의 사각형은 다른 색으로 칠해져 있어야 한다. 따라서 이 정의를 따르면 체스판을 색칠하는 경우는 두 가지뿐이다. 하나는 맨 왼쪽 위 칸이 흰색인 경우, 하나는 검은색인 경우이다.
//
//보드가 체스판처럼 칠해져 있다는 보장이 없어서, 지민이는 8×8 크기의 체스판으로 잘라낸 후에 몇 개의 정사각형을 다시 칠해야겠다고 생각했다. 당연히 8*8 크기는 아무데서나 골라도 된다. 지민이가 다시 칠해야 하는 정사각형의 최소 개수를 구하는 프로그램을 작성하시오.
//이게 실버 4 문제 맞나;;;
import java.util.Scanner;

public class Java1018 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m =sc.nextInt();
        int n =sc.nextInt();
        char[][] arr = new char[m][n];//잘라야할 판
        sc.nextLine();
        for (int i=0; i<m;i++){
            String asd = sc.nextLine(); //임시로 한줄씩 받기
            for (int j=0; j<n; j++){
                arr[i][j] =asd.charAt(j); //한줄에 하나씩 넣기
            }
        }
        sc.close();
        char[][] w_b = {{'W','B','W','B','W','B','W','B'},//흰색 일경우
             {'B','W','B','W','B','W','B','W'},
             {'W','B','W','B','W','B','W','B'},
             {'B','W','B','W','B','W','B','W'},
             {'W','B','W','B','W','B','W','B'},
             {'B','W','B','W','B','W','B','W'},
             {'W','B','W','B','W','B','W','B'},
             {'B','W','B','W','B','W','B','W'}};
        char[][] b_d ={{'B','W','B','W','B','W','B','W'}, //검정 일경우
             {'W','B','W','B','W','B','W','B'},
             {'B','W','B','W','B','W','B','W'},
             {'W','B','W','B','W','B','W','B'},
             {'B','W','B','W','B','W','B','W'},
             {'W','B','W','B','W','B','W','B'},
             {'B','W','B','W','B','W','B','W'},
             {'W','B','W','B','W','B','W','B'}};
        int res=64;
        for(int x=0; x<=m-8; x++) {
            char[][] temp = new char[8][8];
            for(int y=0; y<=n-8; y++) {
                int w = 0;//새로만들 temp의 index값 생성
                for(int i=x; i<=x+7; i++) {//잘라낸8*8판 안에서 하나씩 비교
                    int h = 0;//새로만들 temp의 index값 생성
                    for(int j=y; j<=y+7; j++) {
                        temp[w][h] = arr[i][j];
                        if (w == 7 && h == 7) {
                            //w_b,b_b 둘다 한번에 조회
                            int w_con=0;
                            int b_con=0;
                            for(int a=0; a<8;a++){
                                for(int b=0; b<8;b++){
                                    if (w_b[a][b] != temp[a][b]){
                                        w_con++;//카운트
                                    }
                                    if (b_d[a][b] != temp[a][b]){
                                        b_con++;//카운트
                                    }
                                }
                            }
                            int min =Math.min(w_con,b_con);
                            res =Math.min(res,min);
                        }//7*7이 되었을경우 min 갱신
                        h++;
                    }
                    w++;
                }
            }
        }
        System.out.println(res);
    }
}