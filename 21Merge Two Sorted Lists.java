//Merging two Linked List (Dummy nodes approach)


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummyNode= new ListNode(-1);
        ListNode t1=list1;
        ListNode t2=list2;
        ListNode temp= dummyNode;
        while(t1!=null && t2!=null){
            if(t1.val<t2.val){
                temp.next=t1;
                temp=t1;
                t1=t1.next;
            }
            else{
                temp.next=t2;
                temp=t2;
                t2=t2.next;
            }
        }

        if(t1!=null){  // you cannot directly access the .next value like that , this will throw an error because t1 can already be null and null.next throws an exception
            temp.next=t1;
        }else
        {
            temp.next=t2;
        }

        return dummyNode.next;
    }
}
