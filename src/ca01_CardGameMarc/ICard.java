/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ca01_CardGameMarc;

/**
 *
 * @author Mark
 */
public interface ICard {
    char suit();
    int suitValue();
    
    String displayValue();
    int numericValue();
}
