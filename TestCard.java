package homework2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */

    import java.util.Random;
    class Card
{
public String faces;
public String suits;
    Card(String n,String s)
    {
this.faces=n;
this.suits=s;
    }
public String toString()
    {
        String ss=faces+" of "+suits+"  ";
return ss;
    }
}class DeskOfCard
{
    Card card[];
public void initcard()//初始化
    {
        String faces[]={ "Ace", "Deuce", "Three", "Four", "Five", "Six","Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King" };
        String suits[]={ "Hearts", "Diamonds", "Clubs", "Spades" };
        card = new Card[52];
for(int i=0;i<52;i++)
        {
            card[i] = new Card(faces[i%13],suits[i/13]);
        }
    }
public void shufflecard()//洗牌
    {
        Random rd = new Random();
for(int i=0;i<52;i++)
        {
int j = rd.nextInt(52);//生成随机数
            Card temp = card[i];//交换
            card[i]=card[j];
            card[j]=temp;
        }
    }
public void dealcard()//发牌
    {
for(int i=0;i<52;i++)
        {
if(i%4==0) System.out.println("\n");
            System.out.print(card[i]);
        }
    }
}public class TestCard 
{
public static void main(String[] args) 
    {
        DeskOfCard cc = new DeskOfCard();
        cc.initcard();
        cc.shufflecard();
        cc.dealcard();
    }
}


