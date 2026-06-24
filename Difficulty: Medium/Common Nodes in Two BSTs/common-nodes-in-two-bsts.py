'''Structure for a Tree Node
class Node:
    def __init__(self, val):
        self.data = val
        self.left = None
        self.right = None
'''

class Solution:
    def inorder(self, root, arr):
        if root is None:
            return

        self.inorder(root.left, arr)
        arr.append(root.data)
        self.inorder(root.right, arr)

    def findCommon(self, r1, r2):
        # code here
        arr1 = []
        arr2 = []

        self.inorder(r1, arr1)
        self.inorder(r2, arr2)

        i = j = 0
        common = []

        while i < len(arr1) and j < len(arr2):
            if arr1[i] == arr2[j]:
                common.append(arr1[i])
                i += 1
                j += 1
            elif arr1[i] < arr2[j]:
                i += 1
            else:
                j += 1

        return common