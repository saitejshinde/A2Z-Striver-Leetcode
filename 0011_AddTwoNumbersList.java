class AddTwoNumbersList{

    public static class ListNode {
        int val ;
        ListNode next;

        public ListNode() {}

        ListNode(int val){
            this.val = val;

        }
        ListNode(int val, ListNode next){
            this.val = val;
            this.next = next ;
        }
        

    }


    public static ListNode createList(int[] nums) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        for (int n : nums) {
            curr.next = new ListNode(n);
            curr = curr.next;
        }
        return dummy.next;
    }


    public static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val);
            if (node.next != null) System.out.print(" -> ");
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String args []){
        int[] arr1 = {9,9,9,9,9,9,9};
        int[] arr2 = {9,9,9,9};

        ListNode l1 = createList(arr1);
        ListNode l2 = createList(arr2);

        ListNode result = addTwoNumbers(l1, l2);

        System.out.print("Result: ");
        printList(result);
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode result = new ListNode();
        ListNode head = result;

        int c = 0 ; 
        while(l1 != null || l2 != null){
            
            if(l1 != null && l2 != null ){

                int n = l1.val + l2.val + c;
                c = n / 10;
                n = n % 10;
                result.next = new ListNode(n);
                                
                l1 = l1.next;
                
                l2 = l2.next;
                result = result.next; 
                 
            }
            else if(l1 != null && l2 == null) {
                if(c != 0 ){
                    int n = l1.val + c;
                   c = n / 10;
                    n = n % 10;
                    result.next = new ListNode(n);
                    result = result.next; 
                }
                else{
                    result.next = new ListNode(l1.val);
                    result = result.next; 
                }
                l1 = l1.next;
            }
            else if(l2 != null && l1 == null) {
                if(c != 0 ){
                    int n = l2.val + c;
                    c = n / 10;
                    n = n % 10;
                    result.next = new ListNode(n);
                    result = result.next; 
                }
                else{
                    result.next = new ListNode(l2.val);
                    result = result.next; 
                }
                l2 = l2.next;
            }
        }

        if(c != 0 ){
            result.next = new ListNode(c);
        }

        return head.next;
    }



}