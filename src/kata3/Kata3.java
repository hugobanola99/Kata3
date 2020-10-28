/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata3;

/**
 *
 * @author hugob
 */
public class Kata3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Histogram<String> histogram = new Histogram();
        
        histogram.increment("ulpgc.es");
        histogram.increment("marca.es");
        histogram.increment("elpais.es");
        histogram.increment("marca.es");
        histogram.increment("marca.es");
        histogram.increment("ulpgc.es");
        histogram.increment("youtube.es");
        histogram.increment("youtube.es");
        histogram.increment("google.es");
        histogram.increment("elpais.es");
        histogram.increment("marca.es");
        histogram.increment("google.es");
        
        
        
        HistogramDisplay histogramDisplay = new HistogramDisplay("Histogram",histogram);
        histogramDisplay.execute();

    }
    
}
