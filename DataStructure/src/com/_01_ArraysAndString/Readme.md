# Quick Sort

## Problem Statement : String is UNIQUE CHARACTER

1.  Given String A = "AKASH MOHAN CHAUDHARY"
    Output : False

    Given String B = "ABCDEF"
    Output : True

Algorithm : 
Input : A = "ABCDEF" "AKASH"

char Pivot = choose randomely any character : A.charAt(0), 
int Start = starting index : -1, 
int End = end index of the string : A.length()-1

Operation : 

1.  sort (input, start, end)
   
    1.  it will sort untill start is smaller than end
        
        -   int index = partition(input, start, end)
        
        -   input.partition(input, 0, index-1)
        -   input.partition(input, low+1, index+1)
   
2.  partition (string input, int start, int end)

    1.     


3. Test case Scenatios

    Pivot -- a b c d pivot e f g ----------
            --  smaller than or equal to , pivot , greater than pivot

    
    Variable 
    
    i: counter variable
    j: loop variable

    Method - -swapping
            -   partition
    
    pivot = value of an array ar index i --> remeber to take always last index value

    String = "Hello" : ignore case sensitiveness

    output : "eHllo"

    condition : if(value<=pivot) move left i++ else right

    value : arr[i] 
    pivot = arr[last]
    i : index element smaller than pivot = -1
    j : 


    Pass   : 1  2   3   4   
    
    pivot  : 4

    i      : 

    j      : 

    a























