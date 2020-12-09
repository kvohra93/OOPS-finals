/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kunal
 */
public class ComparableCircle extends Circle implements Comparable<ComparableCircle> {
    
    public ComparableCircle(int area){
    super(area);
    }
    

    @Override
    public int compareTo(ComparableCircle e) {
        return Integer.compare(super.getArea(), e.getArea());
    }
}
