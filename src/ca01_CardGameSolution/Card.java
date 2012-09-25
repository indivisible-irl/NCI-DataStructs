/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ca01_CardGameSolution;

/**
 *
 * @author Mark
 */
public class Card implements ICard {

    private char _suit;
    private int _suitValue;
    
    private String _displayValue;
    private int _numericValue;

    public Card(char suit, int suitValue, String displayValue, int numericValue) {
        this._suit = suit;
        this._suitValue = suitValue;
        this._displayValue = displayValue;
        this._numericValue = numericValue;        
    }
    
    @Override
    public char suit() {
        return _suit;
    }
    
    @Override
    public int suitValue()
    {
        return _suitValue;
    }

    @Override
    public String displayValue() {
        return _displayValue;
    }
    
    @Override
    public int numericValue()
    {
        return _numericValue;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(suit()).append(displayValue()).append("(").append(numericValue()).append("-").append(suitValue()).append(")");
        return sb.toString();
    }
    
}
