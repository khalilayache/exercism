class Hamming {
    private int hamming;

    Hamming(String leftStrand, String rightStrand) {
        if (leftStrand.length() == rightStrand.length()) {
            hamming = 0;
            for (int i = 0; i < leftStrand.length(); i++) {
                if (leftStrand.codePointAt(i) != rightStrand.codePointAt(i)) {
                    hamming++;
                }
            }
        } else {
            if (leftStrand.isEmpty())
                throw new IllegalArgumentException("left strand must not be empty.");
            if (rightStrand.isEmpty())
                throw new IllegalArgumentException("right strand must not be empty.");
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        }

    }

    int getHammingDistance() {
        return hamming;
    }
}
