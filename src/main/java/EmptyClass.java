public class EmptyClass {
    //TODO
    public boolean hasNextOccurence() {
        // relies on the assumption that a TreeNodes will always be the last row in the table view of the tree
        var isOldTree = tree.getSelectionPath() == null;
        var path = isOldTree ? oldTree.getSelectionPath() : tree.getSelectionPath();
        if (path == null) {
            return false;
        }

        return isOldTree ? fetchNextOccurenceInfo(path, oldTree) : fetchNextOccurenceInfo(path, tree);
    }

    private static boolean fetchNextOccurenceInfo(TreePath path, Tree tree) {
        var node = (DefaultMutableTreeNode) path.getLastPathComponent();
        if (node instanceof IssueNode) {
            return tree.getRowCount() != tree.getRowForPath(path) + 1;
        } else {
            return node.getChildCount() > 0;
        }
    }
    //TODO
    //TODO
    //TODO
    //TODO
    //TODO
    //TODO
    //TODO
    //TODO
    //TODO
    //TODO
    //TODO
    //TODO
    //TODO
    //TODO
    //TODO
    //TODO
    //TODO
    //TODO
    //TODO
    //TODO
    //TODO
    //TODO
    //TODO
    //TODO
    //TODO
    //TODO
    //TODO
    //TODO
    //TODO
    //TODO
    //TODO
    //TODO
    //TODO
    //TODO
    //TODO
    //TODO
    //TODO
    //TODO
    //TODO
    //TODO
    //TODO
    //TODO
    //TODO
    //TODO
    //TODO
    //TODO
    //TODO
    //TODO
    //TODO
    //TODO
    //TODO
    //TODO
    //TODO
    //TODO
    //TODO
    //TODO
    //TODO
}
