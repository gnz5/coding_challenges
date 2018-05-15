# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    def isValidBST(self, root):
        if root is None:
            return True

        # verify root.left is smaller
        if root.left is not None:
            if root.val <= root.left.val:
                return False
            # verify largest element of left subtree is smaller than root
            ptr = root.left
            while ptr.right is not None:
                ptr = ptr.right
            if ptr.val >= root.val:
                return False

        # verify root.right is greater
        if root.right is not None:
            if root.val >= root.right.val:
                return False
            # verify smallest element of right subtree is larger than root
            ptr = root.right
            while ptr.left is not None:
                ptr = ptr.left
            if ptr.val <= root.val:
                return False

        # verify left and right subtrees are valid
        if Solution.isValidBST(root, root.left) is False or Solution.isValidBST(root, root.right) is False:
            return False
        # all checks passed
        return True