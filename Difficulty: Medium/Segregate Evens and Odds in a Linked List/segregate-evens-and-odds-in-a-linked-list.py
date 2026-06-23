# Structure of a link list node
# class node:
#     def __init__(self):  
#         self.data = None
#         self.next = None

class Solution:
    def divide(self, head):
        # code here
        even_head = None
        even_tail = None
        
        odd_head = None
        odd_tail = None
        
        curr = head
        while curr is not None:
            if curr.data % 2 == 0:
                if even_head is None:
                    even_head = curr
                    even_tail = curr
                else:
                    even_tail.next = curr
                    even_tail = curr
            else:
                if odd_head is None:
                    odd_head = curr
                    odd_tail = curr
                else:
                    odd_tail.next = curr
                    odd_tail = curr
            
            curr = curr.next
            
        if even_tail is not None:
            even_tail.next = odd_head
        if odd_tail is not None:
            odd_tail.next = None
        
        head = even_head if even_head is not None else odd_head
        
        return head