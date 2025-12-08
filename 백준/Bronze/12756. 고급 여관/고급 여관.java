import java.util.*;
import java.io.*;

public class Main {

    static class Card {
        int power;
        int life;
        boolean isAlive;

        public Card(int power, int life) {
            this.power = power;
            this.life = life;
            this.isAlive = true;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        Card cardA = new Card(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        st = new StringTokenizer(br.readLine());
        Card cardB = new Card(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));

        while(true) {
            cardA.life -= cardB.power;
            cardB.life -= cardA.power;
            if(cardA.life <= 0) cardA.isAlive = false;
            if(cardB.life <= 0) cardB.isAlive = false;
            if(!cardA.isAlive || !cardB.isAlive) break;
        }

        if(!cardA.isAlive && !cardB.isAlive) {
            System.out.println("DRAW");
        }
        if (cardA.isAlive) {
            System.out.println("PLAYER A");
        }
        if(cardB.isAlive) {
            System.out.println("PLAYER B");
        }


    }
}