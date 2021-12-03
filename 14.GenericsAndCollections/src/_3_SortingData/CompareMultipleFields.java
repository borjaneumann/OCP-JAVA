package _3_SortingData;

public class CompareMultipleFields {
    /*When writing a Comparator that compares multiple instance variables, the
    code gets a little messy. Suppose that we have a Squirrel class, as shown
    here:*/
    public class Squirrel {
        private int weight;
        private String species;

        public int getWeight() {
            return weight;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }

        public String getSpecies() {
            return species;
        }

        public void setSpecies(String species) {
            this.species = species;
        }
    }
    /*We want to write a Comparator to sort by species name. If two squirrels
    are from the same species, we want to sort the one that weighs the least
    first. We could do this with code that looks like this*/

}
