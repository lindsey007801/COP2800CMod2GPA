// PalmerPenguinsM2.java
// Lindsey Diamond
// 5/24/26
// This program calculates and displays Palmer Penguin statistics

public class PalmerPenguins {

    // constants to represent the species names & number of species
    static final String SP_CHINSTRAP = "Chinstrap";
    static final String SP_GENTOO = "Gentoo";
    static final String SP_ADELIE = "Adelie";
    
    static final int NUM_CHINSTRAP = 68;
    static final int NUM_GENTOO = 123;
    static final int NUM_ADELIE = 151;
    
    static int totalPenguins = NUM_CHINSTRAP + NUM_GENTOO + NUM_ADELIE;
   
    static final int TOTAL_SPECIES = 3;
   
    public static void main(String[] args) {
   
        // outputs an introduction of the species and how many there are
        System.out.println("Introducing the Palmer Penguins: ");
        System.out.println("\t" + SP_CHINSTRAP + "!");
        System.out.println("\t" + SP_GENTOO + "!");
        System.out.println("and last but not least...");
        System.out.println("\t" + SP_ADELIE + "!");
        System.out.println("There are a total of " + TOTAL_SPECIES + 
                           " penguin species in this dataset.");

        System.out.printf("%s: %d (%.2f%%)\n", 
            SP_CHINSTRAP, 
            NUM_CHINSTRAP,
            ((double) NUM_CHINSTRAP / totalPenguins * 100));
        System.out.printf("%s: %d (%.2f%%)\n", 
            SP_GENTOO, 
            NUM_GENTOO,
            ((double) NUM_GENTOO / totalPenguins * 100));
        System.out.printf("%s: %d (%.2f%%)\n",
            SP_ADELIE,
            NUM_ADELIE,
            ((double) NUM_ADELIE / totalPenguins *100 ));
   }
}