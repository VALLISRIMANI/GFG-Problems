'''
class Node:
    def __init__(self, val):
        self.data = val
        self.left = None
        self.right = None
'''

class Solution:
    def sortedArrayToBST(self, arr):
        # code here
        return self.BST(arr, 0, len(arr) - 1)
    
    def BST(self, arr, low, high):
        if low > high:
            return None

        mid = (low + high) // 2

        root = Node(arr[mid])

        root.left = self.BST(arr, low, mid - 1)
        root.right = self.BST(arr, mid + 1, high)

        return root