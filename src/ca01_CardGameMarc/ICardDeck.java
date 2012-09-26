/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ca01_CardGameMarc;

import java.util.*;

/**
 *
 * @author Mark
 */
public interface ICardDeck<E> {
    E take();
    void add(E e);
    
    void Shuffle();
    ArrayList<ICard> Deal();
    
    int size();
    boolean isEmpty();
    
    int evaluate(ArrayList<ICard> h1, ArrayList<ICard> h2);
 }
