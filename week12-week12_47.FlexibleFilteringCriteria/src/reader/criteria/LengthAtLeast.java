/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reader.criteria;

/**
 *
 * @author CraciunA2
 */
public class LengthAtLeast implements Criterion {

    private final int number;

    public LengthAtLeast(int number) {
        this.number = number;
    }

    @Override
    public boolean complies(String line) {
        return line.length() >= number;
    }

}
