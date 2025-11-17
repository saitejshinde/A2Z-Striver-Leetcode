

// class ListNode (){

//     int val ;
//     ListNode next ;

//     public ListNode() {}

//     ListNode(int val){
//         this.val = val;
//     }

//     public ListNode(int val, ListNode next) {
//         this.val = val;
//         this.next = next;
//     }
    
    
    
// }
 
 
class ListNode {
    int val;
    ListNode next;

    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { 
        this.val = val; 
        this.next = next; 
    }
}

 
 
 class MergeTwoSortedLists {

    public static void main(String[] args) {

        int[] a = {1, 2, 4};
        int[] b = {1, 3, 4};

        ListNode list1 = createList(a);
        ListNode list2 = createList(b);

        System.out.println("List 1:");
        printList(list1);

        System.out.println("List 2:");
        printList(list2);

        ListNode result = mergeTwoLists(list1, list2);

        System.out.println("Merged List:");
        printList(result);
    }

    // Helper to convert array → linked list
    public static ListNode createList(int[] arr) {
        ListNode dummy = new ListNode();
        ListNode curr = dummy;

        for (int x : arr) {
            curr.next = new ListNode(x);
            curr = curr.next;
        }
        return dummy.next;
    }

    // Helper to print a linked list
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode front = new ListNode();
        ListNode head = front ;
        
        while (list1 != null && list2 != null){
        
                if(list1.val >= list2.val){
                    head.next = list2;
                     
                    list2 = list2.next ;
                }
                else if(list1.val < list2.val){

                    head.next = list1 ;
                
                    list1 = list1.next;
                }
                head = head.next;
        }

        head.next = (list1 != null ) ? list1 :list2 ;

        if(list1 != null){
            head.next = list1;
        }else{
            head.next = list2;
        }

        return front.next;
        
    }
    
}
