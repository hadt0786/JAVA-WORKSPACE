


## Palindrome using Linked List

        length -- even | odd

        even --    1   2   3   4 
                    s
                    f

        s = head
        f = head

        s.next1=null
        push(s.value)
        s = s.next
        f = f.next.next


        odd --      1   2   3   4   5  