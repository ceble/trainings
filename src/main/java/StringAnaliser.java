public class StringAnaliser {

    public int findInstances(String input, String pattern) {

        String[] partsSplitedByPattern = input.split(pattern, -1);

        final int length = partsSplitedByPattern.length;
        return length - 1;
    }

}
