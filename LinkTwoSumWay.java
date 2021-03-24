package com.qf.day01;

/**
 * @author ：青崖log一白鹿
 * @date ：Created in 2021/3/23-03-23-2:09
 * @description：递归方法
 * @version: 1.0
 */
public class LinkTwoSumWay {


    public static void main(String[] args) {
        LinkTwoSumWay lt = new LinkTwoSumWay();
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(4);
        l2.next.next = new ListNode(3);
        ListNode result = lt.addTwoNumbers(l1, l2);
        System.out.println(result.val+""+result.next.val+""+result.next.next.val);

    }


    public static class ListNode{
        int val;
        ListNode next;

        public ListNode(int x) {
            val = x;
        }
    }


    public ListNode addTwoNumbers(ListNode l1,ListNode l2){
        int total = l1.val + l2.val;
        int next1 = total /10;
        ListNode result =new ListNode(total%10);
        if (l1.next != null || l2.next != null || next1 != 0){
            l1 = l1.next != null ? l1.next:new ListNode(0);
            l2 = l2.next != null ? l2.next:new ListNode(0);
            l1.val += next1;
            result.next = addTwoNumbers(l1,l2);
        }
        return result;
    }
}
