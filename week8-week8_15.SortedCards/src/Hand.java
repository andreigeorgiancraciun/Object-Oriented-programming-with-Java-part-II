
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author CraciunA2
 */
public class Hand implements Comparable<Hand> {

    private List<Card> hand = new ArrayList<Card>();

    public void add(Card card) {
        this.hand.add(card);
    }

    public void print() {

        for (Card card : this.hand) {
            System.out.println(card);
        }
    }
    
    public void sort(){
        Collections.sort(hand);
    }
    
    public int sumHand(){
        int sumHand1 = 0;
        for( Card card : this.hand){
            sumHand1 = sumHand1 + card.getValue();
        }
        return sumHand1;
    }

    @Override
    public int compareTo(Hand hand) {
        int sumHand1 = sumHand();
        int sumHand2 = hand.sumHand();
        
        return sumHand1 - sumHand2;
        
    }
    
    public void sortAgainstSuit(){
        Collections.sort(this.hand, new SortAgainstSuitAndValue());
    }
    
    
    

}
