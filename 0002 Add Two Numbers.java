class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head= new ListNode(-1);
        ListNode temp=head;
        int sum=0, carry=0;
        while(l1!=null && l2!=null){
            sum=l1.val+l2.val+carry;
            carry=sum/10;
            sum=sum%10;
            ListNode ln=new ListNode(sum);
            temp.next=ln;
            temp=temp.next;
            l1=l1.next;
            l2=l2.next;  
        }
        while(l1!=null){
            sum=l1.val+carry;
            carry=sum/10;
            sum=sum%10;
            ListNode ln=new ListNode(sum);
            ln.next=null;
            temp.next=ln;
            temp=temp.next;
            l1=l1.next;
        }
         while(l2!=null){
            sum=l2.val+carry;
            carry=sum/10;
            sum=sum%10;
            ListNode ln=new ListNode(sum);
            temp.next=ln;
            temp=temp.next;
            l2=l2.next;
        }
         while(carry > 0) {
        
        sum =  carry;
        carry = sum/10;
        sum = sum%10;
             
        ListNode ln = new ListNode(sum);
        temp.next = ln;
        temp=temp.next;
    }
        return head.next;
    }
}
