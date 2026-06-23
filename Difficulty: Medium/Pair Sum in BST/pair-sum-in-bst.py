'''
# Tree Node
class Node:
    def __init__(self, val):
        self.right = None
        self.data = val
        self.left = None

'''

class Solution:
    def inorder(self, root, arr):
        if root is None:
            return
        
        self.inorder(root.left, arr)
        arr.append(root.data)
        self.inorder(root.right, arr)
    
    def findTarget(self, root, target): 
        # your code here.
        arr = []
        self.inorder(root, arr)

        left = 0
        right = len(arr) -1

        while left < right:
            if arr[left] + arr[right] == target:
                return True
            elif arr[left] + arr[right] > target:
                right -= 1
            else: 
                left += 1
        return False 