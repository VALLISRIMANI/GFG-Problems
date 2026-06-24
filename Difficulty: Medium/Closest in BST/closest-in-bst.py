# Tree Node
'''
class Node:
    def __init__(self, val):
        self.right = None
        self.data = val
        self.left = None
'''

class Solution:
    
    #Function to find the least absolute difference between any node
    #value of the BST and the given integer.
    def minDiff(self,root, K):
        # code here
        if root is None:
            return float('inf')

        min_diff = float('inf')

        while root:
            min_diff = min(min_diff, abs(root.data - k))

            if K < root.data:
                root = root.left
            elif K > root.data:
                root = root.right
            else:
                return 0

        return min_diff