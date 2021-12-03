package _3_SortingData;

import java.util.Comparator;

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
    public class MultiFieldComparator implements Comparator<Squirrel> {
        @Override
        public int compare(Squirrel o1, Squirrel o2) {
            int result = o1.getSpecies().compareTo(o2.getSpecies());
            if (result != 0) return result;
            return o1.getWeight()- o2.getWeight();
        }
        //This works assuming no species names are null. It checks one field. If
        //they don't match, we are finished sorting. If they do match, it looks at the
        //next field. This isn't that easy to read, though. It is also easy to get wrong.
        //Changing != to == breaks the sort completely.
    }

}
