package com.qf.day01;

/**
 * @author ：青崖log一白鹿
 * @date ：Created in 2021/3/23-03-23-1:12
 * @description：两数相加-常规解法
 * @version: 1.0
 */


public class LinkTwoSum {

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 **/

public static void main(String[] args) {
    LinkTwoSum lt = new LinkTwoSum();
    ListNode l1 = new ListNode(2);
    l1.next = new ListNode(4);
    l1.next.next = new ListNode(3);

    ListNode l2 = new ListNode(5);
    l2.next = new ListNode(6);
    l2.next.next = new ListNode(4);
    ListNode result = lt.addTwoNumbers(l1, l2);
    System.out.println(result.val);
    System.out.println(result.next.val);
    System.out.println(result.next.next.val);

}

    public static class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }

}

    public ListNode addTwoNumbers(ListNode l1,ListNode l2){
        int next1 = 0;
        int total = 0;
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        while (l1 !=null && l2 !=null){
            total = l1.val+l2.val+next1;
            cur.next = new ListNode(total % 10);
            next1 = total/10;
            l1 = l1.next;
            l2 = l2.next;
            cur = cur.next;

        }
        while (l1 != null){
            total = l1.val + next1;
            cur.next = new ListNode(total%10);
            next1 = total / 10;
            l1 = l1.next;
            cur = cur.next;
        }


        while (l1 != null){
            total = l2.val + next1;
            cur.next = new ListNode(total %10);
            next1 = total /10;
            l2 = l2.next;
            cur = cur.next;
        }

        if (next1 !=0){
            cur.next = new ListNode(next1);
        }
        return dummy.next;
    }
}
