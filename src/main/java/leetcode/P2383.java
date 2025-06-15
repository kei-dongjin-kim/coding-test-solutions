package leetcode;

public class P2383 {
    public int minNumberOfHours(int initialEnergy, int initialExperience, int[] energy, int[] experience) {
        int count = 0;
        int erg = initialEnergy;
        int exp = initialExperience;
        int len = energy.length;
        int i = 0;
        while (i < len) {
            if (erg > energy[i] && exp > experience[i]) {
                erg -= energy[i];
                exp += experience[i];
                i++;
            } else if (erg <= energy[i]) {
                erg++;
                count++;
            } else {
                exp++;
                count++;
            }
        }
        return count;
    }
}
