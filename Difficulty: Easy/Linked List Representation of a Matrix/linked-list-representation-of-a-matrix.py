''' Structure of a node in linked list
class Node():
    def __init__(self,x):
        self.data = x
        self.right = None
        self.down = None
'''


# function should return the pointer to the first element of the in linked list i.e.
# the element at arr[0][0]
class Solution:
    def linkMatrix(self, mat):
        #your code goes here
        if not mat:
            return None

        m = len(mat)
        n = len(mat[0])

        nodes = [[Node(mat[i][j]) for j in range(n)] for i in range(m)]

        for i in range(m):
            for j in range(n):
                if j + 1 < n:
                    nodes[i][j].right = nodes[i][j + 1]

                if i + 1 < m:
                    nodes[i][j].down = nodes[i + 1][j]

        return nodes[0][0]