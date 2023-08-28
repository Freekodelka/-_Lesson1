public interface ComparableCat extends Comparable<ComparableCat> {
    String getName();

    @Override
    default int compareTo(ComparableCat other) {
        return getName().compareTo(other.getName());
    }
}