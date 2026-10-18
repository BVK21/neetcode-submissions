

class TimeMap {

    Map<String, TreeMap<Integer, String>> timeBasedIndex;

    public TimeMap() {
        timeBasedIndex = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        timeBasedIndex
            .computeIfAbsent(key, k -> new TreeMap<>())
            .put(timestamp, value);
    }

    public String get(String key, int timestamp) {

        TreeMap<Integer, String> history = timeBasedIndex.get(key);

        if (history == null) {
            return "";
        }

        Map.Entry<Integer, String> entry =
            history.floorEntry(timestamp);

        return entry == null ? "" : entry.getValue();
    }
}