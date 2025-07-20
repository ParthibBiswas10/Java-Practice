import java.util.*;

class Solution {
    class Node {
        String val; // name
        String subFolder = ""; // subfolder structure
        Map<String, Node> children = new HashMap<>();
        
        Node(String val) {
            this.val = val;
        }
    }

    private Node getNode(String val) {
        return new Node(val);
    }

    private void insert(Node root, List<String> path) {
        for (String folder : path) {
            root.children.putIfAbsent(folder, getNode(folder));
            root = root.children.get(folder);
        }
    }

    private String populateNodes(Node root, Map<String, Integer> subFolderMap) {
        List<Map.Entry<String, String>> subFolderPaths = new ArrayList<>();

        for (Map.Entry<String, Node> entry : root.children.entrySet()) {
            String subFolderResult = populateNodes(entry.getValue(), subFolderMap);
            subFolderPaths.add(new AbstractMap.SimpleEntry<>(entry.getKey(), subFolderResult));
        }

        subFolderPaths.sort(Map.Entry.comparingByKey());

        StringBuilder completePath = new StringBuilder();
        for (Map.Entry<String, String> entry : subFolderPaths) {
            completePath.append("(").append(entry.getKey()).append(entry.getValue()).append(")");
        }

        root.subFolder = completePath.toString();

        if (!root.subFolder.isEmpty()) {
            subFolderMap.put(root.subFolder, subFolderMap.getOrDefault(root.subFolder, 0) + 1);
        }

        return root.subFolder;
    }

    private void removeDuplicates(Node root, Map<String, Integer> subFolderMap) {
        Iterator<Map.Entry<String, Node>> iterator = root.children.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Node> entry = iterator.next();
            Node child = entry.getValue();

            if (!child.subFolder.isEmpty() && subFolderMap.get(child.subFolder) > 1) {
                iterator.remove();
            } else {
                removeDuplicates(child, subFolderMap);
            }
        }
    }

    private void constructResult(Node root, List<String> path, List<List<String>> result) {
        for (Map.Entry<String, Node> entry : root.children.entrySet()) {
            path.add(entry.getKey());
            result.add(new ArrayList<>(path));
            constructResult(entry.getValue(), path, result);
            path.remove(path.size() - 1);
        }
    }

    public List<List<String>> deleteDuplicateFolder(List<List<String>> paths) {
        Node root = getNode("/");

        for (List<String> path : paths) {
            insert(root, path);
        }

        Map<String, Integer> subFolderMap = new HashMap<>();
        populateNodes(root, subFolderMap);

        removeDuplicates(root, subFolderMap);

        List<List<String>> result = new ArrayList<>();
        List<String> path = new ArrayList<>();
        constructResult(root, path, result);

        return result;
    }
}
